package core.output;

public class Output {
    public static void mostrarMenu(){
        System.out.println("""
                Bienvenido al CRUD de usuarios
                
                1. Alta del Usuario
                2. Baja del Usuario
                3. Listar Usuarios
                4. Modificar Nota
                5. Salir
                
                """);
    }
    public static void pedirOpcionUsuario(){
        System.out.println("Ingrese la opción del Menú: ");
    }
    public static void respuestaIncorrecta(){
        System.err.println("Ingrese una opción valida");
    }

    public static void ingreseNombreCompleto(){
        System.out.println("Ingrese el nombre completo del estudiante: ");
    }
    public static void ingreseEdad(){
        System.out.println("Ingrese la edad del estudiante: ");
    }
    public static void ingreseFechaNacimiento(){
        System.out.println("Ingrese la fecha de nacimiento del estudiante: ");
    }
    public static void ingreseAsignatura(){
        System.out.println("Ingrese la asignatura del estudiante: ");
    }
    public static void ingreseNota(){
        System.out.println("Ingrese la nota de la asignatura del estudiante: ");
    }

    public static void darAltaCorrectamente(){
        System.out.println("Se han dado de alta correctamente !!");
    }
}
