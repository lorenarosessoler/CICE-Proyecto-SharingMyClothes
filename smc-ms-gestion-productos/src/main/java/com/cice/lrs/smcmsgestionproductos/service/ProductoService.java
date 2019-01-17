package com.cice.lrs.smcmsgestionproductos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cice.lrs.smcmsgestionproductos.dto.ProductoDTO;
import com.cice.lrs.smcmsgestionproductos.repository.IProductoRepository;


@Service
public class ProductoService  implements IProductoService {
	
	@Autowired
    IProductoRepository productoRepository;

   //@Autowired
   //IUsuarioFeign usuarioFeign;
	
	
	@Override
	public ProductoDTO crearProducto(Long idUser, String name, String type, String code) {
		 return null;
	}
	
	
	@Override
	public List<ProductoDTO> getListaProductos(Long idUser){
		return null;
	}
	
	
	@Override
    public ProductoDTO getUsuario(Long idProduct) {
		return null;
	}

	
	@Override
    public ProductoDTO actualizarProducto(ProductoDTO productoActualizado) {
		return null;
	}
	
	
	@Override
    public ProductoDTO eliminarProducto(Long idProduct) {
		return null;
	}

}
