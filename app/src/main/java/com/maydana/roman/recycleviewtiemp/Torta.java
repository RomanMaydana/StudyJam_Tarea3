package com.maydana.roman.recycleviewtiemp;

import java.io.Serializable;

public class Torta implements Serializable{

    private int imagen1,imagen2;
    private String Nombre, descripcion;

    public Torta(int imagen1, int imagen2, String nombre, String descripcion) {
        this.imagen1 = imagen1;
        this.imagen2 = imagen2;
        Nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getImagen1() {
        return imagen1;
    }

    public void setImagen1(int imagen1) {
        this.imagen1 = imagen1;
    }

    public int getImagen2() {
        return imagen2;
    }

    public void setImagen2(int imagen2) {
        this.imagen2 = imagen2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
