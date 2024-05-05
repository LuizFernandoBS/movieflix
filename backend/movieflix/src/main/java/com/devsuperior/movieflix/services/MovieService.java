package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dtos.GenreDTO;
import com.devsuperior.movieflix.dtos.MovieDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional
    public Page<MovieDTO> pagedMovies(Pageable pageable, GenreDTO genreDTO) {
        try {
            Genre genre = new Genre();
            this.dtoToEntity(genreDTO, genre);
            Page<Movie> movies = repository.findMovieByGenre(pageable, genre);
            return movies.map(MovieDTO::new);
        } catch (EntityNotFoundException ex) {
            throw new ResourceNotFoundException("Resource not found " + genreDTO.getId());
        }
    }

    public void dtoToEntity(GenreDTO genreDTO, Genre genre) {
        genre.setId(genreDTO.getId());
        genre.setName(genreDTO.getName());
        if (!genreDTO.getMoviesDTO().isEmpty()) {
            genreDTO.getMoviesDTO().forEach(movieDTO -> {
                Optional<Movie> obj = repository.findById(movieDTO.getId());
                Movie movie = obj.orElseThrow(() ->
                        new ResourceNotFoundException("Resource not found "
                                + movieDTO.getId()));
                genre.getMovies().add(movie);
            });
        }
    }
}
