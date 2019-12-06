package com.improving.movieDatabase.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

//        private final MovieRepository movieRepository ;

//        public MovieController() { }

//        public MovieController(MovieRepository movieRepository) {
//            this.movieRepository = new MovieRepository();
//        }

//        @GetMapping(path="/all")
//        public @ResponseBody List<Movie> movies() {
//            return movieRepositoryInterface.getMovies();
//        }
    }
