package com.example.mycollections.controllers;

import com.example.mycollections.models.Albums;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")

public class AlbumsController {

    private final List<Albums> albums = new ArrayList<>(){{
        add(new Albums("Born to Run", "Bruce Springsteen", 1975, 8));
        add(new Albums("Never mind", "Nirvana", 1991, 13));
        add(new Albums("1989", "Taylor Swift", 2014, 13));

    }};

    @GetMapping("/json")
    public List<Albums> getAlbumsJson() {
        return albums;
    }


    @GetMapping("/html")
    public String getAlbumHtml() {
        String albumList = "<ul>";
        for (Albums album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Album</h1>
                        <ul>
                """ +
                albumList +
                """
                        </ul>
                    </body>
                """;
    }

}



