package br.com.alura;

import br.com.Model.Clase;
import br.com.Model.Curso;

import java.util.ArrayList;

public class Ejemplo6 {
    public static void main(String[] args) {

        Curso curso = new Curso("java",30);

        curso.addClase(new Clase("ArrayList"));
        curso.addClase(new Clase("List"));
        curso.addClase(new Clase("ArrayList"));

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso);
        System.out.println(cursos.get(0).getClaseList());


    }

}
