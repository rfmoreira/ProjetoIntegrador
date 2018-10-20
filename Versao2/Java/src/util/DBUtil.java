/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luan Amor
 */
public class DBUtil {
    
    private static Connection con = null;
    
    public static Connection getConnection(){
        if(con != null){
            return con;
        }else {
            try {
                String url = "jdbc:postgresql://localhost:1234/ondecomi";
                String user = "postgres";
                String pass = "Amor10";
                
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexão realizada com sucesso.");
                
            } catch (Exception e) {
                System.out.println("Não foi possível realizar a conexão.");
                e.printStackTrace();
            }
            return con;
        }
    }
    
}
