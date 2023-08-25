package com.myroncrudapp.movie_register.controller;

import com.myroncrudapp.movie_register.model.Movie;
import com.myroncrudapp.movie_register.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("/create")
    public Movie create(@RequestBody Movie movie){

        return movieRepository.save(movie);
    }

    @GetMapping("/all")
    public List<Movie> getAllMovies() {

        return movieRepository.findAll();

    }

    @GetMapping("/sortbyname")
    public List<Movie> sortAllMoviesByName() {

        return movieRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));

    }

    @GetMapping("/sortbyrelease")
    public List<Movie> sortAllMoviesByRelease() {

        return movieRepository.findAll(Sort.by(Sort.Direction.DESC, "release"));

    }

    @GetMapping("/sortbydescription")
    public List<Movie> sortAllMoviesByDescription() {

        return movieRepository.findAll(Sort.by(Sort.Direction.ASC, "description"));

    }

    @GetMapping("/{id}")
    public Optional<Movie> findOneById(@PathVariable String id) {
        return movieRepository.findById(id);
    }

    @PutMapping("/update")
    public Movie update(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        movieRepository.deleteById(id);
    }
}
