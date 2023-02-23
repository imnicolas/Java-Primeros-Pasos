//entidad Cuenta :
class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; // Atributo que usamos para referenciar a la clase Cliente

    private static int total = 0 ; // variable estática, solo accesible por la Clase

    // Desde el constructor, manipulamos los nuevos objetos desde su nacimiento. Validar, inicializar atributos, etc ...
    public Cuenta(int agencia){ // Como argumento podemos usar una variable por "lógica de negocio" por ejemplo, en cada instancia
        // de nuestra clase podriamos indicar como párametro que valor va a tenér nuestro objeto.

        if (agencia <= 0 ){
            System.out.println("No se permite 0");
            this.agencia = 1 ; // si creamos un objeto nuevo agencia.value = 1 por default .
        }else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("EL total de las cuentas es : "+ total); // la usamos como contador, para confirmar la cantidad
        // de objetos que tenemos.
    }


    // Ahora definimos nuestros metodos para la clase

    public void agregotitular (Cliente nombreTitular){
        this.titular = nombreTitular ;
    }

    public void depositar(double dinero) {     // NO retorna nada
        //This account   this account    this object
        this.saldo = this.saldo + dinero;
    }

    // Ahora el método retirar con Retorno , nos va a devolver un booleano en este caso para saber si fue exitoso el retiro
    // no retorna nada
    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }
        return false;
    }

    // Ahora el método transferir (), que recibe 2 parámetros el primero es la cantidad a transferir y el segundo
    // es un objeto de tipo cuenta que es a quien vamos a transferirle
    public boolean transferir(double valor, Cuenta cuenta) { // SI retorna

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;

    }

                    // Getter
    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    // Setter
    public void setAgencia(int agencia){
        if(agencia > 0){
            this.agencia = agencia ;
        }else {
            System.out.println("no estan permitidos valores negativos");
        }
    }

    public void setSaldo(double saldo) {
        if(saldo > 0){
            this.saldo = saldo;
        } else {
            System.out.println("no estan permitidos valores negativos");
        }
    }

    public void setNumero(int numero) {
        if(numero > 0){
            this.numero = numero;
        }else {
            System.out.println("no estan permitidos valores negativos");
        }
    } // En este caso, usamos el condicional en los setters, para controlar/ validar que sean valores positivos

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

// Instancias : son objetos que heredan de la clases sus atributos y metodos es decir su ESQUELETO

// Metodos : Atencion , en java hay dos tipos de métodos, 1 es el que retorna un valor y el otro NO( solamente ejecuta
// una serie de cosas sin retornar, este tipo de metodo usa la palabra reservada VOID (no espera retornar nada))

// Uso del THIS : Se usa para declarar que Objeto queremos tratar, sirve para especificar a que atributo tu haces referencia
// van a haber casos que el uso de tus variables sea igual al nombre de tus campos, entonces el uso de this va a hacer mucho
// mas facil poder interpretar.

