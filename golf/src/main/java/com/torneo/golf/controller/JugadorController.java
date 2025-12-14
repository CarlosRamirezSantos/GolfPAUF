package com.torneo.golf.controller;

import com.torneo.golf.dto.JugadorDTO;
import com.torneo.golf.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @GetMapping("/api/listaJugadores")
    public List<JugadorDTO> listar() {
        return jugadorService.findAll();
    }

    @GetMapping("/api/obtenerJugador/{id}")
    public JugadorDTO obtenerJugador(@PathVariable("id") Long id){
        return jugadorService.obtenerJugador(id);
    }

}


