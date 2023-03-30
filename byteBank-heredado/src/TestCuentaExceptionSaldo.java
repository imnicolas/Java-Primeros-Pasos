public class TestCuentaExceptionSaldo {

    public static void main(String[] args) {

        Cuenta cuenta = new CuentaAhorros(123,456);

        cuenta.depositar(200);
        try {
            cuenta.saca(200);
        }catch (SaldoInsuficienteException saldoE){
            saldoE.printStackTrace();
        }

    }
}
