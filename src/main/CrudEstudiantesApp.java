package main;

import core.model.Estudiante;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CrudEstudiantesApp {
    public final static int ALTA_ESTUDIANTE = 1;
    final static int BAJA_ESTUDIANTE = 2;
    final static int LISTAR_ESTUDIANTE = 3;
    final static int MODIFICAR_NOTA = 4;
    public final static int SALIR_APLICACION = 5;
    public final static int NUM_ESTUDIANTES = 2;
    private static int opcionMenu;
    public static HashMap<Integer, Estudiante> estudiantes;
    public static Iterator<Map.Entry<Integer, Estudiante>> iterador;
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
                            listarEstudiantes();
                        break;
                    case MODIFICAR_NOTA:
                        break;
                }
            }

        }while (!usuarioQuiereSalir);

    }

    private static void listarEstudiantes() {
        listado.Listado.listarEstudiantes();
    }

    private static void darAltaEstudiante() {
        altas.Altas.darAltasEstudiantes();
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