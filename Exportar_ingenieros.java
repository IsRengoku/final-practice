import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Exportar_ingenieros {
    
    public void exportar(ArrayList<E_ingenieria> ingenierios){

        try {
            FileWriter file = new FileWriter("Estudiante ingenieria.txt", true);
            PrintWriter print = new PrintWriter(file);
            
            print.print("Estudiantes registrados hasta el momento.");
            print.println();
            for (E_ingenieria estudiante : ingenierios) {
                print.print("Cedula: " + estudiante.getCedula() +"\n"+
                            "Nombre y Apellido: " + estudiante.getNombre()+" "+estudiante.getApellido()+"\n"+
                            "Telefono: " + estudiante.getTelefono() +"\n"+
                            "Semestre actual: " + estudiante.getNum_Semestre() +"\n"+
                            "Promedio Acumulado: " + estudiante.getPromedio_Acum());
                print.println();
            }
            
            print.close();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
