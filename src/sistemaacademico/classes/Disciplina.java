/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.classes;

import java.util.ArrayList;

/**
 *
 * @author guest-ychbik
 */
public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private ArrayList<Disciplina> preRequisitos;

    public Disciplina(String nome, String código, int cargaHoraria) {
        this.nome = nome;
        this.codigo = código;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String código) {
        if(nome.length() == 6) this.nome = nome;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
}
