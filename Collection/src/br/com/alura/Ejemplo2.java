package br.com.alura;

import java.util.ArrayList;

public class Ejemplo2 {

    public static void main(String[] args) {
        String variable1="Clase1";
        String variable2="Clase2";
        String variable3="Clase3";
        String variable4="Clase4";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);

        System.out.println(lista);

//        for (int i = 0 ; i < lista.size() ; i++){
//            System.out.println(lista.get(i));
//        }

//        for (String recorre : lista){
//            System.out.println(recorre);
//        }

        //Lambda function
                    //variable
//        lista.forEach(clase->{
//            System.out.println(clase);
//        });
        // Consigo recorrer la lista de String -> forEach() llega apartir de java 8



    }
}
