package sistemaacademico.classes;

import java.util.ArrayList;

public class DisciplinaObrigatoria {

	private int semestre; 
	private Disciplina disciplina;
 	private ArrayList<Disciplina> preRequisitos;
 	
	
	public DisciplinaObrigatoria(int semestre, Disciplina disciplina) {
		this.semestre = semestre;
		this.disciplina= disciplina;
	}

	public void insertpreRequisito(Disciplina disciplina) {
		this.preRequisitos.add(disciplina);
	}

}
