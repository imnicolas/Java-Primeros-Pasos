public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int numero){ // Los consctrucores, NO se heredan.
        super(agencia,numero); // Por eso hacemos uno nuevo en la clase hija pero podemos llamar al constructor Madre -> super()
    }

    @Override // Sobre escritura de metodo : La firma no puede cambiar es decir solo podemos modificar el bloque de código, de otra forma no es Override
    public boolean saca(double valor) {
        double comision = 0.2;
        return super.saca(valor+comision);
    }

    @Override
    public void depositar(double dinero) {
        this.saldo = this.saldo + dinero;
    }
}
