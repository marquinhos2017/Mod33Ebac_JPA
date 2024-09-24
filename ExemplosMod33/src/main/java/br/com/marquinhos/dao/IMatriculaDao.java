/**
 * 
 */
package br.com.marquinhos.dao;

import br.com.marquinhos.domain.Curso;
import br.com.marquinhos.domain.Matricula;


public interface IMatriculaDao {

	Matricula cadastrar(Matricula mat);
	
	Matricula buscarPorCodigoCurso(String codigoCurso);
	
	Matricula buscarPorCurso(Curso curso);
	
	Matricula buscarPorCodigoCursoCriteria(String codigoCurso);
	
	Matricula buscarPorCursoCriteria(Curso curso);

}
