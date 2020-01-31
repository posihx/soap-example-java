/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posidev.test.dao;

import com.posidev.test.model.Usuario;
import java.util.List;

/**
 *
 * @author alfon
 */
public interface UsuarioDAO {

    public List<Usuario> findAll();

    public Usuario findByIdUsuario(Usuario usuario);

    public Usuario findByUsername(Usuario usuario);

}
