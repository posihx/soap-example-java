/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posidev.test.dao.impl;

import com.posidev.test.dao.EmpleadoDAO;
import com.posidev.test.model.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author alfon
 */
@Stateless
public class EmpeleadoDAOImpl implements EmpleadoDAO {

    @PersistenceContext(name = "sgaPU")
    EntityManager em;

    @Override
    public List<Empleado> findAll() {
        return em.createNamedQuery("Empleado.findAll").getResultList();
    }

    @Override
    public Empleado findById(Empleado empleado) {
        return em.find(Empleado.class, empleado.getId());
    }

    @Override
    public Empleado findByNombre(Empleado empleado) {
        Query query = em.createQuery("from Empleado e where e.nombre=:nombre");
        query.setParameter("nombre", empleado.getNombre());
        return (Empleado) query.getSingleResult();
    }

    @Override
    public void insertEmpleado(Empleado empleado) {
        em.persist(empleado);
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        em.merge(empleado);
    }

    @Override
    public void deleteEmpleado(Empleado empleado) {
        em.remove(em.merge(empleado));
    }

}
