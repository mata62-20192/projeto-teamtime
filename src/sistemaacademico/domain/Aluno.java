package sistemaacademico.domain;

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
		historico = new Historico();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Historico getHistorico() {
		return historico;
	}

}
