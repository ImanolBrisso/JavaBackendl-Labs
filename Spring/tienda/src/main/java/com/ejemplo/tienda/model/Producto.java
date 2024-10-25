package com.ejemplo.tienda.model;

import jakarta.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;
    private Double precio;

    // relacion Many-to-One con categoria
    @ManyToOne
    @JoinColumn(name = "categoria_id") // me refiero a la clase categoria y campo Id
    private Categoria categoria; // una instancia de objeto categoria


    public Producto(String nombre, Double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

}
