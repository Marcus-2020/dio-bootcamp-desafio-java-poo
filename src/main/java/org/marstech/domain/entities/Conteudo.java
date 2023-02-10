package org.marstech.domain.entities;

import java.util.UUID;

abstract class Conteudo extends EntidadeBase {

    protected static final int XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public Conteudo() {
    }

    public Conteudo(UUID id, String titulo, String descricao) {
        super(id);
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double CalcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "AtividadeBase{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                "} " + super.toString();
    }
}
