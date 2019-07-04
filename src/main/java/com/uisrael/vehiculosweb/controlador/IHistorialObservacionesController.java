/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador;

import com.uisrael.vehiculosweb.modelo.Entidades.HistorialObservaciones;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public interface IHistorialObservacionesController {
    public void insertarHistorialObservaciones(HistorialObservaciones h);
    public List<HistorialObservaciones> listarHistorialObservacioneses();
    public HistorialObservaciones buscarHistorialObservaciones(int id);
    
    public List<HistorialObservaciones> buscarHistorialPorObservacion(String observacion);
}
