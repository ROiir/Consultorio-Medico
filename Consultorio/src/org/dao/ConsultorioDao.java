package org.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Consultorio;
import org.utils.MybatisUtil;

public class ConsultorioDao {

         private SqlSessionFactory sqlSessionFactory;
    public ConsultorioDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Consultorio cita) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Consultorio.insertar", cita);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en ConsultorioDAO>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Consultorio cita) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Consultorio.actualizar", cita);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en ConsultorioDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String cve_cita) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Consultorio.eliminar", cve_cita);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en ConsultorioDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Consultorio> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Consultorio> usuarios = session.selectList("Consultorio.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
