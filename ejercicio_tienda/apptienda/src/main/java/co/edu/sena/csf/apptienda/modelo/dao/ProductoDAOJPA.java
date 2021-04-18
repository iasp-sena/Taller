/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.apptienda.modelo.dao;

import co.edu.sena.csf.apptienda.modelo.entidades.Producto;
import javax.ejb.Stateless;

/**
 *
 * @author Ismael
 */
@Stateless
public class ProductoDAOJPA extends GenericDAO<Producto> implements ProductoDAO {
    
    public ProductoDAOJPA() {
        super(Producto.class);
    }
    
}
