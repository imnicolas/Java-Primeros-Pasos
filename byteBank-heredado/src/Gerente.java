

//         Hereda       de      Funcionario
public class Gerente extends Funcionario {
    private String clave;
    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "1234";
    }

    public boolean autenticar(String contraseña){
        if(this.clave == contraseña){
            return true;
        }else{
            return false;
        }
    }

    public double getBonificacion(){
        return super.getSalario(); // super && super() nos sirve para acceder a los metodos de la Clase padre y a su constructor si asi lo necesitamos
    }
}


// HERENCIA:
//A) Hereda todas las características de la Funcionario.
//
//B) Hereda to do el comportamiento de clase Funcionario.
//
//C) Gerente es un Funcionario

// Ventajas
        //1. Importante heredar y dejar herencia, para reutilizar código y asi lograr no repetir
        //   instrucciones, metodos y atributos
        //2. ClasePadre extends ClaseHija -> sintaxis para extender/heredar de una Clase a otra ;
        //3. las clasesHijas reciben todos los atributos y metodos de su clasePadre ;