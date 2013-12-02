/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Doctor;
import org.beans.Receta;
import org.utils.MybatisUtil;
/**
 *
 * @author rodrigo
 */
public class RecetaDao {
    private SqlSessionFactory sqlSessionFactory;
    public RecetaDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Receta receta) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Doctor.insertar", receta);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en RecetaDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Receta receta) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Receta.actualizar", receta);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en RecetaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String recetacol) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Receta.eliminar", recetacol);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en RecetaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Receta> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Receta> usuarios = session.selectList("receta.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
