/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posidev.test.service.impl;

import com.posidev.test.dao.EmpleadoDAO;
import com.posidev.test.model.Empleado;
import com.posidev.test.service.EmpleadoService;
import com.posidev.test.service.EmpleadoServiceWS;
import java.util.List;
import javax.inject.Inject;
import javax.jws.WebService;

/**
 *
 * @author alfon
 */
@WebService(endpointInterface = "com.posidev.test.service.EmpleadoServiceWS")
public class EmpleadoServiceImpl implements EmpleadoService, EmpleadoServiceWS {

    @Inject
    private EmpleadoDAO empleadoDAO;

    @Override
    public List<Empleado> getAll() {
        return empleadoDAO.findAll();
    }

    @Override
    public Empleado findEmpleadoById(Empleado empleado) {
        return empleadoDAO.findById(empleado);
    }

    @Override
    public Empleado findEmpleadoByName(Empleado empleado) {
        return empleadoDAO.findByNombre(empleado);
    }

    @Override
    public void createNewEmpleado(Empleado empleado) {
        empleadoDAO.insertEmpleado(empleado);
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        try {
            empleadoDAO.updateEmpleado(empleado);
        } catch (Exception e) {

        }
    }

    @Override
    public void removeEmpleado(Empleado empleado) {
        empleadoDAO.deleteEmpleado(empleado);
    }

}
