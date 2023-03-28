public class Main {
    public static void main(String[] args) {
        metodo1();
        System.out.println("Fin de main()");
    }
    public static void metodo1(){
        System.out.println("inicio de metodo1");
        try {
            metodo2();
        }catch (MiExcepcion e){
            e.getMessage();
        }
        System.out.println("Fin de metodo 1");
    }

    public static void metodo2(){
        System.out.println("inicio de metodo 2");
        System.out.println("Fin de metodo 2");
        throw new MiExcepcion("mi excepcionnnnnnnnn gg !");
    }
}