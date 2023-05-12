package com.bonanza.back.Service.Implement;

import com.bonanza.back.DTO.TipoAlimentos;
import com.bonanza.back.Model.CentrodeCosto;
import com.bonanza.back.Repository.CentrodeCostoRepository;
import com.bonanza.back.Service.CentrodeCostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentrodeCostoServiceImpl implements CentrodeCostoService {

    @Autowired
    CentrodeCostoRepository centrodeCostoRepository;
    public CentrodeCosto guardarCentrodeCosto(CentrodeCosto centrodeCosto) {
        return centrodeCostoRepository.save(centrodeCosto);
    }
    public List<CentrodeCosto> listarCentrodeCosto() {
        return centrodeCostoRepository.listarCentrodeCosto();
    }

    @Override
    public void eliminarCentrodeCosto(Long centrodecostoId) {
        centrodeCostoRepository.deleteById(centrodecostoId);
    }
}
