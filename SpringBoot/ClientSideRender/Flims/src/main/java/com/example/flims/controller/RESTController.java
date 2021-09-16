package com.example.flims.controller;


import com.example.flims.model.Films;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class RESTController {
    @GetMapping("/films")
    public ResponseEntity<List<Films>> listFilms() {
        List<Films> films = List.of(
                new Films("Gone with the Wind", "Victor Fleming, David O. Selznick",1939L),
                new Films("Bố Già", "Trấn Thành",2020L),
                new Films("Parasite", "Bong Joon-ho",2019L),
                new Films("Money Heist", "Álex Pina",2018L)
        );
        return ResponseEntity.ok().body(films);
    }
}
