public class DeduccionSalario {
    public static void main(String[] args) {

        double salario = 3300.0;
        double Ir;

        if (salario <= 2800) {
            Ir = 7.5;
            System.out.println("su IR es " + Ir + " y la deduccion es de 1");
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            Ir = 15;
            System.out.println("su IR es " + Ir + " y la deduccion es de 2");
        } else if (salario > 3751.0) {
            Ir = 22.5;
            System.out.println("su IR es " + Ir + " y la deduccion es de 3");
        }

        //fin condicion

        // Podemos usar el statement "switch" para evitar muchas condiciones encadenadas


    }
}
