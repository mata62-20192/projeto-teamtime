package sistemaacademico.classes;

import java.util.ArrayList;

public class DisciplinaOptativa {

	private Disciplina disciplina;
	private ArrayList<Disciplina> preRequisitos;
	
	public DisciplinaOptativa( Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
    public void insertpreRequisito(Disciplina disciplina) {
		this.preRequisitos.add(disciplina);
	}

}
