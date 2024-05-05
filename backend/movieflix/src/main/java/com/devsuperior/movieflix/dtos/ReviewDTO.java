package com.devsuperior.movieflix.dtos;
import com.devsuperior.movieflix.entities.Review;
import java.io.Serializable;

public class ReviewDTO implements Serializable {

    private Long id;
    private String text;
    private UserDTO userDTO;
    private MovieDTO movieDTO;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String text, UserDTO userDTO, MovieDTO movieDTO) {
        this.id = id;
        this.text = text;
        this.userDTO = userDTO;
        this.movieDTO = movieDTO;
    }

    public ReviewDTO(Review review) {
        this(review.getId(), review.getText(), new UserDTO(review.getUser()),
                new MovieDTO(review.getMovie()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public MovieDTO getMovieDTO() {
        return movieDTO;
    }

    public void setMovieDTO(MovieDTO movieDTO) {
        this.movieDTO = movieDTO;
    }
}
