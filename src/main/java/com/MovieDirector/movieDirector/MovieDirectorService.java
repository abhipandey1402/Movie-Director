package com.MovieDirector.movieDirector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDirectorService {

    @Autowired
    MovieDirectorRepository movieDirectorRepository;

    public String addMovieDirector(String movie, String director){
        String response = movieDirectorRepository.addMovieDirector(movie, director);
        return response;
    }

    public String getDirectorByMovie(String movie){
        return movieDirectorRepository.getDirectorByMovie(movie);
    }
}
