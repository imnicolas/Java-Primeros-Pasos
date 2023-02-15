public class EjemploCondicionales {
    public static void main(String[] args) {

        int edad = 17;
        int cantidad = 2;

        // Java (basado en el lenguaje c ) se puede evitar las llaves del bloque de código, solo si
        // queremos que en caso que la condicion sea TRUE, la siguiente linea sea ejecutada como consecuencia ;
        // Aunque NO es una buena práctica y por convensión se utilizan siempre las {} para el bloque de código ;
        if (edad >= 18) {
            System.out.println("Puede ingresar es mayor de edad Bienvenido");
        } else {
            if (cantidad >= 2) {
                System.out.println("Es menor de edad pero PUEDE ingresar");
            } else {
                System.out.println("Usted no puede ingresar");
            }
        }
        ;//fin de la condicion
    }
}