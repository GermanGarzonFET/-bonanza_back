package com.bonanza.back.Controller;

import com.bonanza.back.DTO.EspeciesDTO;
import com.bonanza.back.DTO.RequestEstanques;
import com.bonanza.back.Model.Especies;
import com.bonanza.back.Model.Estanques;
import com.bonanza.back.Service.EspeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/especies")
@CrossOrigin("*")
public class EspeciesController {

    @Autowired
    EspeciesService especiesService;

    @PostMapping("/listar")
    private List<EspeciesDTO> listarEspecies (@Validated @RequestBody RequestEstanques request){
        Integer usuario = request.getId_usuario();
        return especiesService.listarEspecies(usuario);
    }

    @PostMapping("/")
    public Especies guardarEspecies(@Validated @RequestBody Especies especies) throws Exception{
        return especiesService.guardarEspecies(especies);
    }
}
