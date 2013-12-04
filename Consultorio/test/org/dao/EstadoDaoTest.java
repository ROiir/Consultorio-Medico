package org.dao;

import java.util.List;
import junit.framework.TestCase;
import org.beans.Estado;

public class EstadoDaoTest extends TestCase {
    
    public EstadoDaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of create method, of class EstadoDao.
     */
    public void testCreate() {
        System.out.println("create");
        Estado estado = new Estado();
        estado.setEstatus("Confirmado");
        estado.setId_estatus(1);
        EstadoDao instance = new EstadoDao();
        boolean expResult = false;
        boolean result = instance.create(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
/*
    public void testUpdate() {
        System.out.println("update");
        Estado estado = null;
        EstadoDao instance = new EstadoDao();
        boolean expResult = false;
        boolean result = instance.update(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


public void testDelect() {
        System.out.println("delect");
        String idestatus = "";
        EstadoDao instance = new EstadoDao();
        boolean expResult = false;
        boolean result = instance.delect(idestatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


public void testBuscarTodos() {
        System.out.println("buscarTodos");
        EstadoDao instance = new EstadoDao();
        List expResult = null;
        List result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
