package com.bonanza.back.Controller;

import com.bonanza.back.DTO.TipoAlimentos;
import com.bonanza.back.Model.InventarioAlimentos;
import com.bonanza.back.Model.Proveedor;
import com.bonanza.back.Service.InventarioAlimentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventario_alimentos")
@CrossOrigin("*")
public class InventarioAlimentoController {

    @Autowired
    InventarioAlimentosService inventarioAlimentosService;

    @GetMapping("/tiposAliemntos")
    private ResponseEntity<List<TipoAlimentos>> tiposAlimentos() {
        return ResponseEntity.ok(inventarioAlimentosService.tiposAlimentos());
    }

    @PostMapping("/registroEntrada/")
    public InventarioAlimentos guardarRegistroEntrada(@RequestBody InventarioAlimentos inventarioAlimentos) throws Exception{

        return inventarioAlimentosService.guardarRegistroEntrada(inventarioAlimentos);
    }
}
