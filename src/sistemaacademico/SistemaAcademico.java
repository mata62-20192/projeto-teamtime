package sistemaacademico;

import sistemaacademico.classes.*;

public class SistemaAcademico {

    public static void main(String[] args) {
    	Universidade universidade = new Universidade("Universidade Federal da Bahia", "UFBA");
        LeitorDeArquivo lei = new LeitorDeArquivo(universidade, "dados.txt");
        lei.leArquivo();
        System.out.println(universidade.cursos.size());
        
    }
    
}
