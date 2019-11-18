package sistemaacademico.classes;

import br.ufba.mata62.teamtime.domain.ComponenteCurricular;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public abstract class ImpressaoDeHistorico {
    public abstract PrintWriter imprimeCabecalho(PrintWriter writer);

    protected void imprimeHistorico() {
        try {
            PrintWriter writer = new PrintWriter("historico.html", "UTF-8");

            this.imprimeCabecalho(writer);

            writer.println("Carga Horária: " + getCargaHoraria());
            writer.println("CR: " + calculaCR());

            for (ComponenteCurricular componentes: componentes) {
                writer.println("---------------------------------------------------------------------------");
                writer.println(componentes.getDisciplina().getNome() + "(" + componentes.getDisciplina().getCodigo() + ")");
                writer.println("CH: " + componentes.getDisciplina().getCargaHoraria());
                writer.println("Natureza: " + componentes.getNatureza().name());
                writer.println("Nota: " + componentes.getNota());
                writer.println("Conceito: " + componentes.getConceito().name());
                writer.println("Semestre: " + componentes.getSemestre());
            }
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }
}
