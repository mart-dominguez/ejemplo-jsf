/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.ejemplo.jsf;

import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author mdominguez
 */
public class Tarea  implements Serializable {
    private Integer id;
    private String descripcion;
    private Date fechaCarga;
    private Boolean finalizada;

    public Tarea() {
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }

    
    public Tarea(Integer id, String descripcion, Date fechaCarga, Boolean finalizada) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaCarga = fechaCarga;
        this.finalizada = finalizada;
    }
    
    
}
