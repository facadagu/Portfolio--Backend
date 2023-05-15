/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.david.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String fechainicioE;
    private String fechafinE;

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, String fechainicioE, String fechafinE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechainicioE = fechainicioE;
        this.fechafinE = fechafinE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFechainicioE() {
        return fechainicioE;
    }

    public void setFechainicioE(String fechainicioE) {
        this.fechainicioE = fechainicioE;
    }

    public String getFechafinE() {
        return fechafinE;
    }

    public void setFechafinE(String fechafinE) {
        this.fechafinE = fechafinE;
    }


}
