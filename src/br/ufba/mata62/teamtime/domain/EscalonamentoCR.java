package br.ufba.mata62.teamtime.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EscalonamentoCR implements CriterioEscalonamento, Comparator<Aluno> {

	@Override
	public ArrayList<Aluno> escalonaAlunos(ArrayList<Aluno> alunos) {
		Collections.sort(alunos, new EscalonamentoCR());
		return alunos;
	}

	@Override
	public int compare(Aluno a, Aluno b) {
		if (a.getCR()>b.getCR())
			return 1;
		else if (a.getCR()<b.getCR())
			return 0;

		if (a.getSemestre()>=b.getSemestre())
			return 1;
		else
			return 0;
	}

}
