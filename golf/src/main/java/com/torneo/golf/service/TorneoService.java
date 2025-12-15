package com.torneo.golf.service;

import com.torneo.golf.dto.GanadorDTO;
import com.torneo.golf.model.Etiqueta;
import com.torneo.golf.model.Jugador;
import com.torneo.golf.repository.ClasificacionRepository;
import com.torneo.golf.repository.EtiquetaRepository;
import com.torneo.golf.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TorneoService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;
    @Autowired
    private EtiquetaRepository etiquetaRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    public List<GanadorDTO> procesarGanadores(Long idTorneo) {

        List<Object[]> resultados = clasificacionRepository.encontrarGanadorPorTorneo(idTorneo);
        List<GanadorDTO> dtos = new ArrayList<>();


        Etiqueta etiquetaGanador = etiquetaRepository.findByDescripcion("GanadorDeTorneo");

        for (Object[] fila : resultados) {


            Long idJugador = ((Number) fila[0]).longValue();
            String nombre = (String) fila[1];
            String apellidos = (String) fila[2];
            Integer handicap = ((Number) fila[3]).intValue();
            Integer posicion = ((Number) fila[4]).intValue();
            String nombreTorneo = (String) fila[5];


            if (etiquetaGanador != null) {
                Jugador jugador = jugadorRepository.findById(idJugador).orElse(null);
                if (jugador != null) {
                    jugador.getEtiquetas().add(etiquetaGanador);
                    jugadorRepository.save(jugador);
                }
            }

            dtos.add(new GanadorDTO(nombre, apellidos, handicap, posicion, nombreTorneo));
        }

        return dtos;
    }
}