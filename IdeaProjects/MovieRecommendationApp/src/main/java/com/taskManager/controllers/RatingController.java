package com.taskManager.controllers;

import com.taskManager.mapper.RatingMapper;
import com.taskManager.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;

public class RatingController {

    @Autowired
    private RatingService ratingService;

    @Autowired
    private RatingMapper ratingMapper;
}
