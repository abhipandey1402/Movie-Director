package com.MovieDirector.movieDirector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieDirectorService {

    @Autowired
    MovieDirectorRepository movieDirectorRepository;

    public void addMovieDirector(MovieDirectorPair pair){
        movieDirectorRepository.addMovieDirector(pair);
    }

    public String getDirectorByMovie(String movie){
        return movieDirectorRepository.getDirectorByMovie(movie);
    }
}
