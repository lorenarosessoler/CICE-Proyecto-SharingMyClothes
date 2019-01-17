package com.cice.lrs.smcmsgestionproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cice.lrs.smcmsgestionproductos.entity.ProductoEntity;


@Repository
public interface IProductoRepository extends JpaRepository<ProductoEntity, Long> {
	
	//@Query(value = "SELECT * FROM productos WHERE idUser = :idUser", nativeQuery = true)
	//ProductoEntity findProductoEntityByIdUsuario(@Param("idUser") String idUser);

}
