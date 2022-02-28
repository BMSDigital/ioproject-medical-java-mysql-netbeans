/**Main principal del sistema..
    *Fraibert Bracho    
    *Cedula: 22270634
    *Mi primer Systema auditado
    *Derecho reservado 
*/
package Ajustes.Controlador;

import Egoist.MySql.SqlDriver;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application 
{
    //Declaracion de los driver mysql
    static private Egoist.MySql.SqlDriver sqlDriver;
    
    //Instancia o llamado de la clase Configuration
    static private Configuration configuration;
    
    static private Thread[] agents;
    
    //Metodo instancia del formulario MainForm
    static private Ajustes.Vista.MainForm screen;
    static private Ajustes.Modelo.Usuario usuario;
    
    //Inicializacion de todos los modulos del sistema
    public static void start()
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                loadCfg();
                loadScreen();
                loadMySql();
                loadAgents();
            }
        });
    }//Fin Start
    
    //Declaracion de sql Driver con sus valores de base datos
    private static void loadMySql()
    {
        sqlDriver = new Egoist.MySql.SqlDriver( configuration.getSqlHost(), configuration.getSqlDB(), configuration.getSqlPort(), configuration.getSqlUser(), configuration.getSqlPassw() );
    }//Fin loadMysql
    
    //Mostrar el mensaje de conexion en la base de datos
    private static void loadCfg()
    {
        configuration = new Configuration();
        if(!configuration.loadCfg())
        {
            int result = showMessageDialog( "La configuración no pudo ser cargada debido a un error en la lectura.", "¿Desea restablecer la configuración por defecto?", 1, new String[]{"Cancelar y salir", "Aceptar"}, new String[]{"cancel", "accept"} ); 
            if( result == 2 )
            {
                if(!configuration.saveCfg())
                {
                    result = showMessageDialog( "No se pudo escribir la configuración.", "¿Desea iniciar la aplicación sin cargar la configuración?", 1, new String[]{"Cancelar y salir", "Aceptar"}, new String[]{ "cancel", "accept" } );
                    if( result == 2 )
                    {
                        configuration.useDefaultCfg();
                    }
                    else
                    {
                        System.exit(0);
                    }
                }
            }
            else
            {
                System.exit(0);
            }
        }
    }
    private static void loadAgents()
    {
        agents = new Thread[1];
        // Sql Agent
        agents[0] = new Egoist.MySql.SqlConAgent( configuration.getSqlHost(), configuration.getSqlDB(), configuration.getSqlPort(), configuration.getSqlUser(), configuration.getSqlPassw() );
        ((Egoist.MySql.SqlConAgent)agents[0]).linkPostMethod(screen, "setSqlIconState", boolean.class);
        
        for( int i = 0; i < agents.length; ++i )
            agents[i].start();
    }
    
    //Modulo pricipal MainForm
    private static void loadScreen()
    {
        screen = new Ajustes.Vista.MainForm();
        //screen.setSize( Integer.parseInt(configuration.getCfgWidth()), Integer.parseInt(configuration.getCfgHeight()) );
        screen.setMenuVisible(false);
        screen.setVisible(true);
        
        //Modulo formulario de login
        callMainOption( new Ajustes.Vista.Login() );
    }//Fin loadScreen
      
    //Manejo de las pantalla de Login o Acceso al Sistema
    public static void callMainOption( javax.swing.JPanel n_content )
    {
        javax.swing.JPanel content = new javax.swing.JPanel()
        {
            private java.awt.Image backImage;
            
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                super.paintComponent(g);

                if( backImage != null )
                    g.drawImage(backImage, 0, 0, this);
                else
                    //Fondo del formulario Login
                    backImage = Egoist.Swing.Image.setAlpha(Ajustes.Controlador.Application.getThemeItem("24", getPreferredSize().width, getPreferredSize().height ), 200 );
            }//Fin paintComponent
        };//Fin content
        
        if(n_content != null)
        {
            content.setSize(n_content.getSize());
            content.setMaximumSize(n_content.getMaximumSize());
            content.setOpaque(false);
            content.setPreferredSize(n_content.getPreferredSize());
            content.add(n_content);
            screen.setContent(content);
        }//Fin n_content
        else
            screen.setContent(null);
    }//Fin callMainOption
    
    
    public static void callInicio()
    {
        callMainOption( new Ajustes.Vista.MenuBar());
    }
    
    public static void repaintScreen()
    {
        if(screen!=null)
            screen.repaint();
    }//Fin repainScreen
    
    /* Eventos MySql que se registraran en la Bitácora */
    public static void onloginEvent( Ajustes.Modelo.Usuario m_usuario)
    {
        usuario = m_usuario;
        screen.setMenuVisible(true);
        
        crearBitacora( "Inicio de sesion en el sistema", true );
    }
    
    //Declaracion de la clave para insertar un usuario
    public static boolean onusuario( Ajustes.Modelo.Usuario usuario )
    {
        boolean res = sqlDriver.sqlInsert(usuario);
        
        crearBitacora( "Registro de usuario", res );
        
        return(res);
    }//fin onusuario
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean oncategoria( Ajustes.Modelo.Categoria categoria )
    {
        boolean res = sqlDriver.sqlInsert(categoria);
        
        crearBitacora( "Registro de la categoria del producto", res );
        
        return(res);
    }//fin oncategoria
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean onmarca( Ajustes.Modelo.Marca marca )
    {
        boolean res = sqlDriver.sqlInsert(marca);
        
        crearBitacora( "Registro de marca del producto", res );
        
        return(res);
    }//fin oncategoria
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean onunidades( Ajustes.Modelo.Unidades unidad )
    {
        boolean res = sqlDriver.sqlInsert(unidad);
        
        crearBitacora( "Registro de unidad de medida del producto", res );
        
        return(res);
    }//fin oncategoria
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean onempresa( Ajustes.Modelo.Empresa empresa )
    {
        boolean res = sqlDriver.sqlInsert(empresa);
        
        crearBitacora( "Registro de los datos de la empresa", res );
        
        return(res);
    }//fin oncategoria
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean onproveedor( Ajustes.Modelo.Proveedores proveedor )
    {
        boolean res = sqlDriver.sqlInsert(proveedor);
        
        crearBitacora( "Registro de los datos del proveedor", res );
        
        return(res);
    }//fin oncategoria
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean oninventario( Ajustes.Modelo.Inventario inventario )
    {
        boolean res = sqlDriver.sqlInsert(inventario);
        
        crearBitacora( "Registro de los datos del inventario", res );
        
        return(res);
    }//fin oncategoria
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean onpaciente( Ajustes.Modelo.Paciente paciente )
    {
        boolean res = sqlDriver.sqlInsert(paciente);
        
        crearBitacora( "Registro de los datos del paciente", res );
        
        return(res);
    }//fin oncategoria
    
    //Declaracion de la clave para insertar un categoria de inventario
    public static boolean ondoctores( Ajustes.Modelo.Doctores doctores )
    {
        boolean res = sqlDriver.sqlInsert(doctores);
        
        crearBitacora( "Registro de los datos del medico", res );
        
        return(res);
    }//fin oncategoria
    
    /*public static boolean onRegisterProfesor( Ajustes.Modelo.Profesor profesor )
    {
        boolean res = sqlDriver.sqlInsert(profesor);
        
        crearBitacora( "Registro de profesor", res );
        
        return(res);
    }
    public static boolean onRegisterMateria( Ajustes.Modelo.Asignatura asignatura ) 
    {
        boolean res = sqlDriver.sqlInsert(asignatura);
        
        crearBitacora( "Registro de asignatura", res );
        
        return(res);
    }*/
    
    public static boolean onCategoriaStatusChanged( Ajustes.Modelo.Categoria p )
    {
        boolean res = sqlDriver.sqlRefresh(p);
        
        crearBitacora( "Cambio de Status de la categoria", res );
        
        return(res);
    }
    /*
     public static boolean onSeccionCreated( Ajustes.Modelo.Seccion seccion )
    {
        boolean res = sqlDriver.sqlRefresh(seccion);
        if( res )
        {
            java.util.ArrayList<Ajustes.Modelo.AsignaturaSeccion> asignaturas = seccion.getHorario();
        
            for( Ajustes.Modelo.AsignaturaSeccion a : asignaturas )
            {
                java.util.ArrayList<Ajustes.Modelo.Bloque> bloques = a.getBloques();
                for( Ajustes.Modelo.Bloque b : bloques )
                    res = sqlDriver.sqlRefresh(b);
            }
        }
        
        crearBitacora( "Actualización de sección", res );
        
        return(res);
    }*/
     
     /* Eventos menores MySql */
    public static java.util.ArrayList loadDbItems( Object o )
    {
        return(sqlDriver.sqlGetAll(o));
    }
    public static java.util.ArrayList loadDbItems( Object o, String key, String value )
    {
        return(sqlDriver.sqlGet(o, key, value));
    }
    public static java.util.ArrayList loadDbItems( Object o, String[] key, String[] value )
    {
        return(sqlDriver.sqlGet(o, key, value));
    }
    
    //Crear bitacora
    public static void crearBitacora( String evento, boolean res )
    {
        Ajustes.Modelo.Bitacora bitacora = new Ajustes.Modelo.Bitacora();
        bitacora.setNombre(usuario.getUser());
        bitacora.setFecha( getFecha() );
        bitacora.setHora( getHora() );
        bitacora.setDescripcion(evento);
        
        String resultado = res == false ? "Falló" + sqlDriver.getError() : "Éxito";
        bitacora.setResultado(resultado.length() > 60 ? resultado.substring( 0, 60 ) : resultado );
        
        sqlDriver.sqlInsert(bitacora);
    }
    
    //Getter
    public static String getFecha()
    {
        String fecha = "";
        Calendar c = new GregorianCalendar();
        fecha += c.get( Calendar.DAY_OF_MONTH );
        fecha += "/" + (c.get(Calendar.MONTH)+1);
        fecha += "/" + c.get(Calendar.YEAR);
        
        return(fecha);
    }
    public static String getHora()
    {
        String hora = "";
        Calendar c = new GregorianCalendar();
        hora += c.get(Calendar.HOUR_OF_DAY);
        hora += ":" + c.get(Calendar.MINUTE);
        hora += ":" + c.get(Calendar.SECOND);
        
        return(hora);
    }
    
    public static Ajustes.Vista.MainForm getScreen()
    {
        return((Ajustes.Vista.MainForm)screen);
    }
    //Ubicar y creacion del modulo para los temas
    public static  java.awt.Image getImage( String imagepath, int width, int height )
    {
        java.awt.Image image = new javax.swing.ImageIcon(Application.class.getResource( "/Background/" + imagepath + ".png" )).getImage();
        return( Egoist.Swing.Image.resize( image, width, height ) );
    }
    public static  java.awt.Image geTImage( String imagepath, int width, int height )
    {
        java.awt.Image image = new javax.swing.ImageIcon(Application.class.getResource( "/Recursos/" + imagepath + ".png" )).getImage();
        return( Egoist.Swing.Image.resize( image, width, height ) );
    }
    public static String getTheme()
    {
        return("Light");
    }
    public static java.awt.Image getThemeItem( String item, int width, int height )
    {
        return(Ajustes.Controlador.Application.getImage("Themes/" + Ajustes.Controlador.Application.getTheme() + "/" + item, width, height));
    }
    public static SqlDriver getSqlDriver()
    {
        return sqlDriver;
    }
    
    /* Message Dialog */
    public static int showSqlErrorMessageDialog()
    {
        return(showMessageDialog( sqlDriver.getError() ));
    }
    public static int showMessageDialog( String msgTitle )
    {
        return(showMessageDialog( "", msgTitle, 1, new String[]{"Aceptar"}, new String[]{"accept"} ));
    }
    public static <T> int showMessageDialog( String msgTitle, String msgStr, int msgColor, String[] buttons, String[] buttonsUrl )
    {
        screen.setContentVisible(false);
        // Eligiendo el color de fondo
        java.awt.Color color;
        switch( msgColor )
        {
            default:
            {
                color = new java.awt.Color( 0, 0, 0, 0 );
            }break;
        }
        
        // Oscureciendo el fondo de la pantalla
        Egoist.Swing.JPanel backColor = new Egoist.Swing.JPanel()
        {
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                if( ((Ajustes.Vista.MainForm)screen).getBackImage() != null )
                    g.drawImage(((Ajustes.Vista.MainForm)screen).getBackImage(), 0, 0, this);
                
                super.paintComponent(g); 
            }  
        };
        backColor.setSize(screen.getSize());
        backColor.setBackground( new java.awt.Color( 0, 0, 0, 0 ) );
        backColor.setScreen(screen);
        backColor.setVisible(false);
        
        screen.getContentPane().add(backColor);
        screen.pack();
        
        Egoist.Swing.Animator animator = Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Fading).init( 175, 30, 3000, Egoist.Swing.Animator.BEHAVIOUR.AccelDown, backColor);
        animator.start();

        // Creando el dialog y agregando el panel de opciones
        javax.swing.JDialog dialog = new javax.swing.JDialog( screen, "", true );
        
        dialog.dispose();
        dialog.setUndecorated(true);

        Ajustes.Vista.Message msg = new Ajustes.Vista.Message(dialog);
        
        // Estableciendo los valores del mensaje
        msg.setMessage( msgTitle, msgStr, buttons, buttonsUrl );
        
        backColor.setVisible(true);
        
        // Mostrando el mensaje
        msg.showTime();
        
        // Limpiando pantalla
        animator.finish();
        
        screen.getContentPane().remove(backColor);
        screen.pack();
        screen.setContentVisible(true);
        
        return(msg.getValue());
    }      
}
