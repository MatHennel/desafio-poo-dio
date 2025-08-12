package br.com.matheus;

import br.com.matheus.entities.models.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Content course = Course.builder().title("Curso Java").description("Aprenda Java").workload(10).build();
        Content course2 = Course.builder().title("Curso Python").description("Aprenda Python").workload(10).build();
        Content course3 = Course.builder().title("Curso Java Script").description("Aprenda Java Script").workload(10).build();

        Content mentoring = Mentoring.builder().title("Mentoria de java").description("Descrição").date(LocalDate.now()).build();


        Set<Content> contents = new LinkedHashSet<>();
        contents.add(course);
        contents.add(course2);
        contents.add(course3);
        contents.add(mentoring);

        Bootcamp bootcamp = Bootcamp.builder().name("Bootcamp Java Developer").description("Descrição Bootcamp Java")
                .contents(contents).build();

        Dev devMatheus = Dev.builder().name("Matheus").build();
        devMatheus.registerBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos DEV Matheus: " + devMatheus.getSubscribedContent());
        devMatheus.progress();
        devMatheus.progress();
        System.out.println("Conteúdos concluídos DEV Matheus: " + devMatheus.getCompletedContents());
        System.out.println("Conteúdos inscritos DEV Matheus: " + devMatheus.getSubscribedContent());
        System.out.println("XP: " + devMatheus.xpTotalCalculation());

        Dev devJoao = Dev.builder().name("João").build();


        System.out.println("Conteúdos inscritos DEV João: " + devJoao.getSubscribedContent());

    }
}