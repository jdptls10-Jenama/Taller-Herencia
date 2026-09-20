public class Nota {

    private double valor;

    public Nota(double valor){
        this.valor=valor;
    }
    public void mostrarNota(){
        System.out.println("Nota: "+valor);
    }

    public double getValor() {
        return valor;
    }
}
