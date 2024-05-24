import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Verificaciones {
    
    public void verificar_ing(ArrayList<E_ingenieria> ingenierias, ArrayList<C_portatil> inventario, String sistem, String proc, String serial) {
        String id = JOptionPane.showInputDialog(null, "Digite su cedula para concretar el registro");
        E_ingenieria estudianteEncontrado = null;
        for (E_ingenieria estudiante : ingenierias) {
            if (estudiante.getCedula().equals(id)) {
                estudianteEncontrado = estudiante;
                break;
            }
        }
    
        if (estudianteEncontrado != null) {
            for (C_portatil portatil : inventario) {
                if (portatil.getSist_operativo().equals(sistem) && portatil.getProcesador().equals(proc)) {
                    serial = portatil.getSerial();
    
                    for (E_ingenieria corroborar : ingenierias) {
                        if (corroborar.getSerial() != serial && estudianteEncontrado.getSerial().equals("")) {
                            estudianteEncontrado.setSerial(serial);
                            portatil.setOcupado("si");
                            JOptionPane.showMessageDialog(null, "Registro realizado con exito.");
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Registro no realizado. \n" +"El equipo puede que esté ocupado o el estudiante ya cuenta con equipo registrado");
                        }
                    }
                    break;
                }
            }
        }
    }

    public void verificar_dis(ArrayList<E_diseño> diseñadores, ArrayList<T_grafica> inventario, String GB, String marca, String serial){
        String id = JOptionPane.showInputDialog(null, "Digite su cedula para concretar el registro");
        E_diseño estudianteEncontrado = null;
        for (E_diseño estudiante : diseñadores) {
            if (estudiante.getCedula().equals(id)) {
                estudianteEncontrado = estudiante;
                break;
            }
        }
    
        if (estudianteEncontrado != null) {
            for (T_grafica tableta : inventario) {
                if (tableta.getAlmacenamiento().equals(GB) && tableta.getMarca().equals(marca)) {
                    serial = tableta.getSerial();
    
                    for (E_diseño corroborar : diseñadores) {
                        if (corroborar.getSerial() != serial && estudianteEncontrado.getSerial().equals("")) {
                            estudianteEncontrado.setSerial(serial);
                            tableta.setOcupado("si");
                            JOptionPane.showMessageDialog(null, "Registro realizado con exito.");
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Registro no realizado. \n" +"El equipo puede que esté ocupado o el estudiante ya cuenta con equipo registrado");
                        }
                    }
                    break;
                }
            }
        }
    }
    
    
}
