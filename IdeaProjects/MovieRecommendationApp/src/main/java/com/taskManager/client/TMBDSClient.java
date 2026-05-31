package com.taskManager.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;

public class TMBDSClient {
    private final WebClient webClient = WebClient.create();

    @Value("${99065c82c437d940287b4ee6ca1e34ed}")
    private String apiKey;

    public String searchMovies(String query){

        String url = "https://api.themoviedb.org/3/search/movie?api_key="
                + apiKey
                + "&query="
                + query;

        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
