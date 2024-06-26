package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ajuda")
public class AjudaController {

    @GetMapping
    public Map<String, Object> getAjuda() {
        Map<String, Object> response = new HashMap<>();
        response.put("estudantes", Arrays.asList("fulano", "beltrano"));
        response.put("projeto", "nome do projeto");
        response.put("tema", "tema do projeto");
        return response;
    }
}
