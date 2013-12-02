/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Paciente;
import org.utils.MybatisUtil;

/**
 *
 * @author rodrigo
 */
public class PacienteDao {
    private SqlSessionFactory sqlSessionFactory;
    public PacienteDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Paciente paciente) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Paciente.insertar", paciente);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en PacienteDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Paciente paciente) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Paciente.actualizar", paciente);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en PacienteDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String curp) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Categoria.eliminar", curp);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en PacienteDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Paciente> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Paciente> usuarios = session.selectList("Paciente.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
