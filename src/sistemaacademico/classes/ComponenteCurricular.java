package sistemaacademico.classes;

public class ComponenteCurricular {

	private String codigo;
	private String nome;
	private String cargaHoraria;
	private String natureza;
	private int nota;
	private String conceito;
	private int semestre;
	
	public ComponenteCurricular(String codigo, String nome, String cargaHoraria, String natureza, int nota,
			String conceito, int semestre) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.natureza = natureza;
		this.nota = nota;
		this.conceito = conceito;
		this.semestre = semestre;
	} 
	
	public void printComponenteCurricular() {
		System.out.println(this.getNome());
		//System.out.println(this.getCodigo());
		//System.out.println(this.getConceito());
		//System.out.println(this.getCargaHoraria());
		//System.out.println(this.getSemestre());
		//System.out.println(this.getNatureza());
		if(existeNota()) {
			System.out.println(this.getNota());
		}
		else {
			System.out.println("-");
		}
	}
	
	public boolean existeNota() {
		if(this.getNota()!=-1) {
			return true;
		}
		else
			return false;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public int getNota() {
		if(this.conceito == "aprovado" || this.conceito=="reprovado por falta")
			return nota;
		else
			return -1;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getConceito() {
		return conceito;
	}

	public void setConceito(String conceito) {
		this.conceito = conceito;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	

}
