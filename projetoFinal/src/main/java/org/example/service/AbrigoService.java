package org.example.service;

import org.example.model.Abrigo;
import org.example.repository.AbrigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AbrigoService {
    @Autowired
    private AbrigoRepository repository;

    public List<Abrigo> findAll() {
        return repository.findAll();
    }

    public Abrigo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Abrigo save(Abrigo abrigo) {
        return repository.save(abrigo);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Abrigo updateAbrigo(Long id, Abrigo abrigoDetails) {
        Optional<Abrigo> abrigoOptional = repository.findById(id);
        if (abrigoOptional.isPresent()) {
            Abrigo abrigo = abrigoOptional.get();
            abrigo.setNome(abrigoDetails.getNome());
            abrigo.setEndereco(abrigoDetails.getEndereco());
            abrigo.setCapacidade(abrigoDetails.getCapacidade());
            return repository.save(abrigo);
        } else {
            throw new RuntimeException("Abrigo não encontrado com o id: " + id);
        }
    }
}
