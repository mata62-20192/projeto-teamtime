/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.domain;


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
//        for (Curso curso : cursos) {
//            if (curso.getCodigo() == codigo) {
//                return curso;
//            }
//        }
        return cursos.get(0);
    }

    public Disciplina findDisciplina(String codigo) {
        for (Disciplina disciplina: disciplinas) {
            if (disciplina.getCodigo() == codigo) {
                return disciplina;
            }
        }
        return null;
    }

    public void addDisciplina (Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
}
