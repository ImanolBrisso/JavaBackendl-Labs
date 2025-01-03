package com.ejemplo.tienda.model;

import jakarta.persistence.*;

@Entity
public class Producto {
    @Id // Para dejar "numero largo"
    @GeneratedValue(strategy = GenerationType.IDENTITY) // se usan identificadores para las bases de datos autogeneradas
    private Long id;

    private String nombre;
    private Double precio;

    // relacion Many-to-One con categoria.
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Producto() {
    }

    public Producto(String nombre, Double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}