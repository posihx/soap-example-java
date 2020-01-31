/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posidev.test.service;

import com.posidev.test.model.Empleado;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author alfon
 */
@WebService
public interface EmpleadoServiceWS {

    @WebMethod
    public List<Empleado> getAll();

    @WebMethod
    public Empleado findEmpleadoById(Empleado empleado);

    @WebMethod
    public Empleado findEmpleadoByName(Empleado empleado);

    @WebMethod
    public void createNewEmpleado(Empleado empleado);

    @WebMethod
    public void updateEmpleado(Empleado empleado);

    @WebMethod
    public void removeEmpleado(Empleado empleado);

}
