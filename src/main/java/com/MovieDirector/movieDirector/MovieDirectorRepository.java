package com.MovieDirector.movieDirector;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieDirectorRepository {

    HashMap<String, String> movieDirectorDb = new HashMap<>();

    public void addMovieDirector(MovieDirectorPair pair){
       movieDirectorDb.put(MovieDirectorPair.getMovie() , MovieDirectorPair.getDirector());
    }

    public String getDirectorByMovie(String movie){
        if(movieDirectorDb.containsKey(movie)){
            return movieDirectorDb.get(movie);
        }
        return null;
    }
}
