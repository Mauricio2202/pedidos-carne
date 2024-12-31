package controller;

public class Cliente {
    
    private String nombre;
    private String telefono;
    private String correo;
    private String nota;
    
    public Cliente(String nombre, String telefono, String correo, String nota) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.nota = nota;
    }
    
    public Cliente() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
