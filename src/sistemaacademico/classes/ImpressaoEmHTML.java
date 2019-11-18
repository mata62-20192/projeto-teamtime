package sistemaacademico.classes;

import java.io.PrintWriter;

public class ImpressaoEmHTML extends ImpressaoDeHistorico {
    @Override
    public PrintWriter imprimeCabecalho(PrintWriter writer) {
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        writer.println("<title>Histórico Aluno</title>");
        writer.println("</head>");
        writer.println("<body>");

        return writer;
    }

    public PrintWriter imprimeRodape(PrintWriter writer) {
        writer.println("<body/>");

        return writer;
    }

    @Override
    protected void imprimeHistorico(PrintWriter writer) {
        super.imprimeHistorico(writer);
    }
}
