package co.edu.unquindio.solid.model;

public class Usuario{
    private String nombre;
    private String ID;
    private String email;
    private String Celular;
    private String direccion;

    public Usuario() {
    }

    public Usuario(String nombre, String ID, String email, String celular, String direccion) {
        this.nombre = nombre;
        this.ID = ID;
        this.email = email;
        this.Celular = celular;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) {
        Celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
