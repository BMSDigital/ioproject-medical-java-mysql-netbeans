/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajustes.Vista;

import Ajustes.Controlador.Validations;
import Ajustes.Modelo.Doctores;
import EgoistSwing.Util.AppView;
import EgoistSwing.Util.TextFieldColorOnFocus;
import EgoistSwing.Util.ToolTip;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Fraibert Bracho
 */
public class AñadirDoctores extends javax.swing.JPanel {
    java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Cedula> cedula;
    java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Estado> estado;
    java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Correo> correo;
    java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Telf> telf;
    Ajustes.Modelo.Doctores doctores;
    public AñadirDoctores() {
        initComponents();
        setEgoistStyle();
        cargarCedula();
        cargarEstado();
        cargarCorreo();
        cargarTelefo();
    }

    //validaciones
    Validations val = new Validations();  
    String ruta,nombre;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_categoria = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbompps = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtcolegiomedico = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        areacedula = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdirecion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        previousseccionbtn = new javax.swing.JButton();
        actualizarbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtespecializacion = new javax.swing.JTextField();
        panel_categoria3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        areacorreo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        spncantidad = new javax.swing.JSpinner();
        jLabel52 = new javax.swing.JLabel();
        areatelefono = new javax.swing.JComboBox<>();
        txtelefono = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        nextbtn = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jcdesde = new com.toedter.calendar.JDateChooser();
        jchasta = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(33,116,162,30));
        setMaximumSize(new java.awt.Dimension(890, 622));
        setMinimumSize(new java.awt.Dimension(890, 622));
        setPreferredSize(new java.awt.Dimension(890, 622));
        setRequestFocusEnabled(false);

        panel_categoria.setBackground(new java.awt.Color(33,116,162,30));
        panel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Nuevo Médico", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html><center><p>NOMBRE</p></html>");

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtnombre.setPreferredSize(new java.awt.Dimension(6, 22));
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("<html><center><p>APELLIDO</p></html>");

        txtapellido.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtapellido.setPreferredSize(new java.awt.Dimension(6, 22));
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("<html><center><p>M.P.P.S</p></html>");

        cbompps.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        cbompps.setPreferredSize(new java.awt.Dimension(6, 23));
        cbompps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbomppsKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("<html><center><p>COLEGIO DE MËDICO</p></html>");

        txtcolegiomedico.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcolegiomedico.setPreferredSize(new java.awt.Dimension(6, 23));
        txtcolegiomedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcolegiomedicoKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html><center><p>LUGAR DE NACIMIENTO</p></html>");

        cboestado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Nuevo", "Bueno", "Usado", "Dañado" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);

        areacedula.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areacedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        areacedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areacedula.setOpaque(false);

        jLabel46.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("<html><center><p>CEDULA</p></html>");

        txtcedula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcedula.setPreferredSize(new java.awt.Dimension(6, 22));
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("<html><center><p>DIRECIÖN</p></html>");

        txtdirecion.setColumns(20);
        txtdirecion.setRows(5);
        txtdirecion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdirecionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtdirecion);

        previousseccionbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        previousseccionbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        previousseccionbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/cancel.png"))); // NOI18N
        previousseccionbtn.setText("Cancelar");
        previousseccionbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        previousseccionbtn.setContentAreaFilled(false);
        previousseccionbtn.setOpaque(true);
        previousseccionbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        previousseccionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                previousseccionbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                previousseccionbtnMouseExited(evt);
            }
        });
        previousseccionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousseccionbtnActionPerformed(evt);
            }
        });

        actualizarbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        actualizarbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        actualizarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/reload.png"))); // NOI18N
        actualizarbtn.setText("Actualizar");
        actualizarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        actualizarbtn.setContentAreaFilled(false);
        actualizarbtn.setOpaque(true);
        actualizarbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        actualizarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarbtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarbtnMouseEntered(evt);
            }
        });
        actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarbtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<html><center><p>ESPECIALIZACIÖN</p></html>");

        txtespecializacion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtespecializacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtespecializacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_categoriaLayout = new javax.swing.GroupLayout(panel_categoria);
        panel_categoria.setLayout(panel_categoriaLayout);
        panel_categoriaLayout.setHorizontalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(previousseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator2))
                .addGap(27, 27, 27))
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel_categoriaLayout.createSequentialGroup()
                            .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_categoriaLayout.createSequentialGroup()
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoriaLayout.createSequentialGroup()
                            .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_categoriaLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtcolegiomedico, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2))
                        .addGroup(panel_categoriaLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(238, 238, 238))
                        .addComponent(txtespecializacion))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(areacedula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbompps, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel_categoriaLayout.setVerticalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtespecializacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areacedula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbompps, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtcolegiomedico, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        panel_categoria3.setBackground(new java.awt.Color(33,116,162,30));
        panel_categoria3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Datos Personales", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("<html><center><p>CORREO ELECTRONICO</p></html>");

        txtcorreo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });

        areacorreo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areacorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        areacorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areacorreo.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(51,51,51,100));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Consulta médica:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);

        spncantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 40, 1));

        jLabel52.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("<html><center><p>LIMITE DE CITAS</p></html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        areatelefono.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areatelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        areatelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areatelefono.setOpaque(false);

        txtelefono.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtelefono.setPreferredSize(new java.awt.Dimension(6, 22));
        txtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtelefonoKeyTyped(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("<html><center><p>TELËFONO</p></html>");

        nextbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        nextbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nextbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/next.png"))); // NOI18N
        nextbtn.setText("Siguiente");
        nextbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        nextbtn.setContentAreaFilled(false);
        nextbtn.setOpaque(true);
        nextbtn.setPreferredSize(new java.awt.Dimension(100, 25));

        finalizar.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        finalizar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/complete.png"))); // NOI18N
        finalizar.setText("Guardar");
        finalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        finalizar.setContentAreaFilled(false);
        finalizar.setOpaque(true);
        finalizar.setPreferredSize(new java.awt.Dimension(100, 25));
        finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finalizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finalizarMouseEntered(evt);
            }
        });
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(51,51,51,100));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Ausencia médica:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setOpaque(false);

        jLabel56.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("<html><center><p>DESDE</p></html>");

        jLabel57.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("<html><center><p>HASTA</p></html>");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jcdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jchasta, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jchasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_categoria3Layout = new javax.swing.GroupLayout(panel_categoria3);
        panel_categoria3.setLayout(panel_categoria3Layout);
        panel_categoria3Layout.setHorizontalGroup(
            panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoria3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoria3Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_categoria3Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_categoria3Layout.createSequentialGroup()
                        .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(areatelefono, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(areacorreo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                    .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_categoria3Layout.setVerticalGroup(
            panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoria3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areacorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areatelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panel_categoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_categoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar(){
   txtcedula.setText("");
   txtnombre.setText("");
   txtapellido.setText("");
   txtespecializacion.setText("");
   txtcorreo.setText("");
   areacedula.setSelectedIndex(0);
   txtcedula.setText("");
   cbompps.setText("");
   txtcolegiomedico.setText("");
   txtdirecion.setText("");
   txtcorreo.setText("");
   txtelefono.setText("");
   txtelefono.setText("");
   areacedula.setSelectedIndex(0);
   areacorreo.setSelectedIndex(0);
   areatelefono.setSelectedIndex(0);
   jcdesde.setDate(null);
   jchasta.setDate(null);
   
   cboestado.setSelectedIndex(0);
   areacorreo.setSelectedIndex(0);
   areatelefono.setSelectedIndex(0);
   
   spncantidad.setValue(0);
       
    }
    
    public void cargarCedula()
    {
        cedula = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Cedula());
        if( cedula != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Cedula c : cedula)
                ((DefaultComboBoxModel)model).addElement(c.getCedula());

            areacedula.setModel(model);
        }
    }
    
    public void cargarEstado()
    {
        estado = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Estado());
        if( estado != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Estado c : estado)
                ((DefaultComboBoxModel)model).addElement(c.getEstado());

            cboestado.setModel(model);
        }
    }
    
    public void cargarCorreo()
    {
        correo = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Correo());
        if( correo != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Correo c : correo)
                ((DefaultComboBoxModel)model).addElement(c.getCorreo());

            areacorreo.setModel(model);
        }
    }
    
    public void cargarTelefo()
    {
        telf = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Telf());
        if( telf != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Telf c : telf)
                ((DefaultComboBoxModel)model).addElement(c.getTelf());

            areatelefono.setModel(model);
        }
    }
    
    Color colorA=new Color(255,255,255,255);
    Color colorB=new Color(255,255,255,100);
    Color foregroundA=new Color(49,152,211);
    Color foregroundB=new Color(255,255,255);
    
    public void setEgoistStyle(){   
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcedula, "<html><left>Introduzca la cedula del paciente, la primera letra en mayúscula.</left></html>",300)).build();
        //(new ToolTip(AppView.loadImage("tooltip.png"),txtnombre, "<html><left>Introduzca el nombre del paciente, la primera letra en mayúscula.</left></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtapellido, "<html><lef>Introduzca el apellido del paciente, la primera letra en mayúscula.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtespecializacion, "<html><lef>Introduzca la especializacion medica, la primera letra en mayúscula.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcolegiomedico, "<html><lef>Introduzca el colegio de medico, la primera letra en mayúscula.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),cbompps, "<html><lef>Introduzca el Ministerio del Poder Popular para la Salud, la primera letra en mayúscula.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtdirecion, "<html><lef>Introduzca la dirección del paciente, la primera letra en mayúscula.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcorreo, "<html><lef>Introduzca el correo electronico del paciente.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtelefono,"<html><lef>Introduzca el numero de telefono del representante en caso de emergencia</lef></html>",300)).build();
        
        
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcedula)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtnombre)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtapellido)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcorreo)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtespecializacion)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,cbompps)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcolegiomedico)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcorreo)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtelefono)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtelefono)).build();
        
    }
    private void previousseccionbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousseccionbtnMouseEntered
        previousseccionbtn.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_previousseccionbtnMouseEntered

    private void previousseccionbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousseccionbtnMouseExited
        previousseccionbtn.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_previousseccionbtnMouseExited

    private void actualizarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtnMouseEntered

    private void actualizarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtnMouseExited

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
         Ajustes.Modelo.Doctores doctores = new Ajustes.Modelo.Doctores();

        //Ingresar campo de texto especialidad
        doctores.setEspecializacion(txtespecializacion.getText());
        //Ingresar campo de texto nombre
        doctores.setNombre(txtnombre.getText());
        //Ingresar campo de texto apellido
        doctores.setApellido(txtapellido.getText());
        //Ingresar campo de texto cedula
        doctores.setCedula(txtcedula.getText());
        //Ingresar combobox cedula
        int selecionado = areacedula.getSelectedIndex();
        doctores.setAreacedula((String)areacedula.getItemAt(selecionado));
        //Ingresar campo de texto mpps
        doctores.setMpps(cbompps.getText());
        //Ingresar campo de texto mpps
        doctores.setCodigo_medico(txtcolegiomedico.getText());
        //Ingresar combobox estado
        selecionado = cboestado.getSelectedIndex();
        doctores.setLugar_nacimiento((String)cboestado.getItemAt(selecionado));
        //Ingresar campo de texto direcion
        doctores.setDireccion(txtdirecion.getText());
        //Ingresar campo de texto correo
        doctores.setCorreo(txtcorreo.getText());
        //Ingresar combobox correo
        selecionado = areacorreo.getSelectedIndex();
        doctores.setAreacorreo((String)areacorreo.getItemAt(selecionado));
        //Ingresar combobox area telefono
        selecionado = areatelefono.getSelectedIndex();
        doctores.setAreatelefono((String)areatelefono.getItemAt(selecionado));
        //Ingresar campo de texo telefono
        doctores.setTelefono(txtelefono.getText());
        //Ingresar campo de texo spi
        doctores.setCantidad_citas(spncantidad.getValue().toString());
        
        //Ingresar Jcalendar desde
        String selectdate_1 = ((JTextField)jcdesde.getDateEditor().getUiComponent()).getText();
        doctores.setFecha_desde(selectdate_1);
        
        //Ingresar Jcalendar desde
        String selectdate_2 = ((JTextField)jchasta.getDateEditor().getUiComponent()).getText();
        doctores.setFecha_hasta(selectdate_2);
        
        //Validar campos texto, cambo box etc
        if( jchasta.getDate()== null)
        {
            val.valEsp(txtespecializacion);
            val.valEsp(txtnombre);
            val.valEsp(txtapellido);
            val.valEsp(areacedula);
            val.valEsp(txtcedula);
            val.valEsp(cbompps);
            val.valEsp(txtcolegiomedico);
            val.valEsp(cboestado);
            val.valEsp(txtdirecion);
            val.valEsp(txtcorreo);
            val.valEsp(areacorreo);
            val.valEsp(areatelefono);
            val.valEsp(txtelefono);
            val.valEsp4(jcdesde);
            val.valEsp4(jchasta);
            val.valEsp7(spncantidad);
            
        }else
        {
            boolean res= Ajustes.Controlador.Application.ondoctores(doctores);
            if( res == true )
            {
                Ajustes.Controlador.Application.showMessageDialog( "El medico fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
                
                /* Se pregunta si se desea registrar el horario del profesor */
            int resp = Ajustes.Controlador.Application.showMessageDialog("Registrar horario", "¿Desea registrar el horario del medico ahora?", 2, new String[]
            {
                "Tal vez más tarde", "Aceptar"
            }, new String[]
            {
                "cancel", "accept"
            });
            if( resp == 2 )
            {
                 HorariosMedicos o = new  HorariosMedicos();
                 o.setDoctores(doctores);
                 Ajustes.Controlador.Application.callMainOption(o);
                
                
            }
            else
            {
                Ajustes.Controlador.Application.callInicio();
            }
            }
            
            else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        }
    }//GEN-LAST:event_finalizarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtnombre, evt, 24);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtapellido, evt, 24);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtespecializacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtespecializacionKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtespecializacion, evt, 24);
    }//GEN-LAST:event_txtespecializacionKeyTyped

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        val.teclasEspeciales(evt, txtcedula);
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        val.digitos(txtcedula, evt);
        val.espacioMaximo(txtcedula, evt, 9);
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtcolegiomedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcolegiomedicoKeyTyped
        val.digitos(txtcolegiomedico, evt);
        val.espacioMaximo(txtcolegiomedico, evt, 9);
    }//GEN-LAST:event_txtcolegiomedicoKeyTyped

    private void cbomppsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbomppsKeyTyped
        val.digitos(cbompps, evt);
        val.espacioMaximo(cbompps, evt, 9);
    }//GEN-LAST:event_cbomppsKeyTyped

    private void txtdirecionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdirecionKeyTyped
       val.espacioMaximo(txtdirecion, evt, 50);
    }//GEN-LAST:event_txtdirecionKeyTyped

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        val.espacioMaximo(txtcorreo, evt, 24);
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void txtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelefonoKeyTyped
       val.digitos(txtelefono, evt);
        val.espacioMaximo(txtelefono, evt, 7);
    }//GEN-LAST:event_txtelefonoKeyTyped

    private void txtelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelefonoKeyPressed
        val.teclasEspeciales(evt, txtelefono);
    }//GEN-LAST:event_txtelefonoKeyPressed

    private void previousseccionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousseccionbtnActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Menu_Modulos());
    }//GEN-LAST:event_previousseccionbtnActionPerformed

    private void finalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseEntered
        finalizar.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_finalizarMouseEntered

    private void finalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseExited
         finalizar.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_finalizarMouseExited

    private void actualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarbtnActionPerformed
        limpiar();
    }//GEN-LAST:event_actualizarbtnActionPerformed
    
        public Doctores getDoctores()
    {
        return doctores;
    }
    public void setDoctores(Doctores doctores)
    {
        this.doctores = doctores;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarbtn;
    private javax.swing.JComboBox<String> areacedula;
    private javax.swing.JComboBox<String> areacorreo;
    private javax.swing.JComboBox<String> areatelefono;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JTextField cbompps;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jcdesde;
    private com.toedter.calendar.JDateChooser jchasta;
    private javax.swing.JButton nextbtn;
    private javax.swing.JPanel panel_categoria;
    private javax.swing.JPanel panel_categoria3;
    private javax.swing.JButton previousseccionbtn;
    private javax.swing.JSpinner spncantidad;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcolegiomedico;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextArea txtdirecion;
    private javax.swing.JTextField txtelefono;
    private javax.swing.JTextField txtespecializacion;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
