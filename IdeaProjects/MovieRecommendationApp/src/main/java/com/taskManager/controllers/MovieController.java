package com.taskManager.controllers;

import com.taskManager.dto.MovieDto.MovieRequest;
import com.taskManager.dto.MovieDto.MovieResponse;
import com.taskManager.mapper.MovieMapper;
import com.taskManager.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieMapper movieMapper;

    @Autowired
    private MovieService movieService;

    @GetMapping("/search")
    public String searchMovies(@RequestParam String query){
        return movieService.searchMovies(query);
    }

    @PostMapping()
    public MovieResponse createMovie(@RequestBody MovieRequest request){
        return movieService.response(request);
    }

}
