package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Cita;
import org.utils.MybatisUtil;

public class CitaDao {
     private SqlSessionFactory sqlSessionFactory;
    public CitaDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Cita cita) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Cita.insertar", cita);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en CitaDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Cita cita) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Cita.actualizar", cita);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en CitaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String cve_cita) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Cita.eliminar", cve_cita);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en CitaDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Cita> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Cita> usuarios = session.selectList("cita.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }

}
