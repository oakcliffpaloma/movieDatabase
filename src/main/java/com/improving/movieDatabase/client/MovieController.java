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
    @GetMapping("/movie/{id}")
    public Movie findById(@PathVariable Integer id) {
        return movieRepository.findById(id).get();
    }


//        private final MovieRepository movieRepository ;

//        public MovieController() { }

//        public MovieController(MovieRepository movieRepository) {
//            this.movieRepository = new MovieRepository();
//        }

    }
