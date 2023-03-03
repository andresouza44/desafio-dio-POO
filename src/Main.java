import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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
    }
}