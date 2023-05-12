package com.bonanza.back.Controller;

import com.bonanza.back.Model.Lote;
import com.bonanza.back.Service.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lote")
@CrossOrigin("*")
public class LoteController {
    @Autowired
    LoteService loteService;

    @PostMapping("/")
    public Lote guardarLote(@RequestBody Lote lote) throws Exception{
        return loteService.guardarLote(lote);
    }

    @GetMapping("/listar")
    private ResponseEntity<List<Lote>> listarLote() {
        return ResponseEntity.ok(loteService.listarLote());
    }

    @DeleteMapping("/eliminar/{loteId}")
    public void eliminarLote(@PathVariable("loteId") Long loteId){
        loteService.eliminarLote(loteId);
    }
}
