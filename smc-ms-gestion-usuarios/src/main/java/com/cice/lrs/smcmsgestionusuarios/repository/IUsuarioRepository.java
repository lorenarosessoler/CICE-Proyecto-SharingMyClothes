package com.cice.lrs.smcmsgestionusuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cice.lrs.smcmsgestionusuarios.entity.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	@Query(value = "SELECT * FROM usuarios WHERE username = :username AND password = :password", nativeQuery = true)
    UsuarioEntity findUsuarioEntityByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
