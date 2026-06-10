/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.uvpalmira.fpoe.exfinal.backend.dao;

import co.edu.uvpalmira.fpoe.exfinal.entities.Editorial;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.TestMethodOrder;
/**
 *
 * @author ajvelez
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EditorialDAOTest {

    private EditorialDAO editorialDAO;
    private Long nit;

    public EditorialDAOTest() {
        //AV-TODO
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("FPOE-Test-PU");
        this.editorialDAO = new EditorialDAO(emf);
    }
    
    @Test
    public void test() {
        try {
            System.out.println("Buscar");
            Editorial ed = new Editorial(1113, "Principito");
            this.editorialDAO.create(ed);
            this.nit = ed.getNit();
            System.out.println("id: " + this.nit);
            ed = null;
            Assert.assertNotNull(this.nit);
            
            System.out.println("Buscar: " + this.nit);
            ed = this.editorialDAO.buscarPorNit(this.nit);
            Assert.assertEquals(1113, ed.getNit());
            
            System.out.println("Actualizar: " + this.nit);
            ed.setNombre("Salvador Gaviota");
            this.editorialDAO.edit(ed);
            ed = null;
            
            ed = this.editorialDAO.buscarPorNit(this.nit);
            Assert.assertEquals(1113, ed.getNit());
            
        } catch (Exception ex){
            Logger.getLogger(EditorialDAOTest.class.getName()).log(Level.SEVERE, null, ex);
            Assert.fail();
        }
    }

}
