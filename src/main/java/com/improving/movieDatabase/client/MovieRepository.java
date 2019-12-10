package com.improving.movieDatabase.client;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

//    List<Movie> findById(Integer id);


    //private final List<Movie> movies = new ArrayList<>();

//    public MovieRepository() {
//        movies.add(new Movie("Star Wars: Episode VII- The Force Awakens", "J.J. Abrams", "Action", 2015, 1));
//        movies.add(new Movie("Avengers: Endgame", "Anthony Russo", "Action", 2019, 2));
//        movies.add(new Movie("Black Panther", "Ryan Coogler", "Action", 2018, 3));
//        movies.add(new Movie("Avengers: Infinity War", "Anthony Russo", "Action", 2018, 4));
//        movies.add(new Movie("Jurassic World", "Colin Trevorrow", "Action", 2015, 5));
//        movies.add(new Movie("Marvel's The Avengers", "Joss Whedon", "Action", 2012, 6));
//        movies.add(new Movie("Star Wars: Episode VIII- The Last Jedi", "J.J. Abrams", "Action", 2017, 7));
//        movies.add(new Movie("Incredibles 2", "Brad Bird", "Animated", 2018, 8));
//        movies.add(new Movie("The Lion King", "Jon Favreau", "Animated", 2019, 9));
//        movies.add(new Movie("Rogue One: A Star Wars Story", "Gareth Edwards", "Action", 2016, 10));
//
//    }


}
