package br.ufba.mata62.teamtime.controller;

import java.util.ArrayList;
import java.util.HashMap;

import br.ufba.mata62.teamtime.domain.*;
import br.ufba.mata62.teamtime.service.*;

public class tst {

	public static void main(String[] args) {
		
		// carrega dados dos cursos no sistema e seleciona curso
		String cursoCodigo = "112140";
		FacadeService service = new FacadeService(cursoCodigo);
		
		// cadastra alunos
		service.cadastraAluno("Andre", 1234, 12345678);
        service.cadastraAluno("Walker", 6094, 12345678);
        service.cadastraAluno("Medeiros", 23884, 12345678);
        service.cadastraAluno("Oliveira", 4234, 12345678);
		service.cadastraAluno("vini", 216216674, 20162);
		
		// testa seleciona aluno
		Aluno aluno = service.visualizaAluno(216216674);
		if (aluno.getNome() == "vini")
			System.out.println("visualizaAluno() OK");
		else
			System.out.println("visualizaAluno() ERRO");
		
		// testa listaAlunos()
		ArrayList<Aluno>alunos = service.listaAlunos();
		if (alunos.size() == 5)
			System.out.println("listaAlunos() OK");
		else
			System.out.println("listaAlunos() ERRO");

		// imprime curriculo
		Curso curso = service.visualizaAluno(1234).getCurso();
		HashMap<Integer, Semestre> semestres = service.visualizaCurriculoCurso(curso);
//		System.out.println(curso.getNome());
//		System.out.println("OBRIGATÓRIAS");

		for (int i = 1; i < semestres.size(); i++) {
//			System.out.println("Semestre: " + i);
			for(int j = 0; j < semestres.get(i).getDisciplinas().size(); j++){
//				System.out.print(semestres.get(i).getDisciplinas().get(j).getCodigo());
//				System.out.print(" - ");
//				System.out.print(semestres.get(i).getDisciplinas().get(j).getCargaHoraria());
//				System.out.print(" - ");
//				System.out.println(semestres.get(i).getDisciplinas().get(j).getNome());
			}
		}
//		System.out.println("OPTATIVAS");
		for (int i = 0; i < semestres.get(0).getDisciplinas().size(); i++){
//			System.out.print(semestres.get(0).getDisciplinas().get(i).getCodigo());
//			System.out.print(" - ");
//			System.out.print(semestres.get(0).getDisciplinas().get(i).getCargaHoraria());
//			System.out.print(" - ");
//			System.out.println(semestres.get(0).getDisciplinas().get(i).getNome());
		}

		// imprime historico
		service.visualizaHistoricoAluno(service.visualizaAluno(1234));
	}

}
