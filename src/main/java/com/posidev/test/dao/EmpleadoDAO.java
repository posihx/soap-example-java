/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posidev.test.dao;

import com.posidev.test.model.Empleado;
import java.util.List;

/**
 *
 * @author alfon
 */
public interface EmpleadoDAO {

    public List<Empleado> findAll();

    public Empleado findById(Empleado empleado);

    public Empleado findByNombre(Empleado empleado);

    public void insertEmpleado(Empleado empleado);

    public void updateEmpleado(Empleado empleado);

    public void deleteEmpleado(Empleado empleado);
}
