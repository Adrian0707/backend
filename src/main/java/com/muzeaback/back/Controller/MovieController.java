package com.muzeaback.back.Controller;

import com.muzeaback.back.DTO.MovieDTO;
import com.muzeaback.back.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/movie")
public class MovieController {
    private MovieService movieService;
    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/event/{id}")
    List<MovieDTO> getMovieByEventId(@PathVariable("id") Long id){
        return movieService.getAllByEventByIdevent(id);
    }
    @GetMapping("/{id}")
    MovieDTO getMovieById(@PathVariable("id") Long id){
        return movieService.getByIdmovie(id);
    }
    @PostMapping(value = "",consumes = MediaType.APPLICATION_JSON_VALUE)
    void postMovie(@RequestBody MovieDTO movieDTO){
        movieService.postMovie(movieDTO);
    }
}
