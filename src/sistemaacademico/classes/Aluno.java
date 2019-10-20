package sistemaacademico.classes;

public class Aluno {
	
	private String nome;
	private String Senha;
	private int matricula;
	private Historico historico;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

}
