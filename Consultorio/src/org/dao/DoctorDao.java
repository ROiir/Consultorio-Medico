package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Doctor;
import org.utils.MybatisUtil;

public class DoctorDao {
    private SqlSessionFactory sqlSessionFactory;
    public DoctorDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Doctor doctor) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Doctor.insertar", doctor);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en DoctorDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Doctor doctor) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Doctor.actualizar", doctor);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en DoctorDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String username_doc) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Doctor.eliminar", username_doc);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en DoctorDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Doctor> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Doctor> usuarios = session.selectList("doctor.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
