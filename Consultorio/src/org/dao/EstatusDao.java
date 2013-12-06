package org.dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.beans.Estatus;
import org.utils.MybatisUtil;
public class EstatusDao {
    private SqlSessionFactory sqlSessionFactory;
    public EstatusDao() {
        sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
    }

    public boolean create(Estatus Estatus) {
         SqlSession session = sqlSessionFactory.openSession();
        try {
            session.insert("Estatus.insertar", Estatus);
            
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en EstatusDao>insertar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean update(Estatus estatus) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.update("Estatus.actualizar", estatus);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error enEstatusDao>update" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
    
     public boolean delect(String idestatus) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            session.delete("Estatus.eliminar", idestatus);
            session.commit();
            return true;
        } catch (Exception e) {
            System.out.println("Error en EstatusDao>Eliminar" + e.getMessage());
            session.rollback();
            return false;
        } finally {
            session.close();
        }
    }
     
     public List<Estatus> buscarTodos() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            List<Estatus> usuarios = session.selectList("Estatus.buscarTodos");
            return usuarios;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }

    }
}
