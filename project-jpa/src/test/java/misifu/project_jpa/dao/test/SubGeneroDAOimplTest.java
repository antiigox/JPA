package misifu.project_jpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.misifu.projectjpa.entity.Genero;
import com.misifu.projectjpa.entity.SubGenero;

import misifu.project_jpa.dao.SubGeneroDao;
import misifu.project_jpa.dao.impl.SubGeneroDAOimpl;

/**
 * Clase TEST para comprobar el funcionamiento de los subgeneros CRUD
 * @author Antigox
 *
 */
class SubGeneroDAOimplTest {
	private SubGeneroDao subGeneroDao= new SubGeneroDAOimpl();
	@Test
	void testGuardar() {
		SubGenero subGenero= new SubGenero();
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero= new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDao.guardar(subGenero);
	}

	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado= this.subGeneroDao.consultarById(7L);
		
		subGeneroConsultado.setDescripcion("Trash metal");
		subGeneroConsultado.getGenero().setDescripcion("Metal Trash");
		
		this.subGeneroDao.actualizar(subGeneroConsultado);
	}

	@Test
	void testEliminar() {
		this.subGeneroDao.eliminar(7L);
	}

	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados= this.subGeneroDao.consultar();
		
		assertTrue(subGenerosConsultados.size()>0);
		
		for(SubGenero subGenero: subGenerosConsultados) {
			System.out.println("Subgenero: "+ subGenero.getDescripcion());
			System.out.println("Genero: "+ subGenero.getGenero().getDescripcion());
		}
	}

	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
