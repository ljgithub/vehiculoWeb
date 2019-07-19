/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author JAVIER
 */
@Named(value = "colaboradorBean")
@ViewScoped
public class ColaboradorBean {

    private int idColaborador;
    private String nombres;
    private String apellidos;
    private int estado;
    
    
    /**
     * Creates a new instance of ColaboradorBean
     */
    public ColaboradorBean() {
        
    }

    public ColaboradorBean(int idColaborador, String nombres, String apellidos, int estado) {
        this.idColaborador = idColaborador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estado = estado;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
