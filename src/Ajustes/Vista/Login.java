
package Ajustes.Vista;
/* Main principal del sistema..
    * Fraibert Bracho    
    * Cedula: 22270634
    * Mi primer Systema auditado
    * Derecho reservado 
*/
import Ajustes.Controlador.Validations;
import static Ajustes.Vista.MenuBar.lbapellido;
import static Ajustes.Vista.MenuBar.lbidubicacion;
import static Ajustes.Vista.MenuBar.lbnivel_acceso;
import static Ajustes.Vista.MenuBar.lbnombre;
import static Ajustes.Vista.MenuBar.lbparroquia;
import static Ajustes.Vista.MenuBar.lbparroquia1;
import static Ajustes.Vista.MenuBar.lbusuario;

import static Ajustes.Vista.MainForm.logi;
import java.awt.Graphics;
import org.apache.commons.codec.digest.DigestUtils;



public class Login extends javax.swing.JPanel {
    Ajustes.Modelo.Usuario usuario;
    Ajustes.Modelo.Usuario usuario1;

    private final int loginItemExtraWidth = 30;
    private final int loginItemWidth = 260;
    
    public Login() {
        initComponents();
        
        //Validaciones txtfield y jbutton el campo txtusuario
        Validations Style = new Validations();
        Style.setEgoistStyle_0(txtusuario, 30, 213);
        Style.setEgoistStyle_1(txtusuario, "Usuario");
        Style.setEgoistStyle_2(txtusuario);
        
        //Validaciones txtfield y jbutton el campo txtusuario
        Style.setEgoistStyle_0(txtpasword, 30, 213);
        Style.setEgoistStyle_5(txtpasword, "Contraseña");
        Style.setEgoistStyle_2(txtpasword);
        
        //Validacion jbutton acceder y salir
        Style.setEgoistStyle_4(btnexit);
        Style.setEgoistStyle_3(cboacceder);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cboacceder = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        txtpasword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        twiter = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        computer = new javax.swing.JLabel();
        web = new javax.swing.JLabel();
        internet = new javax.swing.JLabel();
        chrome = new javax.swing.JLabel();
        youtube = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(404, 320));
        setMinimumSize(new java.awt.Dimension(404, 320));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(405, 320));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(255,255,255,75)
        );

        jTextField1.setBackground(new java.awt.Color(255,255,255,75));
        jTextField1.setForeground(new java.awt.Color(255,255,255,75));
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255,255,255,75));
        jTextField1.setDisabledTextColor(new java.awt.Color(255,255,255,75));
        jTextField1.setMinimumSize(new java.awt.Dimension(1, 2));
        jTextField1.setPreferredSize(new java.awt.Dimension(1, 2));

        txtusuario.setBackground(new java.awt.Color( 255, 255, 255, 100 ));
        txtusuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(255, 255, 255));
        txtusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtusuario.setText("Usuario");
        txtusuario.setToolTipText("");
        txtusuario.setBorder(null);
        txtusuario.setNextFocusableComponent(txtpasword);
        txtusuario.setPreferredSize(new java.awt.Dimension(105, 16));

        jLabel1.setBackground(new java.awt.Color(255,255,255,75)
        );
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar sesión");
        jLabel1.setOpaque(true);

        cboacceder.setBackground(new java.awt.Color(255, 255, 255));
        cboacceder.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cboacceder.setForeground(new java.awt.Color(49, 152, 211));
        cboacceder.setText("Iniciar ");
        cboacceder.setBorderPainted(false);
        cboacceder.setContentAreaFilled(false);
        cboacceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboacceder.setOpaque(true);
        cboacceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboaccederActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(255, 255, 255));
        btnexit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnexit.setForeground(new java.awt.Color(49, 152, 211));
        btnexit.setText("Salir");
        btnexit.setBorderPainted(false);
        btnexit.setContentAreaFilled(false);
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnexit.setOpaque(true);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        txtpasword.setBackground(new java.awt.Color( 255, 255, 255, 100 ));
        txtpasword.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txtpasword.setForeground(new java.awt.Color(255, 255, 255));
        txtpasword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpasword.setText("Contraseña");
        txtpasword.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Has olvidado tu contraseña?");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpasword)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboacceder, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtpasword, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboacceder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtusuario.getAccessibleContext().setAccessibleParent(this);

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Facebook.png"))); // NOI18N

        twiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Twiter.png"))); // NOI18N

        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Instagram.png"))); // NOI18N

        computer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Computer.png"))); // NOI18N

        web.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Web.png"))); // NOI18N

        internet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Internet esplorer.png"))); // NOI18N

        chrome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Chrome.png"))); // NOI18N

        youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Youtube.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(computer)
                        .addGap(7, 7, 7)
                        .addComponent(web)
                        .addGap(10, 10, 10)
                        .addComponent(facebook)
                        .addGap(8, 8, 8)
                        .addComponent(twiter)
                        .addGap(8, 8, 8)
                        .addComponent(instagram)
                        .addGap(10, 10, 10)
                        .addComponent(youtube)
                        .addGap(6, 6, 6)
                        .addComponent(internet)
                        .addGap(10, 10, 10)
                        .addComponent(chrome)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(web, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facebook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twiter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instagram, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(youtube, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chrome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void cboaccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboaccederActionPerformed
        usuario = new Ajustes.Modelo.Usuario();
        String passw;
        usuario.setUser(txtusuario.getText());
        passw = txtpasword.getText();
        String passwEncriptadoMD5 = DigestUtils.md5Hex(passw);
        usuario.setPassw(passwEncriptadoMD5);
        
        java.util.ArrayList<Ajustes.Modelo.Usuario> usuarios = Ajustes.Controlador.Application.loadDbItems(usuario, "user", "'" + usuario.getUser() + "'" );

        if( usuarios != null )
        {   
            if( usuarios.size() > 0 && usuarios.get(0).getPassw().equals(usuario.getPassw()))
            {
                Ajustes.Controlador.Application.onloginEvent(usuario);
                Ajustes.Controlador.Application.callInicio();      
                lbusuario.setText(usuario.getUser());
                lbnombre.setText(usuarios.get(0).getNombre());
                lbapellido.setText(usuarios.get(0).getApellido());
                lbnivel_acceso.setText(usuarios.get(0).getNivel_acceso());
                lbparroquia.setText(usuarios.get(0).getEstado());
                lbparroquia1.setText(usuarios.get(0).getEmail());
                lbidubicacion.setText(String.valueOf(usuarios.get(0).getId()));   
                logi.setText(usuarios.get(0).getUser());
                
            }
            else
                Ajustes.Controlador.Application.showMessageDialog( "Usuario no encontrado", "Verifique la combinación Usuario/Contraseña", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
        }
        else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_cboaccederActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Ajustes.Controlador.Application.showMessageDialog( "Por favor, introduce tu nombre de usuario", "Recibirás un mensaje de correo electrónico con instucciones del restablecimiento de tu contraseña", 1, new String[]{"Aceptar"}, new String[]{"close"} );
    }//GEN-LAST:event_jLabel7MouseClicked

    @Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton cboacceder;
    private javax.swing.JLabel chrome;
    private javax.swing.JLabel computer;
    private javax.swing.JLabel facebook;
    private javax.swing.JLabel instagram;
    private javax.swing.JLabel internet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel twiter;
    private javax.swing.JPasswordField txtpasword;
    private javax.swing.JTextField txtusuario;
    private javax.swing.JLabel web;
    private javax.swing.JLabel youtube;
    // End of variables declaration//GEN-END:variables

}
