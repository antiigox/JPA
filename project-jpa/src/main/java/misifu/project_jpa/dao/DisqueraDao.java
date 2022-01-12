/**
 * 
 */
package misifu.project_jpa.dao;
import java.util.List;

import com.misifu.projectjpa.entity.Disquera;
/**interfaz que genera el DAO para las transacciones del CRUD a la tabla disquera
 * @author Antigox
 *
 */
public interface DisqueraDao {
	
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	/**
	 * Metodo que permite consultar con JPQL la disquera a partir de una descripcion
	 * 
	 * @param descripcion {@link String} descripcion de la disquera
	 * @return {@link Disquera} la disquera consultada
	 */
	Disquera consultarByDescripcionJPQL(String descripcion);
	
	
	/**
	 * Metodo que permite consultar con SQL nativo la disquera a partir de una descripcion
	 * @param descripcion {@link String} descripcion de la disquera
	 * @return {@link Disquera} la disquera consultada
	 */
	Disquera consultarByDescripcionNative(String descripcion);
	
}
