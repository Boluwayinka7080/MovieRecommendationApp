package com.taskManager.repository;

//import com.taskManager.model.Movie;
import com.taskManager.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Ratings, Long> {
}
