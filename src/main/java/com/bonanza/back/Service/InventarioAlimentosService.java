package com.bonanza.back.Service;

import com.bonanza.back.DTO.TipoAlimentos;
import com.bonanza.back.Model.InventarioAlimentos;
import com.bonanza.back.Model.Proveedor;

import java.util.List;

public interface InventarioAlimentosService {
    public List<TipoAlimentos> tiposAlimentos();

    public InventarioAlimentos guardarRegistroEntrada(InventarioAlimentos inventarioAlimentos);
}
