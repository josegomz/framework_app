/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.framework.struts.service;

import com.framework.struts.entity.Struts;
import java.util.List;

/**
 *
 * @author labtw13
 */
public interface IStrutsService {

    public void crearRegistro(Struts struts);

    public void actualizarRegistro(Struts struts);

    public void eliminarRegistro(Struts struts);

    public Struts obtenerRegistro(Long codigo);

    public List<Struts> obtenerRegistros();

}
