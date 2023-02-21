public class PruebaAcceso {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        cuenta.retirar(300);

        System.out.println(cuenta.getSaldo()); // Output -> 0.0 porque retirar() = false

        // System.out.println(cuenta.saldo); Output -> -100 ; Entonces nosotros ahora mostramos el encapsulamiento
        // Si nuestro proyecto tiene reglas de negocios como por ejemplo - No se puede modificar atributos de una clase
        // por afuera de ella .. Entonces necesitamos que sus atributos sean privados / private.

        // Aca , método Getter ..
        Cuenta cuenta2 = new Cuenta();
        cuenta2.depositar(500);
        cuenta2.retirar(300);

        System.out.println(cuenta2.getSaldo());

        // Aca , método Setter ..

        cuenta2.setSaldo(100);

        System.out.println(cuenta2.getSaldo());


    }

}
