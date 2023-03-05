public class TestFuncionario {
    public static void main(String[] args) {

        Funcionario nicolas = new Contador();
        nicolas.setDocumento("37431955");
        nicolas.setSalario(2000);

        System.out.println(nicolas.getSalario()+" salario");

        System.out.println(nicolas.getBonificacion()+" bonificacion");
    }
}