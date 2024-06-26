package org.example.repository;

import org.example.model.Donativo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonativoRepository extends JpaRepository<Donativo, Long> {}
