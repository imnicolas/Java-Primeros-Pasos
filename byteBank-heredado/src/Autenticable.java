public interface Autenticable {

    public void setClave(String clave);

    public boolean iniciarSesion(String clave);

    public boolean autenticar(String contraseña);

}
