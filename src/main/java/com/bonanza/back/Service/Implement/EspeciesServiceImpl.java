package com.bonanza.back.Service.Implement;

import com.bonanza.back.DTO.EspeciesDTO;
import com.bonanza.back.Model.Especies;
import com.bonanza.back.Model.Estanques;
import com.bonanza.back.Repository.EspeciesRepository;
import com.bonanza.back.Service.EspeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspeciesServiceImpl implements EspeciesService {

    @Autowired
    EspeciesRepository especiesRepository;

    public List<EspeciesDTO> listarEspecies(Integer id_usuario) {
        return especiesRepository.listarEspecies(id_usuario);
    }

    public Especies guardarEspecies(Especies especies) {
        return especiesRepository.save(especies);
    }



}
