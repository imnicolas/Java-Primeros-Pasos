public class PracticoReferencias {
    public static void main(String[] args) {

        Cuenta nicoCuenta = new Cuenta () ;
        nicoCuenta.setAgencia(10);

        Cuenta belkisCuenta = new Cuenta() ;
        belkisCuenta.setAgencia(100);
        belkisCuenta.setAgencia(1212321);

        System.out.println("belkis " + belkisCuenta); // Output = belkis Cuenta@4554617c
        System.out.println("nico "+nicoCuenta); // Output = nico Cuenta@1b6d3586

        // Hasta ACA objetos distintos, porque apuntan a 2 espacios diferentes de memoria

        belkisCuenta = nicoCuenta ;

        System.out.println("belkisIGUALES " + belkisCuenta); // Output = belkisIGUALES Cuenta@1b6d3586
        System.out.println("nicoIGUALES " + belkisCuenta); // Output = nicoIGUALES Cuenta@1b6d3586

        // Ahora YA son iguales, porque los dos objetos hacen referencia al mismo espacio en memoria
        // en este caso belkisCuenta y nicoCuenta apuntan al espacio en memoria de nicoCuenta = Cuenta@1b6d3586

        belkisCuenta.setAgencia(1);
        System.out.println("nico "+nicoCuenta.getAgencia()); // Output = nico 1

            // EJEMPLO :
        Cuenta ejemplo = new Cuenta () ;
        ejemplo.setAgencia(100);

        Cuenta ejemplo2 = ejemplo ;
        ejemplo2.setAgencia(500);

        System.out.println(ejemplo.getAgencia()); // Output = 600

        // Las 2 variables, ejemplo y ejemplo2 se refieren al mismo espacio en memoria, entonces el valor de ejemplo
        // cambia por la asignacion realizada en ejemplo2 . Y como en ejemplo2 tenemos += 500, la formula es 100 + 500.
    }

}
