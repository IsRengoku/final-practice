import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exportar_diseñadores {
    
    public void exportar(ArrayList<E_diseño> designers){

        try {
            FileWriter file = new FileWriter("Estudiante ingenieria.txt", true);
            PrintWriter print = new PrintWriter(file);
            
            print.print("Estudiantes registrados hasta el momento.");
            print.println();
            for (E_diseño estudiante : designers) {
                print.print("Cedula: " + estudiante.getCedula() +"\n"+
                            "Nombre y Apellido: " + estudiante.getNombre()+" "+estudiante.getApellido()+"\n"+
                            "Telefono: " + estudiante.getTelefono() +"\n"+
                            "Modalidad de Estudio: " + estudiante.getModalidad_estudio() +"\n"+
                            "Cantidad de asignaturas: " + estudiante.getCant_asignaturas());
                print.println();
            }
            
            print.close();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
