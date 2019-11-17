package br.ufba.mata62.teamtime.domain;

import sistemaacademico.interfaces.FormatosDeImpressao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;


public class Curso implements FormatosDeImpressao.ImprimeHTML, FormatosDeImpressao.ImprimeTXT {
    private String nome;
    private String codigo;
    private HashMap<Integer, Semestre> semestres = new HashMap<Integer, Semestre>();

    public Curso(String nome, String codigo) {
        this.codigo = codigo;
    	this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

	public String getCodigo() {
		return codigo;
	}

    public void addDisciplinaCurso(DisciplinaCurso disciplina) {
    	Semestre semestre = semestres.get(disciplina.getSemestre());

    	if (semestre == null) {
			semestre = new Semestre(disciplina.getSemestre());
			semestres.put(disciplina.getSemestre(), semestre);
		}
		semestre.addDisciplina(disciplina);

    }

	@Override
	public void imprimeTXT() {
		try {
			PrintWriter writer = new PrintWriter("curriculo.txt", "UTF-8");
			writer.println("Curriculo do curso: " + getNome());
			imprimeCurriculo(writer);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void imprimeHTML() {

	}

	private void imprimeCurriculo(PrintWriter writer) {
		for (int i = 1; i < semestres.size(); i++) {
			writer.println("---------------------------------------------------------------------------");
			writer.println("Semestre: " + i);
			for(int j = 0; j < semestres.get(i).getDisciplinas().size(); j++){
				writer.println("Nome " + semestres.get(i).getDisciplinas().get(j).getNome());
				writer.println("Codigo " + semestres.get(i).getDisciplinas().get(j).getCodigo());
			}
		}
		writer.println("---------------------------------------------------------------------------");
		writer.println("Optativas: ");

		for (int i = 0; i < semestres.get(0).getDisciplinas().size(); i++){
			writer.println("Nome " + semestres.get(0).getDisciplinas().get(i).getNome());
			writer.println("Codigo " + semestres.get(0).getDisciplinas().get(i).getCodigo());
		}
	}
}
