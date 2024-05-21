import javax.swing.JOptionPane;

public class E_diseño {
    String cedula;
    String nombre;
    String apellido;
    String telefono;
    String modalidad_estudio;
    int cant_asignaturas;
    int serial;

    public E_diseño(){
    }

    public E_diseño(String cedula, String nombre, String apellido, String telefono, String modalidad_estudio, int cant_asignaturas, int serial){
        String Cedula = cedula;
        String Nombre = nombre;
        String Apellido = apellido;
        String Telefono = telefono;
        String Modalidad_estudio = modalidad_estudio;
        int Cant_asignaturas = cant_asignaturas;
        int Serial = serial;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getModalidad_estudio() {
        return modalidad_estudio;
    }

    public void setModalidad_estudio(String modalidad_estudio) {
        this.modalidad_estudio = modalidad_estudio;
    }

    public int getCant_asignaturas() {
        return cant_asignaturas;
    }

    public void setCant_asignaturas(int cant_asignaturas) {
        this.cant_asignaturas = cant_asignaturas;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void menu_dis(){
        JOptionPane.showMessageDialog(null, "Menú estudiante diseño \n"+
        "  1. Registrar prestamo de equipo \n"+
        "  2. Modificar prestamo de equipo \n"+
        "  3. Devolución de equipo \n"+
        "  4. Buscar equipo \n"+
        "  5. Volver al menú principal");
        boolean bandera = true;
        while (bandera){
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea realizar"));
            switch (opc) {
                case 1:
                
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
