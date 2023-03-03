import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("python");
        curso2.setDescricao("curso de python");
        curso2.setCargaHoraria(16);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("detalhes da mentoria em java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp Banco Panamericano de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.increverBootcamp(bootcamp);
        System.out.println("Conteudo inscrito Camila: " + devCamila.getConteudoIncritos());
        System.out.println("______________");
        //devCamila.progredir();
        System.out.println("Conteudo inscrito Camila: " + devCamila.getConteudoIncritos());
        System.out.println("Conteudo concludo Camila: " + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println("\b");

        Dev devAndre = new Dev();
        devAndre.setNome("André");
        devAndre.increverBootcamp(bootcamp);
        System.out.println("Conteudo inscrito André: " + devAndre.getConteudoIncritos());
        System.out.println("______________");
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("Conteudo inscrito André: " + devAndre.getConteudoIncritos());
        System.out.println("Conteudo concludo André: " + devAndre.getConteudoConcluidos());
        System.out.println("XP: " + devAndre.calcularXp());

    }







}