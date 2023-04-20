package com.bonanza.back.Service.Implement;

import com.bonanza.back.DTO.TipoAlimentos;
import com.bonanza.back.Model.InventarioAlimentos;
import com.bonanza.back.Model.Proveedor;
import com.bonanza.back.Repository.InventarioAlimentosRepository;
import com.bonanza.back.Service.InventarioAlimentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioAlimentosServiceImpl implements InventarioAlimentosService {
    @Autowired
    private InventarioAlimentosRepository inventarioAlimentosRepository;

    public List<TipoAlimentos> tiposAlimentos() {
        return inventarioAlimentosRepository.tiposAlimentos();
    }
    public InventarioAlimentos guardarRegistroEntrada(InventarioAlimentos inventarioAlimentos) {
        return inventarioAlimentosRepository.save(inventarioAlimentos);
    }
}
