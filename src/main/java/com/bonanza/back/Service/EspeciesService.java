package com.bonanza.back.Service;


import com.bonanza.back.Model.Especies;


import java.util.List;

public interface EspeciesService {
    public List<Especies> findAll();

    public List<Especies> listarEspecies();
}
