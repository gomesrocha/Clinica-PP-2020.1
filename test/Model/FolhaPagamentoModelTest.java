/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 10361
 */
public class FolhaPagamentoModelTest {
    
    public FolhaPagamentoModelTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getInss method, of class FolhaPagamentoModel.
     */
    @Test
    public void testGetInss() {
        System.out.println("getInss");
        FolhaPagamentoModel instance = null;
        double expResult = 0.0;
        double result = instance.getInss();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIrrf method, of class FolhaPagamentoModel.
     */
    @Test
    public void testGetIrrf() {
        System.out.println("getIrrf");
        FolhaPagamentoModel instance = null;
        double expResult = 0.0;
        double result = instance.getIrrf();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalarioLiquido method, of class FolhaPagamentoModel.
     */
    @Test
    public void testGetSalarioLiquido() {
        System.out.println("getSalarioLiquido");
        FolhaPagamentoModel instance = null;
        double expResult = 0.0;
        double result = instance.getSalarioLiquido();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
