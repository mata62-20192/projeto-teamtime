package br.ufba.mata62.teamtime.test;

import br.ufba.mata62.teamtime.domain.Aluno;
import br.ufba.mata62.teamtime.domain.Curso;
import br.ufba.mata62.teamtime.service.AlunoService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoServiceTest {

    @Test
    public void testNovoAluno() {
        Curso curso = new Curso("Historia", "MCA");
        AlunoService.novoAluno("John Doe", 123123123, 20191, curso);

        Aluno aluno = new Aluno("John Doe", 123123123, 20191, curso);

        Aluno alunoCad = curso.getAluno(aluno.getMatricula());

        assertNotNull(alunoCad);
    }
}