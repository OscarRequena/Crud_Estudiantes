package listado;

import core.model.Estudiante;
import main.CrudEstudiantesApp;

import java.util.Map;

public class Listado {
    public static void listarEstudiantes(){
        CrudEstudiantesApp.iterador = CrudEstudiantesApp.estudiantes.entrySet().iterator();

        if(!CrudEstudiantesApp.iterador.hasNext()){
            core.output.Output.noHayEstudiantes();
        }

        core.output.Output.cabeceraTabla();
        while(CrudEstudiantesApp.iterador.hasNext()){
            Map.Entry<Integer, Estudiante> entrada = CrudEstudiantesApp.iterador.next();
            Integer id = entrada.getKey();
            Estudiante estudiante = entrada.getValue();
            core.output.Output.cuerpoTabla(id,estudiante.getNombreCompleto(),estudiante.getAsignatura1(),estudiante.getNota1(),estudiante.getAsignatura2(),estudiante.getNota2());
        }
        core.output.Output.finalTabla();

    }
}
