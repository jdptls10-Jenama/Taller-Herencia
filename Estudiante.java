public class Estudiante extends Persona implements Regristo {

    private int edad;
    private double nota;


    public Estudiante(String nombre) {
        super(nombre);
        this.edad=edad;
        this.nota=nota;
    }
    @Override
    public void mostarInformacion() {

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad "+edad);
        System.out.println("Nota: "+nota);

    }
    @Override
    public void registrar() {

        System.out.println("Estudiante registrado");
    }
    public void mostrarNota(){

        System.out.println("La nota es; "+nota);
    }
}