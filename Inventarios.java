import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Inventarios {
    
    public void inventario_ing(ArrayList<C_portatil> computadores){
        boolean bandera = true;
        while(bandera){
            String[] opciones = {"Inventario de computadores totales", "Inventario de computadores ocupados", "Volver al menú principal"};
            int seleccion = JOptionPane.showOptionDialog(null, 
                "<html><body style='text-align: center; font-family: Arial, sans-serif;'>"
                + "<h2 style='margin-bottom: 10px;'>         Seleccione una opción</h2>"
                + "</body></html>", 
                "Menú de Inventario de Computadoras", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                null);

            switch (seleccion) {
                case 0:
                    if (computadores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay computadores en el inventario.");
                    } else {
                        StringBuilder inventarioTotal = new StringBuilder();
                        int i = 1;
                        inventarioTotal.append("<html><body style='font-family: Arial, sans-serif;'>");
                        inventarioTotal.append("<h2>Computadores disponibles</h2>");
                        for (C_portatil portatil : computadores) {
                            inventarioTotal.append("Computador ").append(i).append(": ")
                                           .append("Serial: ").append(portatil.getSerial()).append(", ")
                                           .append("Marca: ").append(portatil.getMarca()).append(", ")
                                           .append("Tamaño: ").append(portatil.getTamano()).append(", ")
                                           .append("Precio: ").append(portatil.getPrecio()).append(", ")
                                           .append("Sistema Operativo: ").append(portatil.getSist_operativo()).append(", ")
                                           .append("Procesador: ").append(portatil.getProcesador()).append("<br>");
                                           System.out.println();
                            i++;
                        }
                        inventarioTotal.append("</body></html>");
                        JOptionPane.showMessageDialog(null, inventarioTotal.toString());
                        }
                    break;
                case 1:
                    if (computadores.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay computadores en el inventario.");
                    } else {
                        StringBuilder inventarioTotal = new StringBuilder();
                        inventarioTotal.append("<html><body style='font-family: Arial, sans-serif;'>");
                        inventarioTotal.append("<h2>Computadores ocupados</h2>");
                        for (C_portatil portatil : computadores) {
                            if(portatil.getOcupado().equals("si")){
                                inventarioTotal.append("Computador ").append(": ")
                                    .append("Serial: ").append(portatil.getSerial()).append(", ")
                                    .append("Marca: ").append(portatil.getMarca()).append(", ")
                                    .append("Tamaño: ").append(portatil.getTamano()).append(", ")
                                    .append("Precio: ").append(portatil.getPrecio()).append(", ")
                                    .append("Sistema Operativo: ").append(portatil.getSist_operativo()).append(", ")
                                    .append("Procesador: ").append(portatil.getProcesador()).append("<br>");
                                    System.out.println();
                            }
                        }   
                        inventarioTotal.append("</body></html>");
                        JOptionPane.showMessageDialog(null, inventarioTotal.toString());
                    }
                    break;
                case 2:
                    bandera = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida.");
                    break;
            }
        }  
    }    

    public void inventario_dis(ArrayList<T_grafica> tablets){
        boolean bandera = true;
        while(bandera){
            String[] opciones = {"Inventario de tabletas totales", "Inventario de tabletas ocupados", "Volver al menú principal"};
            int seleccion = JOptionPane.showOptionDialog(null, 
                "<html><body style='text-align: center; font-family: Arial, sans-serif;'>"
                + "<h2 style='margin-bottom: 10px;'>         Seleccione una opción</h2>"
                + "</body></html>", 
                "Menú de Inventario de tabletas", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                null);

            switch (seleccion) {
                case 0:
                    if (tablets.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay tabletas en el inventario.");
                    } else {
                        StringBuilder inventarioTotal = new StringBuilder();
                        int i = 1;
                        inventarioTotal.append("<html><body style='font-family: Arial, sans-serif;'>");
                        inventarioTotal.append("<h2>Inventario de tabletas</h2>");
                        for (T_grafica portatil : tablets) {
                            inventarioTotal.append("Tableta ").append(i).append(": ")
                                           .append("Serial: ").append(portatil.getSerial()).append(", ")
                                           .append("Marca: ").append(portatil.getMarca()).append(", ")
                                           .append("Tamaño: ").append(portatil.getTamano()).append(", ")
                                           .append("Precio: ").append(portatil.getPrecio()).append(", ")
                                           .append("Almacenamiento: ").append(portatil.getAlmacenamiento()).append(", ")
                                           .append("Peso: ").append(portatil.getPeso()).append("<br>");
                                           System.out.println();
                            i++;
                        }
                        inventarioTotal.append("</body></html>");
                        JOptionPane.showMessageDialog(null, inventarioTotal.toString());
                        }
                    break;
                case 1:
                if (tablets.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay tabletas en el inventario.");
                } else {
                    StringBuilder inventarioTotal = new StringBuilder();
                    inventarioTotal.append("<html><body style='font-family: Arial, sans-serif;'>");
                    inventarioTotal.append("<h2>Tabletas ocupados</h2>");
                    for (T_grafica portatil : tablets) {
                        if(portatil.getOcupado().equals("si")){
                            inventarioTotal.append("Tableta ").append(": ")
                                .append("Serial: ").append(portatil.getSerial()).append(", ")
                                .append("Marca: ").append(portatil.getMarca()).append(", ")
                                .append("Tamaño: ").append(portatil.getTamano()).append(", ")
                                .append("Precio: ").append(portatil.getPrecio()).append(", ")
                                .append("Almacenamiento: ").append(portatil.getAlmacenamiento()).append(", ")
                                .append("Peso: ").append(portatil.getPeso()).append("<br>");
                                System.out.println();
                        }
                    }   
                    inventarioTotal.append("</body></html>");
                    JOptionPane.showMessageDialog(null, inventarioTotal.toString());
                }
                    break;
                case 2:
                    bandera = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida.");
                    break;
            }
        }
    }
}

