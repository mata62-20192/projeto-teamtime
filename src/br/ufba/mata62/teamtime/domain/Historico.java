package br.ufba.mata62.teamtime.domain;

import java.util.ArrayList;

public class Historico {

	private int semestre;
	private ArrayList<ComponenteCurricular> componentes;
	
	public Historico(int semestre) {
		this.semestre = semestre;
		componentes = new ArrayList<>();
	}
	
	public void addMateria(ComponenteCurricular componente) {
		componentes.add(componente);
	}

	public int getSemestreAtual() {
		return semestre;
	}
	
	public void setSemestreAtual(int semestre) {
		this.semestre = semestre;
	}
	
	public void printHistorico(){

    	for(int i = 1; i <=semestre; i++) {
    		for(int j =0; j < componentes.size();j++) {
    			if( componentes.get(i).getSemestre() == i ) {
    				//componentes.get(i).printComponenteCurricular();
    			}
    		}
    	}
    	System.out.println(this.calculaCR());
    }

	public Double calculaCR() {
		return somaNotas()/componentes.size();
	}
	
	private Double somaNotas() {
		Double somaDasNotas = 0.0;
		somaDasNotas=0.0;
		for (int i =0; i <componentes.size();i++) {
			if(semestre<=componentes.get(i).getSemestre()) {
				semestre=componentes.get(i).getSemestre();
				somaDasNotas+=componentes.get(i).getNota();
			}
		}
		return somaDasNotas;
	}

	public int getCargaHoraria() {
		int cargaHoraria = 0;
		
		for (ComponenteCurricular componetes: componentes) {
			cargaHoraria += componetes.getDisciplina().getCargaHoraria();
		}
		return cargaHoraria;
	}

	public ArrayList<ComponenteCurricular> getComponentes() {
		return componentes;
	}
}
