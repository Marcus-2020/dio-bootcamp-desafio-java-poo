package org.marstech.domain.entities;

import java.util.ArrayList;

public class Dev {

    private String nome;
    private ArrayList<Mentoria> mentorias;
    private ArrayList<Curso> cursos;

    public Dev(String nome, ArrayList<Mentoria> mentorias, ArrayList<Curso> cursos) {
        this.nome = nome;
        this.mentorias = mentorias;
        this.cursos = cursos;
    }

    public void InscreverNoBootcamp() {

    }

    public void Progredir() {

    }

    public void CalcularTotalXmp() {

    }

    public void ExibirCursos() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Mentoria> getMentorias() {
        return mentorias;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}
