/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavha.cursos.java.ejemplo.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author mdominguez
 */
@Named("beanTabla")
@SessionScoped
public class BeanTabla implements Serializable {
    private List<Tarea> tareas;
    private Tarea unatarea;
    

    
    @PostConstruct
    public void init(){
        this.tareas =new ArrayList<>();
        this.tareas.add(new Tarea(1, "tarea 1", new Date(), false));
        this.tareas.add(new Tarea(2, "tarea 2", new Date(), false));
        this.tareas.add(new Tarea(3, "tarea 3", new Date(), false));
        this.tareas.add(new Tarea(4, "tarea 4", new Date(), false));
        this.tareas.add(new Tarea(5, "tarea 5", new Date(), false));
        this.tareas.add(new Tarea(6, "tarea 6", new Date(), false));
        this.tareas.add(new Tarea(7, "tarea 7", new Date(), false));
        this.tareas.add(new Tarea(8, "tarea 8", new Date(), false));
        this.tareas.add(new Tarea(9, "tarea 9", new Date(), false));
        this.tareas.add(new Tarea(10, "tarea 10", new Date(), false));        
        unatarea = new Tarea();                
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public Tarea getUnatarea() {
        return unatarea;
    }

    public void setUnatarea(Tarea unatarea) {
        this.unatarea = unatarea;
    }
    
}
