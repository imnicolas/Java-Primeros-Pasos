package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo3 {

    public static void main(String[] args) {
        String curso1="Geometria";
        String curso2="Fisica";
        String curso3="Quimica";
        String curso4="Historia";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        //Collections.sort(cursos); //ordena una lista de forma ascendente
        // Collections.sort(cursos, Collections.reverseOrder()); ordena una lista de forma descendente

        //cursos.sort(Comparator.reverseOrder());//Ordena de mayor a menor (descendente)
        //cursos.sort(Comparator.naturalOrder());//Ordena de menor a mayor (ascendente)

        List<String> cursosList =cursos.stream().sorted().collect(Collectors.toList());

        //System.out.println(cursosList);
    }
}

