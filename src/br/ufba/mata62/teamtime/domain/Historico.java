package br.ufba.mata62.teamtime.domain;

import sistemaacademico.interfaces.FormatosDeImpressao;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Historico implements FormatosDeImpressao.ImprimeHTML, FormatosDeImpressao.ImprimeTXT{

	private int semestre;
	private ArrayList<ComponenteCurricular> componentes;
	
	public Historico(int semestre) {
		this.semestre = semestre;
		componentes = new ArrayList<>();
	}
	
	public void addMateria(ComponenteCurricular componente) {
		componentes.add(componente);
	}

	public int getSemestreAtual() {
		return semestre;
	}
	
	public void setSemestreAtual(int semestre) {
		this.semestre = semestre;
	}
	
	public void printHistorico(){

    	for(int i = 1; i <=semestre; i++) {
    		for(int j =0; j < componentes.size();j++) {
    			if( componentes.get(i).getSemestre() == i ) {
    				//componentes.get(i).printComponenteCurricular();
    			}
    		}
    	}
    	System.out.println(this.calculaCR());
    }

	public Double calculaCR() {
		return somaNotas()/componentes.size();
	}
	
	private Double somaNotas() {
		Double somaDasNotas = 0.0;
		somaDasNotas=0.0;
		for (int i =0; i <componentes.size();i++) {
			if(semestre<=componentes.get(i).getSemestre()) {
				semestre=componentes.get(i).getSemestre();
				somaDasNotas+=componentes.get(i).getNota();
			}
		}
		return somaDasNotas;
	}

	public int getCargaHoraria() {
		int cargaHoraria = 0;
		for (ComponenteCurricular componetes: componentes) {
			cargaHoraria += componetes.getDisciplina().getCargaHoraria();
		}
		return cargaHoraria;
	}

	public void imprimeTXT() {
		try {
			PrintWriter writer = new PrintWriter("historico.txt", "UTF-8");
			writer.println("Histórico:");
			imprimeHistorico(writer);
			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	@Override
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
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	private void imprimeHistorico(PrintWriter writer) {
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
	}
}
