public class Docente {
  public class Docente extends Persona implements Registrable {
    private String codigo;
    public Docente(String nombre, String codigo) {
        super(nombre);
        this.codigo = codigo;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Docente: " + nombre);
        System.out.println("Codigo: " + codigo);
    }
    @Override
    public void registrar() {
        System.out.println("Docente registrado");
    }
    public void registrarNota(Estudiante estudiante, double nota) {
        System.out.println("Nota de " + estudiante.getNombre() + ": " + nota);
    }
}
