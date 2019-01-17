package com.cice.lrs.smcmsgestionproductos.webrest;

import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cice.lrs.smcmsgestionproductos.dto.ProductoDTO;
import com.cice.lrs.smcmsgestionproductos.service.IProductoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProductoResource {
	
	@Autowired
    IProductoService productoService;    
    
    Logger log = null;
    
    
    /**
     * OBTENER ESTADO del Entity
     * 
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Void> getStatus(){
        System.out.println("/status");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    
    
    /**
     * HEALTH CHECK
     * 
     * @return
     */
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity getHealth() {
        return new ResponseEntity(HttpStatus.OK);
    }
    
    
    
    /**
     * CREAR PRODUCTO
     * 
     */
    @RequestMapping(value = "/producto", method = RequestMethod.POST)
 	public ResponseEntity<ProductoDTO> crearUsuario(@RequestBody ProductoDTO productoDTO) {
 		System.out.println("Producto recibido " +productoDTO.toString());
 		ProductoDTO result = productoService.crearProducto(productoDTO.getIdUser(), productoDTO.getName(), productoDTO.getType(), productoDTO.getCode());
 		return ResponseEntity.ok(result);
     }
    
    
    //ACABAR

}
