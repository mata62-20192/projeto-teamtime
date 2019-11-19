package br.ufba.mata62.teamtime.domain;

import br.ufba.mata62.teamtime.service.FacadeService;
import br.ufba.mata62.teamtime.service.InicializaService;
import sistemaacademico.classes.LeitorDeArquivo;

import java.nio.file.Paths;

public class TestMain {

    public static void main(String[] args) {

        FacadeService facade = new FacadeService("112140");

//        Aluno aluno = new Aluno("Matheus", 1234, 12345678, curso);
//        aluno.setSemestre(1);
//        aluno.fazerMateria(new ComponenteCurricular(comunicacao, ComponenteCurricular.Natureza.OB, 9.5, ComponenteCurricular.Conceito.APROVADO, 1));
//        aluno.fazerMateria(new ComponenteCurricular(estudosOrganizacionais, ComponenteCurricular.Natureza.OB, 5.1, ComponenteCurricular.Conceito.APROVADO, 1));
//        facade.cadastraAluno();

//        Universidade universidade = new Universidade("Universidade Federal da Bahia", "UFBA");
//        LeitorDeArquivo file = new LeitorDeArquivo(universidade, "dados.txt");
//        file.leArquivo();
//        System.out.println(universidade.cursos.size());
//
//        Curso curso = universidade.getCurso("316130");
//
//        Disciplina comunicacao = universidade.findDisciplina("ADM202");
//        Disciplina estudosOrganizacionais = universidade.findDisciplina("ADMF54");
//
//
//
//        System.out.println(aluno.getHistorico().getCargaHoraria());
//        aluno.getHistorico().imprimeTXT();
//        aluno.getHistorico().imprimeHTML();
//        curso.imprimeTXT();
//
    }
}
