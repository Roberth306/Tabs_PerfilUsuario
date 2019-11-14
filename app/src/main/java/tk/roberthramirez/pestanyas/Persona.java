package tk.roberthramirez.pestanyas;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellidos;
    private String fechaNac;
    private String direccionPers;
    private String DNI;
    private String empresa;
    private String cif;
    private String direccionEmpr;
    private String paginaWeb;
    private String email;

    private String contrasena;

    public Persona(String nombre, String apellidos, String fechaNac, String direccionPers, String DNI, String empresa, String cif, String direccionEmpr, String paginaWeb, String email, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.direccionPers = direccionPers;
        this.DNI = DNI;
        this.empresa = empresa;
        this.cif = cif;
        this.direccionEmpr = direccionEmpr;
        this.paginaWeb = paginaWeb;
        this.email = email;
        this.contrasena = contrasena;
    }

    public String cambiarContraseña(String contraVieja, String contraNueva1, String contraNueva2) {
        if(!contraVieja.equals(this.contrasena)){
            return "La contraseña actual no es correcta";
        }else if(!contraNueva1.equals(contraNueva2)) {
            return "Las contraseñas no coninciden";
        }else {
            this.contrasena = contraNueva1;
            return "Contraseña Cambiada Exitosamente";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getDireccionPers() {
        return direccionPers;
    }

    public String getDNI() {
        return DNI;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getCif() {
        return cif;
    }

    public String getDireccionEmpr() {
        return direccionEmpr;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public String getEmail() {
        return email;
    }
}
