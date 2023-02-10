package org.marstech.domain.entities;

import java.util.UUID;

public class Curso extends Conteudo {

    private long cargaHoraria;

    public Curso() {
    }

    public Curso(UUID id, String titulo, String descricao, long cargaHoraria) {
        super(id, titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double CalcularXp() {
        return XP_PADRAO * 1.5;
    }

    public long getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(long cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "ID='" + super.getId() + "', " +
                "titulo='" + super.getTitulo() + "', " +
                "descricao='" + super.getDescricao() + "', " +
                "cargaHoraria=" + cargaHoraria +
                "}";
    }
}
