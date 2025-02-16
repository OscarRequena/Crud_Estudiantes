package altas;

import core.model.Estudiante;
import main.CrudEstudiantesApp;


public class Altas {

    public static void darAltasEstudiantes(){

        for(int i = 0; i < CrudEstudiantesApp.NUM_ESTUDIANTES; i++ ){
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

            CrudEstudiantesApp.estudiantes.put(i+1, new Estudiante(nombreCompleto,edad,fechaNacimiento,asignatura1,nota1,asignatura2,nota2));

        }
        core.output.Output.darAltaCorrectamente();
    }
}
