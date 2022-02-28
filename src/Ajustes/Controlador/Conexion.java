
package Ajustes.Controlador;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
   public String bd = "projectdb";// aqui va nombre de la base de datos
   public String url = "jdbc:mysql://localhost/"+bd;//por defecto donde se guarda la base de datos
   public String login = "root";//root es el nombre de usuario de la base de datos, viene asi por defecto
   public String password = "";//por defecto el pasword es el que se le asigne, quise dejarlo en blanco pero no aceptaba asi que le puse 0000 mejor dejarlo asi
   public Object conexion;
   
   public Conexion (){
       
   }
  
   
   public Connection Conectar(){
     Connection link =null;
    
     try{
         //obtenemos el driver de para mysql
         Class.forName("org.gjt.mm.mysql.Driver");
         //obtenemos la conexión
         link = DriverManager.getConnection(url,login,password);
 
         if (link!=null){
         
         }
      }
      catch(SQLException e){
         JOptionPane.showMessageDialog(null,e);
      }catch(ClassNotFoundException e){
          JOptionPane.showMessageDialog(null,e);
      }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
      }
       return link;
   } 

    public void DesConectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

