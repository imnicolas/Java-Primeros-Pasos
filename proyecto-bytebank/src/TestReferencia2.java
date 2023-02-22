public class TestReferencia2 {

    public static void main(String[] args) {
// Creamos un objeto nuevo de tipo Cliente
        Cliente nicolas = new Cliente();
        nicolas.setNombre("Nicolás");
        nicolas.setDocumento("37431955");
        nicolas.setTelefono("1500");
// Creamos un objeto nuevo de tipo Cuenta
        Cuenta cuentaDeNicolas = new Cuenta();
        cuentaDeNicolas.agregotitular(nicolas) ; // Referencia de cuentaDeNicolas -> nicolas
        System.out.println(cuentaDeNicolas.getTitular().getNombre());
    }
}

// Recorda : En Java todos es de acuerod a Referencias.
// En este ejemplo, lo que pasó fue que creamos 2 objetos nuevos, instancias de las dos clases Cuenta y Cliente.
// Entonces nosotros podemos relacionar los dos objetos mediante referencias, como vimos anteriormente.
// En este caso en nuestra clase Cuenta, nosotros hicimos una variable (Atributo) llamada titular del tipo Cliente
// Con esto nosotros nos referimos a un objeto de tipo Cliente, para poder establecer la relacion entre los 2 objetos.