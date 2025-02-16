package bajas;

import core.model.Estudiante;
import main.CrudEstudiantesApp;

import java.util.Map;

public class Bajas {

    public static void darBajaEstudiante(){
        CrudEstudiantesApp.iterador = CrudEstudiantesApp.estudiantes.entrySet().iterator();

        core.output.Output.eligirIdEstudiante();
        int idEstudiante = core.input.Input.recibirIdEstudiante();
        while(CrudEstudiantesApp.iterador.hasNext()){
            Map.Entry<Integer, Estudiante> entrada = CrudEstudiantesApp.iterador.next();
            Integer id = entrada.getKey();
            if(idEstudiante == id){
                CrudEstudiantesApp.iterador.remove();
            }
        }
    }
}
