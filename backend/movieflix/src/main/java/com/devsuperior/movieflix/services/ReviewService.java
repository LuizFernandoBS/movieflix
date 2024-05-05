package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dtos.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    public ReviewDTO save(ReviewDTO reviewDTO) {
        Review review = new Review();
        this.dtoToEntity(reviewDTO, review);
        review = repository.save(review);
        return new ReviewDTO(review);
    }

    private void dtoToEntity(ReviewDTO dto, Review review) {
        review.setText(dto.getText());

        Optional<Movie> movieOptional = movieRepository.findById(dto.getMovieDTO().getId());
        Movie movie = movieOptional.orElseThrow(() ->
                new ResourceNotFoundException("Entity not found "
                        + dto.getMovieDTO().getId()));

        review.setMovie(movie);

        Optional<User> userOptional = userRepository.findById(dto.getUserDTO().getId());
        User user = userOptional.orElseThrow(() ->
                new ResourceNotFoundException("Entity not found"
                        + dto.getUserDTO().getId()));

        review.setUser(user);
    }
}
