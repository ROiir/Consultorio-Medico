package org.dao;

import java.util.List;
import junit.framework.TestCase;
import org.beans.Estatus;
public class EstatusDaoTest extends TestCase {
    
    public EstatusDaoTest(String testName) {
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
     * Test of create method, of class EstatusDao.
     */
    public void testCreate() {
        System.out.println("create");
        Estatus estado = new Estatus();
        estado.setEstatus("Confirmado");
        estado.setId_estatus(2);
        EstatusDao instance = new EstatusDao();
        boolean expResult = false;
        boolean result = instance.create(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

/*
 public void testUpdate() {
        System.out.println("update");
        Estatus estatus = null;
        EstatusDao instance = new EstatusDao();
        boolean expResult = false;
        boolean result = instance.update(estatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public void testDelect() {
        System.out.println("delect");
        String idestatus = "";
        EstatusDao instance = new EstatusDao();
        boolean expResult = false;
        boolean result = instance.delect(idestatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 public void testBuscarTodos() {
        System.out.println("buscarTodos");
        EstatusDao instance = new EstatusDao();
        List expResult = null;
        List result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
