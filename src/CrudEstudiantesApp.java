import core.model.Estudiante;

import java.util.HashMap;

public class CrudEstudiantesApp {
    public final static int ALTA_ESTUDIANTE = 1;
    final static int BAJA_ESTUDIANTE = 2;
    final static int LISTAR_ESTUDIANTE = 3;
    final static int MODIFICAR_NOTA = 4;
    public final static int SALIR_APLICACION = 5;
    final static int NUM_ESTUDIANTES = 2;
    private static int opcionMenu;
    public static HashMap<Integer, Estudiante> estudiantes;

    public static void main(String[] args) {
        estudiantes = new HashMap<>();
        boolean usuarioQuiereSalir=false;
        do {
            boolean respuestaIncorrecta;
            do {
                mostrarMenu();
                opcionMenu = pedirOpcionUsuario();
                respuestaIncorrecta = validarOpcionMenu();
                if (!respuestaIncorrecta){
                    core.output.Output.respuestaIncorrecta();
                }
            }while (!respuestaIncorrecta);

            if (opcionMenu == SALIR_APLICACION ){
                usuarioQuiereSalir = true;
            }else{
                switch (opcionMenu){
                    case ALTA_ESTUDIANTE :
                            darAltaEstudiante();
                        break;
                    case BAJA_ESTUDIANTE:
                        break;
                    case LISTAR_ESTUDIANTE:
                        break;
                    case MODIFICAR_NOTA:
                        break;
                }
            }

        }while (!usuarioQuiereSalir);

    }

    private static void darAltaEstudiante() {
        for(int i = 0; i < NUM_ESTUDIANTES; i++ ){
            core.output.Output.ingreseNombreCompleto();
            String nombreCompleto = core.input.Input.recibirNombreCompleto();
            core.output.Output.ingreseEdad();
            int edad = core.input.Input.recibirEdad();
            core.output.Output.ingreseFechaNacimiento();
            String fechaNacimiento = core.input.Input.recibirFechaNacimiento();
            core.output.Output.ingreseAsignatura();
            String asignatura1 = core.input.Input.recibirAsignatura();
            core.output.Output.ingreseNota();
            int nota1 = core.input.Input.recibirNota();
            core.output.Output.ingreseAsignatura();
            String asignatura2 = core.input.Input.recibirAsignatura();
            core.output.Output.ingreseNota();
            int nota2 = core.input.Input.recibirNota();

            estudiantes.put(i+1, new Estudiante(nombreCompleto,edad,fechaNacimiento,asignatura1,nota1,asignatura2,nota2));

        }
        core.output.Output.darAltaCorrectamente();
    }

    private static boolean validarOpcionMenu() {
       return core.validador.Validador.validarOpcionMenu(opcionMenu);
    }

    private static int pedirOpcionUsuario() {
        core.output.Output.pedirOpcionUsuario();
        return core.input.Input.recibirParametroMenu();
    }

    private static void mostrarMenu(){
        core.output.Output.mostrarMenu();
    }
}