package com.example.lab6p.bean;

import java.sql.Time;

public class Reproduccion {
    private int idReproduccion;
    private Time fecha;
    private int nombreCancion;

    public Time getFecha() {
        return fecha;
    }

    public void setFecha(Time fecha) {
        this.fecha = fecha;
    }

    public int getIdReproduccion() {
        return idReproduccion;
    }

    public void setIdReproduccion(int idReproduccion) {
        this.idReproduccion = idReproduccion;
    }



    public int getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(int nombreCancion) {
        this.nombreCancion = nombreCancion;
    }
}
