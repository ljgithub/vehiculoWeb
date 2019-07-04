/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador;

import com.uisrael.vehiculosweb.modelo.Entidades.Tipo;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public interface ITipoController {
    public void insertarTipo(Tipo t);
    public List<Tipo> listarTipoes();
    public Tipo buscarTipo(int id);
    
    public List<Tipo> buscarTipoPorFuncion(String funcion);
}
