/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.classes;

import java.util.ArrayList;


public class Curso {
    private String nome; 
    private ArrayList<DisciplinaCurso> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }
    
    public void addDisciplinas(DisciplinaCurso disciplina) {
    	this.disciplinas.add(disciplina);
    	
    }
    
    public void imprimeCurriculo() {
    	for (int i = 0; i < disciplinas.size(); i++) {
			System.out.println(disciplinas.get(i).getNome());
		} 
	}
    
    public void disciplinaSemetre(){
    	for (int i = 0; i < disciplinas.size(); i++) {	
    		if( disciplinas.get(i).getSemestre() == i ) {
    			System.out.println(disciplinas.get(i).getNome());
    		}
		} 
    }
    
    
}
