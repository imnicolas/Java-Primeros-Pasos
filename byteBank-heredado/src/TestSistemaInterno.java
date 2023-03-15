public class TestSistemaInterno {
    public static void main(String[] args) {


        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador administrador = new Administrador();

        sistema.autentica(gerente1);
        sistema.autentica(administrador);
    }
}
