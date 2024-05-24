import java.util.ArrayList;
import javax.swing.JOptionPane;

public class menu_dis {
    
    public void menu(ArrayList<E_diseño> diseñadores, ArrayList<T_grafica> tabletas){
        ArrayList<T_grafica> inventario = new ArrayList<>();
        inventario = tabletas;
        boolean bandera = true;
        while (bandera){
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Menú estudiante diseño \n"+
        "  1. Registrar prestamo de equipo \n"+
        "  2. Devolución de equipo \n"+
        "  3. Buscar equipo \n"+
        "  4. Estudiantes dentro del sistema \n"+
        "  5. Volver al menú principal"));
        switch (opc) {
            case 1:
                String GB = "";
                String marca = "";
                String serial = "";
                int almacenamiento = Integer.parseInt(JOptionPane.showInputDialog("Digite el almacenamiento que desea: \n"+
                                                                                     " 1. 256 GB \n"+
                                                                                     " 2. 512 GB \n"+
                                                                                     " 3. 1 TB"));
                switch (almacenamiento) {
                    case 1:
                        GB = "256 GB";
                        int i = Integer.parseInt(JOptionPane.showInputDialog("Marcas disponibles con ese almacenamiento: \n"+
                                                                             "1. Huion \n"+
                                                                             "2. XP-Pen"));
                        switch (i) {
                            case 1:
                                marca = "Huion";
                                break;
                            case 2:
                                marca = "XP-Pen";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                                break;
                        }
                        break;
                    case 2:
                        GB = "512 GB";
                        int j = Integer.parseInt(JOptionPane.showInputDialog("Marcas disponibles con ese almacenamiento \n"+
                                                                             "1. Wacom \n"+
                                                                             "2. Ugee"));
                        switch (j) {
                            case 1:
                                marca = "Wacom";
                                break;
                            case 2:
                                marca = "Ugee";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida");
                                break;
                        }
                        break;
                    case 3:
                        GB = "1 TB";
                        int k = Integer.parseInt(JOptionPane.showInputDialog("Marcas disponibles con ese almacenamiento \n"+
                                                                             "1. Gaomon \n"+
                                                                             "2. Wacom"));
                        switch (k) {
                            case 1:
                                marca = "Gaomon";
                                break;
                            case 2:
                                marca = "Wacom";
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
                ver.verificar_dis(diseñadores, inventario, GB, marca, serial);
                break;
            case 2:
                String ced = JOptionPane.showInputDialog(null, "Digite su cedula para eliminar registro");
                E_diseño estudianteEncontrado = null;
                for (E_diseño estudiante : diseñadores) {
                    if (estudiante.getCedula().equals(ced)) {
                        estudianteEncontrado = estudiante;
                        break;
                    }
                }
                if(estudianteEncontrado != null){
                    if (estudianteEncontrado.getSerial().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No tiene asignado un computador hasta el momento.");
                        break;
                    }
                    else{
                        for (T_grafica tablas : tabletas) {

                            if(estudianteEncontrado.getSerial().equals(tablas.getSerial())){
                                estudianteEncontrado.setSerial("");
                                tablas.setOcupado("no");
                                JOptionPane.showMessageDialog(null, "Registro eliminado con exito.");
                                return;
                            }
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontro el registro con esa cedula.");
                }
                break;
            case 3:
                boolean ocupado = false;
                for (T_grafica imprimir : inventario) {
                    JOptionPane.showMessageDialog(null,"Serial: " + imprimir.getSerial()+"\n"
                                                                    + "Marca: " + imprimir.getMarca()+"\n"
                                                                    + "Tamaño: " + imprimir.getTamano()+"\n"
                                                                    + "Precio: " + imprimir.getPrecio()+"\n"
                                                                    + "Almacenamiento: " + imprimir.getAlmacenamiento()+"\n"
                                                                    + "Peso: " + imprimir.getPeso());
                }
                String bus_serial = JOptionPane.showInputDialog("Digite el codigo serial del equipo a buscar:");
                for (T_grafica equipo : inventario) {
                    if (equipo.getSerial().equalsIgnoreCase(bus_serial) && equipo.getOcupado() == "no") {
                       ocupado = true;
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
                Exportar_diseñadores dis = new Exportar_diseñadores();
                dis.exportar(diseñadores);
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
