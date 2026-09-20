public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Carlos", 20, 0);
        Docente docente = new Docente("Pedro", "DOC001");

        Asignatura matematicas = new Asignatura("Matematicas");
        Asignatura programacion = new Asignatura("Programacion");
        Asignatura fisica = new Asignatura("Fisica");
      
        matematicas.colocarNota(4.0);
        programacion.colocarNota(4.5);
        fisica.colocarNota(3.5);
      
        estudiante.mostrarInformacion();
        System.out.println();
      
        docente.mostrarInformacion();
        System.out.println();
      
        matematicas.mostrarAsignatura();
        programacion.mostrarAsignatura();
        fisica.mostrarAsignatura();
        
        System.out.println();
        double promedio = (matematicas.getNota()
                + programacion.getNota()
                + fisica.getNota()) / 3;
       
        System.out.println("Promedio: " + promedio);
       
        System.out.println();
        estudiante.registrar();
        docente.registrar();
    }
}
