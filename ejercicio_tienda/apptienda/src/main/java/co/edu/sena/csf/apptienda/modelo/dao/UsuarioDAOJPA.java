/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.apptienda.modelo.dao;

import co.edu.sena.csf.apptienda.modelo.entidades.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ismael
 */
@Stateless
public class UsuarioDAOJPA extends GenericDAO<Usuario> implements UsuarioDAO {
    
    public UsuarioDAOJPA() {
        super(Usuario.class);
    }
    
}
