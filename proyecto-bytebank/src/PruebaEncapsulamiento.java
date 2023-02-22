public class PruebaEncapsulamiento {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.setNombre("esteban");
        cliente.setDocumento("39k9k9k9");

        System.out.println(cliente.getNombre() + " " + cliente.getDocumento());
    }
}
