/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.ejemplo.jsf;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author martdominguez
 */
@Named("combosBean")
@RequestScoped
public class BeanCombos {
    
    private Boolean recibirNotificaciones=true;
    private Boolean aceptoCondiciones=true;

    public Boolean getRecibirNotificaciones() {
        return recibirNotificaciones;
    }

    public void setRecibirNotificaciones(Boolean recibirNotificaciones) {
        this.recibirNotificaciones = recibirNotificaciones;
    }

    public Boolean getAceptoCondiciones() {
        return aceptoCondiciones;
    }

    public void setAceptoCondiciones(Boolean aceptoCondiciones) {
        this.aceptoCondiciones = aceptoCondiciones;
    }
    
    
    
}
