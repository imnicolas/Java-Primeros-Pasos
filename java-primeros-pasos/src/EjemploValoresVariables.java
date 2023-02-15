public class EjemploValoresVariables{
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 9;
        System.out.println(numero2);

        numero2 = numero1 ;
        System.out.println(numero2);

        numero1 = 88 ;
        // numero 2 ???
        // Java trabaja con los valores de las variables, no usa punteros.
        // es decir que en este ej. La variable numero2 sigue valiendo 5.
        // porque numero2 no esta apuntando a numero1, solo le fue asignado el valor de numero1.
    }
}
