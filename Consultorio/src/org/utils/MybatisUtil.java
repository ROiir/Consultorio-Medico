/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.utils;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 *
 * @author rodrigo
 */
public class MybatisUtil {
     private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("Basedatos_Config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            System.out.println("Error en MybatisUtil" + e.getMessage());
        }

    }
    
      
    public static SqlSessionFactory getSqlSessionFactory(){
    
        return sqlSessionFactory;
             
    }
}
