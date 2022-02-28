package Ajustes.Vista;

public class Agenda extends javax.swing.JPanel {

  
    public Agenda() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        combobusqueda1 = new javax.swing.JComboBox();
        combobusqueda2 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        btbuscar = new javax.swing.JButton();
        actualizarbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listadotbl = new javax.swing.JTable();
        delinfo = new javax.swing.JLabel();
        modificarbtn = new javax.swing.JButton();
        previous = new javax.swing.JButton();

        setBackground(new java.awt.Color(33,116,162,0));
        setMaximumSize(new java.awt.Dimension(930, 560));
        setMinimumSize(new java.awt.Dimension(930, 560));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(930, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "BÚSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Symbol", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(70, 43));
        jPanel1.setOpaque(false);

        combobusqueda1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        combobusqueda1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--", "Usuario", "Boletos", " " }));
        combobusqueda1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        combobusqueda1.setOpaque(false);

        combobusqueda2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        combobusqueda2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NOMBRE", "APELLIDO", "TELEFONO", "EMAIL", "USUARIO", "NIVEL", "PREVILEGIO" }));
        combobusqueda2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        combobusqueda2.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(combobusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(combobusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel4.setOpaque(false);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color( 255, 255, 255, 0 ));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true), "Listado de pacientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setDoubleBuffered(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(450, 400));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(450, 400));
        jScrollPane1.setOpaque(false);

        listadotbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        listadotbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombres", "Apellidos", "Sexo", "Estado Civil", "Especialidades", "Tipo de Contrato", "Status"
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
        listadotbl.setGridColor(new java.awt.Color(204, 204, 204));
        listadotbl.setOpaque(false);
        listadotbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listadotbl.setUpdateSelectionOnSort(false);
        listadotbl.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(listadotbl);

        delinfo.setBackground(new java.awt.Color( 255, 255, 255, 5 ));
        delinfo.setText("Haz Click en la celda donde se encuentra los datos!!");
        delinfo.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(delinfo)
                .addGap(584, 584, 584))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(delinfo)
                .addContainerGap())
        );

        modificarbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        modificarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/icons8_calendar_plus_16px.png"))); // NOI18N
        modificarbtn.setText("Agendar Citas");
        modificarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        modificarbtn.setContentAreaFilled(false);
        modificarbtn.setOpaque(true);
        modificarbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        modificarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbtnActionPerformed(evt);
            }
        });

        previous.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        previous.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/previous.png"))); // NOI18N
        previous.setText("Anterior");
        previous.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        previous.setContentAreaFilled(false);
        previous.setOpaque(true);
        previous.setPreferredSize(new java.awt.Dimension(100, 25));
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                previousMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                previousMouseExited(evt);
            }
        });
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseEntered

    }//GEN-LAST:event_btbuscarMouseEntered

    private void btbuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbuscarMouseExited
   
    }//GEN-LAST:event_btbuscarMouseExited

    private void actualizarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtnMouseEntered

    private void actualizarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarbtnMouseExited

    private void modificarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbtnActionPerformed
        Ajustes.Controlador.Application.callMainOption(new AgendarPaciente());
    }//GEN-LAST:event_modificarbtnActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Menu_Modulos());
    }//GEN-LAST:event_previousActionPerformed

    private void previousMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseExited

    }//GEN-LAST:event_previousMouseExited

    private void previousMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseEntered

    }//GEN-LAST:event_previousMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarbtn;
    private javax.swing.JButton btbuscar;
    private javax.swing.JComboBox combobusqueda1;
    private javax.swing.JComboBox combobusqueda2;
    private javax.swing.JLabel delinfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listadotbl;
    private javax.swing.JButton modificarbtn;
    private javax.swing.JButton previous;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
