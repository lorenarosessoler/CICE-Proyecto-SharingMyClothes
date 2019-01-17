package com.cice.lrs.smcmsgestionproductos.dto;

/**
 * Modelo de datos de producto
 * 
 * @author lorenarosessoler
 *
 */
public class ProductoDTO {
	
	//Atributos
	private Long idProduct;
    private Long idUser;
    private String name;
    private String type;
    private String code;
	
 
    
    //Costructores
	public ProductoDTO() {
		super();
	}
    
	
    public ProductoDTO(Long idProduct, Long idUser, String name, String type, String code) {
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
