package com.ejemplo.demo.controller;

import com.ejemplo.demo.model.Persona;
import com.ejemplo.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// este es un controlador de Spring MVC
@Controller
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    // metodos manejadores de get y post

    // este el manejador de la raiz
    @GetMapping("/")
    public String verPaginaInicio(Model modelo) {
        modelo.addAttribute("personas", personaRepository.findAll());
        return "index";
    }

    // mostrar un formulario para crear una persona nueva
    // Model permite pasar datos del controlador a la vista
    // la solicitud get se pasa a `http://localhost:8080/nueva`
    @GetMapping("/nueva")
    public String mostrarFormularioPersona(Model modelo) {
        modelo.addAttribute("persona", new Persona());
        return "nueva_persona";
    }

    // maneja el envio del formulario y guarda la persona
    @PostMapping("/guardar")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaRepository.save(persona);
        return "redirect:/";
    }

}
