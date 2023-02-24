public class Cuenta2 {

    private int numero ;
    private double saldo ;
    private int agencia ;
    private static int total ; // static, nos va a decir que esta variable NO es de la instancia, mas bien es de la Clase
    // entonces no puede ser alterada por nuestra instancia.



    public Cuenta2 (){
        // vacio
    }

    //Atraves de este metodo constructor, podemos manipular las instancias de esta Clase desde su nacimiento
    public Cuenta2 (int agencia){
        if(agencia <= 0){// aqui valido que agencia >= 0. Tambien podría pedir, como parametro al momento de instanciar
            System.out.println("Error no se vale 0");
            this.agencia = 1 ;
        }else {
            this.agencia = agencia ;
        }
        total++;
        System.out.println("Aqui se crea una nueva cuenta");
        System.out.println("la cantidad total de cuentas nuevas es " + total);
    }
    //Cada vez que creemos una nueva cuenta del tipo Cuenta va a tener estos valores y esta lógica !


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Cuenta2.total = total;
    }
}
