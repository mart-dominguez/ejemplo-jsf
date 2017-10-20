package com.mavha.cursos.java.ejemplo.jsf;


import com.mavha.cursos.java.ejemplo.logica.Conversor;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdominguez
 */
@Named("conversorBean")
@RequestScoped
public class BeanPaginaConversion {
    @Inject 
    private Conversor conversor;
    
    @Inject
    BeanHistorial historial;
    
    private Double temperaturaIngreso;
    private Double temperaturaResultado;
    
    public String irx(){
        historial.doalgo();
        if(temperaturaIngreso!=null && temperaturaIngreso%2==0) return "pagina2.xhtml";
        return "pagina1.xhtml";
    }
    
    public void farenheitToCelcius(){
        this.temperaturaResultado = conversor.farenheitToCelcius(temperaturaIngreso);
    }
    
    public void celciusToFarenheit(){
        this.temperaturaResultado = conversor.celciusToFarenheit(temperaturaIngreso);
    }

    public Conversor getConversor() {
        return conversor;
    }

    public void setConversor(Conversor conversor) {
        this.conversor = conversor;
    }

    public Double getTemperaturaIngreso() {
        return temperaturaIngreso;
    }

    public void setTemperaturaIngreso(Double temperaturaIngreso) {
        this.temperaturaIngreso = temperaturaIngreso;
    }

    public Double getTemperaturaResultado() {
        return temperaturaResultado;
    }

    public void setTemperaturaResultado(Double temperaturaResultado) {
        this.temperaturaResultado = temperaturaResultado;
    }

    
}
