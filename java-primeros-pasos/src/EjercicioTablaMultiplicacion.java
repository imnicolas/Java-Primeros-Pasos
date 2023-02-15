public class EjercicioTablaMultiplicacion {
    public static void main(String[] args) {

        for (int contador = 0; contador <= 10; contador++) {
            for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
                System.out.print(contador * multiplicacion);
                System.out.print(" ");
            }
            System.out.println();
        }//fin del ciclo
    }
}
