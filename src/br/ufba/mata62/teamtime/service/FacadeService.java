package br.ufba.mata62.teamtime.service;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

import br.ufba.mata62.teamtime.domain.*;

public class FacadeService {
	
	private Universidade universidade;
	private Curso curso;
	private final String PATH = Paths.get("").toAbsolutePath().toString()+"/src//br/ufba/mata62/teamtime/repository/dados.txt";
	
	public FacadeService(String codigoCurso) {
		InicializaService inicializa = new InicializaService(PATH);
		universidade = inicializa.getUniversidade();
		curso = universidade.getCurso(codigoCurso);
		
		if (universidade == null || curso == null) {
			//error
		}
	}

	public void cadastraAluno(String nome, int numeroMatricula, int semestreIngresso) {
		AlunoService.novoAluno(nome, numeroMatricula, semestreIngresso, curso);
	}
	
	public ArrayList<Aluno> listaAlunos() {
		return curso.getAlunos();
	}
	
	public Aluno visualizaAluno(int matricula) {
		Aluno aluno = curso.getAluno(matricula);
		return aluno;
	}
	
	public void visualizaHistoricoAluno(Aluno aluno) {
		aluno.getHistorico();
	}
	
	public HashMap<Integer, Semestre> visualizaCurriculoCurso(Curso curso) {
		return curso.getSemestres();

	}
	
	public void visualizaEscalonamentoCurso(Curso curso, String criterio) {
		
	}
}
