package entidades;
// Generated 03/06/2019 12:20:03 PM by Hibernate Tools 4.3.1



/**
 * Mascota generated by hbm2java
 */
public class Mascota  implements java.io.Serializable {


     private int idMascota;
     private String nombreMascota;
     private String nombreCliente;
     private String raza;

    public Mascota() {
    }

    public Mascota(int idMascota, String nombreMascota, String nombreCliente, String raza) {
       this.idMascota = idMascota;
       this.nombreMascota = nombreMascota;
       this.nombreCliente = nombreCliente;
       this.raza = raza;
    }
   
    public int getIdMascota() {
        return this.idMascota;
    }
    
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }
    public String getNombreMascota() {
        return this.nombreMascota;
    }
    
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getNombreCliente() {
        return this.nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getRaza() {
        return this.raza;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }




}


