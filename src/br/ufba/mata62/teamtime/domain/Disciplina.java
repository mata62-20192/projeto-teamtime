package br.ufba.mata62.teamtime.domain;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;

    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return this.nome;
    }


    public String getCodigo() {
        return this.codigo;
    }


    public int getCargaHoraria() {
        return this.cargaHoraria;
    }


    
}
