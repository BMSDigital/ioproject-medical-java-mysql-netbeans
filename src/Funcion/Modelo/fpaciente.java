package Funcion.Modelo;

import Ajustes.Controlador.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fpaciente {
    Conexion mysql = new Conexion();
    Connection cn= mysql.Conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar,String filtro){
        
        DefaultTableModel modelo;
        
        String[] titulos={"Id","Nombre","Apellido","Telf","Email","Login","Password","nivel","Previlegio"};
        
        String[] registro=new String[9];
        
        totalregistros = 0;
        
        modelo = new DefaultTableModel(null,titulos);
        
        if(filtro.equalsIgnoreCase("NOMBRE")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where nombre like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("APELLIDO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where apellido like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("TELEFONO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where telf like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("EMAIL")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where email like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("USUARIO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where user like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("NIVEL")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where nivel like '%"
                + buscar + "%'";
        }else if(filtro.equalsIgnoreCase("PREVILEGIO")){
        sSQL = "select u.user,u.pass,u.nivel,u.privilegio,"
                + "p.idpersona,p.nombre,p.apellido,p.telf,p.email from persona p inner join usuario u "
                + "on p.idpersona=u.idpersona where privilegio like '%"
                + buscar + "%'";
        }
        
        try{
            Statement st = cn.createStatement();
            ResultSet rt = st.executeQuery(sSQL);
            
            while(rt.next()){
                registro[0] = rt.getString("idpersona");
                registro[1] = rt.getString("nombre");
                registro[2] = rt.getString("apellido");
                registro[3] = rt.getString("telf");
                registro[4] = rt.getString("email");
                registro[5] = rt.getString("user");
                registro[6] = rt.getString("pass");
                registro[7] = rt.getString("nivel");
                registro[8] = rt.getString("privilegio");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
            
        }catch(Exception e){
            
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }  
    }
}
