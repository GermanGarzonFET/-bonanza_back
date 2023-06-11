package com.bonanza.back.Service;

import com.bonanza.back.DTO.EstanquesDTO;
import com.bonanza.back.Model.Estanques;

import java.util.List;

public interface EstanquesService {

    public List<EstanquesDTO> findAll(Integer id_usuario);

    public Estanques guardarEstanques(Estanques estanques);
    public Estanques save(Estanques estanques);
}
