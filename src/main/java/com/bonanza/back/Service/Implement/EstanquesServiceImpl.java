package com.bonanza.back.Service.Implement;

import com.bonanza.back.DTO.EstanquesDTO;
import com.bonanza.back.DTO.RequestEstanques;
import com.bonanza.back.Model.Estanques;
import com.bonanza.back.Repository.EstanquesRepository;
import com.bonanza.back.Service.EstanquesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EstanquesServiceImpl implements EstanquesService {
    @Autowired
    EstanquesRepository estanquesRepository;

    public List<EstanquesDTO> findAll(Integer id_usuario) {
        return estanquesRepository.listar(id_usuario);
    }

    public Estanques guardarEstanques(Estanques estanques) {
        return estanquesRepository.save(estanques);
    }

    @Override
    @Transactional
    public Estanques save(Estanques estanques) {
        return estanquesRepository.save(estanques);
    }
}
