package sistemaacademico.domain;

import java.util.ArrayList;

public class Semestre {
    private int semestre;
    private ArrayList<DisciplinaCurso> disciplinas = new ArrayList<>();

    public Semestre (int semestre) {
        this.semestre = semestre;
    }

    public void addDisciplina (DisciplinaCurso disciplina) {
        disciplinas.add(disciplina);
    }

    public ArrayList<DisciplinaCurso> getDisciplinas() {
        return  disciplinas;
    }
}
