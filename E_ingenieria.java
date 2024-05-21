
public class E_ingenieria {
    String cedula;
    String nombre;
    String apellido;
    String telefono;
    int num_Semestre;
    double promedio_Acum;
    String serial;

    public E_ingenieria(){
    }

    public E_ingenieria(String cedula, String nombre, String apellido, String telefono, int num_Semestre, double promedio_Acum, String serial) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.num_Semestre = num_Semestre;
        this.promedio_Acum = promedio_Acum;
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

    public int getNum_Semestre() {
        return num_Semestre;
    }

    public void setNum_Semestre(int num_Semestre) {
        this.num_Semestre = num_Semestre;
    }

    public double getPromedio_Acum() {
        return promedio_Acum;
    }

    public void setPromedio_Acum(double promedio_Acum) {
        this.promedio_Acum = promedio_Acum;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}

    