package com.ejemplo.tienda.repository;

import com.ejemplo.tienda.model.Categoria;
import com.ejemplo.tienda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // metodo personalizado para encontrar productos por categoria con paginacion
    Page<Producto> findByCategoria(Categoria categoria, Pageable pageable);

    // metodo personalizado para buscar por nombre (que ignore las mayuscula y minusculas)
    // prefijos:
    Page<Producto>findByNombreContainingIgnoreCase(String nombre, Pageable pageable); // se busca por filtro - select from where - nombre
}
