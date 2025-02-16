package core.model;

public class Estudiante {
    private String NombreCompleto;
    private String Asignatura1;
    private int edad;
    private String fecha_nacimiento;
    protected int Nota1;
    private String Asignatura2;
    protected int Nota2;

    public Estudiante(String nombreCompleto, int edad, String fecha_nacimiento, String asignatura1, int nota1, String asignatura2, int nota2) {
        NombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        Asignatura1 = asignatura1;
        Nota1 = nota1;
        Asignatura2 = asignatura2;
        Nota2 = nota2;
    }

    public void setNota1(int nota1) {
        Nota1 = nota1;
    }

    public void setNota2(int nota2) {
        Nota2 = nota2;
    }
}
