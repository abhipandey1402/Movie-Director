package com.MovieDirector.movieDirector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieDirectorController {

    @Autowired
    MovieDirectorService movieDirectorService;

    @PostMapping("/add-movie-director")
    public void addMovieDirector(@RequestBody() MovieDirectorPair pair){
        movieDirectorService.addMovieDirector(pair);
    }

    @GetMapping("/get-director-by-movie")
    public ResponseEntity<String> getDirectorByMovie(@RequestParam() String movie){
        String response = movieDirectorService.getDirectorByMovie(movie);

        if(response != null)
            return new ResponseEntity<>(response, HttpStatus.FOUND);

            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
