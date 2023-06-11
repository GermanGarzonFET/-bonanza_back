package com.bonanza.back.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "lote")
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy", locale = "es-CO", timezone = "America/Bogota")
    private Date fecha_siembra;
    private String proveedor;
    private String densidad_siembra;
    private Integer numero_animales;
    private String centro_costo;
    private String especie;
    private String dias_cultivo;

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
