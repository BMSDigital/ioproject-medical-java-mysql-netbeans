package Ajustes.Controlador;

import EgoistSwing.Animator.Animator;
import EgoistSwing.Animator.Resize;
import EgoistSwing.Physics.Rect;
import EgoistSwing.Point.Point2d;
import EgoistSwing.Util.ButtonFlash;
import EgoistSwing.Util.ExpandOnFocus;
import EgoistSwing.Util.TextFieldColorOnFocus;
import EgoistSwing.Util.TextFieldName;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Validations {
    private Animator passwAnim;
    
// Creando animaciones para los campos de texto todo en uno
    public void setEgoistStyle(JTextField txt)
    {
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txt)).build();
    }
    
// Creando animaciones para los campos de texto todo en uno
    public void setEgoistStyle_0(JTextField TXT, final int loginItemExtraWidth, final int loginItemWidth)
    {
      (new ExpandOnFocus(new java.awt.Dimension(loginItemWidth, 30), new java.awt.Dimension(loginItemExtraWidth, 0), 100, TXT)).build();
    }
   
//Creando efecto de nombre de nombre de campo de texto
    public void setEgoistStyle_1(JTextField TXT, String TxtField)
    {
        (new TextFieldName(TxtField, TXT)).build();
    }
    
// Creando efecto de cambio de color de campos de texto
    public void setEgoistStyle_2(JTextField TXT)
    {
        Color colorA = new Color(255, 255, 255, 255);
        Color colorB = new Color(255, 255, 255, 100);
        Color foregroundA = new Color(49, 152, 211);
        Color foregroundB = new Color(255, 255, 255);
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, TXT)).build();
    }
    
// Creando efecto de seleccion de boton entrar
    public void setEgoistStyle_3(JButton BUTTON)
    {
        (new ButtonFlash(BUTTON, new java.awt.Color(45, 164, 134, 0))).build();
    }
    
// Creando efecto de seleccion de boton exit
    public void setEgoistStyle_4(JButton BUTTON)
    {
        (new ButtonFlash(BUTTON, new java.awt.Color(54, 54, 54, 0))).build();
    }
    
//Creando efecto de nombre del camp de texto JPasswordField
    public void setEgoistStyle_5(JPasswordField TXT, String TxtField)
    {
        (new TextFieldName(TxtField, TXT)).build();
    }
    
    public void limpiar1(JButton n){
       n.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }
    public void limpiar2(JButton n){
       n.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }
    
   
    /*public void valEsp(JDateChooser  h){
        if (h.getDate() == null) {
            //h.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        }else{
            h.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }*/
    
    
    public void valEsp7(JSpinner h){
        if (h.getValue().equals(0)) {
            h.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        }else {
            h.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }
    
    //Validar campos de texto con bordes
    public void valEsp(JTextField nodo) {
        if (nodo.getText().equals("")) {
            nodo.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            nodo.requestFocus();
        } else {
            nodo.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }
    
    //Validar un JCalendar
    public void valEsp4(JDateChooser nodo)
    {
        if (nodo.getDate() == null) {
            nodo.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
        } else {
            nodo.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    
    }
  
    //Validar combo box con bordes --
    public void valEsp(JComboBox lista) {
        if (lista.getModel().getSelectedItem().equals("--")) {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista.requestFocus();
            return;
        } else {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }
    
    public void valEsp(JTextArea lista) {
        if (lista.getText().length() == 0) {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista.requestFocus();
            return;
        } else {
            lista.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }
    public void valEsp2(JComboBox lista2) {
        if (lista2.getModel().getSelectedItem().equals("SELECIONAR")) {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista2.requestFocus();
            return;
        } else {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }
    public void valEsp3(JComboBox lista2) {
        if (lista2.getModel().getSelectedItem().equals("CANTIDAD")) {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.red));
            lista2.requestFocus();
            return;
        } else {
            lista2.setBorder(BorderFactory.createEtchedBorder(Color.WHITE, Color.WHITE));
        }
    }
    
    

    public void digitos(JTextField n,KeyEvent e) {
        int k = (int) e.getKeyChar();
        char c = e.getKeyChar();
        if((k >= 97 && k <= 122) || (k >= 65 && k <= 90)){
           e.setKeyChar((char)KeyEvent.VK_DELETE);
           n.setText("");
           Toolkit.getDefaultToolkit().beep();
        }
        
        if((k >= 32 && k <= 47) || (k >= 58 && k <= 64) || (k >= 91 && k <= 96) || (k >= 123 && k <= 126)){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_DELETE);
           n.setText("");
           Toolkit.getDefaultToolkit().beep();
        }
        //para validar caracteres raros que no se puede validar normalmente
        if((c == '?')||(c == '¡') ||(c == 'ñ')||(c == 'Ñ') || (c == '´')||(c == 'ç') ||  (c == 'º')||(c == 'ª') || (c == '·')||(c == '☺')){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_DELETE);
           n.setText("");
           Toolkit.getDefaultToolkit().beep();
        }
     
    }

    public void letras(KeyEvent e) {
        int k = (int) e.getKeyChar();
        char c = e.getKeyChar();
        if(k >= 48 && k <= 57){
           e.setKeyChar((char)KeyEvent.VK_DELETE);
        }
        
        if((k >= 33 && k <= 47) || (k >= 58 && k <= 64) || (k >= 91 && k <= 96) || (k >= 123 && k <= 126)){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_DELETE);  
        }
        //para validar caracteres raros que no se puede validar normalmente
        if((c == '?')||(c == '¡') || (c == '´')||(c == 'ç') ||  (c == 'º')||(c == 'ª') || (c == '·')||(c == '☺')){
           Toolkit.getDefaultToolkit().beep();
           e.setKeyChar((char)KeyEvent.VK_DELETE);
        }
       
    }
    
    public void teclasEspeciales(KeyEvent e,JTextField n){
        int k = (int) e.getKeyCode();
       if((k >= 1 && k <= 7)||( k>=14 && k <= 19) || ( k>=21 && k <= 31)){
          Toolkit.getDefaultToolkit().beep();
          n.setText(null);
          Ajustes.Controlador.Application.showMessageDialog( "Error no se acepta caracteres especiales", " Validando datos", 1, new String[]{"Aceptar"}, new String[]{"close"} );
       }
       
    }
    public void espacioMaximo(JTextField n,KeyEvent e, int i ){
        if(n.getText().length() >= i){
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
           Toolkit.getDefaultToolkit().beep();
           n.setText(null);
           Ajustes.Controlador.Application.showMessageDialog( "Ha excedido el numero maximo de caracter", " Validando datos", 1, new String[]{"Aceptar"}, new String[]{"close"} );
        }
    }
    
    public void espacioMaximo(JTextArea n,KeyEvent e, int i ){
        if(n.getText().length() >= i){
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
           Toolkit.getDefaultToolkit().beep();
           n.setText(null);
           Ajustes.Controlador.Application.showMessageDialog( "Ha excedido el numero maximo de caracter", " Validando datos", 1, new String[]{"Aceptar"}, new String[]{"close"} );
        }
    }
    
    public void espacioMaximo2(JTextArea n,KeyEvent e, int i ){
        if(n.getText().length() >= i){
           e.setKeyChar((char)KeyEvent.VK_CLEAR);
           Toolkit.getDefaultToolkit().beep();
           n.setText(null);
           Ajustes.Controlador.Application.showMessageDialog( "Ha excedido el numero maximo de caracter", " Validando datos", 1, new String[]{"Aceptar"}, new String[]{"close"} );
        }
    }


}
