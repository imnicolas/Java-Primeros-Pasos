public class MultiplosDe3 {
    public static void main(String[] args) {

        for (int numero = 0; numero <= 100; numero++) {
            int multiplo = numero % 3;
            if (multiplo == 0) {
                System.out.print("el numero " + numero + " es multiplo de 3");
            }
            System.out.println();
        }//fin condicion
    }
}
