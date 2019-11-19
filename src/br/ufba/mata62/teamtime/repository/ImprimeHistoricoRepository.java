package br.ufba.mata62.teamtime.repository;

import br.ufba.mata62.teamtime.domain.ComponenteCurricular;
import br.ufba.mata62.teamtime.domain.Historico;
import com.sun.xml.internal.bind.v2.TODO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public abstract class ImprimeHistoricoRepository {

    public void imprimirHistorico(Historico historico) {
        try {
            PrintWriter writer = this.criaArquivo();
            writer = this.head(writer);

            writer.println("Carga Horária Total: " + historico.getCargaHoraria());
            writer.println("CR: " + historico.calculaCR());

            for (ComponenteCurricular componente: historico.getComponentes()) {
                writer.println("---------------------------------------------------------------------------");
                writer.println(componente.getDisciplina().getNome() + "(" + componente.getDisciplina().getCodigo() + ")");
                writer.println("CH: " + componente.getDisciplina().getCargaHoraria());
                writer.println("Natureza: " + componente.getNatureza().name());
                writer.println("Nota: " + componente.getNota());
                writer.println("Conceito: " + componente.getConceito().name());
                writer.println("Semestre: " + componente.getSemestre());
            }
            writer = this.footer(writer);
            writer.close();
        }
        catch (Exception e) {
            //TODO: tratar exception
        }

    }
    public abstract PrintWriter criaArquivo() throws FileNotFoundException, UnsupportedEncodingException;
    public abstract PrintWriter head(PrintWriter writer);
    public abstract PrintWriter footer(PrintWriter writer);
    public abstract PrintWriter novaLinha(PrintWriter writer);
}
