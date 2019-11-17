package sistemaacademico.classes;

public class Aluno {
	
	private String nome;
	private String senha;
	private int matricula;
	private Curso curso;
	private Historico historico;

	public Aluno(String nome, String senha, int matricula, Curso curso) {
		this.nome = nome;
		this.senha = senha;
		this.matricula = matricula;
		this.curso = curso;
		historico = new Historico(0);
	}

	public void fazerMateria(ComponenteCurricular componenteCurricular) {
		historico.addMateria(componenteCurricular);
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public Historico getHistorico() {
		return historico;
	}
	
	public Curso getCurso() {
		return curso;
	}

	public void setSemestre(int semestre){
		historico.setSemestreAtual(semestre);
	}

}
