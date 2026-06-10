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
public class Estudiante extends Persona{
    
    // atributos
    @Column
    (nullable = false, unique = true, length = 100)
    private long codigo;
    
    // constructores
    public Estudiante(long codigo, long nuip, String nombre, String apellido) {
        super(nuip, nombre, apellido);
        this.codigo = codigo;
    }
    
    // constructor vacio
    public Estudiante() {
    }
    
    // metodos de acceso
    public long getCodigo() {
        return codigo;
    }
    
    // metodos set
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
    
}
