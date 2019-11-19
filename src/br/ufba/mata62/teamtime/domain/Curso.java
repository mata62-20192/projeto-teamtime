package br.ufba.mata62.teamtime.domain;

import java.util.ArrayList;
import java.util.HashMap;


public class Curso {
    private String nome;
    private String codigo;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private HashMap<Integer, Semestre> semestres = new HashMap<Integer, Semestre>();

    public Curso(String nome, String codigo) {
        this.codigo = codigo;
    	this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

	public String getCodigo() {
		return codigo;
	}

    public void addDisciplinaCurso(DisciplinaCurso disciplina) {
    	Semestre semestre = semestres.get(disciplina.getSemestre());

    	if (semestre == null) {
			semestre = new Semestre(disciplina.getSemestre());
			semestres.put(disciplina.getSemestre(), semestre);
		}
		semestre.addDisciplina(disciplina);

    }

	public HashMap<Integer, Semestre> getSemestres() {
		return semestres;
	}

	public void addAluno(Aluno aluno) throws Exception {
		
		for (Aluno itAluno: alunos){
			if (itAluno.equals(aluno)) {
				throw new Exception("Aluno já existe");
			}
		}
		alunos.add(aluno);
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public Aluno getAluno(int matricula) {
		for (Aluno aluno: alunos) {
			if (aluno.equals(matricula))
				return aluno; 
		}
		
		//errooo;
		return null;
	}
	
	public boolean equals(String a) {
		return this.codigo == a;
	}
}
