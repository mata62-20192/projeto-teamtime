package br.ufba.mata62.teamtime.service;

import br.ufba.mata62.teamtime.domain.*;

public class AlunoService {

	
	public AlunoService (Aluno aluno) {
		
	}
	
	public static void novoAluno(String nome, int numeroMatricula, int semestreIngresso, Curso curso) {
		Aluno aluno = new Aluno(nome, numeroMatricula, semestreIngresso, curso);
		try {
			curso.addAluno(aluno);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
