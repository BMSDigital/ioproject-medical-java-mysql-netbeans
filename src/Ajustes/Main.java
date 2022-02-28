/**Main principal del sistema..
    *Fraibert Bracho    
    *Cedula: 22270634
    *Mi primer Systema auditado
    *Derecho reservado 
*/
package Ajustes;
    import javax.swing.UIManager;
    import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    //Main Principal
    public static void main( String[] args )
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
        {
        
        }
        //Iniciar el proyecto.
       Ajustes.Controlador.Application.start();
    }//Fin main
}//Fin Main

