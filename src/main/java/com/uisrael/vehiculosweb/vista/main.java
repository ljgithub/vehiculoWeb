/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.vista;

import com.uisrael.vehiculosweb.controlador.IColaboradorController;
import com.uisrael.vehiculosweb.controlador.IMPL.ColaboradorControllerImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.Colaborador;

/**
 *
 * @author JAVIER
 */
public class main {
    public static void main(String [] args){
        Colaborador  colaborador = new Colaborador();
        colaborador.setIdColaborador(1);
        colaborador.setNombres("Javier");
        colaborador.setApellidos("Morales");
        
        
        IColaboradorController icc = new ColaboradorControllerImpl();
        icc.insertarColaborador(colaborador);
    }
    
}
