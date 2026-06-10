/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.entities;

import jakarta.persistence.Column;

/**
 *
 * @author USUARIO
 */
public class Persona {
    
    // atributos
    @Column
    (nullable = false, unique = true, length = 100)
    private long nuip;
    
    @Column
    (nullable = false, unique = false, length = 100)
    private String nombre;
    
    @Column
    (nullable = false, unique = false, length = 100)
    private String apellido;
    
    // constructores
    public Persona(long nuip, String nombre, String apellido) {
        this.nuip = nuip;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // constructor vacio
    public Persona() {
    }
     
    // metodos de acceso
    public long getNuip() {
        return nuip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    // metodos set
    public void setNuip(long nuip) {
        this.nuip = nuip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
