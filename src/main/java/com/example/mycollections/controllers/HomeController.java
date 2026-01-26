package com.example.mycollections.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping("/")
    public String home() {
        return """
            <html>
                <body>
                    <h1>Spring Boot Personal Library Viewer</h1>
                    <h2>Available Endpoints:</h2>
                    <ul>
                        <li><a href="/books/html">Books HTML</a> - Shows a list of three books in HTML format</li>
                        <li><a href="/books/json">Books JSON</a> - Shows a list of three books in JSON format</li>
                        <li><a href="/albums/html">Albums HTML</a> - Shows a list of three albums in HTML format</li>
                        <li><a href="/albums/json">Albums JSON</a> - Shows a list of three albums in JSON format</li>
                        <li><a href="/movies/html">Movies HTML</a> - Shows a list of three movies in HTML format</li>
                        <li><a href="/movies/json">Movies JSON</a> - Shows a list of three movies in JSON format</li>
                    </ul>
                </body>
            </html>
        """;
    }
}
