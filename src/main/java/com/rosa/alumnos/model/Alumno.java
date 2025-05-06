package com.rosa.alumnos.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    
    private String NumeroControl;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private  String carrera;
    private String ImagenURL;

   
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNumeroControl() {
        return NumeroControl;
    }
    public void setNumeroControl(String numeroControl) {
        NumeroControl = numeroControl;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getImagenURL() {
        return ImagenURL;
    }
    public void setImagenURL(String imagenURL) {
        ImagenURL = imagenURL;
    }
   


    

}
