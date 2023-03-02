public class TestReferencias {

    public static void main(String[] args) {

        // Ejemplo : si instanciara un Gerente de tipo Funcionario
        //                      SI porque el elemento mas generico puede ser adaptado al mas especifico 
        Funcionario funcionario = new Funcionario();
        funcionario.setNombre("nicolas");

        Gerente gerente = new Gerente();
        gerente.setNombre("camila");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

    }

}
