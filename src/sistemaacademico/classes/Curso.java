/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.classes;

import java.util.ArrayList;


public class Curso {
    private String nome;
    private ArrayList<DisciplinaObrigatoria> disciplinasObrigatorias ;
    private ArrayList<DisciplinaOptativa>  disciplinasOptativas;
    

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }
    
    public void insertDisciplinaObrigatoria(DisciplinaObrigatoria disciplina) {
		this.disciplinasObrigatorias.add(disciplina);
	}
    
    public void insertDisciplinaOptativas(DisciplinaOptativa disciplina) {
		this.disciplinasOptativas.add(disciplina);
	}
    
}
