/**
 * 
 */
package br.com.marquinhos;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import br.com.marquinhos.dao.CursoDao;
import br.com.marquinhos.dao.ICursoDao;
import br.com.marquinhos.domain.Curso;


public class CursoTest {

	private ICursoDao cursoDao;
	
	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("CURSO TESTE");
		curso.setNome("Curso de Java Backend");
		curso = cursoDao.cadastrar(curso);
		
		Assert.assertNotNull(curso);
		Assert.assertNotNull(curso.getId());
	}
}
