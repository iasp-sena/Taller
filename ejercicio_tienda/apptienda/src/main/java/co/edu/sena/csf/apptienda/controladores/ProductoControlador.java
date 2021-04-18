/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.csf.apptienda.controladores;

import co.edu.sena.csf.apptienda.modelo.dao.ProductoDAO;
import co.edu.sena.csf.apptienda.modelo.entidades.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ismael
 */
@Named
@ViewScoped
public class ProductoControlador implements Serializable {
    
    @Inject
    private ProductoDAO productoDAO;
    private List<Producto> productos;
    private List<Producto> productosCarrito;
    
    @PostConstruct
    public void inicializar(){
        productos = productoDAO.buscarTodos();
        productosCarrito = new ArrayList<>();
    }
    
    public void agregarAlCarrito(Producto producto){
        System.out.println("Agregando un producto....");
        productosCarrito.add(producto);
        
        for(Producto p: productosCarrito){
            System.out.println(p.getNombre());
        }
    }
    
    public int getCantidadProductosCarrito(){
        return productosCarrito.size();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Producto> getProductosCarrito() {
        return productosCarrito;
    }
    
    
    
}
