package com.taskManager.controllers;

import com.taskManager.dto.MovieDto.MovieRequest;
import com.taskManager.dto.MovieDto.MovieResponse;
import com.taskManager.mapper.MovieMapper;
import com.taskManager.model.MovieSearchResponseDto;
import com.taskManager.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Collections;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieMapper movieMapper;

    @Autowired
    private MovieService movieService;

    @GetMapping("/search/{query}")
    public MovieSearchResponseDto searchMovies(@PathVariable String query){
        return movieService.searchMovies(query);
    }

//    @PostMapping()
//    public MovieResponse createMovie(@RequestBody MovieRequest request){
//        return movieService.response(request);
//    }

}
