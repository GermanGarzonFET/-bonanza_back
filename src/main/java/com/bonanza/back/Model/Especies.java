package com.bonanza.back.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "especies")
public class Especies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_especie;

    private LocalDateTime fecha_registro;


    private Integer id_usuario;

    public LocalDateTime getFechaRegistro() {
        return fecha_registro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fecha_registro = fechaRegistro;
    }

    @PrePersist
    public void asignarFechaRegistro() {
        fecha_registro = LocalDateTime.now();
    }
}
