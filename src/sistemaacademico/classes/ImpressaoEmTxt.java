package sistemaacademico.classes;

import java.io.PrintWriter;

public class ImpressaoEmTxt extends ImpressaoDeHistorico {
    @Override
    public PrintWriter imprimeCabecalho(PrintWriter writer) {
        writer.println("Historico: ");

        return writer;
    }
}
