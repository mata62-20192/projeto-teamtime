package br.ufba.mata62.teamtime.repository;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ImprimeHistoricoTXTRepository  extends ImprimeHistoricoRepository{
    @Override
    public PrintWriter criaArquivo() throws FileNotFoundException, UnsupportedEncodingException {
        return null;
    }

    @Override
    public PrintWriter head(PrintWriter writer) {
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
