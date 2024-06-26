package org.example.controller;

import org.example.model.Voluntario;
import org.example.service.VoluntarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntarios")
public class VoluntarioController {
    @Autowired
    private VoluntarioService service;

    @GetMapping
    public List<Voluntario> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Voluntario findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Voluntario save(@RequestBody Voluntario voluntario) {
        return service.save(voluntario);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
