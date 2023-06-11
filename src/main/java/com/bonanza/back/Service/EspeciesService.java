package com.bonanza.back.Service;


import com.bonanza.back.DTO.EspeciesDTO;
import com.bonanza.back.DTO.EstanquesDTO;
import com.bonanza.back.Model.Especies;
import com.bonanza.back.Model.Estanques;


import java.util.List;

public interface EspeciesService {
    public List<EspeciesDTO> listarEspecies(Integer id_usuario);
    Especies guardarEspecies(Especies especies);
}
