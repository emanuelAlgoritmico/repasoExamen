/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.entities;

import co.edu.uvpalmira.fpoe.persistence.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

/**
 *
 * @author Univalle
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "Editorial.buscarPorNit",
    query = "SELECT e FROM Editorial AS e WHERE e.nit = :nit")
})

public class Editorial extends AbstractEntity {

    // atributos
    @Column(nullable = false, unique = true, length = 100)
    private long nit;
    
    @Column(nullable = false, unique = false, length = 100)
    private String nombre;
    
    // constructores
    public Editorial(long nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }
    
    // constructor vacio
    public Editorial() {
    }
    

    public Editorial(long nit, String nombre, Long id) {
        super(id);
        this.nit = nit;
        this.nombre = nombre;
    }
    
    // metodos de acceso
    public long getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }
    
    // metodos set
    public void setNit(long nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
