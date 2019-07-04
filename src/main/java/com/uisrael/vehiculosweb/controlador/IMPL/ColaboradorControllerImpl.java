/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.controlador.IMPL;

import com.uisrael.vehiculosweb.controlador.IColaboradorController;
import com.uisrael.vehiculosweb.modelo.DAO.IMPL.ColaboradorDaoImpl;
import com.uisrael.vehiculosweb.modelo.Entidades.Colaborador;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public class ColaboradorControllerImpl implements IColaboradorController{
    public void insertarColaborador(Colaborador c ){
        ColaboradorDaoImpl cd = new ColaboradorDaoImpl();    
        cd.insertarColaborador(c);
    }

    @Override
    public List<Colaborador> listarColaboradores() {
        ColaboradorDaoImpl cd = new ColaboradorDaoImpl();    
        
        return cd.listarColaboradores();
    }

    @Override
    public Colaborador buscarColaborador(int id) {
        ColaboradorDaoImpl cd = new ColaboradorDaoImpl();    
        return cd.buscarColaborador(id);        
    }

    @Override
    public List<Colaborador> buscarColaboradorPorApellidos(String apellido) {
        ColaboradorDaoImpl cd = new ColaboradorDaoImpl();    
        return cd.buscarColaboradorPorApellidos(apellido);
    }
    
    
}
