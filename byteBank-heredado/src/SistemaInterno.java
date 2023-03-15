public class SistemaInterno {

    private String clave = "1234";
    public boolean autentica (Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("log in succesfull");
            return true;
        }else {
            System.out.println("can't log in");
            return false;
        }
    }

}
