package sistemaacademico.classes;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

import br.ufba.mata62.teamtime.domain.*;

public class LeitorDeArquivo {
	private Universidade uni;
	private String arquivo;
	
	public LeitorDeArquivo(Universidade uni, String arquivo) {
		this.uni = uni;
		this.arquivo = arquivo;
	}
	
	public boolean leArquivo() {
		try {
			 File file = new File("../dados.txt");
			 //File file = new File(System.getProperty("user.dir") + "/dados.txt");
			System.out.println(file.getAbsolutePath());
            Scanner input = new Scanner(file);

            int numCursos = input.nextInt();
            for (int i = 0; i < numCursos; i++) {
                // Le nome
                input.nextLine();
                String nome = input.nextLine();
                String codigo = input.nextLine();
                int numDisciplinas = input.nextInt();
                Curso curso = new Curso(nome, codigo);
                uni.addCurso(curso);

                for (int j = 0; j < numDisciplinas; j++) {
                    // ADMF52 1 OB 34 20102
                    input.nextLine();
                    String nomeDisc = input.nextLine();
                    String codigoDisc = input.next();
                    int semestre = input.nextInt();
                    String natureza = input.next();
                    int ch = input.nextInt();
                    String curriculo = input.next();

                    Disciplina disciplina = uni.findDisciplina(codigoDisc);
                    if (disciplina == null) {
                        disciplina = new Disciplina(nomeDisc, codigoDisc, ch);
                        uni.addDisciplina(disciplina);
                    }
                    DisciplinaCurso disciplinaCurso = new DisciplinaCurso(disciplina, semestre, natureza, new HashSet<Disciplina>());
                    curso.addDisciplinaCurso(disciplinaCurso);
                }
            }

            //Curso oi = universidade.getCurso("105");
            //oi.imprimeCurriculo("html");

            input.close();
            return true;
        } catch (Exception e) {
            System.out.println("Deu erro mans: " + e);
            return false;
        }
	}

}
