package com.ejemplo.demo.controller;

import com.ejemplo.demo.model.Persona;
import com.ejemplo.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

// Este es un controlador de Spring MVC
@Controller
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    // se establecen los metodos manejadores de get y post - se recuperan y envian datos

    // es el manejador de la raiz
    @GetMapping("/")
    public String verPaginaInicio(Model modelo) {
        modelo.addAttribute("personas", personaRepository.findAll());
        return "index";
    }


    // mostrar un formulario para crear una persona nueva - Retorna
    @GetMapping("/nueva")
    public String mostrarFormularioPersona(Model modelo) {
        modelo.addAttribute("persona", new Persona());
        return "nueva_persona";
    }

    // maneja el envio del formulario y guarda a la persona - Redirecciona a la raiz del manejador getmapping
    @PostMapping("/guardar")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaRepository.save(persona);
        return "redirect:/";
    }

}
