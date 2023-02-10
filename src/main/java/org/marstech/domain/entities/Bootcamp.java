package org.marstech.domain.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Bootcamp extends EntidadeBase {
    private String nome;
    private String descricao;
    private LocalDate DataInicial;
    private LocalDate DataFinal;
    private ArrayList<Dev> devs;
    private ArrayList<Mentoria> mentorias;
    private ArrayList<Curso> cursos;

    public Bootcamp(
            UUID id, String nome, String descricao,
            LocalDate dataInicial, LocalDate dataFinal,
            ArrayList<Dev> devs,
            ArrayList<Mentoria> mentorias,
            ArrayList<Curso> cursos) {

        super(id);
        this.nome = nome;
        this.descricao = descricao;
        DataInicial = dataInicial;
        DataFinal = dataFinal;
        this.devs = devs;
        this.mentorias = mentorias;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return DataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        DataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return DataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        DataFinal = dataFinal;
    }

    public ArrayList<Dev> getDevs() {
        return devs;
    }

    public void setDevs(ArrayList<Dev> devs) {
        this.devs = devs;
    }

    public ArrayList<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(ArrayList<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
