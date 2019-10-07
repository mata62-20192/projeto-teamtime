package sistemaacademico.classes;

import java.util.ArrayList;

public class DisciplinaObrigatoria {

	private int semestre; 
	private ArrayList<Disciplina> preRequisito;
	
	public DisciplinaObrigatoria(int semestre) {
		this.semestre=semestre;
	}

}
