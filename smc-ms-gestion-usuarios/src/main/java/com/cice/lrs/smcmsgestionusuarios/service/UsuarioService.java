package com.cice.lrs.smcmsgestionusuarios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cice.lrs.smcmsgestionusuarios.dto.UsuarioDTO;
import com.cice.lrs.smcmsgestionusuarios.entity.UsuarioEntity;
import com.cice.lrs.smcmsgestionusuarios.repository.IUsuarioRepository;

@Service
public class UsuarioService  implements IUsuarioService {
	
	@Autowired
    IUsuarioRepository usuarioRepository;

    //@Autowired
    //IProductoFeign productoFeign;

	
	/**
     * Método crear nuevo usuario
     */
    @Override
    public UsuarioDTO crearUsuario(String username, String password) {
    	UsuarioEntity usuarioEntity = new UsuarioEntity(null, username, password);
    	UsuarioEntity result = usuarioRepository.save(usuarioEntity);
    	return new UsuarioDTO(result.getIdUser(), result.getUsername(), result.getPassword());
    }

    
    
    /**
     * Método obtener lista de usuarios registrados
     */
    @Override
    public List<UsuarioDTO> getListaUsuarios() {
        return null;
    }

    
    
    /**
     * Método obtener un ususario dado su userame and password
     */
    @Override
    public UsuarioDTO getUsuario(String username, String password) {
        UsuarioEntity usuarioEntity = usuarioRepository.findUsuarioEntityByUsernameAndPassword(username, password);
        return new UsuarioDTO(usuarioEntity.getIdUser(), usuarioEntity.getUsername(), usuarioEntity.getPassword());
    }

    
    
    /**
     * Método obtener un ususario dado su id
     */
    @Override
    public UsuarioDTO getUsuario(Long idUser) {
        Optional<UsuarioEntity> usuarioEntityOptional = usuarioRepository.findById(idUser);
        UsuarioDTO usuarioDTO = null;
        if(usuarioEntityOptional.isPresent()){
            usuarioDTO = new UsuarioDTO(
                    usuarioEntityOptional.get().getIdUser(),
                    usuarioEntityOptional.get().getUsername(),
                    usuarioEntityOptional.get().getPassword()
            );
        }
        return usuarioDTO;
    }

    
    
    /**
     * Método actualizar usuario
     */
    @Override
    public UsuarioDTO actualizarUsuario(UsuarioDTO usuarioActualizado) {
        return null;
    }

    
    
    /**
     * Método eliminar un usuario y todos sus datos de otros microservicios 
     */
    @Override
    public UsuarioDTO eliminarUsuario(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
      //  productoFeign.eliminarProductoByIdUsuario(idUsuario);
    	return null;
    }
}
