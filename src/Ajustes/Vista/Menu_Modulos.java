package Ajustes.Vista;
import Egoist.Swing.Animator;
import Ajustes.Controlador.Validations;
import java.awt.Graphics;

/**
 *
 * @author Fraibert Bracho
 */
public class Menu_Modulos extends javax.swing.JPanel {
boolean boletos_der, boletos_iz,redes_sociales;
    /**
     * Creates new form Menu
     */
    public Menu_Modulos() {
        initComponents();
        
        lbusuario2.setText(MainForm.logi.getText());
        //Validaciones txtfield y jbutton el campo txtusuario
        Validations Style = new Validations();
        //Validacion jbutton acceder y salir
        
        Style.setEgoistStyle_3(bt1);
        Style.setEgoistStyle_3(bt2);
        Style.setEgoistStyle_3(bt3);
        Style.setEgoistStyle_3(bt4);
        Style.setEgoistStyle_3(bt5);
        Style.setEgoistStyle_3(bt6);
        Style.setEgoistStyle_3(bt7);
        Style.setEgoistStyle_3(bt8);
        Style.setEgoistStyle_3(bt9);
        Style.setEgoistStyle_3(bt11);
        Style.setEgoistStyle_3(bt12);
        Style.setEgoistStyle_3(bt13);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btusuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbusuario2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btusuario1 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt11 = new javax.swing.JButton();
        bt12 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        bt13 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 616));
        setMinimumSize(new java.awt.Dimension(1000, 616));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 616));
        setLayout(null);

        btusuario.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        btusuario.setForeground(new java.awt.Color(255, 255, 255));
        btusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/user_30px.png"))); // NOI18N
        btusuario.setBorder(null);
        btusuario.setBorderPainted(false);
        btusuario.setContentAreaFilled(false);
        btusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btusuario.setFocusPainted(false);
        add(btusuario);
        btusuario.setBounds(70, 20, 41, 30);

        jLabel7.setBackground(new java.awt.Color(255,255,255,75));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hola,");
        add(jLabel7);
        jLabel7.setBounds(120, 40, 31, 15);

        lbusuario2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbusuario2.setForeground(new java.awt.Color(255, 255, 255));
        lbusuario2.setText("Usuario");
        add(lbusuario2);
        lbusuario2.setBounds(150, 40, 80, 15);

        jLabel4.setBackground(new java.awt.Color(255,255,255,75));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cerrar sesión");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel4);
        jLabel4.setBounds(120, 60, 69, 15);

        btusuario1.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        btusuario1.setForeground(new java.awt.Color(255, 255, 255));
        btusuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/exit_25px.png"))); // NOI18N
        btusuario1.setBorder(null);
        btusuario1.setBorderPainted(false);
        btusuario1.setContentAreaFilled(false);
        btusuario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btusuario1.setFocusPainted(false);
        add(btusuario1);
        btusuario1.setBounds(70, 50, 41, 25);

        bt1.setBackground(new java.awt.Color(45, 121, 167));
        bt1.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 255));
        bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/stethoscope_80px.png"))); // NOI18N
        bt1.setText("<html><center><p>Pacientes</p></html>");
        bt1.setBorderPainted(false);
        bt1.setContentAreaFilled(false);
        bt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt1.setOpaque(true);
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        add(bt1);
        bt1.setBounds(80, 90, 195, 150);

        bt4.setBackground(new java.awt.Color(45, 121, 167));
        bt4.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        bt4.setForeground(new java.awt.Color(255, 255, 255));
        bt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_treatment_80px_3.png"))); // NOI18N
        bt4.setText("<html><center><p>Historia Medica</p></html>");
        bt4.setBorderPainted(false);
        bt4.setContentAreaFilled(false);
        bt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt4.setOpaque(true);
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        add(bt4);
        bt4.setBounds(290, 90, 195, 150);

        bt7.setBackground(new java.awt.Color(45, 121, 167));
        bt7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bt7.setForeground(new java.awt.Color(255, 255, 255));
        bt7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_shopping_bag_80px.png"))); // NOI18N
        bt7.setText("<html><center><p>Compras</p></html>");
        bt7.setBorderPainted(false);
        bt7.setContentAreaFilled(false);
        bt7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt7.setOpaque(true);
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        add(bt7);
        bt7.setBounds(500, 90, 195, 150);

        bt11.setBackground(new java.awt.Color(45, 121, 167));
        bt11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bt11.setForeground(new java.awt.Color(255, 255, 255));
        bt11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_security_specialist_male_70px.png"))); // NOI18N
        bt11.setText("<html><center><p> Proveedor</p></html>");
        bt11.setBorderPainted(false);
        bt11.setContentAreaFilled(false);
        bt11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt11.setOpaque(true);
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });
        add(bt11);
        bt11.setBounds(710, 90, 195, 150);

        bt12.setBackground(new java.awt.Color(45, 121, 167));
        bt12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bt12.setForeground(new java.awt.Color(255, 255, 255));
        bt12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/doctor.png"))); // NOI18N
        bt12.setText("<html><center><p>Medico</p></html>");
        bt12.setBorderPainted(false);
        bt12.setContentAreaFilled(false);
        bt12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt12.setOpaque(true);
        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });
        add(bt12);
        bt12.setBounds(710, 250, 195, 150);

        bt8.setBackground(new java.awt.Color(45, 121, 167));
        bt8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bt8.setForeground(new java.awt.Color(255, 255, 255));
        bt8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_edit_file_70px.png"))); // NOI18N
        bt8.setText("<html><center><p>Inventario</p></html>");
        bt8.setBorderPainted(false);
        bt8.setContentAreaFilled(false);
        bt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt8.setOpaque(true);
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        add(bt8);
        bt8.setBounds(500, 250, 195, 150);

        bt5.setBackground(new java.awt.Color(45, 121, 167));
        bt5.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        bt5.setForeground(new java.awt.Color(255, 255, 255));
        bt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_add_80px.png"))); // NOI18N
        bt5.setText("<html><center><p>Consulta Medica</p></html>");
        bt5.setBorderPainted(false);
        bt5.setContentAreaFilled(false);
        bt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt5.setOpaque(true);
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        add(bt5);
        bt5.setBounds(290, 250, 195, 150);

        bt2.setBackground(new java.awt.Color(45, 121, 167));
        bt2.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 255, 255));
        bt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_schedule_80px_3.png"))); // NOI18N
        bt2.setText("<html><center><p>Agendar Citas</p></html>");
        bt2.setBorderPainted(false);
        bt2.setContentAreaFilled(false);
        bt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt2.setOpaque(true);
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        add(bt2);
        bt2.setBounds(80, 250, 195, 150);

        bt3.setBackground(new java.awt.Color(45, 121, 167));
        bt3.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        bt3.setForeground(new java.awt.Color(255, 255, 255));
        bt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_receipt_80px_1.png"))); // NOI18N
        bt3.setText("<html><center><p>Pago Servicios</p></html>");
        bt3.setBorderPainted(false);
        bt3.setContentAreaFilled(false);
        bt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt3.setOpaque(true);
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        add(bt3);
        bt3.setBounds(80, 410, 195, 150);

        bt6.setBackground(new java.awt.Color(45, 121, 167));
        bt6.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        bt6.setForeground(new java.awt.Color(255, 255, 255));
        bt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_payment_history_80px_1.png"))); // NOI18N
        bt6.setText("<html><center><p>Honorarios</sp></html>");
        bt6.setBorderPainted(false);
        bt6.setContentAreaFilled(false);
        bt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt6.setOpaque(true);
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        add(bt6);
        bt6.setBounds(290, 410, 195, 150);

        bt9.setBackground(new java.awt.Color(45, 121, 167));
        bt9.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        bt9.setForeground(new java.awt.Color(255, 255, 255));
        bt9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/icons8_sales_performance_80px.png"))); // NOI18N
        bt9.setText("<html><center><p>Ventas</sp></html>");
        bt9.setBorderPainted(false);
        bt9.setContentAreaFilled(false);
        bt9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt9.setOpaque(true);
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        add(bt9);
        bt9.setBounds(500, 410, 195, 150);

        bt13.setBackground(new java.awt.Color(45, 121, 167));
        bt13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        bt13.setForeground(new java.awt.Color(255, 255, 255));
        bt13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/settings_50px.png"))); // NOI18N
        bt13.setText("Configuración");
        bt13.setBorderPainted(false);
        bt13.setContentAreaFilled(false);
        bt13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt13.setOpaque(true);
        bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt13ActionPerformed(evt);
            }
        });
        add(bt13);
        bt13.setBounds(710, 410, 195, 150);
    }// </editor-fold>//GEN-END:initComponents

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new AñadirDoctores());
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Agenda());
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new HorariosMedicos());
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt13ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Historia_Medica());
    }//GEN-LAST:event_bt1ActionPerformed

    @Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt11;
    private javax.swing.JButton bt12;
    private javax.swing.JButton bt13;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btusuario;
    private javax.swing.JButton btusuario1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel lbusuario2;
    // End of variables declaration//GEN-END:variables

}

