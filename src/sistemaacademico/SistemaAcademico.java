package sistemaacademico;

import sistemaacademico.classes.*;

public class SistemaAcademico {

    public static void main(String[] args) {
    	Universidade universidade = new Universidade("Universidade Federal da Bahia", "UFBA");
        LeitorDeArquivo lei = new LeitorDeArquivo(universidade, "dados.txt");
        lei.leArquivo();
        System.out.println(universidade.cursos.size());
        Curso curso = universidade.getCurso("316130");

        Disciplina comunicacao = universidade.findDisciplina("ADM202");
        Disciplina estudosOrganizacionais = universidade.findDisciplina("ADMF54");

        Aluno aluno = new Aluno("Matheus", "1234", 12345678, curso);
        aluno.setSemestre(1);
        aluno.fazerMateria(new ComponenteCurricular(comunicacao, ComponenteCurricular.Natureza.OB, 9.5, ComponenteCurricular.Conceito.APROVADO, 1));
        aluno.fazerMateria(new ComponenteCurricular(estudosOrganizacionais, ComponenteCurricular.Natureza.OB, 5.1, ComponenteCurricular.Conceito.APROVADO, 1));

        System.out.println(aluno.getHistorico().getCargaHoraria());
        aluno.getHistorico().imprimeTXT();
        aluno.getHistorico().imprimeHTML();
        curso.imprimeTXT();

        System.out.println(123);
    }
    
}
