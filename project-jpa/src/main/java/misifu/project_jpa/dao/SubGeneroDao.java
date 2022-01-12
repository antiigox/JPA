package misifu.project_jpa.dao;

import java.util.List;

import com.misifu.projectjpa.entity.SubGenero;

public interface SubGeneroDao {
	/**
	 * Metodo que permite guardar un subgenero.
	 * @param subGenero {link Subgenero} objeto a guardar
	 */
	void guardar(SubGenero subGenero);
	
	/**
	 * Metodo que permite guardar un subgenero.
	 * @param subGenero {link Subgenero} objeto a actualizar
	 */
	void actualizar(SubGenero subGenero);
	
	/**
	 * Metodo que permite guardar un subgenero.
	 * @param id {link Long} identificador de subgenero a eliminar
	 */
	void eliminar(Long id);
	
	
	/**
	 * Metodo que  permite consultar la lista de subgeneros
	 * 
	 * @return {@link List}  lista de subgeneros consultados
	 */
	List<SubGenero> consultar();
	
	/**
	 * Metodo que permite consultar un subgenero a partir de su identificador
	 * @param id {@link Long} identificador del subgenero a consultar
	 * @return {@link SubGenero} un objeto subgenero consultado
	 */
	SubGenero consultarById(Long id);
}
