public class PruebaMetodos {

    public static void main(String[] args) {
// Ahora usamos el primer metodo depositar, en una nueva instancia de la clase Cuenta
        Cuenta cuenta = new Cuenta();
        cuenta.saldo = 300;
        cuenta.depositar(200);
        System.out.println(cuenta.saldo);
// ACA usamos el segundo metodo retirar, que este retorna true o false (para verificar si el retiro es exitoso) en este caso.
        cuenta.retirar(50);
        System.out.println(cuenta.saldo);

        Cuenta cuentaDeBelkis = new Cuenta(); // 2da Cuenta para usar el metodo transferir ()
        cuentaDeBelkis.depositar(1000);
        boolean puedeTransferir = cuentaDeBelkis.transferir(400, cuenta);
        if (puedeTransferir) {
            System.out.println("transferencia Exitosa");
        } else {
            System.out.println("No pudo transferir");
        }
        System.out.println("Belkis account : " + cuentaDeBelkis.saldo);
        System.out.println("Nico Account : " + cuenta.saldo);

    }// Fin del main

}
