package br.ufba.mata62.teamtime.repository;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ImprimeHistoricoRepositoryHTML extends ImprimeHistoricoRepository {

    @Override
    public PrintWriter criaArquivo() throws FileNotFoundException, UnsupportedEncodingException {
        return new PrintWriter("historico.html", "UTF-8");
    }

    @Override
    public PrintWriter head(PrintWriter writer) {
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        writer.println("<title>Histórico Aluno</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<table border=\"1\">");
        writer.println("<tr>");
        writer.println("<th>Semestre</th>");
        writer.println("<th>Código</th>");
        writer.println("<th>Disciplina</th>");
        writer.println("<th>CH</th>");
        writer.println("<th>Carga Horária</th>");
        writer.println("<th>Natureza</th>");
        writer.println("<th>Nota</th>");
        writer.println("<th>Conceito</th>");
        writer.println("</tr>");
        return writer;
    }

    @Override
    public PrintWriter footer(PrintWriter writer) {
        writer.println("</table>");
        writer.println("</body>");
        writer.println("</html>");
        return writer;

    }

    @Override
    public PrintWriter novaLinha(PrintWriter writer) {
        return null;
    }
}
