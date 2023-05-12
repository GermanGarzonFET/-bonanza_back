package com.bonanza.back.Controller;

import com.bonanza.back.Model.CentrodeCosto;
import com.bonanza.back.Service.CentrodeCostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centrodecosto")
@CrossOrigin("*")
public class CentrodeCostoController {
    @Autowired
    CentrodeCostoService centrodeCostoService;

    @PostMapping("/")
    public CentrodeCosto guardarCentrodeCosto(@RequestBody CentrodeCosto centrodeCosto) throws Exception{
        return centrodeCostoService.guardarCentrodeCosto(centrodeCosto);
    }

    @GetMapping("/listar")
    private ResponseEntity<List<CentrodeCosto>> listarCentrodeCosto() {
        return ResponseEntity.ok(centrodeCostoService.listarCentrodeCosto());
    }

    @DeleteMapping("/eliminar/{centrodecostoId}")
    public void eliminarCentrodeCosto(@PathVariable("centrodecostoId") Long centrodecostoId){
        centrodeCostoService.eliminarCentrodeCosto(centrodecostoId);
    }
}
