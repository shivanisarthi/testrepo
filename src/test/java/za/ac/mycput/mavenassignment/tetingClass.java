/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.mavenassignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ntobeko Magam
 * @student Number 216108055
 */
public class tetingClass {

    private MavenClass mavenClass;

    public tetingClass() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        this.mavenClass = new MavenClass();
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAdd() {
        int result = mavenClass.add(3, 7);
        assertEquals(10, result);
    }

    @Test
    public void testSubtraction() {
        int result = mavenClass.subtraction(10, 5);
        assertEquals(5, result);

    }
    
    
  
}
