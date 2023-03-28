public class MiExcepcion  extends RuntimeException{
    public MiExcepcion(){
        super();
    }

    public MiExcepcion(String message){
        super(message);
    }

}

// Throwable es una Clase que se divide en 2 grandes grupos -> Exceptions & Errors
