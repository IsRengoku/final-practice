import java.util.ArrayList;
import javax.swing.JOptionPane;

public class menu_ing {

    public void menu(ArrayList<E_ingenieria> ingenierias, ArrayList<C_portatil> computadores){
        boolean bandera = true;
        while (bandera){
            JOptionPane.showMessageDialog(null, "Menú estudiante ingenieria \n"+
        "  1. Registrar prestamo de equipo \n"+
        "  2. Modificar prestamo de equipo \n"+
        "  3. Devolución de equipo \n"+
        "  4. Buscar equipo \n"+
        "  5. Volver al menú principal");
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar"));
        switch (opc) {
            case 1:
                String sistem = "";
                String proc = "";
                JOptionPane.showMessageDialog(null, "Opciones de portatiles: \n"+
                " 1. Windows 7 \n"+
                " 2. Windows 10 \n"+
                " 3. Windows 11");
                int sistema_operativo = Integer.parseInt(JOptionPane.showInputDialog("Digite el sistema operativo que desea"));
                switch (sistema_operativo) {
                    case 1:
                        sistem = "Windows 7";
                        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite el procesador que desea \n"+
                                                                             "1. AMD Ryzen \n"+
                                                                             "2. Intel® Core™ i5"));
                        if (i == 1) {
                            proc = "AMD Ryzen";
                        }
                        else{
                            proc = "Intel® Core™ i5";
                        }
                        break;
                    case 2:
                        sistem = "Windows 10";
                        int j = Integer.parseInt(JOptionPane.showInputDialog("Digite el procesador que desea \n"+
                                                                             "1. AMD Ryzen \n"+
                                                                             "2. Intel® Core™ i5"));
                        if (j == 1) {
                            proc = "AMD Ryzen";
                        }
                        else{
                            proc = "Intel® Core™ i5";
                        }
                        break;
                    case 3:
                        sistem = "Windows 11";
                        int k = Integer.parseInt(JOptionPane.showInputDialog("Digite el procesador que desea \n"+
                                                                             "1. AMD Ryzen \n"+
                                                                             "2. Intel® Core™ i5"));
                        if (k == 1) {
                            proc = "AMD Ryzen";
                        }
                        else{
                            proc = "Intel® Core™ i5";
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no valida. \n"+ "Intente de nuevo");
                        break;
                }
                String id = JOptionPane.showInputDialog(null, "Digite su cedula para concretar el registro");
                String serial = "";
                for (C_portatil portatil : computadores) {
                    if (portatil.getSist_operativo().equals(sistem) && portatil.getProcesador().equals(proc)) {
                        serial = portatil.getSerial();
                    }
                }  
                for (E_ingenieria estudiante : ingenierias) {
                    if (estudiante.getCedula().equals(id)) {
                        estudiante.setSerial(serial);
                    }
                }  
                for (E_ingenieria i : ingenierias) {
                    JOptionPane.showMessageDialog(null, i.getCedula() +"\n"+
                                                                        i.getNombre()+"\n"+
                                                                        i.getApellido()+"\n"+
                                                                        i.getTelefono()+"\n"+
                                                                        i.getNum_Semestre()+"\n"+
                                                                        i.getPromedio_Acum()+"\n"+
                                                                        i.getSerial());
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                bandera = false;
                Main ma = new Main();
                ma.menu();
                break;  
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. \n"+
                "Por favor, ingrese una opción válida");
                break;
        }
        }
    }
}
