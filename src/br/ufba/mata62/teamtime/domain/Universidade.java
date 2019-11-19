package br.ufba.mata62.teamtime.domain;


import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String sigla;
    public ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Universidade(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public Curso getCurso (String codigo) {  

        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return cursos.get(0);
        //return null;
    }

    public Disciplina findDisciplina(String codigo) {
    	for (Disciplina disciplina: disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;
    }

    public void addDisciplina (Disciplina disciplina) {
    	if (findDisciplina(disciplina.getCodigo()) == null)
    		disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

	public void addAluno(Aluno aluno, String codigoCurso) throws Exception {
		Curso curso = getCurso(codigoCurso);
		curso.addAluno(aluno);
	}
}
