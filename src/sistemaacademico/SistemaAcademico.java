package sistemaacademico;

import sistemaacademico.classes.*;

public class SistemaAcademico {

    public static void main(String[] args) {
    	Universidade universidade = new Universidade("Universidade Federal da Bahia", "UFBA");
        LeitorDeArquivo file = new LeitorDeArquivo(universidade, "dados.txt");
        file.leArquivo();
        System.out.println(universidade.cursos.size());
            
    }
    
}
