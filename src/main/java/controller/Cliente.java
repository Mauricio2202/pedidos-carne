
package controller;

public class Cliente {
    
    private String nombre;
    private String telefono;
    private String direccion;
    private String nota;
    
    public Cliente(String nombre, String telefono, String direccion, String nota) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
}
