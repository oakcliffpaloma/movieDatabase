package com.improving.movieDatabase.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.GeneratedValue;
import java.net.URI;


@RestController
@RequestMapping
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;


    @GetMapping(path="/all")
    public @ResponseBody Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    @GetMapping("/movies/{id}")
    public Movie findById(@PathVariable Integer id) {
        return movieRepository.findById(id).get();
    }
    @PostMapping("/movies")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        Movie savedMovie = movieRepository.save(movie);


        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/movies")
                .buildAndExpand(savedMovie.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        Movie savedMovie = movieRepository.save(movie);


        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedMovie.getId()).toUri();

        return ResponseEntity.created(location).build();
    }


//        private final MovieRepository movieRepository ;

//        public MovieController() { }

//        public MovieController(MovieRepository movieRepository) {
//            this.movieRepository = new MovieRepository();
//        }

    }
