package com.cice.lrs.smcmsgestionproductos.service;

import java.util.List;

import com.cice.lrs.smcmsgestionproductos.dto.ProductoDTO;


public interface IProductoService {
	
	/**
     * Método para crear un nuevo producto en la base de datos para determinado usuario
     * 
     * @param idUser
     * @param name
     * @param type
     * @param code
     * @return
     */
    ProductoDTO crearProducto(Long idUser, String name, String type, String code);

    
    
    /**
     * Método que devuelve la lista de productos registrados en la base de datos por usuario
     * 
     * @param idUser
     * @return
     */
    List<ProductoDTO> getListaProductos(Long idUser);

   
    
    /**
     * Método que devuelve un producto dado su idProduct
     * 
     * @param idProduct
     * @return
     */
    ProductoDTO getUsuario(Long idProduct);

    
    
    /**
     * Método que actualiza un producto dado
     * 
     * @param productoActualizado
     * @return
     */
    ProductoDTO actualizarProducto(ProductoDTO productoActualizado);

    
    
    /**
     * Método que elimina un producto dado
     * 
     * @param idProduct
     * @return
     */
    ProductoDTO eliminarProducto(Long idProduct);

}
