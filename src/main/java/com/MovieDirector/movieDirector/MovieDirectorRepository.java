package com.MovieDirector.movieDirector;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieDirectorRepository {

    HashMap<String, String> movieDirectorDb = new HashMap<>();

    public String addMovieDirector(String movie, String director){
       movieDirectorDb.put(movie, director);
        return "Movie Director Pair Added Successfully";
    }

    public String getDirectorByMovie(String movie){
        if(movieDirectorDb.containsKey(movie)){
            return movieDirectorDb.get(movie);
        }
        return null;
    }
}
