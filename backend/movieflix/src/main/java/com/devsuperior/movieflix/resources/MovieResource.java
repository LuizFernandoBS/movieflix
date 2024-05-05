package com.devsuperior.movieflix.resources;

import com.devsuperior.movieflix.dtos.GenreDTO;
import com.devsuperior.movieflix.dtos.MovieDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movies")
public class MovieResource {

    @Autowired
    private MovieService service;

    @GetMapping
    public ResponseEntity<Page<MovieDTO>> pagedMovies(Pageable pageable,
                                                      @RequestBody GenreDTO genreDTO) {
        Page<MovieDTO> dtos = service.pagedMovies(pageable, genreDTO);
        return ResponseEntity.ok().body(dtos);
    }
}
