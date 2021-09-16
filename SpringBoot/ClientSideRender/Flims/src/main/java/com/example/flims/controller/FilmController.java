package com.example.flims.controller;

import com.example.flims.model.Films;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/")
public class FilmController {
    @GetMapping("/films")
    public String listFilm(Model model) {
        List<Films> films = List.of(
                new Films("Gone with the Wind", "Victor Fleming, David O. Selznick",1939L),
                new Films("Bố Già", "Trấn Thành",2020L),
                new Films("Parasite", "Bong Joon-ho",2019L),
                new Films("Money Heist", "Álex Pina",2018L)
        );
        model.addAttribute("films", films);
        return "films";
    }
}
