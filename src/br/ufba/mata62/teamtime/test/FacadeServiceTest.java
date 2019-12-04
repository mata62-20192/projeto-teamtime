package br.ufba.mata62.teamtime.test;

import br.ufba.mata62.teamtime.domain.Aluno;
import br.ufba.mata62.teamtime.service.FacadeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeServiceTest {

    FacadeService facade;

    @BeforeEach
    public void init() {
        FacadeService facade = new FacadeService("105");
    }

    @Test
    public void testCadastraAluno() {
        facade.cadastraAluno("John", 123123123, 20192);

        assertNotEquals(0, facade.listaAlunos().size());
    }

    @Test
    public void testListaAlunos() {
    }

    @Test
    public void testvisualizaAluno() {
    }

    @Test
    public void testVisualizaHistoricoAluno() {
    }

    @Test
    public void testVisualizaCurriculoCurso() {
    }

    @Test
    public void testVisualizaEscalonamentoCurso() {
    }

    @Test
    public void testMudaCriterioEscalonamento() {
    }
}