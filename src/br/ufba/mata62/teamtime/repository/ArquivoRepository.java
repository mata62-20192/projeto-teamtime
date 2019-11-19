package br.ufba.mata62.teamtime.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

import br.ufba.mata62.teamtime.domain.*;

public class ArquivoRepository {

	private File file;
	private Scanner input;
	
	public ArquivoRepository(String path) throws FileNotFoundException {
		file = new File(path);
		input = new Scanner(file);
	}
	
	public String proximaLinha() {
		if(input.hasNextLine()){
			return input.nextLine();
		}
		else {
			return null;
		}
	}
	
	public int proximoNumero() {
		return input.nextInt();
	}
	public int leNumeroDeCursos() {
		int numeroDeCursos = this.proximoNumero();
		this.proximaLinha();
		return numeroDeCursos;
	}

	public int leNumeroDisciplinasCurso() {
		int numeroDeMaterias = this.proximoNumero();
		this.proximaLinha();
		return numeroDeMaterias;
	}

	public Curso leCurso() {

		String nome = input.nextLine();
		String codigo = input.nextLine();
		return new Curso(nome, codigo);
	}
	
	public DisciplinaCurso leDisciplina() {
		String nomeDisc = input.nextLine();
		String codigoDisc = input.next();
		int semestre = input.nextInt();
		String natureza = input.next();
		int ch = input.nextInt();
		String curriculo = input.next();
		Disciplina disciplina = new Disciplina(nomeDisc, codigoDisc, ch);
		System.out.println(nomeDisc);
		this.proximaLinha();
		return new DisciplinaCurso(disciplina, semestre, natureza);
	}
}
