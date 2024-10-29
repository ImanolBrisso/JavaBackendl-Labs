package com.ejemplo.tienda.controller;

import com.ejemplo.tienda.model.Producto;
import com.ejemplo.tienda.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProductoController {

    @Autowired // simplifica la creacion de las instancias - las crea cuando las necesita
    private ProductoRepository productoRepository; // primer metodo a iniciarse

    @GetMapping("/productos")// metodo
    public String listarProductos(Model model, int page, int size) {
        Page<Producto> paginaProductos = productoRepository.findAll(PageRequest.of(page, size));
        model.addAttribute("paginaProductos", paginaProductos);
        return "productos"; // endpoint a utilizar ya que es un http "return"
    }
}
