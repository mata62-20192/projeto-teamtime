package br.ufba.mata62.teamtime.controller;

import java.util.ArrayList;

import br.ufba.mata62.teamtime.domain.*;
import br.ufba.mata62.teamtime.service.*;

public class tst {

	public static void main(String[] args) {
		FacadeService service = new FacadeService("316130");
		service.cadastraAluno("vini", 216216674, 20162);
		Aluno aluno = service.visualizaAluno(216216674);
		System.out.println(aluno.getNome());
		
		ArrayList<Aluno>alunos = service.listaAlunos();
		
		for (Aluno alu: alunos) {
			System.out.println(alu.getMatricula());
		}
		
		
	}

}
