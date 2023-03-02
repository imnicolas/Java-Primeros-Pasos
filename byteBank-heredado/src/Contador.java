public class Contador extends Funcionario{

    @Override // la notation sobreEscritura -> apunta al elemento mas especifico, Contador
    public double getBonificacion() {
        System.out.println("SobreEscribiendo el método :");
        return 200;
    }
}
