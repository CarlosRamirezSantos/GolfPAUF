package com.torneo.golf.service;

import com.torneo.golf.model.Clasificacion;
import com.torneo.golf.repository.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    public Double calcularPremio(Long idJugador, Long idTorneo) {

        Clasificacion clasificacion = clasificacionRepository.findByJugadorIdAndTorneoId(idJugador, idTorneo);

        if (clasificacion == null) {
            return 0.0;
        }

        Integer posicion = clasificacion.getPosicion();

        Double premioTotal = clasificacion.getTorneo().getPremioTotal();
        Double premioGanado = 0.0;


        if (posicion == 1) {
            premioGanado = premioTotal * 0.50;
        } else if (posicion == 2) {
            premioGanado = premioTotal * 0.30;
        } else if (posicion == 3) {
            premioGanado = premioTotal * 0.20;
        }


        return premioGanado;
    }
}