package com.MovieDirector.movieDirector;

public class MovieDirectorPair {
    private static String movie;
    private static String director;

    public MovieDirectorPair(String movie, String director) {
        this.movie = movie;
        this.director = director;
    }

    public static String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public static String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
