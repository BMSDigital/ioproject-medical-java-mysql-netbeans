
package Ajustes.Controlador;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection; //
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexBD {
 
     public Connection Conexion;
    
    
    public ConexBD()
    {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
           Conexion = DriverManager.getConnection("jdbc:mysql://localhost/projectdb","root","");
          
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en la conexion");
       }    
    }
      
    public boolean ejecutar(String sql){
        boolean local =false;

            try {
                Statement st=Conexion.createStatement();
                st.execute(sql);
                local=true;
            } catch (Exception e) {
                System.out.println(sql+"  "+e);
            }
           return local;
    }

public ResultSet consultar(String sql) throws SQLException{

                Statement st=Conexion.createStatement();
                ResultSet  rs=st.executeQuery(sql);
                return rs;
   }

public boolean guardarImagen(String ruta,String nombre){
        String insert = "insert into cargarimagen(imagen,nombre) values(?,?)";
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            Conexion.setAutoCommit(false);
            File file = new File(ruta);
            fis = new FileInputStream(file);
            ps = Conexion.prepareStatement(insert);
            ps.setBinaryStream(1,fis,(int)file.length());
            ps.setString(2, nombre);
            ps.executeUpdate();
            Conexion.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ConexBD.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(ConexBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
        return false;
    }
    
}
