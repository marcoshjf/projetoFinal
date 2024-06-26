package org.example.controller;

import org.example.model.Abrigo;
import org.example.service.AbrigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abrigos")
public class AbrigoController {
    @Autowired
    private AbrigoService service;

    @GetMapping
    public List<Abrigo> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Abrigo findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Abrigo save(@RequestBody Abrigo abrigo) {
        return service.save(abrigo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
