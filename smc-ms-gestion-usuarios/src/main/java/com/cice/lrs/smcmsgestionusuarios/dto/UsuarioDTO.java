package com.cice.lrs.smcmsgestionusuarios.dto;

/**
 * Modelo de datos de Usuario
 * 
 * @author lorenarosessoler
 *
 */
public class UsuarioDTO {

	//Atributos
    private Long idUser;
    private String username;
    private String password;
	
 
    
    //Costructores
    public UsuarioDTO() {
		super();
	}
	
    public UsuarioDTO(Long idUser, String username, String password) {
		this.idUser = idUser;
		this.username = username;
		this.password = password;
	}
    
    
    
    //Getters y Setters
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
