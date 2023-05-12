package com.bonanza.back.Service.Implement;

import com.bonanza.back.Model.Especies;
import com.bonanza.back.Model.Usuario;
import com.bonanza.back.Repository.EspeciesRepository;
import com.bonanza.back.Service.EspeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspeciesServiceImpl implements EspeciesService {

    @Autowired
    EspeciesRepository especiesRepository;

    public List<Especies> findAll() {
        return especiesRepository.findAll();
    }

    public List<Especies> listarEspecies(){
        return especiesRepository.listarEspecies();
    }
}
