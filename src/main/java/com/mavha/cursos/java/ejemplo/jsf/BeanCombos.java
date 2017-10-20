/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.ejemplo.jsf;

import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author martdominguez
 */
@Named("combosBean")
@SessionScoped
public class BeanCombos implements Serializable{
    
    private List<Idioma> listaIdiomas;
    private Integer idIdioma;
    private Integer idIdiomaPF;
    private String idIdioma2;
    
    @PostConstruct
    public void init(){
        this.listaIdiomas = new ArrayList<>();
        listaIdiomas.add(new Idioma(1, "INGLES", "ENG"));
        listaIdiomas.add(new Idioma(2, "Portugues", "FRA"));
        listaIdiomas.add(new Idioma(3, "Aleman", "GER"));
    }
    
    private String[] idiomas;
    private String[] idiomas2;
    
    private String misIdiomas;
    
    private Boolean recibirNotificaciones=true;
    private Boolean aceptoCondiciones=true;
    private Boolean recibirNotificaciones2=true;
    private Boolean aceptoCondiciones2=true;
    private String notificarme;
    private String condiciones;

    public Boolean getRecibirNotificaciones2() {
        return recibirNotificaciones2;
    }

    public void setRecibirNotificaciones2(Boolean recibirNotificaciones2) {
        this.recibirNotificaciones2 = recibirNotificaciones2;
    }

    public Boolean getAceptoCondiciones2() {
        return aceptoCondiciones2;
    }

    public void setAceptoCondiciones2(Boolean aceptoCondiciones2) {
        this.aceptoCondiciones2 = aceptoCondiciones2;
    }

    
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

    public String getNotificarme() {
        return notificarme;
    }

    public void setNotificarme(String notificarme) {
        this.notificarme = notificarme;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String getMisIdiomas() {
        return misIdiomas;
    }

    public void setMisIdiomas(String misIdiomas) {
        this.misIdiomas = misIdiomas;
    }

    public String[] getIdiomas2() {
        return idiomas2;
    }

    public void setIdiomas2(String[] idiomas2) {
        this.idiomas2 = idiomas2;
    }
    
    
    

    public void procesarCondiciones2(){
        System.out.println("::::::"+this.aceptoCondiciones2);
        System.out.println("---"+this.recibirNotificaciones2);
        condiciones = this.aceptoCondiciones2 ? " Condiciones Aceptadas" : "Condiciones rechazadas";        
    }    

    public List<Idioma> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(List<Idioma> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }

    public Integer getIdIdioma() {
        return idIdioma;
    }

    public void setIdIdioma(Integer idIdioma) {
        this.idIdioma = idIdioma;
    }

    public String getIdIdioma2() {
        return idIdioma2;
    }

    public void setIdIdioma2(String idIdioma2) {
        this.idIdioma2 = idIdioma2;
    }

    public Integer getIdIdiomaPF() {
        return idIdiomaPF;
    }

    public void setIdIdiomaPF(Integer idIdiomaPF) {
        this.idIdiomaPF = idIdiomaPF;
    }
    
    

    
    
    public void procesarNotifiacicones2(){
        System.out.println("::::::"+this.aceptoCondiciones2);
        System.out.println("---"+this.recibirNotificaciones2);        
        notificarme = this.recibirNotificaciones2  ? " Notificarme de todo" : "No me notifiquen nunca";        
    }    
    public String procesarForm2(){
        System.out.println("::::::"+this.aceptoCondiciones);
        System.out.println("---"+this.recibirNotificaciones);
        condiciones = this.aceptoCondiciones ? " Condiciones Aceptadas" : "Condiciones rechazadas";        
        notificarme = this.recibirNotificaciones  ? " Notificarme de todo" : "No me notifiquen nunca";        
        this.misIdiomas = "Idiomas  : "+ Arrays.toString(this.idiomas)+"\r\n";
        this.misIdiomas += "Idiomas 2: "+ Arrays.toString(this.idiomas2)+"\r\n";
        this.misIdiomas += "Id idioma principal: "+ this.idIdioma+"\r\n";
        this.misIdiomas += "Id idioma PF : "+ this.idIdiomaPF+"\r\n";
        this.misIdiomas += "Id idioma principal string: "+ this.idIdioma2+"\r\n";
        return null;
    }


    
}
