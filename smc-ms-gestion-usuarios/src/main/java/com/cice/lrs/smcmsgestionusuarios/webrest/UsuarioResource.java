package com.cice.lrs.smcmsgestionusuarios.webrest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cice.lrs.smcmsgestionusuarios.dto.UsuarioDTO;
import com.cice.lrs.smcmsgestionusuarios.service.IUsuarioService;


@RestController
public class UsuarioResource {
	
    @Autowired
    IUsuarioService usuarioService;    
    
    /**
     * OBTENER ESTADO
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
    public ResponseEntity getHealt() {
        return new ResponseEntity(HttpStatus.OK);
    }
	
    
    
    /**
     * CREAR USUARIO
     * 
     * @param usuarioDTO
     * @return
     * @throws URISyntaxException
     */
//	@RequestMapping(value = "/usuario",method = RequestMethod.POST)
//	public ResponseEntity<Void> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) throws URISyntaxException {
//		log.info("Usuario recibido: {}" +usuarioDTO.toString());
//	    UsuarioDTO result = usuarioService.crearUsuario(usuarioDTO.getUsername(), usuarioDTO.getPassword());
//	    String location = String.format("http://localhost:8089/usuario/%s", result.getIdUser());
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.setLocation(new URI(location));
//	    return new ResponseEntity<>(headers, HttpStatus.CREATED);
//	}
    
    @RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<UsuarioDTO> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		//log.info("Usuario recibido: {}" +usuarioDTO.toString());
		UsuarioDTO result = usuarioService.crearUsuario(usuarioDTO.getUsername(), usuarioDTO.getPassword());
		return ResponseEntity.ok(result);
    }

}
