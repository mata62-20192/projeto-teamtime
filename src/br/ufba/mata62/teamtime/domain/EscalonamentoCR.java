package br.ufba.mata62.teamtime.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EscalonamentoCR implements CriterioEscalonamento, Comparator<Aluno> {

	@Override
	public ArrayList<Aluno> escalonaAlunos(ArrayList<Aluno> alunos) {
		return Collections.sort(alunos, new EscalonamentoCR());
	}

	@Override
	public int compare(Aluno a, Aluno b) {
		return a.getCR()-b.getCR();
	}

}