import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("------- DEV RAFAEL -------");
        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println(" ------- ");
        System.out.println("Conteudos inscritos: " + devRafael.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devRafael.getConteudosConcluidos());
        System.out.println("XP: " + devRafael.calcularXp());

        System.out.println("\n -------   ------- \n");

        System.out.println("------- DEV JOSÉ -------");
        Dev devJose = new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        devJose.progredir();
        System.out.println("Conteudos inscritos: " + devJose.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devJose.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularXp());








    }
}
