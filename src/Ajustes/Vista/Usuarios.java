
package Ajustes.Vista;
import Ajustes.Controlador.ConexBD;
import Ajustes.Controlador.Conexion;
import Ajustes.Controlador.Validations;
import Ajustes.Modelo.Usuario;
import EgoistSwing.Util.AppView;
import EgoistSwing.Util.ButtonFlash;
import EgoistSwing.Util.ExpandOnFocus;
import EgoistSwing.Util.TextFieldColorOnFocus;
import EgoistSwing.Util.ToolTip;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

public class Usuarios extends javax.swing.JPanel {

    public Usuarios() {
        initComponents();
        inhabilitar();
        setEgoistStyle();
    }
    Validations val = new Validations();
    private String accion="registrar";
    Conexion mysql = new Conexion();
    Connection cn= mysql.Conectar();
    
    Color colorA=new Color(255,255,255,255);
    Color colorB=new Color(255,255,255,100);
    Color foregroundA=new Color(49,152,211);
    Color foregroundB=new Color(255,255,255);
    
  
   public void setEgoistStyle(){
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtnombre)).build();
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtapellido)).build();
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtusuario)).build();
        (new ExpandOnFocus(new java.awt.Dimension(165,50), new java.awt.Dimension(30,0), 100, txtpasword)).build();
        (new ExpandOnFocus(new java.awt.Dimension(77,50), new java.awt.Dimension(8,0), 100, txtemail)).build();
        (new ExpandOnFocus(new java.awt.Dimension(77,50), new java.awt.Dimension(13,0), 100, txttelefono)).build();
        (new ButtonFlash(btregistrar, new java.awt.Color(183,103,103,0))).build();
        (new ButtonFlash(btnuevo, new java.awt.Color(183,103,103,0))).build();
        
          
        (new ToolTip(AppView.loadImage("tooltip.png"),txtnombre, "<html><left>Introduzca el nombre completo en letra mayúscula. No se permiten números ni caracteres especiales.</left></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtapellido, "<html><lef>Introduzca el apellido completo en letra mayúscula. No se permiten números ni caracteres especiales.</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtusuario, "<html><lef>Introduzca una cuenta que sea legible y recordable. Para iniciar sesion en el sistema.</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtpasword,"<html><lef>Contraceñas deben tener 8 caracteres como minimo. y contener mayuscula y minuscula.</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtemail,"<html><lef>Introduzca una direccion de correo electronico favorita. Para iniciar sesion</lef></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txttelefono,"<html><lef>Introduzca su numero de telefono ya que nos ayuda a mantener tu cuenta segura</lef></html>",200)).build();
        
        
        //(new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtnombre)).build();
    }
    public void habilitar(){
        txtidpersona.setVisible(false);
        txtnombre.setEnabled(true);
        txtapellido.setEnabled(true);
        txtusuario.setEnabled(true);
        txtpasword.setEnabled(true);
        txtemail.setEnabled(true);
        txttelefono.setEnabled(true);
        cboemail.setEnabled(true);
        cboestado.setEnabled(true);
        cbotelefono.setEnabled(true);
        slidernivel.setEnabled(true);
        
        btregistrar.setEnabled(true);
        cboemail.setSelectedIndex(0);
        cbotelefono.setSelectedIndex(0);
        cboestado.setSelectedIndex(0);
        txtnombre.setText("");
        txtapellido.setText("");
        txtusuario.setText("");
        txtpasword.setText("");
        txtemail.setText("");
        txttelefono.setText("");
    }
    
    public void inhabilitar(){
        txtidpersona.setVisible(false);
        txtnombre.setEnabled(false);
        txtapellido.setEnabled(false);
        txtusuario.setEnabled(false);
        txtpasword.setEnabled(false);
        txtemail.setEnabled(false);
        txttelefono.setEnabled(false);
        cboemail.setEnabled(false);
        cboestado.setEnabled(false);
        cbotelefono.setEnabled(false);
        slidernivel.setEnabled(false);
        
        btregistrar.setEnabled(false);
        
        txtnombre.setText("");
        txtapellido.setText("");
        txtusuario.setText("");
        txtpasword.setText("");
        txtemail.setText("");
        txttelefono.setText("");
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtidpersona = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboemail = new javax.swing.JComboBox<String>();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        cbotelefono = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        slidernivel = new javax.swing.JSlider();
        slidertext = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<String>();
        txtpasword = new javax.swing.JPasswordField();
        btregistrar = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(354, 550));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(354, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Nuevo usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        cboemail.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboemail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "@gmail.com", "@hotmail.com", "@yahoo.com", "Otro" }));
        cboemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoKeyReleased(evt);
            }
        });

        cbotelefono.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbotelefono.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        cbotelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbotelefono.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pasword");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nivel de acceso");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(214, 128, 0));
        jLabel45.setText("*");

        slidernivel.setForeground(new java.awt.Color(255, 255, 255));
        slidernivel.setMajorTickSpacing(1);
        slidernivel.setMaximum(2);
        slidernivel.setPaintLabels(true);
        slidernivel.setPaintTicks(true);
        slidernivel.setValue(1);
        slidernivel.setOpaque(false);
        slidernivel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidernivelStateChanged(evt);
            }
        });

        slidertext.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        slidertext.setForeground(new java.awt.Color(255, 255, 255));
        slidertext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slidertext.setText("Moderador");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado");

        cboestado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Activado", "Desactivado" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);

        txtpasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasword.setText("Contraseña");
        txtpasword.setToolTipText("");
        txtpasword.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(slidertext, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slidernivel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtidpersona, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboemail, 0, 1, Short.MAX_VALUE))
                            .addComponent(cboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpasword, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpasword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(2, 2, 2)
                .addComponent(slidernivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slidertext)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btregistrar.setBackground(new java.awt.Color(190, 74, 77));
        btregistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/Ok_24px.png"))); // NOI18N
        btregistrar.setText("Registrar");
        btregistrar.setContentAreaFilled(false);
        btregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btregistrar.setOpaque(true);
        btregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btregistrarActionPerformed(evt);
            }
        });

        btnuevo.setBackground(new java.awt.Color(190, 74, 77));
        btnuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/Plus_24px.png"))); // NOI18N
        btnuevo.setText("Nuevo");
        btnuevo.setContentAreaFilled(false);
        btnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnuevo.setOpaque(true);
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void slidernivelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidernivelStateChanged
        switch(slidernivel.getValue()){
            case 0:
            {
                slidertext.setText("Usuario");
            }
            break;
            
            case 1:
            {
                slidertext.setText("Moderador");
            }
            break;
            
            case 2:
            {
                slidertext.setText("Administrador");
            }
        }    
    }//GEN-LAST:event_slidernivelStateChanged

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btregistrar.setText("Registrar");
        accion = "registrar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btregistrarActionPerformed
        Ajustes.Modelo.Usuario usuario = new Ajustes.Modelo.Usuario();
        int selecionado = cboemail.getSelectedIndex();
        selecionado = cbotelefono.getSelectedIndex();
        selecionado = cboestado.getSelectedIndex();
        String passw;
        
        usuario.setNombre(txtnombre.getText());
        usuario.setApellido(txtapellido.getText());
        usuario.setUser(txtusuario.getText());
        passw = txtpasword.getText();
        String passEncriptadoMD5 = DigestUtils.md5Hex(passw);
        usuario.setPassw(passEncriptadoMD5);
        usuario.setEmail(txtemail.getText().concat((String)cboemail.getSelectedItem().toString()));
        usuario.setTelefono((String)cbotelefono.getSelectedItem().toString().concat(txttelefono.getText()));
        usuario.setEstado((String)cboestado.getSelectedItem().toString());
        usuario.setNivel_acceso(slidertext.getText());
        
        //Validar campos texto, cambo box etc
        if( cboestado.getSelectedItem().equals("--"))
        {
            val.valEsp(txtnombre);
            val.valEsp(txtapellido);
            val.valEsp(txtusuario);
            val.valEsp(txtpasword);
            val.valEsp(txtemail);
            val.valEsp(cboemail);
            val.valEsp(cbotelefono);
            val.valEsp(txttelefono);
            val.valEsp(cboestado);
        }else
        {
            boolean res= Ajustes.Controlador.Application.onusuario(usuario);
        if( res == true )
        {
            Ajustes.Controlador.Application.showMessageDialog( "El usuario fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
            inhabilitar();}
         else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        }
    }//GEN-LAST:event_btregistrarActionPerformed

    private void txttelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyReleased
        val.digitos(txttelefono, evt);
    }//GEN-LAST:event_txttelefonoKeyReleased

    @Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnuevo;
    private javax.swing.JButton btregistrar;
    private javax.swing.JComboBox<String> cboemail;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cbotelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider slidernivel;
    private javax.swing.JLabel slidertext;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtidpersona;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpasword;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
