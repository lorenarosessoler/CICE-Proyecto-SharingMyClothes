package com.cice.lrs.smcmsgestionusuarios.webrest;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;

import com.cice.lrs.smcmsgestionusuarios.dto.UsuarioDTO;
import com.cice.lrs.smcmsgestionusuarios.service.IUsuarioService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UsuarioResource {
	
    @Autowired
    IUsuarioService usuarioService;    
    
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
     * CREAR USUARIO
     * 
     * @param usuarioDTO
     * @return
     * @throws URISyntaxException
     */
//    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
//	public ResponseEntity<Object> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) throws URISyntaxException {
//		log.info("Usuario recibido: {}" +usuarioDTO.toString());
//	    UsuarioDTO result = usuarioService.crearUsuario(usuarioDTO.getUsername(), usuarioDTO.getPassword());
//	    String location = String.format("http://localhost:8089/usuario/%s", result.getIdUser());
//	    HttpHeaders headers = new HttpHeaders();
//	    headers.setLocation(new URI(location));
//	    return new ResponseEntity<>(headers, HttpStatus.CREATED);
//	}
//    
    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
 	public ResponseEntity<UsuarioDTO> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
 		System.out.println("Usuario recibido " +usuarioDTO.toString());
 		UsuarioDTO result = usuarioService.crearUsuario(usuarioDTO.getUsername(), usuarioDTO.getPassword());
 		return ResponseEntity.ok(result);
     }
    
    
    
    /**
     * RECUPERAR USUARIO POR ID
     * 
     * @param idUser
     * @return
     */
    @RequestMapping(value = "/usuario/{idUser}", method = RequestMethod.GET)
 	public ResponseEntity<UsuarioDTO> recuperarUsuarioPorId(@PathVariable Long idUser) {
 		System.out.println("Id de ussuario  " +idUser);
 		return ResponseEntity.ok(usuarioService.getUsuario(idUser));
     }
    
    
    
    /**
     * RECUPERAR USUARIO REGISTRADO
     * 
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/usuario/{username}/{password}", method = RequestMethod.GET)
 	public ResponseEntity<UsuarioDTO> recuperarUsuarioRegistardo(@PathVariable String username, @PathVariable String password) {
 		UsuarioDTO usuarioDTO = usuarioService.getUsuario(username, password); 
 		return ResponseEntity.ok(usuarioDTO);
     }
    
    
    
    /**
     * BORRAR USUARIO
     * 
     * @param usuarioDTO
     * @return
     * @throws URISyntaxException
     */
    @RequestMapping(value = "/usuario/{idUser}", method = RequestMethod.DELETE)
 	public ResponseEntity<String> eliminarUsuariosYTodosSusProductos(@PathVariable Long idUser) {
 		usuarioService.eliminarUsuario(idUser); 
 		return ResponseEntity.ok("Se ha borrado el usuario. Todo ha ido bien");
     }

}
