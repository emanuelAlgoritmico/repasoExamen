/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Prestamo {
    
    //asociaciones
    private Libro libro;
    private List<Estudiante> estudiante = new ArrayList<>();
     
    private LocalDateTime fechaRealizacion;
    private LocalDateTime fechaDevolucion;
    
    // constructores
    public Prestamo(Libro libro, LocalDateTime fechaRealizacion, LocalDateTime fechaDevolucion) {
        this.libro = libro;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaDevolucion = fechaDevolucion;
    }
    
    // constructor vacio
    public Prestamo() {
    }
    
    // metodos de acceso
    public Libro getLibro() {
        return libro;
    }

    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    public LocalDateTime getFechaRealizacion() {
        return fechaRealizacion;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    // metodos set
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    public void setFechaRealizacion(LocalDateTime fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
}
