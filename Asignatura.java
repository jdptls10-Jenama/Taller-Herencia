public class Asignatura {

    private String nombre;
    private double nota;
    public Asignatura(String nombre){
        this.nombre=nombre;
    }
    public void colocarNota(double nota){
        this.nota =nota;
    }
    public void mostrarAsignatura(){
        System.out.println(nombre +"- nota: "+nota);
    }

    public double getNota() {
        return nota;
    }
}
