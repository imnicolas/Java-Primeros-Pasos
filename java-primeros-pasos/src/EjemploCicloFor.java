public class EjemploCicloFor {
    public static void main(String[] args) {
                // variable     condición       lo que vamos a ejecutar
        for (int contador = 0 ; contador <= 10 ; contador ++) {
            System.out.println(contador);
        }//fin del ciclo
    }
}
    //Como funciona ?
// Para la primer parte, donde declaras variable, hay que saber que en la primera iteración, el for
// inicializa nuestra variable, pasa por la condición y ejecuta el código, luego en la segunda iteración NO vuelve
// a inicializar la variable, lo que hace es IGNORAR esa parte y continúa su ruta.

    // Cuando usar for ?
// Cuando no necesitemos usar la variable en un ámbito fuera del for, a diferencia del while
// que si se puede usar la variable fuera del scope del ciclo