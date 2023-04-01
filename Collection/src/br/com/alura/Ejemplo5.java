package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo5 {

    public static void main(String[] args) {

        Curso curso1=new Curso("Java",30);
        Curso curso2=new Curso("Js",12);
        Curso curso3=new Curso("Rust",50);
        Curso curso4=new Curso("Php",20);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        Collections.sort(cursos);
        Collections.sort(cursos,Collections.reverseOrder());

        // Lambda retorna una List nueva -> por eso la referenciamos
        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Php")).
                sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        System.out.println(cursoList);

    }

}
