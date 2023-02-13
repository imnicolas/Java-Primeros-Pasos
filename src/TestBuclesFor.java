public class TestBuclesFor {
    public static void main(String[] args) {

        for(int fila = 0 ; fila <= 10 ; fila ++){
            for (int columna = 0 ; columna <= 10 ; columna ++){ // 10 columnas por 1 fila en cada iteracion
                if (columna > fila ){
                    break;
                }
                System.out.print(columna+1);// la variable columna = 0 entonces al imprimirla con +1 el output es 1 en vez de 0
                //en la primer iteracion
            }
            System.out.println();
        }//fin de condicion

    }
}
