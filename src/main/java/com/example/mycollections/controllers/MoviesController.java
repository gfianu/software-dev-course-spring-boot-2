package com.example.mycollections.controllers;

import com.example.mycollections.models.Movies;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")

public class MoviesController {

    private final List<Movies> movies = new ArrayList<>() {{
        add(new Movies("Fight Club", "David Fincher", 1999, 139));
        add(new Movies("The Godfather", "Francis Ford Coppola", 1972, 175));
        add(new Movies("Interstellar", "Christopher Nolan", 2014, 169));
    }};

    @GetMapping("/json")
    public List<Movies> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {
        String movieList = "<ul>";
        for (Movies movie : movies) {
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
