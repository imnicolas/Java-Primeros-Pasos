public class MiExcepcion  extends Exception{ // Excepcion Checked (verificada) por el programador.
    public MiExcepcion(){
        super();
    }

    public MiExcepcion(String message){
        super(message);
    }

}

// Throwable es una Clase que se divide en 2 grandes grupos -> Exceptions & Errors
