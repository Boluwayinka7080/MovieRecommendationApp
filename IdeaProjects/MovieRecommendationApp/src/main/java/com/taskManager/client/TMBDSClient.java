package com.taskManager.client;


import com.taskManager.model.MovieSearchResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Collections;

@Component
public class TMBDSClient {
    private final WebClient webClient = WebClient.create();

    @Value("${tmdb.api.key}")
    private String apiKey;

    public MovieSearchResponseDto searchMovies(String query){

        String url = "https://api.themoviedb.org/3/search/movie?api_key="
                + apiKey
                + "&query="
                + query;

        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(MovieSearchResponseDto.class)
                .block();


    }
}
