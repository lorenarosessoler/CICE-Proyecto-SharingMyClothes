package com.cice.lrs.smcmsgestionusuarios.service;

import java.util.List;

import com.cice.lrs.smcmsgestionusuarios.dto.UsuarioDTO;


public interface IUsuarioService {
	
	/**
     * Método para crear un nuevo usuario en la base de datos
     * 
     * @param username
     * @param password
     * @return
     */
    UsuarioDTO crearUsuario(String username, String password);

    
    
    /**
     * Método que devuelve la lista de usuarios registrados en la base de datos
     * 
     * @return
     */
    List<UsuarioDTO> getListaUsuarios();

    
    
    /**
     * Método que devuelve un usuario dado su username y password
     * 
     * @param username
     * @param password
     * @return
     */
    UsuarioDTO getUsuario(String username, String password);

    
    
    /**
     * Método que devuelve un usuario dado su idUser
     * 
     * @param idUser
     * @return
     */
    UsuarioDTO getUsuario(Long idUser);

    
    
    /**
     * Método que actualiza un usuario dado
     * 
     * @param usuarioActualizado
     * @return
     */
    UsuarioDTO actualizarUsuario(UsuarioDTO usuarioActualizado);

    
    
    /**
     * Método que elimina un usuario dado y elimina todos sus datos llamando a otros servicios dependientes
     * 
     * @param idUser
     * @return
     */
    UsuarioDTO eliminarUsuario(Long idUser);

}
