package com.valentina.pruebasemana2;

public class Contacto {
    private String nombre;
    private String fechanacimiento;
    private String telefono;
    private String email;
    private String descripcion;

    public Contacto(String nombre, String fechanacimiento, String telefono, String email, String descripcion){
        this.nombre             = nombre;
        this.fechanacimiento    = fechanacimiento;
        this.telefono           = telefono;
        this.email              = email;
        this.descripcion        = descripcion;
    }

    public Contacto() {

    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechanacimiento() { return fechanacimiento; }

    public void setFechanacimiento(String fechanacimiento) { this.fechanacimiento = fechanacimiento; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
