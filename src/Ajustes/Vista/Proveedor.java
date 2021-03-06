
package Ajustes.Vista;

import Ajustes.Controlador.Validations;
import Ajustes.Modelo.Bitacora;
import Ajustes.Modelo.Categoria;
import EgoistSwing.Util.AppView;
import EgoistSwing.Util.ButtonFlash;
import EgoistSwing.Util.ExpandOnFocus;
import EgoistSwing.Util.TextFieldColorOnFocus;
import EgoistSwing.Util.TextFieldName;
import EgoistSwing.Util.ToolTip;
import java.awt.Color;
import java.awt.Graphics;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;

public class Proveedor extends javax.swing.JPanel{
    ArrayList<Categoria> listaBase = new ArrayList();
    ArrayList<Categoria> listaFiltro = new ArrayList();
    ArrayList<ArrayList<Categoria>> historial = new ArrayList();
    int index = 0;
    
    public Proveedor() {
        initComponents();
        inhabilitar();
        setEgoistStyle();
    }
    
    //para obtener la fecha actual del sistema
    Calendar fecha_actual=new GregorianCalendar();
    
    Validations val = new Validations();
    private String accion="Guardar";
    
    Color colorA=new Color(255,255,255,255);
    Color colorB=new Color(255,255,255,100);
    Color foregroundA=new Color(49,152,211);
    Color foregroundB=new Color(255,255,255);

    public void setEgoistStyle(){
        // Creando animaciones para los campos de texto
        (new ExpandOnFocus(new java.awt.Dimension(140,50), new java.awt.Dimension(30,0), 200, txtfecha)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(227,50), new java.awt.Dimension(30,0), 200, txtcodigo)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(219,50), new java.awt.Dimension(10,0), 200, txtproveedor)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(157,50), new java.awt.Dimension(10,0), 200, txtrif)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(219,50), new java.awt.Dimension(10,0), 200, txtdireccion)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(134,50), new java.awt.Dimension(10,0), 200, txttelefono)).build();

        (new ExpandOnFocus(new java.awt.Dimension(129,50), new java.awt.Dimension(10,0), 200, txtcorreo)).build();
        
        // Creando efecto de nombre de campo de texto
        (new TextFieldName("Codigo", txtcodigo)).build();
        
        // Creando efecto de cambio de color de campos de texto
        Color colorA = new Color(255, 255, 255, 255);
        Color colorB = new Color(255, 255, 255, 100);
        Color foregroundA = new Color(49, 152, 211);
        Color foregroundB = new Color(255, 255, 255);

        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtcodigo)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtproveedor)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtrif)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtdireccion)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txttelefono)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtcorreo)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtproveedor, "<html><left>Introduzca el nombre del proveedor.</left></html>",300)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtrif, "<html><left>Introduzca el rif de la empresa.</left></html>",300)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtdireccion, "<html><left>Introduzca la direcci??n o ubicaci??n.</left></html>",300)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txttelefono, "<html><left>Introduzca el numero de telefono de la empresa.</left></html>",300)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcorreo,"<html><lef>Introduzca la direccion de correo electronico de la empresa.</lef></html>",200)).build();
        
        // Creando efecto de seleccion de boton
        (new ButtonFlash(btnuevo, new java.awt.Color(45, 164, 134, 0))).build();
        
        (new ButtonFlash(btguardar, new java.awt.Color(45, 164, 134, 0))).build();
        
    }
    public void habilitar(){
        txtfecha.setEnabled(false);
        lbid.setVisible(false);
        txtfecha.setCalendar(fecha_actual);
        txtcodigo.setVisible(false);
        txtproveedor.setEnabled(true);
        txtdireccion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtcorreo.setEnabled(true);
        txtrif.setEnabled(true);
        cborif.setEnabled(true);
        cbotelefono.setEnabled(true);
        cboemail.setEnabled(true);;

        
        btguardar.setEnabled(true);
        
        txtcodigo.setText("");
        txtproveedor.setText("");
        txtrif.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        cboemail.setSelectedIndex(0);
        cbotelefono.setSelectedIndex(0);
        cborif.setSelectedIndex(0);
    }
    
    public void inhabilitar(){
        lbid.setVisible(false);
        txtcodigo.setVisible(false);
        txtfecha.setEnabled(false);
        txtproveedor.setEnabled(false);
        txtdireccion.setEnabled(false);
        txttelefono.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtrif.setEnabled(false);
        cborif.setEnabled(false);
        cbotelefono.setEnabled(false);
        cboemail.setEnabled(false);
        
        btguardar.setEnabled(false);
        
        //txtfecha.setText("");
        txtproveedor.setText("");
        txtrif.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        cboemail.setSelectedIndex(0);
        cbotelefono.setSelectedIndex(0);
        cborif.setSelectedIndex(0);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_categoria = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbid = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtproveedor = new javax.swing.JTextField();
        txtrif = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        cborif = new javax.swing.JComboBox<>();
        cbotelefono = new javax.swing.JComboBox<>();
        cboemail = new javax.swing.JComboBox<>();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtfecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255,255,255,50));
        setMaximumSize(new java.awt.Dimension(440, 430));
        setMinimumSize(new java.awt.Dimension(440, 430));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(470, 430));

        panel_categoria.setBackground(new java.awt.Color(0,0,0,10));
        panel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Proveedores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FECHA");

        jPanel4.setBackground(new java.awt.Color(51,51,51,100));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Datos Privados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);

        lbid.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        lbid.setForeground(new java.awt.Color(255, 255, 255));
        lbid.setText("<html><center><p>ID</p></html>");

        txtcodigo.setBackground(new java.awt.Color( 255, 255, 255, 100 ));
        txtcodigo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigo.setText("Codigo");

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<html><center><p>PROVEEDOR</p></html>");

        txtproveedor.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        txtrif.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtrif.setPreferredSize(new java.awt.Dimension(6, 22));
        txtrif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtrifKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html><center><p>RIF</p></html>");

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("<html><center><p>DIRECCI??N</p></html>");

        txtdireccion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<html><center><p>TELEFONO</p></html>");

        txttelefono.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("<html><center><p>CORREO</p></html>");

        txtcorreo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcorreo.setPreferredSize(new java.awt.Dimension(6, 23));

        cborif.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cborif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "J", "V" }));
        cborif.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cborif.setMinimumSize(new java.awt.Dimension(52, 22));
        cborif.setOpaque(false);
        cborif.setPreferredSize(new java.awt.Dimension(52, 22));

        cbotelefono.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbotelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        cbotelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbotelefono.setOpaque(false);

        cboemail.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboemail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "@gmail.com", "@hotmail.com", "@yahoo.com", "Otro" }));
        cboemail.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcodigo)
                    .addComponent(txtdireccion)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cborif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrif, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttelefono))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboemail, 0, 1, Short.MAX_VALUE))
                    .addComponent(txtproveedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbid))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrif, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cborif, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/Plus_24px.png"))); // NOI18N
        btnuevo.setText("Nuevo");
        btnuevo.setContentAreaFilled(false);
        btnuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        btguardar.setBackground(new java.awt.Color(45,164,134,0));
        btguardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btguardar.setForeground(new java.awt.Color(255, 255, 255));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/Ok_24px.png"))); // NOI18N
        btguardar.setText("Guardar");
        btguardar.setContentAreaFilled(false);
        btguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        txtfecha.setForeground(new java.awt.Color(153, 153, 153));
        txtfecha.setFocusCycleRoot(true);
        txtfecha.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtfecha.setPreferredSize(new java.awt.Dimension(95, 23));

        javax.swing.GroupLayout panel_categoriaLayout = new javax.swing.GroupLayout(panel_categoria);
        panel_categoria.setLayout(panel_categoriaLayout);
        panel_categoriaLayout.setHorizontalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addGap(37, 37, 37)
                        .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panel_categoriaLayout.setVerticalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panel_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        Ajustes.Modelo.Proveedores proveedor = new Ajustes.Modelo.Proveedores();
        int selecionado = cboemail.getSelectedIndex();
        selecionado = cbotelefono.getSelectedIndex();
        selecionado = cborif.getSelectedIndex();
        
        Calendar cal;
        int d,m,a;
        cal =txtfecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) -1900;
        
        proveedor.setFecha(new Date(a,m,d).toString());
        proveedor.setProveedor(txtproveedor.getText());
        proveedor.setRif((String)cborif.getSelectedItem().toString().concat(txtrif.getText()));
        proveedor.setDireccion(txtdireccion.getText());
        proveedor.setTelefono((String)cbotelefono.getSelectedItem().toString().concat(txttelefono.getText()));
        proveedor.setCorreo(txtcorreo.getText().concat((String)cboemail.getSelectedItem().toString()));
        
        //Validar campos texto, cambo box etc
        if( cboemail.getSelectedItem().equals("--"))
        {
            val.valEsp(txtproveedor);
            val.valEsp(txtrif);
            val.valEsp(cborif);
            val.valEsp(txtdireccion);
            val.valEsp(cbotelefono);
            val.valEsp(txttelefono);
            val.valEsp(txtcorreo);
            val.valEsp(cboemail);
        }else
        {
            boolean res= Ajustes.Controlador.Application.onproveedor(proveedor);
        if( res == true )
        {
            Ajustes.Controlador.Application.showMessageDialog( "El proveedor fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
            inhabilitar();}
         else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        }
          
    }//GEN-LAST:event_btguardarActionPerformed

    private void txttelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyReleased
        val.digitos(txttelefono, evt);
    }//GEN-LAST:event_txttelefonoKeyReleased

    private void txtrifKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrifKeyReleased
        val.digitos(txttelefono, evt);
    }//GEN-LAST:event_txtrifKeyReleased

@Override
    public void paintComponent( java.awt.Graphics g )
    {
        super.paintComponent(g);
        
        if( Egoist.Swing.Animator.isBeingAnimated(this) == false )
            repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btguardar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JComboBox<String> cboemail;
    private javax.swing.JComboBox<String> cborif;
    private javax.swing.JComboBox<String> cbotelefono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbid;
    private javax.swing.JPanel panel_categoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtproveedor;
    private javax.swing.JTextField txtrif;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
