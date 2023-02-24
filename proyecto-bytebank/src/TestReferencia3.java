public class TestReferencia3 {

    public static void main(String[] args) {

        Cuenta cuentaDeNicolas = new Cuenta(12);
        // cuentaDeNicolas.titular.nombre = "Nicolas";
        // System.out.println(cuentaDeNicolas.titular.nombre);
            // El output acá, es un exception. Porque titular = null -> exception . . . (despues de null el resto es exception)

        Cuenta cuentaDeBelkis = new Cuenta(13);
        cuentaDeBelkis.setTitular(new Cliente());
        cuentaDeBelkis.getTitular().setNombre("Belkis");
        System.out.println(cuentaDeBelkis.getTitular().getNombre());


        Cuenta cuentaDeNico = new Cuenta(200); // Ahora con el atributo titular = new Cliente()
        System.out.println(cuentaDeNico.getTitular().getNombre()); // Output -> null . default value = null ;
        cuentaDeNico.getTitular().setNombre("jose");
        System.out.println(cuentaDeNico.getTitular().getNombre()); // Output -> jose .

    }
}

// Por default un tipo de datos String (objeto) es inicializado null ;
// Haciendo un parentesis, si tuvieras un System.out.println(cuentaDeNicolas.titular) --> null .
// por qué ? Porque el atributo titular(String) al no ser inicializado su valor es null por default ..
