public class Administrador extends Funcionario implements Autenticable{

    private AutenticacionUtil util;

    public Administrador(){
        this.util = new AutenticacionUtil();
    }

    public double getBonificacion(){
        return this.getSalario();
    }

    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }

    @Override
    public boolean autenticar(String contraseña) {
        return false;// TODO
    }
}
