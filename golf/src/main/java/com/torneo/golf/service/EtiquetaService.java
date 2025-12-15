package com.torneo.golf.service;

import com.torneo.golf.model.Etiqueta;
import com.torneo.golf.repository.EtiquetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtiquetaService {

    @Autowired
    private EtiquetaRepository etiquetaRepository;

    public Etiqueta guardarEtiqueta(Etiqueta etiqueta) {
        return etiquetaRepository.save(etiqueta);
    }
}