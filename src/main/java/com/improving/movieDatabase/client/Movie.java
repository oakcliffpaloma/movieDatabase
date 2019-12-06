package com.improving.movieDatabase.client;

import javax.persistence.*;

@Entity(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String director;
    private String genre;
    private int ReleaseYr;

    public Movie(){}


//    public Movie(String name, String director, String genre, int releaseYear, int id) {
//        this.name = name;
//        this.director = director;
//        this.genre = genre;
//        this.releaseYear = releaseYear;
//        this.id = id;
//    }


    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }
    public String getGenre() {
        return genre;
    }

    public int getReleaseYr() {
        return ReleaseYr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYr(int releaseYr) {
        this.ReleaseYr = releaseYr;
    }
}

