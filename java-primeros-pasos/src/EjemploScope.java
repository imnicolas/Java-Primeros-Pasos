public class EjemploScope {
    public static void main(String[] args) {
        int edad = 21;
        int cantidadPersonas = 2;

        // ALl boolean por defecto es false ;
        boolean esPareja;
        // Este print no compila, porque JAVA no permite usar variables que no esten inicializadas ;


        // Ahora inicializamos la variable esPareja asignandole en el bloque de código que puede ser tanto true como false
        // entonces compila, de lo contrario, con solo el bloque del if sin el bloque del else, nosotros tendríamos una minima posibilidad
        // de que la variable sea NO inicializada ; ( Java no acepta variables no inicializadas para compilar )
        if (cantidadPersonas > 1) {
            esPareja = true;
        } else {
            esPareja = false;
        }
        boolean puedeEntrar = edad >= 18 && esPareja;
        System.out.println(esPareja);


        if (puedeEntrar) {
            System.out.println("sea Bienvenido");
        } else {
            System.out.println("Usted no puede ingresar");
        }
        ;//fin de la condicion
    }
}