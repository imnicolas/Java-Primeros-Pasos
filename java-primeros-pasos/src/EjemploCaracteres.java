public class EjemploCaracteres {

    public static void main (String[] args){

        char caracter = 'a' ;
        System.out.println(caracter);

        // char guarda un valor y en este caso el 65 en la tabla UNICODE, corresponde al caracter "A"
        char valor = 65;
        System.out.println(valor);
// -------------------------------
        // NO compila !! JAVA transforma el resultado de la operación al tipo mas grande, este caso es int
        // por eso no compila, no podemos asignarle a una variable de tipo char, un valor de tipo int.
        valor = (char) (valor + 1) ;
        System.out.println(valor);
    // Solución, castear el valor de la variable, forzar el resultado del output que diciendo en la primer expresion que
        //tenemos como resultado un char y en la segunda expresion la agrupamos entre () para indicar que el resultado
            //de esta operación es la que va a convertirse en tipo char;
// -------------------------------
        // String no es un tipo de datos en JAVA String es un Objeto ;
        String palabra = "Alura cursos online de tecnología";
        System.out.println(palabra);
    // Ten en cuenta que el número 2020 aparece al final de la oración,
        // esto se debe a que Java convierte automáticamente el número a String, de manera DIFERENTE a lo que sucedió con
            // los tipos primitivos que vimos anteriormente.
        palabra =palabra + 2020;
        System.out.println(palabra);

        //-------------------------------
        //El concepto y cómo declarar char y String.
        //Cómo concatenar Strings.
        //Atajo para crear método main.
        //Las variables almacenan valores y no referencias.
        //-------------------------------
    }
}
