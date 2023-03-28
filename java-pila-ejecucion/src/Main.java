public class Main {
    public static void main(String[] args) {
        metodo1();
        System.out.println("Fin de main()");
    }
    public static void metodo1 (){
        System.out.println("inicio de metodo1");
        try {
            metodo2();
        }catch (MiExcepcion e){ // En el bloque la excepcion puede que ocurra como puede que NO!
            e.getMessage();
        }
        System.out.println("Fin de metodo 1");
    }

    public static void metodo2 ()throws MiExcepcion{ // En la firma throws quiero decir que el metodo SI o si lanza una excepcion
        System.out.println("inicio de metodo 2");
        System.out.println("Fin de metodo 2");
        throw new MiExcepcion("mi excepcionnnnnnnnn gg !");
    }
}