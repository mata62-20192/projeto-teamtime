package br.ufba.mata62.teamtime.controller;

import java.util.ArrayList;

import br.ufba.mata62.teamtime.domain.*;
import br.ufba.mata62.teamtime.service.*;

public class tst {

	public static void main(String[] args) {
		
		// carrega dados dos cursos no sistema e seleciona curso
		String cursoCodigo = "316130";
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
		
		
	}

}
