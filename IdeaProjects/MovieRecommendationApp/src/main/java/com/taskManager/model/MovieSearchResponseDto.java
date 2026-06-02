package com.taskManager.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSearchResponseDto {

    private int page;
    private List<MovieDto> results;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("total_results")
    private int totalResults;




    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MovieDto {

        private boolean adult;

//        @JsonProperty("backdrop_path")
//        private String backdropPath;

        @JsonProperty("genre_ids")
        private List<Integer> genreIds;

        private Long id;
        private String title;

        @JsonProperty("original_language")
        private String originalLanguage;

        @JsonProperty("original_title")
        private String originalTitle;

//        private String overview;
//        private Double popularity;
//
//        @JsonProperty("poster_path")
//        private String posterPath;
//
//        @JsonProperty("release_date")
//        private String releaseDate;
//
//        private boolean softcore;
//        private boolean video;
//
//        @JsonProperty("vote_average")
//        private Double voteAverage;
//
//        @JsonProperty("vote_count")
//        private Integer voteCount;


    }
}