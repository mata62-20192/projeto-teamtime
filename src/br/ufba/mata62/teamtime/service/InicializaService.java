package br.ufba.mata62.teamtime.service;

import br.ufba.mata62.teamtime.domain.*;
import br.ufba.mata62.teamtime.repository.ArquivoRepository;

public class InicializaService {

	ArquivoRepository dados;
	Universidade universidade;
	
	public InicializaService(String path) {
		try {
			dados = new ArquivoRepository(path);
			carregaDados();
			
		} catch (Exception e) {
			
		}
	}

	private void carregaDados() {
		String NOME = "Universidade Federal da Bahia";
		String SIGLA = "UFBA";
		
		universidade = new Universidade(NOME, SIGLA);
		int numeroCursos = dados.proximoNumero();
		carregaCursosUniversidade(numeroCursos);
		
	}

	private void carregaCursosUniversidade(int numeroCursos) {
		for(int i=0; i< numeroCursos; i++) {
			Curso curso = dados.leCurso();			
			universidade.addCurso(curso);
			dados.proximaLinha();
			int numeroDisciplinasCurso = dados.proximoNumero();
			carregaDisciplinasCurso(numeroDisciplinasCurso, curso);
		}
		
	}

	private void carregaDisciplinasCurso(int numeroDisciplinasCurso, Curso curso) {
		for (int i=0; i< numeroDisciplinasCurso; i++) {
			DisciplinaCurso disciplina = dados.leDisciplina();
			curso.addDisciplinaCurso(disciplina);
			universidade.addDisciplina(disciplina.getDisciplina());
		}
		
	}

	public Universidade getUniversidade() {
		return universidade;
	}
}
