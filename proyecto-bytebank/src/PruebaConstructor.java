public class PruebaConstructor {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(19); // Entonces asignamos al objeto nuevo desde el inicio - agencia : 19 ;
        Cuenta cuenta1 = new Cuenta(88);
        Cuenta cuenta2 = new Cuenta(55);
        Cuenta cuenta3 = new Cuenta(22);
                            //Cuenta.total= 0; Output -> .total has private access in Cuenta.
        Cuenta.setTotal(20);// Output -> 20 . Que paso? nuestro set esta declarado de manera static por eso podemos
                            //acceder a nuestra variable total desde nuestra Clase.
                            // ATENCION : los métodos get y set dependen de la lógica de negocio de cada proyecto .
        System.out.println(Cuenta.getTotal());

    }
}
// *Referencia
// Si una clase contiene una variable/metodo static, esto significa que todas sus instancias van a hacer referencia a la variable
// Ejemplo : Instancia1 ---> static var total = 0; / Instancia2 ---> static var total = 0;
// Es decir los dos objetos nuevos hacen referencia a la misma variable, que en este caso es un contador.

//         vive en
// static    --->   Clase ... es decir puedo acceder solo desde la Clase

//         vive en
// !static    --->   instancia ... es decir puedo acceder solo desde la instancia