package com.taskManager.dto.MovieDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MovieResponse {
    private Long id;
    private String title;
    private String overview;
    private String releaseDate;
}

