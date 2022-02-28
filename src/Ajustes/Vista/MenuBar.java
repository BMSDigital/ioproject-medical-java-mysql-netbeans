
package Ajustes.Vista;

import Ajustes.Controlador.Validations;
import java.awt.Graphics;

public class MenuBar extends javax.swing.JPanel
{

    
    public MenuBar()
    {
        initComponents();
        //Validaciones txtfield y jbutton el campo txtusuario
          Validations Style = new Validations();
        
        //Validacion jbutton acceder y salir
          Style.setEgoistStyle_3(cboacceder1);
          
    }
    static private Ajustes.Vista.MainForm screen;
    
    
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbnivel_acceso = new javax.swing.JLabel();
        lbparroquia = new javax.swing.JLabel();
        lbidubicacion = new javax.swing.JLabel();
        lbnombre = new javax.swing.JLabel();
        lbapellido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbusuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbparroquia1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboacceder1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 460));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(768, 500));

        jLabel1.setBackground(new java.awt.Color(255,255,255,75));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACCESO CON PRIVELEGIO ");

        jLabel3.setBackground(new java.awt.Color(255,255,255,75));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cambiar contraseña");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255,255,255,75));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cerrar sesión");

        lbnivel_acceso.setBackground(new java.awt.Color(255,255,255,75));
        lbnivel_acceso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbnivel_acceso.setForeground(new java.awt.Color(255, 255, 255));
        lbnivel_acceso.setText("jLabel4");

        lbparroquia.setBackground(new java.awt.Color(255,255,255,75));
        lbparroquia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbparroquia.setForeground(new java.awt.Color(255, 255, 255));
        lbparroquia.setText("jLabel5");

        lbidubicacion.setBackground(new java.awt.Color(255,255,255,75));
        lbidubicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbidubicacion.setForeground(new java.awt.Color(255, 255, 255));
        lbidubicacion.setText("jLabel1");

        lbnombre.setBackground(new java.awt.Color(255,255,255,75));
        lbnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(255, 255, 255));
        lbnombre.setText("jLabel2");

        lbapellido.setBackground(new java.awt.Color(255,255,255,75));
        lbapellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbapellido.setForeground(new java.awt.Color(255, 255, 255));
        lbapellido.setText("jLabel3");

        jLabel6.setBackground(new java.awt.Color(255,255,255,75));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bienvenido");

        jLabel5.setBackground(new java.awt.Color(255,255,255,75));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID-000");

        lbusuario.setBackground(new java.awt.Color(255,255,255,75));
        lbusuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbusuario.setForeground(new java.awt.Color(255, 255, 255));
        lbusuario.setText("jLabel6");

        jLabel7.setBackground(new java.awt.Color(255,255,255,75));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hola,");

        jLabel2.setBackground(new java.awt.Color(255,255,255,75));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Perfil");

        jLabel8.setBackground(new java.awt.Color(255,255,255,75));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre: ");

        jLabel9.setBackground(new java.awt.Color(255,255,255,75));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido:");

        jLabel10.setBackground(new java.awt.Color(255,255,255,75));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Acceso:");

        jLabel11.setBackground(new java.awt.Color(255,255,255,75));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado:");

        lbparroquia1.setBackground(new java.awt.Color(255,255,255,75));
        lbparroquia1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbparroquia1.setForeground(new java.awt.Color(255, 255, 255));
        lbparroquia1.setText("jLabel5");

        jLabel12.setBackground(new java.awt.Color(255,255,255,75));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");

        cboacceder1.setBackground(new java.awt.Color(45, 164, 134));
        cboacceder1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cboacceder1.setForeground(new java.awt.Color(255, 255, 255));
        cboacceder1.setText("Iniciar ");
        cboacceder1.setBorderPainted(false);
        cboacceder1.setContentAreaFilled(false);
        cboacceder1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboacceder1.setOpaque(true);
        cboacceder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboacceder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(lbidubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(14, 14, 14)
                        .addComponent(lbnivel_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbparroquia, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbparroquia1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboacceder1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(295, 295, 295))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbidubicacion)
                    .addComponent(jLabel7)
                    .addComponent(lbusuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbapellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lbnivel_acceso))))
                .addGap(9, 9, 9)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cboacceder1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbparroquia)
                    .addComponent(jLabel12)
                    .addComponent(lbparroquia1))
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cboacceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboacceder1ActionPerformed
         Ajustes.Controlador.Application.callMainOption(new Menu_Modulos());
    }//GEN-LAST:event_cboacceder1ActionPerformed
@Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cboacceder1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel lbapellido;
    public static javax.swing.JLabel lbidubicacion;
    public static javax.swing.JLabel lbnivel_acceso;
    public static javax.swing.JLabel lbnombre;
    public static javax.swing.JLabel lbparroquia;
    public static javax.swing.JLabel lbparroquia1;
    public static javax.swing.JLabel lbusuario;
    // End of variables declaration//GEN-END:variables
}
