import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Estudiantes {
    
    public void ingenieria(){
        ArrayList<E_ingenieria> ingenieria = new ArrayList<>();
        String serial = "";
        Pattern patternAlphaNum = Pattern.compile("^[a-zA-Z0-9]+$");
        String regexNums = "^[+-]?\\d+(\\.\\d+)?|\\*$";
        Pattern patternNums = Pattern.compile(regexNums);

        if (!ingenieria.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista ya contiene estudiantes.");
            return;
        }

        boolean bandera = true;

        while (bandera) {
            String cedula = JOptionPane.showInputDialog("Digite la cedula del estudiante a ingresar:");
            Matcher matcherCedula = patternAlphaNum.matcher(cedula);

            String nombre = JOptionPane.showInputDialog("Digite el nombre del estudiante a ingresar:");
            Matcher matcherNombre = patternAlphaNum.matcher(nombre);

            String apellido = JOptionPane.showInputDialog("Digite el apellido del estudiante a ingresar:");
            Matcher matcherApellido = patternAlphaNum.matcher(apellido);

            String telefono = JOptionPane.showInputDialog("Digite el telefono del estudiante a ingresar:");
            Matcher matcherTelefono = patternAlphaNum.matcher(telefono);

            String num_Semestre = JOptionPane.showInputDialog("Digite el semestre del estudiante a ingresar:");
            Matcher matcherSemestre = patternAlphaNum.matcher(num_Semestre);
            int semestre = Integer.parseInt(num_Semestre);

            String promedio_Acum = JOptionPane.showInputDialog("Digite el promedio acumulado del estudiante a ingresar:");
            Matcher matcherPromedio = patternNums.matcher(promedio_Acum);
            double promedio = Double.parseDouble(promedio_Acum);

            if (matcherCedula.matches() && matcherNombre.matches() && matcherApellido.matches() &&
                matcherTelefono.matches() && matcherSemestre.matches() && matcherPromedio.matches()) {

                E_ingenieria estudiante = new E_ingenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);
                ingenieria.add(estudiante);
                JOptionPane.showMessageDialog(null, "Estudiante guardado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no válidos. \nNo se permiten caracteres especiales.");
            }

            int opc = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro estudiante?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.NO_OPTION) {
                bandera = false;
            }
        }

        Herramientas obj = new Herramientas();
        obj.portatiles(ingenieria, false);
    }

    public void diseño(){
        ArrayList<E_diseño> diseñadores = new ArrayList<>();
        String serial = "";
        Pattern patternAlphaNum = Pattern.compile("^[a-zA-Z0-9]+$");

        if (!diseñadores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista ya contiene estudiantes.");
            return;
        }

        boolean bandera = true;

        while (bandera) {
            String cedula = JOptionPane.showInputDialog("Digite la cedula");
            Matcher matcherCedula = patternAlphaNum.matcher(cedula);

            String nombre = JOptionPane.showInputDialog("Digite el nombre");
            Matcher matcherNombre = patternAlphaNum.matcher(nombre);

            String apellido = JOptionPane.showInputDialog("Digite el apellido");
            Matcher matcherApellido = patternAlphaNum.matcher(apellido);

            String telefono = JOptionPane.showInputDialog("Digite el telefono");
            Matcher matcherTelefono = patternAlphaNum.matcher(telefono);

            String modalidad_estudio = JOptionPane.showInputDialog("Digite la modalidad de estudio");
            Matcher matcherModalidad = patternAlphaNum.matcher(modalidad_estudio);

            String cant_asignaturas = JOptionPane.showInputDialog("Digite la cantidad de asignaturas");
            Matcher matcherAsignaturas = patternAlphaNum.matcher(cant_asignaturas);
            int asignaturas = Integer.parseInt(cant_asignaturas);

            if (matcherCedula.matches() && matcherNombre.matches() && matcherApellido.matches() &&
                matcherTelefono.matches() && matcherModalidad.matches() && matcherAsignaturas.matches()) {

                E_diseño estudiante = new E_diseño(cedula, nombre, apellido, telefono, modalidad_estudio, asignaturas, serial);
                diseñadores.add(estudiante);
                JOptionPane.showMessageDialog(null, "Estudiante guardado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Datos no válidos. \nNo se permiten caracteres especiales.");
            }

            int opc = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro estudiante?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opc == JOptionPane.NO_OPTION) {
                bandera = false;
            }
        }

        Herramientas obj = new Herramientas();
        obj.tabletas(diseñadores, false);
    }
}
