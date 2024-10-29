package com.ejemplo.tienda.repository;

import com.ejemplo.tienda.model.Categoria;
import com.ejemplo.tienda.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // metodo personalizado para encontrar productos por categoria con paginacion
    // findby: significa buscar (select producto nombre y un where)
    // Categoria: campo por el cual se filtra
    Page<Producto> findByCategoria(Categoria categoria, Pageable pageable);

    // metodo personalizado para buscar por nombre (que ignore las mayuscula y minusculas) "Congelados" , "CONGELADOS"
    // Containing: es una busqueda especifica realizada por un string que se le pasa explicitamente
    // IgnoreCase: no le hace caso a las mayúsculas o minusculas
    // countBy (COUNT(*), COUNT(nombre))
    Page<Producto>findByNombreContainingIgnoreCase(String nombre, Pageable pageable); // se busca por filtro - select from where - nombre
}
