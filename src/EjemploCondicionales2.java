public class EjemploCondicionales2 {
    public static void main(String[] args) {

        int edad = 21;
        int cantidadPersonas = 2;

        // variable de tipo primitivo que puede ser igual a true o false;
        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja ;
        System.out.println(esPareja);

        // Ahora tenemos en la condición una expresión boolean pero lo ideal es que nosotros tengamos optimizado
        // entonces podemos asignarle a la variable esPareja como valor la variable cantidadPersonas por ejemplo ;
        if (puedeEntrar) {
            System.out.println("sea Bienvenido");
        } else {
            System.out.println("Usted no puede ingresar");
        }
        ;//fin de la condicion
    }
}


// Java (basado en el lenguaje c ) se puede evitar las llaves del bloque de código, solo si
// queremos que en caso que la condicion sea TRUE, la siguiente linea sea ejecutada como consecuencia ;
// Aunque NO es una buena práctica y por convensión se utilizan siempre las {} para el bloque de código ;
