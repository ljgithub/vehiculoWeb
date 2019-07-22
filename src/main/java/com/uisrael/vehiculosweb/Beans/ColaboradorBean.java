/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.Beans;

import com.uisrael.vehiculosweb.controlador.IColaboradorController;
import com.uisrael.vehiculosweb.controlador.IMPL.ColaboradorControllerImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.Colaborador;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.view.ViewScoped;




/**
 *
 * @author JAVIER
 */
@ManagedBean(name = "colaboradorBean")
@ViewScoped
public class ColaboradorBean implements Serializable{

    private static final IColaboradorController icc = new ColaboradorControllerImpl();
    
    private int idColaborador;
    private String nombres;
    private String apellidos;
    private int estado;
    
    private Colaborador colaborador;
    
    private List<Colaborador> listaColaboradores;
    
    /**
     * Creates a new instance of ColaboradorBean
     */

    
    public ColaboradorBean() {
        
    }

    @PostConstruct
    public void init(){
        System.out.println("Manejador Creado y listo");
    }
    
    
     public void insertarColaborador(){
        colaborador = new Colaborador();
        colaborador.setNombres(nombres);
        colaborador.setApellidos(apellidos);
        colaborador.setEstado(estado);
        icc.insertarColaborador(colaborador);
        System.out.println("ColaboradorInsertado" + nombres);
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

    public List<Colaborador> getListaColaboradores() {
        return listaColaboradores;
    }

    public void setListaColaboradores(List<Colaborador> listaColaboradores) {
        this.listaColaboradores = listaColaboradores;
    }
    
  
    
}
