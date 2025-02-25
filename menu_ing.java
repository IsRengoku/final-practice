import java.util.ArrayList;
import javax.swing.JOptionPane;

public class menu_ing {

    ArrayList<C_portatil> inventario = new ArrayList<>();

    public void menu(ArrayList<E_ingenieria> ingenierias, ArrayList<C_portatil> computadores){
        inventario = computadores;
        boolean bandera = true;
        while (bandera){
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Menú estudiante ingenieria \n"+
        "  1. Registrar prestamo de equipo \n"+
        "  2. Devolución de equipo \n"+
        "  3. Buscar equipo \n"+
        "  4. Estudiantes dentro del sistema \n"+
        "  5. Volver al menú principal \n"));
        switch (opc) {
            case 1:
                String sistem = "";
                String proc = "";
                String serial = "";
                int sistema_operativo = Integer.parseInt(JOptionPane.showInputDialog("Digite el sistema operativo que desea: \n"+
                                                                                     " 1. Windows 7 \n"+
                                                                                     " 2. Windows 10 \n"+
                                                                                     " 3. Windows 11"));
                switch (sistema_operativo) {
                    case 1:
                        sistem = "Windows 7";
                        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite el procesador que desea: \n"+
                                                                             "1. AMD Ryzen \n"+
                                                                             "2. Intel® Core™ i5"));
                        switch (i) {
                            case 1:
                                proc = "AMD Ryzen";
                                break;
                            case 2:
                                proc = "Intel® Core™ i5";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                                break;
                        }
                        break;
                    case 2:
                        sistem = "Windows 10";
                        int j = Integer.parseInt(JOptionPane.showInputDialog("Digite el procesador que desea \n"+
                                                                             "1. AMD Ryzen \n"+
                                                                             "2. Intel® Core™ i5"));
                        switch (j) {
                            case 1:
                                proc = "AMD Ryzen";
                                break;
                            case 2:
                                proc = "Intel® Core™ i5";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                                break;
                        }
                        break;
                    case 3:
                        sistem = "Windows 11";
                        int k = Integer.parseInt(JOptionPane.showInputDialog("Digite el procesador que desea \n"+
                                                                             "1. AMD Ryzen \n"+
                                                                             "2. Intel® Core™ i5"));
                        switch (k) {
                            case 1:
                                proc = "AMD Ryzen";
                                break;
                            case 2:
                                proc = "Intel® Core™ i5";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                                break;
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no valida. \n"+ "Intente de nuevo");
                        break;
                }
                Verificaciones ver = new Verificaciones();
                ver.verificar_ing(ingenierias, inventario, sistem, proc, serial);
                break;
            case 2:
                String ced = JOptionPane.showInputDialog(null, "Digite su cedula para eliminar registro");
                E_ingenieria estudianteEncontrado = null;
                for (E_ingenieria estudiante : ingenierias) {
                    if (estudiante.getCedula().equals(ced)) {
                        estudianteEncontrado = estudiante;
                        break;
                    }
                }
                if (estudianteEncontrado.getSerial().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No tiene asignado un computador hasta el momento.");
                    break;
                }
                else{
                    for (C_portatil portatil : computadores) {
                        
                        if(estudianteEncontrado.getSerial().equals(portatil.getSerial())){
                            estudianteEncontrado.setSerial("");
                            portatil.setOcupado("no");
                            JOptionPane.showMessageDialog(null, "Registro eliminado con exito.");
                            return;
                        }
                    }
                }
                break;
            case 3:
                boolean ocupado = false;
                for (C_portatil imprimir : computadores) {
                    JOptionPane.showMessageDialog(null,"Serial: " + imprimir.getSerial()+"\n"
                                                                    + "Marca: " + imprimir.getMarca()+"\n"
                                                                    + "Tamaño: " + imprimir.getTamano()+"\n"
                                                                    + "Precio: " + imprimir.getPrecio()+"\n"
                                                                    + "Almacenamiento: " + imprimir.getSist_operativo()+"\n"
                                                                    + "Peso: " + imprimir.getProcesador());
                }
                String bus_serial = JOptionPane.showInputDialog("Digite el codigo serial del equipo a buscar:");
                for (C_portatil equipo : inventario) {
                    if (equipo.getSerial().equalsIgnoreCase(bus_serial) && equipo.getOcupado() == "no") {
                       ocupado = true;
                       break;
                    }
                }
                if (ocupado) {
                    JOptionPane.showMessageDialog(null, "El equipo se encuentra disponible");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El equipo se encuentra ocupado");
                }
                break;
            case 4:
                Exportar_ingenieros ing = new Exportar_ingenieros();
                ing.exportar(ingenierias);
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
