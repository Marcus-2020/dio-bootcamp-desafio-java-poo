package org.marstech.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

public class Mentoria extends Conteudo {

    private LocalDate dataMentoria;

    public Mentoria() {
    }

    public Mentoria(UUID id, String titulo, String descricao, LocalDate dataMentoria) {
        super(id, titulo, descricao);
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO * 1.5;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "ID='" + super.getId() + "', " +
                "titulo='" + super.getTitulo() + "', " +
                "descricao='" + super.getDescricao() + "', " +
                "dataMentoria=" + dataMentoria +
                "}";
    }
}
