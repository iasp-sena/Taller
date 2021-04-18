/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.apptienda.controladores;

import co.edu.sena.csf.apptienda.modelo.dao.UsuarioDAO;
import co.edu.sena.csf.apptienda.modelo.entidades.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ismael
 * 
 * @AppicationScope
 * @SessionScope
 * @ViewScope
 * @RequestScope
 * 
 */
@Named
@ViewScoped
public class UsuarioControlador implements Serializable {
    
    @Inject
    private UsuarioDAO usuarioDAO;
    private Usuario usuario;
    
    public UsuarioControlador() {
        //usuarioDAO es null;
    }
    
    @PostConstruct
    public void inicializar(){
        //usuarioDAO ya no es null
        usuario = usuarioDAO.buscarPorId(1);
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
}
