package br.ufba.mata62.teamtime.domain;

import java.util.zip.DeflaterOutputStream;

public class ComponenteCurricular {

	public enum Conceito {
		APROVADO,
		REPROVADO,
		REPROVADO_FALTA
	}

	public enum Natureza {
		OB,
		OP
	}

	private Disciplina disciplina;
	private Natureza natureza;
	private Double nota;
	private Conceito conceito;
	private int semestre;

	public ComponenteCurricular(Disciplina disciplina,
			Natureza natureza,
			Double nota,
			Conceito conceito,
			int semestre) {
		this.disciplina = disciplina;
		this.natureza = natureza;
		this.nota = nota;
		this.conceito = conceito;
		this.semestre = semestre;
	}

	public boolean existeNota() {
		if(this.getNota()!=-1) {
			return true;
		}
		else
			return false;
	}

	public Natureza getNatureza() {
		return natureza;
	}


	public Double getNota() {
		return nota;
	}

	public Conceito getConceito() {
		return conceito;
	}


	public int getSemestre() {
		return semestre;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

}
