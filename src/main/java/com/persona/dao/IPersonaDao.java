package com.persona.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.persona.modelo.Persona;

/*
 * ORG: ORGANIZACIÓN(INTERNO)           COM: COMERCIAL (VENDER)
 * 
 * INTERFACE: NO SE PROGRAMA, SOLO SE AGREGAN LOS METODOS A IMPLEMENTAR
 * 
 */

@Repository
public interface IPersonaDao extends CrudRepository<Persona, Serializable>{

	/*
	 * NO SE PROGRAMA EL CRUD PORQUE YA EXISTEN LOS METODOS: save,
	 * saveAll, delete, deleteAll, deleteById, update, list ETC...
	 */
	
}