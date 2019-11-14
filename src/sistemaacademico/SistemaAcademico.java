package sistemaacademico;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

import br.ufba.mata62.teamtime.domain.*;

public class SistemaAcademico {

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\vini0\\IdeaProjects\\projeto-teamtime1\\src\\sistemaacademico\\dados.txt");
            Scanner input = new Scanner(file);

            Universidade universidade = new Universidade("Universidade Federal da Bahia", "UFBA");

            int numCursos = input.nextInt();
            for (int i = 0; i < numCursos; i++) {
                // Le nome
                input.nextLine();
                String nome = input.nextLine();
                String codigo = input.nextLine();
                int numDisciplinas = input.nextInt();
                Curso curso = new Curso(nome, codigo);
                universidade.addCurso(curso);

                for (int j = 0; j < numDisciplinas; j++) {
                    // ADMF52 1 OB 34 20102
                    input.nextLine();
                    String nomeDisc = input.nextLine();
                    String codigoDisc = input.next();
                    int semestre = input.nextInt();
                    String natureza = input.next();
                    int ch = input.nextInt();
                    String curriculo = input.next();

                    Disciplina disciplina = universidade.findDisciplina(codigoDisc);
                    if (disciplina == null) {
                        disciplina = new Disciplina(nomeDisc, codigoDisc, ch);
                        universidade.addDisciplina(disciplina);
                    }
                    DisciplinaCurso disciplinaCurso = new DisciplinaCurso(disciplina, semestre, natureza, new HashSet<Disciplina>());
                    curso.addDisciplinaCurso(disciplinaCurso);
                }
            }

            //Curso oi = universidade.getCurso("105");
            //oi.imprimeCurriculo("html");

            input.close();
        } catch (Exception e) {
            System.out.println("Deu erro mans: " + e);
        }
    }
    
}
