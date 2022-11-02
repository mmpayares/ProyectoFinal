package com.example.vinos.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Vino {
    private String vinoId;
    private String nombre;
    private String color;
    private String cepa;
    private String edad;
    private String pais;
    public Vino(String nombre, String color, String cepa, String edad, String pais) {
        this.nombre = nombre;
        this.color = color;
        this.cepa = cepa;
        this.edad = edad;
        this.pais = pais;
    }
    
}
