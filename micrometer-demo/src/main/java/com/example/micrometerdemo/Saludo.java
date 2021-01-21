package com.example.micrometerdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Saludo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // genera el campo como AUTO_INCREMENT
    private Integer id;

    private String mensaje;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
