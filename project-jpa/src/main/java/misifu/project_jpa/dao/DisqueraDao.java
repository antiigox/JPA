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
	
}
