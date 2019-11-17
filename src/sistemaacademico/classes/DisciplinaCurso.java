package sistemaacademico.classes;

import java.util.HashSet;

public class DisciplinaCurso {

	private int semestre;
	private Disciplina disciplina;
	private String natureza;
	private HashSet<Disciplina> preRequisito = new HashSet<>();

	public DisciplinaCurso(Disciplina disciplina, int semestre, String natureza, HashSet<Disciplina> preRequisito) {
		this.semestre = semestre;
		this.disciplina = disciplina;
		this.natureza = natureza;
		this.preRequisito = preRequisito;
	}

	public int getSemestre() {
		return semestre;
	}
	public String getNome() {
		return disciplina.getNome();
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public HashSet<Disciplina> getPreRequisito() {
		return preRequisito;
	}

	public String getCodigo() {
		return disciplina.getCodigo();
	}

	public int getCargaHoraria () {
		return disciplina.getCargaHoraria();
	}
}
