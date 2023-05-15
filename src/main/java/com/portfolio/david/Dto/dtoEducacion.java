/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.david.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String fechainicioE;
    @NotBlank
    private String fechafinE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String fechainicioE, String fechafinE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechainicioE = fechainicioE;
        this.fechafinE = fechafinE;
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
