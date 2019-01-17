package com.cice.lrs.smcmsgestionproductos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class ProductoEntity {
	
    @Id
    @GeneratedValue
    @Column(name = "idProduct")
    private Long idProduct;

    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "code")
    private String code;

    
    
    //Constructores
	public ProductoEntity() {
		super();
	}


	public ProductoEntity(Long idProduct, Long idUser, String name, String type, String code) {
		this.idProduct = idProduct;
		this.idUser = idUser;
		this.name = name;
		this.type = type;
		this.code = code;
	}


	
	//Getters y Setters
	public Long getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}


	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}
	
}
