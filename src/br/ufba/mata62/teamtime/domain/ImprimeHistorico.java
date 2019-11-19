package br.ufba.mata62.teamtime.domain;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public abstract class ImprimeHistorico {


    /*
       public void imprimeHTML() {
        try {
            PrintWriter writer = new PrintWriter("historico.html", "UTF-8");
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            writer.println("<title>Histórico Aluno</title>");
            writer.println("</head>");
            writer.println("<body>");

            imprimeHistorico(writer);

            writer.println("<body/>");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    */

   public void imprimirHistorico(Historico historico) throws FileNotFoundException, UnsupportedEncodingException {

       PrintWriter writer = this.criaArquivo();
       writer = this.head(writer);
       writer.println("<body>");

       writer.println("Carga Horária: " + historico.getCargaHoraria());
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

       writer.println("</body>");
       writer.close();
    }
    public abstract PrintWriter criaArquivo() throws FileNotFoundException, UnsupportedEncodingException;
    public abstract PrintWriter head(PrintWriter writer);
    public abstract PrintWriter body(PrintWriter writer);
    public abstract PrintWriter footer(PrintWriter writer);
    public abstract PrintWriter novaLinha(PrintWriter writer);
}
