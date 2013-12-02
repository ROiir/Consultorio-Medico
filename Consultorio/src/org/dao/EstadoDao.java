/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Estado;
import org.utils.MybatisUtil;

/**
 *
 * @author rodrigo
 */
public class EstadoDao {
    private SqlSessionFactory sqlSessionFactory;
    public EstadoDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Estado estado) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Estado.insertar", estado);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en EstadoDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Estado estado) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Estado.actualizar", estado);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en EstadoDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String idestatus) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Estado.eliminar", idestatus);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en EstadoDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Estado> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Estado> usuarios = session.selectList("estado.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
