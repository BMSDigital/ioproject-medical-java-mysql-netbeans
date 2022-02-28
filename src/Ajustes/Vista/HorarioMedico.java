/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajustes.Vista;

import Ajustes.Modelo.Doctores;

/**
 *
 * @author Fraibert Bracho
 */
public class HorarioMedico extends javax.swing.JPanel {

    /**
     * Creates new form HorarioMedico
     */
    public HorarioMedico() {
        initComponents();
    }
    Ajustes.Modelo.Doctores doctores;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_categoria = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        txtmodelo = new javax.swing.JTextField();
        txtserial = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        areacedula2 = new javax.swing.JComboBox<>();
        txtcedula2 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        areacorreo = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblCedula49 = new javax.swing.JLabel();
        atributostxt1 = new javax.swing.JComboBox();
        valorestxt1 = new javax.swing.JComboBox();
        lblCedula50 = new javax.swing.JLabel();
        previous1 = new javax.swing.JButton();
        nextbtn1 = new javax.swing.JButton();
        actualizarbtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(33,116,162,30));
        setMaximumSize(new java.awt.Dimension(890, 522));
        setMinimumSize(new java.awt.Dimension(890, 522));
        setPreferredSize(new java.awt.Dimension(890, 522));

        panel_categoria.setBackground(new java.awt.Color(33,116,162,30));
        panel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Agenda Médica", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Lunes");
        jRadioButton1.setOpaque(false);

        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Martes");
        jRadioButton2.setOpaque(false);

        jRadioButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Miércoles");
        jRadioButton3.setOpaque(false);

        jRadioButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Jueves");
        jRadioButton4.setOpaque(false);

        jRadioButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Viernes");
        jRadioButton5.setOpaque(false);

        jRadioButton6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Sábado");
        jRadioButton6.setOpaque(false);

        jRadioButton7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Domingo");
        jRadioButton7.setOpaque(false);

        jRadioButton8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Mañana");
        jRadioButton8.setOpaque(false);

        jRadioButton9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Mañana");
        jRadioButton9.setOpaque(false);

        jRadioButton10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Mañana");
        jRadioButton10.setOpaque(false);

        jRadioButton11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("Mañana");
        jRadioButton11.setOpaque(false);

        jRadioButton12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("Mañana");
        jRadioButton12.setOpaque(false);

        jRadioButton13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setText("Mañana");
        jRadioButton13.setOpaque(false);

        jRadioButton14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton14.setText("Mañana");
        jRadioButton14.setOpaque(false);

        jRadioButton15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton15.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton15.setText("Tarde");
        jRadioButton15.setOpaque(false);

        jRadioButton16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton16.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton16.setText("Tarde");
        jRadioButton16.setOpaque(false);

        jRadioButton17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton17.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton17.setText("Tarde");
        jRadioButton17.setOpaque(false);

        jRadioButton18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton18.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton18.setText("Tarde");
        jRadioButton18.setOpaque(false);

        jRadioButton19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton19.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton19.setText("Tarde");
        jRadioButton19.setOpaque(false);

        jRadioButton20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton20.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton20.setText("Tarde");
        jRadioButton20.setOpaque(false);

        jRadioButton21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton21.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton21.setText("Tarde");
        jRadioButton21.setOpaque(false);

        txtmodelo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtmodelo.setPreferredSize(new java.awt.Dimension(6, 22));

        txtserial.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtserial.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("<html><center><p>APELLIDO</p></html>");

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html><center><p>NOMBRE</p></html>");

        cboestado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Nuevo", "Bueno", "Usado", "Dañado" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html><center><p>ESPECIALIDAD</p></html>");

        areacedula2.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areacedula2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        areacedula2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areacedula2.setOpaque(false);

        txtcedula2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcedula2.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel50.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("<html><center><p>TELËFONO</p></html>");

        txtcorreo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        areacorreo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areacorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        areacorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areacorreo.setOpaque(false);

        jLabel37.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("<html><center><p>CORREO ELECTRONICO</p></html>");

        javax.swing.GroupLayout panel_categoriaLayout = new javax.swing.GroupLayout(panel_categoria);
        panel_categoria.setLayout(panel_categoriaLayout);
        panel_categoriaLayout.setHorizontalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7))
                .addGap(18, 18, 18)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addGap(33, 33, 33)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton15))
                .addGap(86, 86, 86)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(areacedula2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areacorreo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_categoriaLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtserial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboestado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        panel_categoriaLayout.setVerticalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_categoriaLayout.createSequentialGroup()
                            .addComponent(jRadioButton8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton14))
                        .addGroup(panel_categoriaLayout.createSequentialGroup()
                            .addComponent(jRadioButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton7)))
                    .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_categoriaLayout.createSequentialGroup()
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_categoriaLayout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_categoriaLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(areacorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(areacedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_categoriaLayout.createSequentialGroup()
                            .addComponent(jRadioButton21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton15))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color( 255, 255, 255, 10 ));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Consultas del Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setDoubleBuffered(false);

        lblCedula49.setBackground(new java.awt.Color( 255, 255, 255, 25 ));
        lblCedula49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula49.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula49.setText("Atributo");
        lblCedula49.setOpaque(true);

        atributostxt1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        atributostxt1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Evento", "Resultado" }));
        atributostxt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        atributostxt1.setDoubleBuffered(true);
        atributostxt1.setOpaque(false);

        valorestxt1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        valorestxt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        valorestxt1.setDoubleBuffered(true);
        valorestxt1.setOpaque(false);

        lblCedula50.setBackground(new java.awt.Color( 255, 255, 255, 25 ));
        lblCedula50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula50.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula50.setText("Valor");
        lblCedula50.setOpaque(true);

        previous1.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        previous1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        previous1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/previous.png"))); // NOI18N
        previous1.setText("Anterior");
        previous1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        previous1.setContentAreaFilled(false);
        previous1.setOpaque(true);
        previous1.setPreferredSize(new java.awt.Dimension(100, 25));
        previous1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                previous1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                previous1MouseEntered(evt);
            }
        });
        previous1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previous1ActionPerformed(evt);
            }
        });

        nextbtn1.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        nextbtn1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nextbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/next.png"))); // NOI18N
        nextbtn1.setText("Buscar");
        nextbtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        nextbtn1.setContentAreaFilled(false);
        nextbtn1.setMaximumSize(new java.awt.Dimension(65, 19));
        nextbtn1.setMinimumSize(new java.awt.Dimension(65, 19));
        nextbtn1.setOpaque(true);
        nextbtn1.setPreferredSize(new java.awt.Dimension(100, 25));
        nextbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextbtn1MouseExited(evt);
            }
        });

        actualizarbtn1.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        actualizarbtn1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        actualizarbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/reload.png"))); // NOI18N
        actualizarbtn1.setText("Actualizar");
        actualizarbtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        actualizarbtn1.setContentAreaFilled(false);
        actualizarbtn1.setOpaque(true);
        actualizarbtn1.setPreferredSize(new java.awt.Dimension(100, 25));
        actualizarbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarbtn1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarbtn1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(actualizarbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(previous1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblCedula49, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(atributostxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblCedula50, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(valorestxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(nextbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula49, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atributostxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorestxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula50, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previous1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void previous1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous1MouseEntered
        previous1.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_previous1MouseEntered

    private void previous1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous1MouseExited
        previous1.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_previous1MouseExited

    private void previous1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous1ActionPerformed
       
    }//GEN-LAST:event_previous1ActionPerformed

    private void nextbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbtn1MouseExited
        nextbtn1.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_nextbtn1MouseExited

    private void actualizarbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtn1MouseEntered

    private void actualizarbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtn1MouseExited
   public Doctores getDoctores()
    {
        return doctores;
    }
    public void setDoctores(Doctores doctores)
    {
        this.doctores = doctores;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarbtn1;
    private javax.swing.JComboBox<String> areacedula2;
    private javax.swing.JComboBox<String> areacorreo;
    private javax.swing.JComboBox atributostxt1;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel lblCedula49;
    private javax.swing.JLabel lblCedula50;
    private javax.swing.JButton nextbtn1;
    private javax.swing.JPanel panel_categoria;
    private javax.swing.JButton previous1;
    private javax.swing.JTextField txtcedula2;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtserial;
    private javax.swing.JComboBox valorestxt1;
    // End of variables declaration//GEN-END:variables

}
