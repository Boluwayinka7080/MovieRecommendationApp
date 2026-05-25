package com.taskManager.controllers;

import com.taskManager.mapper.MovieMapper;
import com.taskManager.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieController {
    @Autowired
    private MovieMapper movieMapper;

    @Autowired
    private MovieService movieService;

}
