//entidad Cuenta :
class Cuenta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular; // Atributo que usamos para referenciar a la clase Cliente

    // Ahora definimos nuestros metodos para la clase
    // no retorna nada
    public void depositar(double dinero) {
        //    This account        this account    this object
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

    // Ahora el método transferir (), que recibe 2 parámetros el primero es la cantidad a transferir y el segundo es un objeto de tipo cuenta
    // que es a quien vamos a transferirle

    // SI retorna
    public boolean transferir(double valor, Cuenta cuenta) {

        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;

    }

}

// Instancias : son objetos que heredan de la clases sus atributos y metodos es decir su ESQUELETO

// Metodos : Atencion , en java hay dos tipos de métodos, 1 es el que retorna un valor y el otro NO( solamente ejecuta
// una serie de cosas sin retornar, este tipo de metodo usa la palabra reservada VOID (no espera retornar nada))

// Uso del THIS : Se usa para declarar que Objeto queremos tratar, sirve para especificar a que atributo tu haces referencia
// van a haber casos que el uso de tus variables sea igual al nombre de tus campos, entonces el uso de this va a hacer mucho
// mas facil poder interpretar.

