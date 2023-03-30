public class TestGerente {

    public static void main(String[] args) {

        Gerente gerente2 = new Gerente();
        gerente2.setSalario(6000);
        gerente2.setClave("1234");

        Funcionario jorge = new Gerente();
        jorge.setSalario(3000);
        System.out.println(jorge.getBonificacion()+" JORGE BONIF"); // 10% del salario


        Gerente esteban = new Gerente();
        esteban.setSalario(2000);
        esteban.getBonificacion();
        System.out.println(esteban.getBonificacion()+" ES la bonif MIA"); // 100% del salario

        boolean autentico = gerente2.iniciarSesion("1234");

        System.out.println(gerente2.getBonificacion()+" Bonificacion del gerente");
        System.out.println(gerente2.iniciarSesion("1234"));
        System.out.println(autentico);

    }
}
