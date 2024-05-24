public class C_portatil {
    String serial;
    String marca;
    double tamano;
    double precio;
    String sist_operativo;
    String procesador;
    String ocupado;

    public C_portatil(){
    }

    public C_portatil(String serial, String marca, double tamano, double precio, String sist_operativo, String procesador, String ocupado){
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sist_operativo = sist_operativo;
        this.procesador = procesador;
        this.ocupado = ocupado;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getSist_operativo() {
        return sist_operativo;
    }

    public void setSist_operativo(String sist_operativo) {
        this.sist_operativo = sist_operativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
