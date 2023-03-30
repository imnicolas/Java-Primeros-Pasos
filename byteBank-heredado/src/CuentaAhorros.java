public class CuentaAhorros extends Cuenta{

    public CuentaAhorros(int agencia,int numero){
        super(agencia,numero);
        System.out.println("se creo una cuenta de ahorro");
    }

    @Override
    public void depositar(double dinero) {
        this.saldo = this.saldo + dinero;
    }
}
