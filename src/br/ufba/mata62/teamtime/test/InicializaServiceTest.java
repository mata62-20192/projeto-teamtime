package br.ufba.mata62.teamtime.test;

import br.ufba.mata62.teamtime.domain.Universidade;
import br.ufba.mata62.teamtime.service.InicializaService;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class InicializaServiceTest {

    @Test
    public void testGetUniversidade() {
        InicializaService init = new InicializaService(Paths.get("").toAbsolutePath().toString()+"/src/br/ufba/mata62/teamtime/repository/dados.txt");
        
        Universidade universidade = init.getUniversidade();
        
        assertNotNull(universidade);
        assertEquals("UFBA", universidade.getSigla());
    }
}