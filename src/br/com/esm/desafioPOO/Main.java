package br.com.esm.desafioPOO;

import br.com.esm.desafioPOO.domain.Bootcamp;
import br.com.esm.desafioPOO.domain.Curso;
import br.com.esm.desafioPOO.domain.Dev;
import br.com.esm.desafioPOO.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("ApiRestFull");
        curso1.setCargaHoraria(8);
        curso1.setDescicaoConteudo("Criação de uma API no padrão Rest");

        Curso curso2 = new Curso();

        curso2.setTitulo("Postgresql");
        curso2.setCargaHoraria(6);
        curso2.getDescicaoConteudo();

        Curso curso3 = new Curso();

        curso3.setTitulo("Docker");
        curso3.setCargaHoraria(4);
        curso3.setDescicaoConteudo("introdução ao Docker");

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Como se desenvolver na carreira de programador. ");
        mentoria.setDescicaoConteudo("Dicas e tecnicas para se tornar um desenvolvedor de excelência.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNomeBootcamp("Java Expert");
        bootcamp.setDescricaoBootcamp("Como se tornar um java expert");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devEmerson = new Dev();
        devEmerson.setNomeDev("Emerson Mascarenhas");
        devEmerson.inscreverBootcamp(bootcamp);
        System.out.printf("Conteudos inscritos Emerson %n" + devEmerson.getConteudosInscritos());
        devEmerson.avancarBootcamp();
        devEmerson.avancarBootcamp();
        System.out.println("-");
        System.out.println("Conteudos Incritos Emerson: " + devEmerson.getConteudosInscritos());
        System.out.println("Conteudos conclidos Emerson: " + devEmerson.getConteudosConcluidos());
        System.out.println(" XP: " + devEmerson.calcularTotalXP());

        System.out.println("====================");
        Dev devJosi = new Dev();
        devJosi.setNomeDev("Josi Mascarenhas");
        devJosi.inscreverBootcamp(bootcamp);
        System.out.printf("Conteudos inscritos Josi " + devJosi.getConteudosInscritos());
        devJosi.avancarBootcamp();
        devJosi.avancarBootcamp();
        devJosi.avancarBootcamp();
        devJosi.avancarBootcamp();
        System.out.println("-");
        System.out.println("Conteudos Incritos Josi: " + devJosi.getConteudosInscritos());
        System.out.println("Conteudos conclidos Josi: " + devJosi.getConteudosConcluidos());
        System.out.println(" XP: " + devJosi.calcularTotalXP());



    }
}
