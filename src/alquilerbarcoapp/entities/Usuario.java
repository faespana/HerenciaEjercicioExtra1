package alquilerbarcoapp.entities;

import java.util.Date;

public class Usuario {
   
    private String nombre;
    private String documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private String posicionAmarre;
    private Integer tipoBarco;

    public Usuario() {
    }

    public Usuario(String nombre, String documentoCliente, Date fechaAlquiler, Date fechaDevolucion, String posicionAmarre, Integer tipoBarco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.tipoBarco = tipoBarco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(String posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Integer getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(Integer tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", documentoCliente=" + documentoCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", tipoBarco=" + tipoBarco + '}';
    }
    
}
