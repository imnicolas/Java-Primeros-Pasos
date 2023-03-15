public class Contador extends Funcionario{

    // Heredo de Clase abstracta -> estoy obligado a implementar y sobreEscribir sus metodos.
    @Override // la notation Override -> apunta al elemento mas especifico, Contador (Polimorfismo)
    public double getBonificacion() {
        System.out.println("SobreEscribiendo el método :");
        return 200;
    }
}
