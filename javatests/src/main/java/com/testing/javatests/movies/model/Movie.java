package com.testing.javatests.movies.model;

public class Movie {

    private Integer id;
    private String name;
    private int minutes;
    private Genre genre;

    public Movie(String name, int minutes, Genre genre) {
        this(null, name, 152, Genre.ACTION);
    }

    public Movie(Integer id, String name, int i, Genre action) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public Genre getGenre() {
        return genre;
    }
}
