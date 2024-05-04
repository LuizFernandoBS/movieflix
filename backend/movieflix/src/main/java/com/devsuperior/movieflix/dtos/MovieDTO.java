package com.devsuperior.movieflix.dtos;

import com.devsuperior.movieflix.entities.Movie;

import java.io.Serializable;
import java.util.Objects;

public class MovieDTO implements Serializable {

    private Long id;
    private String title;
    private Integer year;
    private String subtitle;
    private String imgUrl;
    private String synopsis;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String title, Integer year, String subtitle, String imgUrl,
                    String synopsis) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.subtitle = subtitle;
        this.imgUrl = imgUrl;
        this.synopsis = synopsis;
    }

    public MovieDTO(Movie movie) {
        this(movie.getId(), movie.getTitle(), movie.getYear(), movie.getSubtitle(),
                movie.getImgUrl(), movie.getSynopsis());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieDTO)) return false;
        MovieDTO movieDTO = (MovieDTO) o;
        return Objects.equals(getId(), movieDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
