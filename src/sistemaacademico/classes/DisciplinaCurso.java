package sistemaacademico.classes;

import java.util.ArrayList;

public class DisciplinaCurso {

	private int semestre;
	private String nome; 
	private String natureza;
	private ArrayList<Disciplina> preRequisito;
	
	public DisciplinaCurso(int semestre, String nome, String natureza, ArrayList<Disciplina> preRequisito) {
		super();
		this.semestre = semestre;
		this.nome = nome;
		this.natureza = natureza;
		this.preRequisito = preRequisito;
	}
	
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public ArrayList<Disciplina> getPreRequisito() {
		return preRequisito;
	}
	public void setPreRequisito(ArrayList<Disciplina> preRequisito) {
		this.preRequisito = preRequisito;
	}
	
    
	
	
}
