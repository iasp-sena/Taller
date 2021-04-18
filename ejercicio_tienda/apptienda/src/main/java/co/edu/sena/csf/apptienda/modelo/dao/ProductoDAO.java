/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.apptienda.modelo.dao;

import co.edu.sena.csf.apptienda.modelo.entidades.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ismael
 */
@Local
public interface ProductoDAO {

    Producto buscarPorId(Integer id);

    List<Producto> buscarTodos();

    void registrar(Producto obj);

    void actualizar(Producto obj);

    void eliminar(Producto obj);

}
