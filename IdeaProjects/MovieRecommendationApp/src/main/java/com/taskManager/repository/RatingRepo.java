package com.taskManager.repository;

import com.taskManager.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Movie, Long> {
}
