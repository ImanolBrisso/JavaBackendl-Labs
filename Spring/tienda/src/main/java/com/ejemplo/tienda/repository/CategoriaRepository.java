package com.ejemplo.tienda.repository;

// Aca de se modifica las consultas de datos

import com.ejemplo.tienda.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
