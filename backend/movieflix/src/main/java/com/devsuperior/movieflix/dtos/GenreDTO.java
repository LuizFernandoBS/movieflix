package com.devsuperior.movieflix.dtos;

import com.devsuperior.movieflix.entities.Genre;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class GenreDTO implements Serializable {

    private Long id;
    private String name;

    private Set<MovieDTO> moviesDTO = new HashSet<>();

    public GenreDTO() {
    }

    public GenreDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public GenreDTO(Genre genre) {
        this(genre.getId(), genre.getName());
    }

    public GenreDTO(Genre genre, Set<MovieDTO> moviesDTO) {
        this(genre);
        moviesDTO.forEach(movieDTO -> this.getMoviesDTO().add(movieDTO));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<MovieDTO> getMoviesDTO() {
        return moviesDTO;
    }
}
