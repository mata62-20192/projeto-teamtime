package br.ufba.mata62.teamtime.test;

import br.ufba.mata62.teamtime.domain.Aluno;
import br.ufba.mata62.teamtime.service.FacadeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FacadeServiceTest {

    FacadeService facade;

    @BeforeEach
    public void init() {
        facade = new FacadeService("112140");
        facade.cadastraAluno("John", 123123123, 20192);
    }

    @Test
    public void testCadastraAluno() {
        facade.cadastraAluno("AAA", 321321321, 20192);
    }

    @Test
    public void testListaAlunos() {
        assertTrue(facade.listaAlunos() instanceof ArrayList);
        assertEquals(1, facade.listaAlunos().size());
    }

    @Test
    public void testvisualizaAluno() {
        Aluno aluno = facade.visualizaAluno(123123123);

        assertNotNull(aluno);
    }

    @Test
    public void testVisualizaEscalonamentoCurso() {
        assertTrue(facade.visualizaEscalonamentoCurso() instanceof ArrayList);
        assertEquals(1, facade.visualizaEscalonamentoCurso().size());
    }
}