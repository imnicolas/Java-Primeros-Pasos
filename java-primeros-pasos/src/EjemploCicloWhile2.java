public class EjemploCicloWhile2 {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0; // la variable total para sumar contador en cada iteracion

        while (contador <= 10) {
            total = total + contador ;
            // System.out.println(total); Si imprimo total dentro del ciclo, mi output va a ser el total de la suma
            // en cada iteracion, por ej : 1 3 6 10 15 21 ... 55 ;
            contador++;
        }
        System.out.println(total); // Si lo imprimo fuera del Scope del ciclo, mi output solo va a imprimir el total ;
    }
}
