/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajustes.Vista;

import Ajustes.Controlador.Validations;
import java.awt.Graphics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Fraibert Bracho
 */
public class AgendarPaciente extends javax.swing.JPanel {
    java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Consulta> consulta;
    
    
    public AgendarPaciente() {
        initComponents();
        cargarConsulta();
        inHabilitar();
        aceptarbtn1.setEnabled(false);
    }
     Ajustes.Modelo.Paciente paciente;
     Validations val = new Validations();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalizar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        nextmateriabtn = new javax.swing.JButton();
        previousseccionbtn = new javax.swing.JButton();
        nextseccionbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        semestretxt = new javax.swing.JComboBox();
        carreratxt = new javax.swing.JComboBox();
        lblCedula43 = new javax.swing.JLabel();
        lblCedula44 = new javax.swing.JLabel();
        lblCedula46 = new javax.swing.JLabel();
        turnotxt = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        horariotbl = new javax.swing.JTable();
        delinfo = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblCedula89 = new javax.swing.JLabel();
        lblCedula90 = new javax.swing.JLabel();
        lblCedula91 = new javax.swing.JLabel();
        tipo_paciente = new javax.swing.JLabel();
        lbnombre_completo = new javax.swing.JLabel();
        fecha_nacimiento = new javax.swing.JLabel();
        lblCedula92 = new javax.swing.JLabel();
        lugar_nacimiento = new javax.swing.JLabel();
        previousmateriabtn = new javax.swing.JButton();
        aceptarbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        combobusqueda2 = new javax.swing.JComboBox();
        txtbuscar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        actualizarbtn = new javax.swing.JButton();
        aceptarbtn1 = new javax.swing.JButton();
        btbuscar = new javax.swing.JButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(33,116,162,0));
        setDoubleBuffered(false);
        setMaximumSize(new java.awt.Dimension(949, 622));
        setPreferredSize(new java.awt.Dimension(949, 622));

        finalizar.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        finalizar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/finish.png"))); // NOI18N
        finalizar.setText("Finalizar");
        finalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        finalizar.setContentAreaFilled(false);
        finalizar.setOpaque(true);
        finalizar.setPreferredSize(new java.awt.Dimension(100, 25));

        limpiar.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        limpiar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/finish.png"))); // NOI18N
        limpiar.setText("Limpiar horario");
        limpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        limpiar.setContentAreaFilled(false);
        limpiar.setOpaque(true);
        limpiar.setPreferredSize(new java.awt.Dimension(100, 25));

        addbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/add.png"))); // NOI18N
        addbtn.setText("Agregar Asignatura");
        addbtn.setToolTipText("Haz click para agregar una asignatura");
        addbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        addbtn.setContentAreaFilled(false);
        addbtn.setOpaque(true);
        addbtn.setPreferredSize(new java.awt.Dimension(100, 25));

        delbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/del.png"))); // NOI18N
        delbtn.setText("Eliminar Asignatura");
        delbtn.setToolTipText("Haz click para eliminar una asignatura");
        delbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        delbtn.setContentAreaFilled(false);
        delbtn.setOpaque(true);
        delbtn.setPreferredSize(new java.awt.Dimension(100, 25));

        nextmateriabtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        nextmateriabtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nextmateriabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/next.png"))); // NOI18N
        nextmateriabtn.setText("Siguiente");
        nextmateriabtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        nextmateriabtn.setContentAreaFilled(false);
        nextmateriabtn.setOpaque(true);
        nextmateriabtn.setPreferredSize(new java.awt.Dimension(100, 25));

        previousseccionbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        previousseccionbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        previousseccionbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/cancel.png"))); // NOI18N
        previousseccionbtn.setText("Cancelar");
        previousseccionbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        previousseccionbtn.setContentAreaFilled(false);
        previousseccionbtn.setOpaque(true);
        previousseccionbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        previousseccionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                previousseccionbtnMouseExited(evt);
            }
        });
        previousseccionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousseccionbtnActionPerformed(evt);
            }
        });

        nextseccionbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        nextseccionbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        nextseccionbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/next.png"))); // NOI18N
        nextseccionbtn.setText("Siguiente");
        nextseccionbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        nextseccionbtn.setContentAreaFilled(false);
        nextseccionbtn.setOpaque(true);
        nextseccionbtn.setPreferredSize(new java.awt.Dimension(100, 25));

        jPanel4.setBackground(new java.awt.Color( 255, 255, 255, 0 ));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "ASIGNACIÓN DE CITAS ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setDoubleBuffered(false);

        semestretxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        semestretxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        semestretxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        semestretxt.setOpaque(false);
        semestretxt.setPreferredSize(new java.awt.Dimension(36, 21));

        carreratxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        carreratxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--" }));
        carreratxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        carreratxt.setOpaque(false);
        carreratxt.setPreferredSize(new java.awt.Dimension(36, 21));
        carreratxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreratxtActionPerformed(evt);
            }
        });

        lblCedula43.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lblCedula43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula43.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula43.setText("Tipo consulta:");
        lblCedula43.setOpaque(true);

        lblCedula44.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lblCedula44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula44.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula44.setText("Especialidad:");
        lblCedula44.setOpaque(true);

        lblCedula46.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lblCedula46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula46.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula46.setText("Médico:");
        lblCedula46.setOpaque(true);

        turnotxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        turnotxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DIURNO" }));
        turnotxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        turnotxt.setOpaque(false);
        turnotxt.setPreferredSize(new java.awt.Dimension(36, 21));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCedula43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCedula44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCedula46, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(carreratxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semestretxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula43)
                    .addComponent(carreratxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula44)
                    .addComponent(semestretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula46)
                    .addComponent(turnotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel3.setDoubleBuffered(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        horariotbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        horariotbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"<html><center><p>7:00 a 7:45</p></center></html>", null, null, null, null, null, null, null},
                {"7:45 a 8:30", null, null, null, null, null, null, null},
                {"8:30 a 9:15", null, null, null, null, null, null, null},
                {"9:30 a 10:15", null, null, null, null, null, null, null},
                {"10:15 a 11:00", null, null, null, null, null, null, null},
                {"11:00 a 11:45", null, null, null, null, null, null, null},
                {"11:45 a 12:30", null, null, null, null, null, null, null},
                {"12:30 a 13:15", null, null, null, null, null, null, null},
                {"13:15 a 14:00", null, null, null, null, null, null, null},
                {"14:00 a 14:45", null, null, null, null, null, null, null},
                {"15:00 a 15:45", null, null, null, null, null, null, null},
                {"15:45 a 16:30", null, null, null, null, null, null, null},
                {"16:30 a 17:15", null, null, null, null, null, null, null},
                {"17:15 a 18:00", null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        horariotbl.setCellSelectionEnabled(true);
        horariotbl.setGridColor(new java.awt.Color(204, 204, 204));
        horariotbl.setOpaque(false);
        horariotbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        horariotbl.getTableHeader().setResizingAllowed(false);
        horariotbl.getTableHeader().setReorderingAllowed(false);
        horariotbl.setUpdateSelectionOnSort(false);
        horariotbl.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(horariotbl);

        delinfo.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        delinfo.setText("Haz Click en la celda donde se encuentra la asignatura a eliminar");
        delinfo.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(delinfo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delinfo)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color( 255, 255, 255, 0 ));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "DATOS DEL PACIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel12.setDoubleBuffered(false);

        lblCedula89.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lblCedula89.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula89.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula89.setText("Nombre completo");
        lblCedula89.setOpaque(true);

        lblCedula90.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lblCedula90.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula90.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula90.setText("Lugar de nacimiento");
        lblCedula90.setOpaque(true);

        lblCedula91.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lblCedula91.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula91.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula91.setText("Tipo de paciente");
        lblCedula91.setOpaque(true);

        tipo_paciente.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        tipo_paciente.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tipo_paciente.setForeground(new java.awt.Color(255, 255, 255));
        tipo_paciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipo_paciente.setText("0");
        tipo_paciente.setOpaque(true);

        lbnombre_completo.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lbnombre_completo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbnombre_completo.setForeground(new java.awt.Color(255, 255, 255));
        lbnombre_completo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnombre_completo.setText("0");
        lbnombre_completo.setOpaque(true);

        fecha_nacimiento.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        fecha_nacimiento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fecha_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        fecha_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha_nacimiento.setText("0");
        fecha_nacimiento.setOpaque(true);

        lblCedula92.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lblCedula92.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCedula92.setForeground(new java.awt.Color(255, 255, 255));
        lblCedula92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCedula92.setText("Fecha de nacimiento");
        lblCedula92.setOpaque(true);

        lugar_nacimiento.setBackground(new java.awt.Color( 255, 255, 255, 75 ));
        lugar_nacimiento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lugar_nacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lugar_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lugar_nacimiento.setText("0");
        lugar_nacimiento.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula90)
                    .addComponent(lblCedula92)
                    .addComponent(lblCedula91, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula89))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbnombre_completo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lugar_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula89)
                    .addComponent(lbnombre_completo))
                .addGap(11, 11, 11)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_nacimiento)
                    .addComponent(lblCedula92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula90)
                    .addComponent(lugar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_paciente)
                    .addComponent(lblCedula91))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        previousmateriabtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        previousmateriabtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        previousmateriabtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/previous.png"))); // NOI18N
        previousmateriabtn.setText("Volver");
        previousmateriabtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        previousmateriabtn.setContentAreaFilled(false);
        previousmateriabtn.setOpaque(true);
        previousmateriabtn.setPreferredSize(new java.awt.Dimension(100, 25));

        aceptarbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        aceptarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/add.png"))); // NOI18N
        aceptarbtn.setText("Aceptar");
        aceptarbtn.setToolTipText("Haz click para agregar una asignatura");
        aceptarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        aceptarbtn.setContentAreaFilled(false);
        aceptarbtn.setOpaque(true);
        aceptarbtn.setPreferredSize(new java.awt.Dimension(100, 25));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "BÚSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(70, 43));
        jPanel1.setOpaque(false);

        combobusqueda2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        combobusqueda2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CEDULA" }));
        combobusqueda2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        combobusqueda2.setEnabled(false);
        combobusqueda2.setOpaque(false);
        combobusqueda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobusqueda2ActionPerformed(evt);
            }
        });

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(combobusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel5.setOpaque(false);

        actualizarbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        actualizarbtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        actualizarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/reload.png"))); // NOI18N
        actualizarbtn.setText("Actualizar");
        actualizarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        actualizarbtn.setContentAreaFilled(false);
        actualizarbtn.setOpaque(true);
        actualizarbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        actualizarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarbtnMouseExited(evt);
            }
        });
        actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarbtnActionPerformed(evt);
            }
        });

        aceptarbtn1.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        aceptarbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/add.png"))); // NOI18N
        aceptarbtn1.setText("Agregar");
        aceptarbtn1.setToolTipText("Haz click para agregar una asignatura");
        aceptarbtn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        aceptarbtn1.setContentAreaFilled(false);
        aceptarbtn1.setOpaque(true);
        aceptarbtn1.setPreferredSize(new java.awt.Dimension(100, 25));
        aceptarbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarbtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarbtn1MouseExited(evt);
            }
        });
        aceptarbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbtn1ActionPerformed(evt);
            }
        });

        btbuscar.setBackground(new java.awt.Color(255 , 255, 255, 125));
        btbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/search.png"))); // NOI18N
        btbuscar.setText("Buscar");
        btbuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btbuscar.setContentAreaFilled(false);
        btbuscar.setDoubleBuffered(true);
        btbuscar.setMaximumSize(new java.awt.Dimension(73, 19));
        btbuscar.setMinimumSize(new java.awt.Dimension(73, 19));
        btbuscar.setOpaque(true);
        btbuscar.setPreferredSize(new java.awt.Dimension(100, 25));
        btbuscar.setSelected(true);
        btbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btbuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btbuscarMouseExited(evt);
            }
        });
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(aceptarbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jRadioButton21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton21.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton21.setText(" Citas asignadas ");
        jRadioButton21.setOpaque(false);

        jRadioButton22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton22.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton22.setText(" Cupos disponibles");
        jRadioButton22.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(previousmateriabtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextmateriabtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(previousseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nextseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton21)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButton22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aceptarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aceptarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton21)
                                .addComponent(jRadioButton22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previousseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextmateriabtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousmateriabtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void Habilitar(){
        carreratxt.setEnabled(true);
        semestretxt.setEnabled(true);
        turnotxt.setEnabled(true);
    }
    
    public void inHabilitar(){
        carreratxt.setEnabled(false);
        semestretxt.setEnabled(false);
        turnotxt.setEnabled(false);
    }
    
    public void limpiar(){
        carreratxt.setSelectedIndex(0);
        semestretxt.setSelectedIndex(0);
        turnotxt.setSelectedIndex(0);
        txtbuscar.setText("");
        lbnombre_completo.setText("0");
        fecha_nacimiento.setText("0");
        lugar_nacimiento.setText("0");
        tipo_paciente.setText("0");
        carreratxt.setEnabled(false);
        semestretxt.setEnabled(false);
        turnotxt.setEnabled(false);
        aceptarbtn1.setEnabled(false);
    }
    
    public void cargarConsulta()
    {
        consulta = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Consulta());
        if( consulta != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Consulta c : consulta)
                ((DefaultComboBoxModel)model).addElement(c.getConsulta());

            carreratxt.setModel(model);
        }
    }
    
    private void previousseccionbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousseccionbtnMouseExited
        previousseccionbtn.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_previousseccionbtnMouseExited

    private void btbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseEntered
        btbuscar.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_btbuscarMouseEntered

    private void btbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseExited
        btbuscar.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_btbuscarMouseExited

    private void actualizarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtnMouseEntered

    private void actualizarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtnMouseExited

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        paciente = new Ajustes.Modelo.Paciente();
        String area;
        paciente.setCedula(txtbuscar.getText());
        
        area = (String) combobusqueda2.getSelectedItem().toString();
        paciente.setAreacedula(area);
        
        java.util.ArrayList<Ajustes.Modelo.Paciente> pacientes = Ajustes.Controlador.Application.loadDbItems(paciente, "cedula", "'" + paciente.getCedula() + "'" );

        if( pacientes != null )
        {   
            if( pacientes.size() > 0 && pacientes.get(0).getCedula().equals(paciente.getCedula()))
            { 
                lbnombre_completo.setText(pacientes.get(0).getNombre().concat(" "+(String)pacientes.get(0).getApellido()));
                fecha_nacimiento.setText(pacientes.get(0).getFecha_nacimiento());
                lugar_nacimiento.setText(pacientes.get(0).getLugar_nacimiento());
                tipo_paciente.setText(pacientes.get(0).getTipo_paciente());
                aceptarbtn1.setEnabled(true);
                
            }
            else
                Ajustes.Controlador.Application.showMessageDialog( "El Paciente no se encuentra creado porfavor indicar si:", "Deseas crear el registro", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
               
        }
        else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_btbuscarActionPerformed

    private void combobusqueda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobusqueda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobusqueda2ActionPerformed

    private void txtbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyPressed
        val.teclasEspeciales(evt, txtbuscar);
    }//GEN-LAST:event_txtbuscarKeyPressed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        val.digitos(txtbuscar, evt);
        val.espacioMaximo(txtbuscar, evt, 9);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void aceptarbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbtn1ActionPerformed
        Habilitar();
    }//GEN-LAST:event_aceptarbtn1ActionPerformed

    private void aceptarbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarbtn1MouseEntered
         aceptarbtn1.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_aceptarbtn1MouseEntered

    private void aceptarbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarbtn1MouseExited
        aceptarbtn1.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_aceptarbtn1MouseExited

    private void actualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarbtnActionPerformed
        limpiar();
    }//GEN-LAST:event_actualizarbtnActionPerformed

    private void previousseccionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousseccionbtnActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Menu_Modulos());
    }//GEN-LAST:event_previousseccionbtnActionPerformed

    private void carreratxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreratxtActionPerformed
        //Validar campos texto, cambo box etc
        if( carreratxt.getSelectedItem().equals("Consulta Externa"))
        {
            
            
        }
    }//GEN-LAST:event_carreratxtActionPerformed

    @Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarbtn;
    private javax.swing.JButton aceptarbtn1;
    private javax.swing.JButton actualizarbtn;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton btbuscar;
    private javax.swing.JComboBox carreratxt;
    private javax.swing.JComboBox combobusqueda2;
    private javax.swing.JButton delbtn;
    private javax.swing.JLabel delinfo;
    private javax.swing.JLabel fecha_nacimiento;
    private javax.swing.JButton finalizar;
    private javax.swing.JTable horariotbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula43;
    private javax.swing.JLabel lblCedula44;
    private javax.swing.JLabel lblCedula46;
    private javax.swing.JLabel lblCedula89;
    private javax.swing.JLabel lblCedula90;
    private javax.swing.JLabel lblCedula91;
    private javax.swing.JLabel lblCedula92;
    private javax.swing.JLabel lbnombre_completo;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel lugar_nacimiento;
    private javax.swing.JButton nextmateriabtn;
    private javax.swing.JButton nextseccionbtn;
    private javax.swing.JButton previousmateriabtn;
    private javax.swing.JButton previousseccionbtn;
    private javax.swing.JComboBox semestretxt;
    private javax.swing.JLabel tipo_paciente;
    private javax.swing.JComboBox turnotxt;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
