package com.torneo.golf.controller;

import com.torneo.golf.dto.GanadorDTO;
import com.torneo.golf.service.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TorneoController {

    @Autowired
    private TorneoService torneoService;

    @GetMapping("api/ganadores/{idTorneo}")
    public List<GanadorDTO> obtenerGanadores(@PathVariable("idTorneo") Long idTorneo) {
        return torneoService.procesarGanadores(idTorneo);
    }
}