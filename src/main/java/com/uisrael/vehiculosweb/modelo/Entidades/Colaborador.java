/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author jjmm7
 */
@Entity
@Table(name = "colaborador")
public class Colaborador implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idColaborador;
    private String nombres;
    private String apellidos;
    private int estado;

    @OneToMany(mappedBy = "colaborador", cascade = CascadeType.ALL)
    private List<OrdenTrabajo> ordenes = new ArrayList<>();
    
    public Colaborador() {
    }

    public Colaborador(int idColaborador, String nombres, String apellidos, int estado) {
        this.idColaborador = idColaborador;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estado = estado;
    }
    
    public List<OrdenTrabajo> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<OrdenTrabajo> ordenes) {
        this.ordenes = ordenes;
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

    @Override
    public String toString() {
        return "Colaborador{" + "idColaborador=" + idColaborador + ", nombres=" + nombres + ", apellidos=" + apellidos + ", estado=" + estado + ", ordenes=" + ordenes + '}';
    }


}
