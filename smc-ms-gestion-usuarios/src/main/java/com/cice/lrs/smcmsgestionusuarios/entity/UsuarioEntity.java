package com.cice.lrs.smcmsgestionusuarios.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue
    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

	

	
	
	//Constructors
	public UsuarioEntity() {
	}
	
	public UsuarioEntity(Long idUser, String username, String password) {
		this.idUser = idUser;
		this.username = username;
		this.password = password;
	}



	//Getter y Setters
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
