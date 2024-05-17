import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "                                Universidad San Juan de Dios \n" +
       "Bienvenidos al sistema de gestión de prestamo de equipos electronicos");
       
       JOptionPane.showMessageDialog(null, "                                Menú Principal \n" +
                                                          "Escoja la opcion que desee: \n"+
                                                          " 1. Estudiante de Ingenieria \n"+
                                                          " 2. Estudiante de Diseño \n" +
                                                          " 3. Imprimir inventario de Tabletas Gráficas \n" +
                                                          " 4. Imprimir inventario de Computadores portatiles \n"+
                                                          " 5. Salir del programa");
       boolean bandera = true;
       while(bandera){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion deseada "));
            switch (opcion) {
            case 1:
            
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "¡¡Hasta luego, apreciado estudiante!!");
                bandera = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no valida. \n"+
                                                                    "Por favor, ingrese una opción válida");
                break;
            }
        }
    }
}