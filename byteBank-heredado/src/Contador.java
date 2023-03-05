public class Contador extends Funcionario{

    // getBonificacion() es metodo abstracto, por lo tanto hay que implementarlo en cada caso de herencia.
    @Override // la notation sobreEscritura -> apunta al elemento mas especifico, Contador (Polimorfismo)
    public double getBonificacion() {
        System.out.println("SobreEscribiendo el método :");
        return 200;
    }
}
