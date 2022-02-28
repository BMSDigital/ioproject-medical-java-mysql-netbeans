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
public class HorariosMedicos extends javax.swing.JPanel {

    /**
     * Creates new form HorariosMedicos
     */
    public HorariosMedicos() {
        initComponents();
    }

    Ajustes.Modelo.Doctores doctores;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        lblCedula49 = new javax.swing.JLabel();
        atributostxt1 = new javax.swing.JComboBox();
        valorestxt1 = new javax.swing.JComboBox();
        lblCedula50 = new javax.swing.JLabel();
        previous1 = new javax.swing.JButton();
        nextbtn1 = new javax.swing.JButton();
        actualizarbtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        familiatable = new javax.swing.JTable();
        modificarbtn = new javax.swing.JButton();
        delinfo = new javax.swing.JLabel();
        panel_categoria = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        delinfo1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lblCedula89 = new javax.swing.JLabel();
        lblCedula90 = new javax.swing.JLabel();
        lblCedula91 = new javax.swing.JLabel();
        tipo_paciente = new javax.swing.JLabel();
        lbnombre_completo = new javax.swing.JLabel();
        fecha_nacimiento = new javax.swing.JLabel();
        lblCedula92 = new javax.swing.JLabel();
        lugar_nacimiento = new javax.swing.JLabel();
        aceptarbtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(890, 622));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(890, 622));

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

        familiatable.setAutoCreateRowSorter(true);
        familiatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellidos", "Cédula", "Fecha de nacimiento", "Parentesco", "Sexo", "Grado de instrucción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        familiatable.setColumnSelectionAllowed(true);
        familiatable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        familiatable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(familiatable);

        modificarbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        modificarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/icons8_calendar_plus_16px.png"))); // NOI18N
        modificarbtn.setText("Asignar");
        modificarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        modificarbtn.setContentAreaFilled(false);
        modificarbtn.setOpaque(true);
        modificarbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });

        delinfo.setBackground(new java.awt.Color( 255, 255, 255, 5 ));
        delinfo.setText("Haz Click en la celda donde se encuentra los datos!!");
        delinfo.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(actualizarbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(previous1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblCedula49, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(atributostxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblCedula50, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(valorestxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(nextbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(delinfo)
                        .addGap(413, 413, 413)
                        .addComponent(modificarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modificarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delinfo))
                .addGap(12, 12, 12))
        );

        panel_categoria.setBackground(new java.awt.Color(33,116,162,30));
        panel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel12.setBackground(new java.awt.Color( 255, 255, 255, 0 ));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "ASIGNACIÓN HORARIOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel12.setDoubleBuffered(false);

        jRadioButton15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton15.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton15.setText("Tarde");
        jRadioButton15.setOpaque(false);

        jRadioButton14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton14.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton14.setText("Mañana");
        jRadioButton14.setOpaque(false);

        jRadioButton7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Domingo");
        jRadioButton7.setOpaque(false);

        jRadioButton6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Sábado");
        jRadioButton6.setOpaque(false);

        jRadioButton5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("Viernes");
        jRadioButton5.setOpaque(false);

        jRadioButton4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Jueves");
        jRadioButton4.setOpaque(false);

        jRadioButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Miércoles");
        jRadioButton3.setOpaque(false);

        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Martes");
        jRadioButton2.setOpaque(false);

        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Lunes");
        jRadioButton1.setOpaque(false);

        jRadioButton8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Mañana");
        jRadioButton8.setMaximumSize(new java.awt.Dimension(61, 29));
        jRadioButton8.setMinimumSize(new java.awt.Dimension(61, 29));
        jRadioButton8.setOpaque(false);
        jRadioButton8.setPreferredSize(new java.awt.Dimension(61, 29));

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

        delinfo1.setBackground(new java.awt.Color( 255, 255, 255, 5 ));
        delinfo1.setText("Haz Click en cada celda para elhorario del medico!!");
        delinfo1.setOpaque(true);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delinfo1)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton15)
                            .addComponent(jRadioButton21)
                            .addComponent(jRadioButton20)
                            .addComponent(jRadioButton19)
                            .addComponent(jRadioButton18)
                            .addComponent(jRadioButton17)
                            .addComponent(jRadioButton16))))
                .addGap(17, 17, 17))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(delinfo1)
                .addGap(11, 11, 11)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jRadioButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jRadioButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color( 255, 255, 255, 0 ));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "DATOS DEL MEDICO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel13.setDoubleBuffered(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(322, 225));

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

        aceptarbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        aceptarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/icons8_calendar_plus_16px.png"))); // NOI18N
        aceptarbtn.setText("Agregar");
        aceptarbtn.setToolTipText("Haz click para agregar una asignatura");
        aceptarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        aceptarbtn.setContentAreaFilled(false);
        aceptarbtn.setOpaque(true);
        aceptarbtn.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula90)
                            .addComponent(lblCedula92)
                            .addComponent(lblCedula91, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCedula89))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbnombre_completo, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(fecha_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lugar_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipo_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula89)
                    .addComponent(lbnombre_completo))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_nacimiento)
                    .addComponent(lblCedula92))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula90)
                    .addComponent(lugar_nacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_paciente)
                    .addComponent(lblCedula91))
                .addGap(18, 18, 18)
                .addComponent(aceptarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_categoriaLayout = new javax.swing.GroupLayout(panel_categoria);
        panel_categoria.setLayout(panel_categoriaLayout);
        panel_categoriaLayout.setHorizontalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoriaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panel_categoriaLayout.setVerticalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void previous1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous1MouseExited
        previous1.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_previous1MouseExited

    private void previous1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous1MouseEntered
        previous1.setBackground(new java.awt.Color(255, 255, 255, 175));
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_previous1MouseEntered

    private void previous1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previous1ActionPerformed

    }//GEN-LAST:event_previous1ActionPerformed

    private void nextbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbtn1MouseExited
        nextbtn1.setBackground(new java.awt.Color(255, 255, 255, 125));
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_nextbtn1MouseExited

    private void actualizarbtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtn1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtn1MouseExited

    private void actualizarbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtn1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtn1MouseEntered

    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        Ajustes.Controlador.Application.callMainOption(new AgendarPaciente());
    }//GEN-LAST:event_modificarbtnActionPerformed

       public Doctores getDoctores()
    {
        return doctores;
    }
    public void setDoctores(Doctores doctores)
    {
        this.doctores = doctores;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarbtn;
    private javax.swing.JButton actualizarbtn1;
    private javax.swing.JComboBox atributostxt1;
    private javax.swing.JLabel delinfo;
    private javax.swing.JLabel delinfo1;
    private javax.swing.JTable familiatable;
    private javax.swing.JLabel fecha_nacimiento;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedula49;
    private javax.swing.JLabel lblCedula50;
    private javax.swing.JLabel lblCedula89;
    private javax.swing.JLabel lblCedula90;
    private javax.swing.JLabel lblCedula91;
    private javax.swing.JLabel lblCedula92;
    private javax.swing.JLabel lbnombre_completo;
    private javax.swing.JLabel lugar_nacimiento;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JButton nextbtn1;
    private javax.swing.JPanel panel_categoria;
    private javax.swing.JButton previous1;
    private javax.swing.JLabel tipo_paciente;
    private javax.swing.JComboBox valorestxt1;
    // End of variables declaration//GEN-END:variables
}
