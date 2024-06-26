package org.example.service;

import org.example.model.Donativo;
import org.example.repository.DonativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonativoService {
    @Autowired
    private DonativoRepository repository;

    public List<Donativo> findAll() {
        return repository.findAll();
    }

    public Donativo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Donativo save(Donativo donativo) {
        return repository.save(donativo);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
