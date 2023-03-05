public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(int agencia,int numero){
        super(agencia,numero);
    }

    @Override
    public void depositar(double dinero) {
        this.saldo = this.saldo + dinero;
    }
}
