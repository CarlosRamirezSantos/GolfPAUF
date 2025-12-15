package com.torneo.golf.controller;

import com.torneo.golf.dto.ClasificacionDTO;
import com.torneo.golf.model.Etiqueta;
import com.torneo.golf.model.Jugador;
import com.torneo.golf.model.Torneo;
import com.torneo.golf.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clasificaciones")
public class ClasificacionController {
    @Autowired
    private ClasificacionService clasificacionService;


    //endpoint para calcular el premio del jugador
    /*@GetMapping("/api/repartoDinero")
    public Double obtenerPremio(
            @RequestParam Long idJugador,
            @RequestParam Long idTorneo
    ){
        //llamamos al servicio
        Double cantidadGanada = clasificacionService.calcularPremio(idJugador,idTorneo);

        return cantidadGanada;
    }*/

}
