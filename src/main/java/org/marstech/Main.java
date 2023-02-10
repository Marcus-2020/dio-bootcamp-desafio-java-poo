package org.marstech;

import org.marstech.domain.entities.Curso;
import org.marstech.domain.entities.Mentoria;

import java.time.LocalDate;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(UUID.randomUUID(), "curso java", "descricao curso java", 8);
        Curso curso2 = new Curso(UUID.randomUUID(), "curso js", "descricao curso js", 4);

        Mentoria mentoria1 = new Mentoria(UUID.randomUUID(), "mentoria java", "mentoria mentoria java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria(UUID.randomUUID(), "mentoria js", "descricao mentoria js", LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);

        System.out.println();

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}