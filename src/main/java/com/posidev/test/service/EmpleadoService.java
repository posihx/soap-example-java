/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posidev.test.service;

import com.posidev.test.model.Empleado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alfon
 */
@Local
public interface EmpleadoService {

    public List<Empleado> getAll();

    public Empleado findEmpleadoById(Empleado empleado);

    public Empleado findEmpleadoByName(Empleado empleado);

    public void createNewEmpleado(Empleado empleado);

    public void updateEmpleado(Empleado empleado);

    public void removeEmpleado(Empleado empleado);

}
