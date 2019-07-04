/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.vehiculosweb.modelo.DAO;

import com.uisrael.vehiculosweb.modelo.Entidades.Colaborador;
import java.util.List;

/**
 *
 * @author jjmm7
 */
public interface IColaboradorDao {
    public void insertarColaborador(Colaborador c);
    public List<Colaborador> listarColaboradores();
    public Colaborador buscarColaborador(int id);
    
    public List<Colaborador> buscarColaboradorPorApellidos(String apellido);
}
