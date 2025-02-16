package modificar;

import core.model.Estudiante;
import main.CrudEstudiantesApp;

import java.util.Map;

public class Modificar {

    public static void modificarNotaEstudiante() {
        CrudEstudiantesApp.iterador = CrudEstudiantesApp.estudiantes.entrySet().iterator();

        core.output.Output.eligirIdEstudiante();
        int idEstudiante = core.input.Input.recibirIdEstudiante();
        while(CrudEstudiantesApp.iterador.hasNext()){
            Map.Entry<Integer, Estudiante> entrada = CrudEstudiantesApp.iterador.next();
            Integer id = entrada.getKey();
            if(idEstudiante == id){
                core.output.Output.ingresarNuevaNota();
                int nuevaNota = core.input.Input.recibirNuevaNota();
                Estudiante estudiante = entrada.getValue();
                estudiante.setNota1(nuevaNota);
            }
        }
    }
}
