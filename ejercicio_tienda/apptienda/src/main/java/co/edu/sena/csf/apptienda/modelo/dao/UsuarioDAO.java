/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.apptienda.modelo.dao;

import co.edu.sena.csf.apptienda.modelo.entidades.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ismael
 */
@Local
public interface UsuarioDAO {
    
    Usuario buscarPorId(Integer id);

    List<Usuario> buscarTodos();

    void registrar(Usuario obj);

    void actualizar(Usuario obj);

    void eliminar(Usuario obj);
    
}
