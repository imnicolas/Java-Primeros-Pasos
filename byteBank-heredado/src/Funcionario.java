public class Funcionario {

    private String nombre;
    private String documento;
    private double salario;

    public Funcionario (){
        //metodo del mismo tipo de retorno de la Clase que puede o no asignar
        // parametros para asignarlos a nuestras variables de Clase
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonificacion(){
            return this.salario * 0.1;
    }

}
