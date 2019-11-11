package sistemaacademico.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Historico {

	private int semestre;
	private ArrayList<ComponenteCurricular> componentes;
	private Double somaDasNotas;

	public int getSemestreAtual() {
		somaDasNotas=0.0;
		for (int i =0; i <componentes.size();i++) {
			if(semestre<=componentes.get(i).getSemestre()) {
				semestre=componentes.get(i).getSemestre();
				this.somaDasNotas+=componentes.get(i).getNota();
			}
		}
		return semestre;
	}
	public Historico() {
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
		Double cr;
		cr = this.somaDasNotas/componentes.size();
		return cr;
	}

}
