package sistemaacademico.domain;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Curso {
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

    public void setNome(String nome) {
       this.nome = nome;
    }

    public void addDisciplinaCurso(DisciplinaCurso disciplina) {
    	Semestre semestre = semestres.get(disciplina.getSemestre());

    	if (semestre == null) {
			semestre = new Semestre(disciplina.getSemestre());
			semestres.put(disciplina.getSemestre(), semestre);
		}
		semestre.addDisciplina(disciplina);

    }

    public void imprimeCurriculo(String formato) throws IOException {

		FileWriter fileWriter;
		PrintWriter printWriter;

    	if (formato == "html") {
			fileWriter = new FileWriter("historico.html");
			printWriter = new PrintWriter(fileWriter);
			printWriter.print("<!DOCTYPE html>" +
							"<html>" +
							"<head>" +
							"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" +
							"<title>$title</title>" +
							"</head>" +
							"<body>"
					);

		} else {
			fileWriter = new FileWriter("C:\\Users\\vini0\\IdeaProjects\\projeto-teamtime1\\src\\sistemaacademico\\historico.txt");
			printWriter = new PrintWriter(fileWriter);
		}

		printWriter.println("Obrigatorias:");
		for(Map.Entry<Integer, Semestre> entry : semestres.entrySet()) {
			if (entry.getKey() == 0) {
				continue;
			}
			Semestre semestre =  entry.getValue();
			ArrayList<DisciplinaCurso> disciplinas = semestre.getDisciplinas();
			printWriter.println();
			printWriter.println("Semestre " + entry.getKey() + ":");

			for (DisciplinaCurso disciplina : disciplinas) {
				printWriter.println(disciplina.getNome());
				printWriter.println(
					"Codigo: " + disciplina.getCodigo() +
					" Carga Horaria: "+ disciplina.getCargaHoraria()
				);
			}
    	}

		printWriter.println("Optativas:");
		Semestre semestre =  semestres.get(0);
		ArrayList<DisciplinaCurso> disciplinas = semestre.getDisciplinas();
		printWriter.println();

		for (DisciplinaCurso disciplina : disciplinas) {
			printWriter.println(disciplina.getNome());
			printWriter.println(
					"Codigo: " + disciplina.getCodigo() +
							" Carga Horaria: "+ disciplina.getCargaHoraria()
			);
		}

		if (formato == "html") {
			printWriter.print("</body>" +
					"</html>");
		}

		printWriter.close();
	}

}
