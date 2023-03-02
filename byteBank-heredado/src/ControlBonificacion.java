public class ControlBonificacion {

    private double suma;

    public double registrarSalario(Funcionario funcionario){ // Ahora resolvemos un solo metodo para todos los que extienden de Funcionario
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual : "+this.suma);
        return this.suma;
    }
    /*public double registrarSalario(Gerente gerente){ // Sobrecarga de metodo
        this.suma = gerente.getBonificacion() + this.suma;
        System.out.println("Calculo actual : "+this.suma);
        return this.suma;
    }
    public double registrarSalario(Contador contador){ // Sobrecarga de metodo
        this.suma = contador.getBonificacion() + this.suma;
        System.out.println("Calculo actual : "+this.suma);
        return this.suma;
    }*/

}
