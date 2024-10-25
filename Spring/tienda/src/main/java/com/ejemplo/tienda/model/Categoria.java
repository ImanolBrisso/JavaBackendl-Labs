package com.ejemplo.tienda.model;

import jakarta.persistence.*;
import java.util.*;

public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // anotaciones para un campo - clave primaria

    private String nombre;

    // relacion One-To-Many con producto. - Una categoria le puede permanecer a muchos productos pero no viceversa

    // Diseño base de datos
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Categoria() {

    }

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
