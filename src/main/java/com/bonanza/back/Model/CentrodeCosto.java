package com.bonanza.back.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "centrodecosto")
public class CentrodeCosto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String coordenadas;
    private String observacion;
    private String area;
    private String profundidad;
    private LocalDateTime fechaRegistro;

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @PrePersist
    public void asignarFechaRegistro() {
        fechaRegistro = LocalDateTime.now();
    }
}
