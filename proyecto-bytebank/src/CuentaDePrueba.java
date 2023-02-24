public class CuentaDePrueba {

    public static void main(String[] args) {

        Cuenta2 cuenta1 = new Cuenta2 (20);
        Cuenta2 cuenta2 = new Cuenta2 (30);
        Cuenta2 cuenta3 = new Cuenta2 (40);

    }
}

// Atencion, el constructor () te obliga, te fuerza a que le indiques parametros al momento de crear objetos.
// con esto conseguimos validar nuestros objetos hasta llegar a la lógica de negocio que necesitemos.
// EJEMPLO : si necesitamos -> agencia > 1 - Podemos indicar en el constructor una condicion y ademas por parametro
// para que no se le asigne un valor default, le indicamos que la nueva instancia necesita un argumento para su creación.