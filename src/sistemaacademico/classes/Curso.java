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
public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinasObrigatorias, disciplinasOptativas;

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }
    
}
