package com.example.myappaboscan;

public class modelosList {
    private String nombre,descripcion;
    private int blockimg;


    public modelosList() {
    }

    public modelosList(String nombre, String descripcion, int blockimg) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.blockimg = blockimg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getBlockimg() {
        return blockimg;
    }

    public void setBlockimg(int blockimg) {
        this.blockimg = blockimg;
    }
}
