package br.ufba.mata62.teamtime.domain;

public class Aluno {
	
	private String nome;
	private String senha;
	private int matricula;
	private Curso curso;
	private int semestreIngresso;
	private Historico historico;
	private double CR;

	public Aluno(String nome, int matricula, int semestreIngresso, Curso curso) {
		this.nome = nome;
		this.senha = "1234";
		this.matricula = matricula;
		this.curso = curso;
		this.semestreIngresso = semestreIngresso;
		historico = new Historico(0);
	}

	public void fazerMateria(ComponenteCurricular componenteCurricular) {
		historico.addMateria(componenteCurricular);
	}

	public String getNome() {
		return nome;
	}

	public double getCR() {
		return CR;
	}

	public int getSemestre() {
		return semestreIngresso;
	}

	public String getSenha() {
		return senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public Historico getHistorico() {
		return historico;
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setSemestre(int semestre){
		historico.setSemestreAtual(semestre);
	}
	
	public boolean equals(Aluno a) {
		return this.matricula == a.matricula;
	}
	
	public boolean equals(int a) {
		return this.matricula == a;
	}

}
