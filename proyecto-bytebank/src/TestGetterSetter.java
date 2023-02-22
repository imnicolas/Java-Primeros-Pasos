public class TestGetterSetter {


    private int numero ;
    private double comas ;
    private String nombre ;



    // Getter & Setter


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getComas() {
        return comas;
    }

    public void setComas(double comas) {
        this.comas = comas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


        // Metodos



        public void agregarMarco(String valor){
            this.nombre = valor + this.nombre + valor;
        }

}
