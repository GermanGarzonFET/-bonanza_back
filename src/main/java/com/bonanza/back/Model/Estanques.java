package com.bonanza.back.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tipos_estanques")
public class Estanques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_estanque;
    private String uso;
    private String consecutivo;
    private String densidad_siembra;
    private String medicion;
    private String geolocation;
    private String evidencia_fotografica;
    private Integer id_usuario;

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
