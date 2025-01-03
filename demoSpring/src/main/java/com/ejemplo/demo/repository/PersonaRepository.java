package com.ejemplo.demo.repository;

import com.ejemplo.demo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// operaciones CRUD: create read update delete

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
