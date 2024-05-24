import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "                               Universidad San Juan de Dios \n" +
       "Bienvenidos al sistema de gestión de prestamo de equipos electronicos");
       Main ma = new Main();
       ma.menu();
    }

    public void menu(){
       boolean bandera = true;
       while(bandera){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("             Menú Principal \n" +
                                                                    "Escoja la opcion que desee: \n"+
                                                                    " 1. Estudiante de Ingenieria \n"+
                                                                    " 2. Estudiante de Diseño \n" + 
                                                                    " 3. Inventario total de los equipos \n"+
                                                                    " 4. Salir del programa"));
            switch (opcion) {
            case 1:
                Estudiantes ingenieria = new Estudiantes();
                ingenieria.ingenieria();
                break;
            case 2:
                Estudiantes designers = new Estudiantes();
                designers.diseño();
                break;
            case 3:
                String[] opciones = {"Inventario Computadores", "Inventario Tabletas"};
                boolean entrar = true;
                int seleccion = JOptionPane.showOptionDialog(null, 
                "<html><body style='text-align: center; font-family: Arial, sans-serif;'>"
                + "<h2 style='margin-bottom: 10px;'>Seleccione una opción</h2>"
                + "</body></html>", 
                "Menú de Inventario", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                null);
                if (seleccion != 1) {
                    Herramientas atajo_ing = new Herramientas();
                    atajo_ing.portatiles(null, entrar);
                }
                else{
                    Herramientas atajo_dis = new Herramientas();
                    atajo_dis.tabletas(null, entrar);
                }
                break;
            case 4:
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