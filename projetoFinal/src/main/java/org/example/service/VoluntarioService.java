package org.example.service;

import org.example.model.Voluntario;
import org.example.repository.VoluntarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoluntarioService {
    @Autowired
    private VoluntarioRepository repository;

    public List<Voluntario> findAll() {
        return repository.findAll();
    }

    public Voluntario findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Voluntario save(Voluntario voluntario) {
        return repository.save(voluntario);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
