package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")

public class MoviesController {

    private final List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Fight Club", "David Fincher", 1999, 139));
        add(new Movie("The Godfather", "Francis Ford Coppola", 1972, 175));
        add(new Movie("Interstellar", "Christopher Nolan", 2014, 169));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {
        String movieList = "<ul>";
        for (Movie movie : movies) {
            movieList += "<li>" + movie + "</li>";
        }
        movieList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Movie</h1>
                        <ul>
                """ +
                movieList +
                """
                        </ul>
                    </body>
                """;
    }
}
