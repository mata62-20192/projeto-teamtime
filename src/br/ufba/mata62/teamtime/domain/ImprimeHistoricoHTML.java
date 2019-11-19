package br.ufba.mata62.teamtime.domain;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ImprimeHistoricoHTML extends ImprimeHistorico {

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
        return writer;
    }

    @Override
    public PrintWriter body(PrintWriter writer) {
        return null;
    }

    @Override
    public PrintWriter footer(PrintWriter writer) {
        return null;
    }

    @Override
    public PrintWriter novaLinha(PrintWriter writer) {
        return null;
    }
}
