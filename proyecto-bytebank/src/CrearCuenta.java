public class CrearCuenta {

    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta(11) ;// new Cuenta (), significa guardame espacio en memoria para este objeto
        primeraCuenta.setSaldo(1000);
        //primeraCuenta.pais("Argentina"); no compila, el atributo pais no existe en la clase Cuenta.
        System.out.println(primeraCuenta.getSaldo());
        // Aqui Java nos pide que declaremos el objeto con parentesis, ya que lo que va a guardar
        //el objetos son una agrupacion de datos (atributos/metodos) ;
        // --------------------------------
        // Creamos una 2da Cuenta (Notamos que la primerCuenta y la segundaCuenta son INDEPENDIENTES entre si
        Cuenta segundaCuenta = new Cuenta(14) ;
        segundaCuenta.setSaldo(2000);
        System.out.println(segundaCuenta.getSaldo());
    }
}
// Instancias
    // 1 - Crear un nuevo objeto cuenta
    // 2 - cargarle datos a la nueva cuenta, usando una variable del tipo Cuenta para hacer la nueva cuenta
    // que significa Instancia?? El objeto Cuenta tiene n cantidad de instancias, cada objeto que hereda de Cuenta es
    // una instancia de la Clase Cuenta .

// Valores por Default
    // Cuando usamos new a un objeto, automaticamente se inicializa sus campos por ejemplo un atributo de tipo int
    // devuelve su default que es 0 (cero).
    // No es recomendable inicializar en el esqueleto (clases), sus atributos, porque
    // todas sus instancias van a heredar sus valores.

// Referencias
    // Java no guarda valores en variables. Mas bien Java tiene como concepto que la variable hace referencia al espacio
    // en memoria que se le asigno por ejemplo: primeraCuenta -> 303FFD. (303FFD es el Id generado del espacio en memoria)
    // Entonces la variable es la referencia al espacio en memoria donde se guarda el dato.