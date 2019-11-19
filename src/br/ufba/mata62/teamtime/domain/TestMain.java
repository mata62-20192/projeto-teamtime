package br.ufba.mata62.teamtime.domain;

import br.ufba.mata62.teamtime.service.FacadeService;
import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {

        FacadeService facade = new FacadeService("112140");

        facade.cadastraAluno("Andre", 1234, 12345678);
        facade.cadastraAluno("Walker", 6094, 12345678);
        facade.cadastraAluno("Medeiros", 23884, 12345678);
        facade.cadastraAluno("Oliveira", 4234, 12345678);

        ArrayList<Aluno> alunos = facade.listaAlunos();
        System.out.println(alunos.size());
        
        for (Aluno aluno: alunos) {
            System.out.println(aluno.getNome());
        }
        System.out.println(facade.visualizaAluno(1234).getNome());

    }
}
