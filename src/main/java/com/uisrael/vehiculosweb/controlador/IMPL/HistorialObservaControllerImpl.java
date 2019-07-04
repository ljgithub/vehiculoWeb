/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador.IMPL;

import com.uisrael.vehiculosweb.controlador.IHistorialObservacionesController;
import com.uisrael.vehiculosweb.modelo.DAO.IMPL.HistorialObservacionesDaoImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.HistorialObservaciones;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public class HistorialObservaControllerImpl implements IHistorialObservacionesController{

    @Override
    public void insertarHistorialObservaciones(HistorialObservaciones h) {
        try {
            HistorialObservacionesDaoImpl hd = new HistorialObservacionesDaoImpl();
            hd.insertarHistorialObservaciones(h);
        } catch (Exception e) {
            System.err.println("Error en el Controlador");
        }
    }

    @Override
    public List<HistorialObservaciones> listarHistorialObservacioneses() {
        HistorialObservacionesDaoImpl cd = new HistorialObservacionesDaoImpl();    
        return cd.listarHistorialObservacioneses();
    }

    @Override
    public HistorialObservaciones buscarHistorialObservaciones(int id) {
        HistorialObservacionesDaoImpl cd = new HistorialObservacionesDaoImpl();    
        return cd.buscarHistorialObservaciones(id);
    }

    @Override
    public List<HistorialObservaciones> buscarHistorialPorObservacion(String observacion) {
         HistorialObservacionesDaoImpl cd = new HistorialObservacionesDaoImpl();    
        return cd.buscarHistorialPorObservacion(observacion);
    }
   
}
