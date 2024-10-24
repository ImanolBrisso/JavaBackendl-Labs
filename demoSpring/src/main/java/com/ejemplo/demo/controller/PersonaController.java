package com.ejemplo.demo.controller;

import com.ejemplo.demo.model.Persona;
import com.ejemplo.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/")
    public String verPaginaInicio(Model modelo) {
        modelo.addAttribute("personas", personaRepository.findAll());
        return "index";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioPersona(Model modelo) {
        modelo.addAttribute("persona", new Persona());
        return "nueva_persona";
    }

    @PostMapping("/guardar")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaRepository.save(persona);
        return "redirect:/";
    }

}
