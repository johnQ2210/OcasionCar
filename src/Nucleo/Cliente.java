package Nucleo;

public class Cliente extends Usuario{

    private String nombre;
    private String dni;
    private String relacion_empresa;
    private long telefono;

    public Cliente(String correo, String clave, String nombre, String dni, String relacion_empresa, long telefono) {
        super(correo, clave);
        this.nombre = nombre;
        this.dni = dni;
        this.relacion_empresa = relacion_empresa;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getRelacion_empresa() {
        return relacion_empresa;
    }

    public void setRelacion_empresa(String relacion_empresa) {
        this.relacion_empresa = relacion_empresa;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
