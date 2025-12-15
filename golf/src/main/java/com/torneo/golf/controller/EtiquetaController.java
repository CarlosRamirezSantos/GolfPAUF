package com.torneo.golf.controller;

import com.torneo.golf.model.Etiqueta;
import com.torneo.golf.service.EtiquetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtiquetaController {

    @Autowired
    private EtiquetaService etiquetaService;

    @PostMapping("api/insertarEtiqueta")
    public Etiqueta insertarEtiqueta(@RequestBody Etiqueta etiqueta) {
        return etiquetaService.guardarEtiqueta(etiqueta);
    }
}