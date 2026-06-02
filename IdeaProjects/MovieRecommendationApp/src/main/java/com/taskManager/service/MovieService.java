package com.taskManager.service;

import com.taskManager.client.TMBDSClient;
import com.taskManager.dto.MovieDto.MovieRequest;
import com.taskManager.dto.MovieDto.MovieResponse;
import com.taskManager.mapper.MovieMapper;
//import com.taskManager.model.Movie;
import com.taskManager.model.MovieSearchResponseDto;
//import com.taskManager.repository.MovieRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class MovieService {
//    private final MovieRepo movieRepo;
    private final MovieMapper movieMapper;
    private final TMBDSClient tmbdsClient;

//    public MovieResponse response(MovieRequest request){
//        Movie movie = movieMapper.toEntity(request);
//        Movie savedMovie = movieRepo.save(movie);
//        return movieMapper.toResponse(savedMovie);
//    }
    public MovieSearchResponseDto searchMovies(String query){
        return tmbdsClient.searchMovies(query);
    }

}
