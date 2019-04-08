package Gestiones;

import java.util.Date;

public class Usuario {
   //Atributos
   private String nombreUsuario;
   private int cedulaUsuario;
   private int telefono;
   private Date fechaNacimientoUsuario;
   private String correoUsuario;
   private String direccionCasaUsuario;
   
   //Constructor//////////////////
    public Usuario(int cedulaUsuario, Date fechaNacimientoUsuario,String nombreUsuario, String direccionCasaUsuario,int telefono, String correoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.correoUsuario = correoUsuario;
        this.direccionCasaUsuario = direccionCasaUsuario;
        this.telefono=telefono;
    }
    //////Metodos//////////
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public int getCedulaUsuario() {
        return cedulaUsuario;
    }
    public void setCedulaUsuario(int cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }
    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }
    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }
    public String getCorreoUsuario() {
        return correoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public String getDireccionCasaUsuario() {
        return direccionCasaUsuario;
    }
    public void setDireccionCasaUsuario(String direccionCasaUsuario) {
        this.direccionCasaUsuario = direccionCasaUsuario;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", cedulaUsuario=" + cedulaUsuario + ", fechaNacimientoUsuario=" + fechaNacimientoUsuario + ", correoUsuario=" + correoUsuario + ", direccionCasaUsuario=" + direccionCasaUsuario + '}';
    }
}
