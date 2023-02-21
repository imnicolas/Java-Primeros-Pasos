public class TestReferencia {

    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta () ;
        primeraCuenta.setSaldo(200);

        Cuenta segundaCuenta =  primeraCuenta;
        segundaCuenta.setSaldo(50); // ATENCION, asignarle al campo saldo el valor 50 afecta al objeto primeraCuenta? SI
            // Este Output es = 50.0 y 50.0 ;
        System.out.println("Saldo en primera cuenta es : "+primeraCuenta.getSaldo());
        System.out.println("Saldo en segunda cuenta es : "+segundaCuenta.getSaldo());
        segundaCuenta.setSaldo(400);
        System.out.println("Saldo en PRIMERA cuenta es : "+primeraCuenta.getSaldo());

        // Referencias :
            // y aca la explicación, primeraCuenta apunta al espacio en memoria que se le fue asignado.
            // Con segundaCuenta también apuntando al mismo espacio en memoria, cuando hacemos cambios de valores
            // los hacemos en ese espacio en memoria
            // para explicar como conseguimos ese Id del espacio en memoria del que hablamos hacemos esto ->

        System.out.println(primeraCuenta);        // Output = Cuenta@15f29k3
        // imprimiendo solo primeraCuenta nos devuelve primero el tipo de objeto y luego del @ el Id del espacio en memoria
        // reservado.
    }

}
