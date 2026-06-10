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
public class Libro {
    
    // atributos
    @Column
    (nullable = false, unique = true, length = 100)
    private long isbn;
    
    @Column
    (nullable = false, unique = true, length = 100)
    private String titulo;
    
    @Column
    (nullable = false, unique = true, length = 100)
    private String autor;
    
    // asociaciones
    private Editorial editorial;
    
    // constructores
    public Libro(long isbn, String titulo, String autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    // constructor vacio
    public Libro() {
    }
    
    // metodos de acceso
    public long getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }
    
    // metodos set
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}
