/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukkaplikasiperpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class koneksi {
       Connection koneksi=null;
    
    public static Connection koneksiDb()
    {       
    try{
        
         String url="jdbc:mysql://localhost/aplikasiperpustakaan";
         String user="root";
         String pass="";
         Class.forName("com.mysql.jdbc.Driver");
         Connection koneksi=DriverManager.getConnection(url,user,pass);
         return koneksi;
          
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    
    }
}
