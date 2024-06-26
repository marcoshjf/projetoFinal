package org.example.controller;

import org.example.model.Donativo;
import org.example.service.DonativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donativos")
public class DonativoController {
    @Autowired
    private DonativoService service;

    @GetMapping
    public List<Donativo> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Donativo findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Donativo save(@RequestBody Donativo donativo) {
        return service.save(donativo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
