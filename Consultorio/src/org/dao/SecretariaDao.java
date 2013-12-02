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
import org.beans.Secretaria;
import org.utils.MybatisUtil;
/**
 *
 * @author rodrigo
 */
public class SecretariaDao {
    private SqlSessionFactory sqlSessionFactory;
    public SecretariaDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Secretaria secretaria) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Secretaria.insertar", secretaria);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en SecretariaDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Doctor doctor) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Secretaria.actualizar", doctor);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en SecretariaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String username_doc) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Secretaria.eliminar", username_doc);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en SecretariaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Secretaria> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Secretaria> usuarios = session.selectList("secretaria.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}