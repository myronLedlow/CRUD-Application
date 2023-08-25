package com.myroncrudapp.movie_register.repository;

import com.myroncrudapp.movie_register.model.Movie;
import com.myroncrudapp.movie_register.service.MovieService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
}
