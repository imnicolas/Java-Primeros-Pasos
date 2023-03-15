

//         Hereda       de      Funcionario
public class Gerente extends Funcionario implements Autenticable {

    private AutenticacionUtil util ;

    public Gerente(){
        this.util = new AutenticacionUtil();
    }

    public double getBonificacion(){
        System.out.println("ejecutando desde Gerente");
        return 2000 ;
        // super && super() nos sirve para acceder a los atributos/metodos
        // de la Clase padre y a su constructor si asi lo necesitamos
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {

        return this.util.iniciarSesion(clave);
    }

}


// HERENCIA:
//A) Hereda todas las características de la Clase Funcionario.
//
//B) Hereda to do el comportamiento de Clase Funcionario.
//
//C) Gerente es un Funcionario

// Ventajas
        //1. Importante heredar y dejar herencia, para reutilizar código y asi lograr no repetir
        //   instrucciones, metodos y atributos
        //2. ClasePadre extends ClaseHija -> sintaxis para extender/heredar de una Clase a otra ;
        //3. las clasesHijas reciben todos los atributos y metodos de su clasePadre ;