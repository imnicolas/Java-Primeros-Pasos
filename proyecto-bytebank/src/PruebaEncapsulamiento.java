public class PruebaEncapsulamiento {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("esteban");
        cliente.setDocumento("39k9k9k9");

        System.out.println(cliente.getNombre() + " " + cliente.getDocumento());
    }
}

        // En Este caso nosotros tenemos 2 nuevos objetos, instancias de las clases Cliente y Cuenta.
            // Un punto importante a favor de los getter y setter. por ejemplo :
            // Si quiero modificar un atributo del objeto cliente y lo hago a traves de sus setters. Me estoy
            // exponiendo a poder modificar a mi antojo, los valores de los atributos de mi clase Cliente, además
            // también si quisiera podría validar de formas distintas ya que puedo modificar los setters para cada objeto nuevo
            // IMPORTANTE : Por esto es importante seguir manejandome con métodos, depositar() - retirar() - transferir()
            // para asegurarnos de mantener una lógica en el código y proteger los atributos de las Clases.