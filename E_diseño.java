public class E_diseño {
    String cedula;
    String nombre;
    String apellido;
    String telefono;
    String modalidad_estudio;
    int cant_asignaturas;
    String serial;

    public E_diseño(){
    }

    public E_diseño(String cedula, String nombre, String apellido, String telefono, String modalidad_estudio, int cant_asignaturas, String serial){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.modalidad_estudio = modalidad_estudio;
        this.cant_asignaturas = cant_asignaturas;
        this.serial = serial;
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

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
