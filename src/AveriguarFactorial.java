public class AveriguarFactorial {
    public static void main(String[] args) {

        int factorial = 1 ;

        for( int n = 1 ; n < 11 ; n++){
            factorial *= n ; // Ahora aprovechamos que en la variable factorial queda guardado el valor de la multiplicacion
            // y en cada iteracion se lo multiplica por n cantidad de veces
            System.out.println("el factorial de " + n + " es " + factorial);
        }//fin ciclo 1

    }
}
