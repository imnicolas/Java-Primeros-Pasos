public class EjercicioMatriz {
    public static void main(String[] args) {
        //una matriz es una "cuadricula de x * x"

        //imprimir matriz de asteriscos
        //Uso de break para romper un ciclo con un condicional

        for (int fila = 0; fila <= 10; fila++) {
            for (int columna = 0; columna <= 10; columna++) { // aca mismo se podría cambiar la condicion del ciclo
                // por ejemplo ; columna < fila ; así nos daría el mismo que el siguiente if
                if (columna >= fila) {
                    break;
                }//en la primer iteracion del fila = 0 y columna = 0 entonces imprime un "*"
                // segunda iteracion fila = 1 y columna = 0 + 1 entonces imprime dos "*"
                // tercer iteracion fila = 2 y columna = 0 + 1 + 2 entonces imprime tres "*" etcetera.
                System.out.print("*");
                System.out.print(" ");
            }//fin del ciclo
            System.out.println();
        }// fin del ciclo
    }
}
