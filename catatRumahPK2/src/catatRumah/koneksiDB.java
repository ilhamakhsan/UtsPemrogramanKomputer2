/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catatRumah;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ilham
 */
public class koneksiDB {
    public static Connection MySQL(){
        try {
            MysqlDataSource ds = new  MysqlDataSource();
            ds.setUser("ilham"); //isi user database
            ds.setPassword("ilham");//password dari user database
            ds.setServerName("localhost"); // isi name servernya
            ds.setDatabaseName("catatrumah"); // isi nama database nya
            ds.setPortNumber(3306); // port
            ds.setServerTimezone("Asia/Jakarta");
            Connection c = ds.getConnection();
            return c;
            
        } catch (SQLException e) {
           System.out.println(e.getMessage());
            return null; 
        }
    }/*
    public static void main(String[] args) {
        try {
            Connection conn = koneksiDB.MySQL();
         System.out.println(conn.getCatalog());
        } catch (SQLException e) {
        }
}*/
}

