
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
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;

public class Empresa extends javax.swing.JPanel{
    ArrayList<Categoria> listaBase = new ArrayList();
    ArrayList<Categoria> listaFiltro = new ArrayList();
    ArrayList<ArrayList<Categoria>> historial = new ArrayList();
    int index = 0;
    
    public Empresa() {
        initComponents();
        inhabilitar();
        setEgoistStyle();
    }
    
    //para obtener la fecha actual del sistema
    Calendar fecha_actual=new GregorianCalendar();
    
    Validations val = new Validations();
    private String accion="guardar";
    
    Color colorA=new Color(255,255,255,255);
    Color colorB=new Color(255,255,255,100);
    Color foregroundA=new Color(49,152,211);
    Color foregroundB=new Color(255,255,255);

    public void setEgoistStyle(){
        // Creando animaciones para los campos de texto
        (new ExpandOnFocus(new java.awt.Dimension(140,50), new java.awt.Dimension(30,0), 200, txtfecha)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(140,50), new java.awt.Dimension(30,0), 200, txtcodigo)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(380,50), new java.awt.Dimension(10,0), 200, txtnombre)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(180,50), new java.awt.Dimension(10,0), 200, txtdepartamento)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(180,50), new java.awt.Dimension(10,0), 200, txtdirecion)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(98,50), new java.awt.Dimension(10,0), 200, txttelefono)).build();

        (new ExpandOnFocus(new java.awt.Dimension(96,50), new java.awt.Dimension(10,0), 200, txtcorreo)).build();
       
        // Creando efecto de nombre de campo de texto
        (new TextFieldName("Codigo", txtcodigo)).build();
        
        // Creando efecto de cambio de color de campos de texto
        Color colorA = new Color(255, 255, 255, 255);
        Color colorB = new Color(255, 255, 255, 100);
        Color foregroundA = new Color(49, 152, 211);
        Color foregroundB = new Color(255, 255, 255);

        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtcodigo)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtnombre)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtdepartamento)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtdirecion)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txttelefono)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtcorreo)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtnombre, "<html><left>Introduzca el nombre de la empresa.</left></html>",300)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtdepartamento, "<html><left>Introduzca el nombre del departamento.</left></html>",300)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtdirecion, "<html><left>Introduzca el direccion fiscal de la empresa.</left></html>",300)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txttelefono,"<html><lef>Introduzca el numero de telefono de la empresa.</lef></html>",200)).build();
        
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
        txtnombre.setEnabled(true);
        txtdepartamento.setEnabled(true);
        txtdirecion.setEnabled(true);
        txttelefono.setEnabled(true);
        txtcorreo.setEnabled(true);
        cbotelefono.setEnabled(true);
        cboemail.setEnabled(true);
        
        btguardar.setEnabled(true);
        txtcodigo.setText("");
        txtnombre.setText("");
        txtdepartamento.setText("");
        txtdirecion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        cboemail.setSelectedIndex(0);
        cbotelefono.setSelectedIndex(0);
    }
    
    public void inhabilitar(){
        lbid.setVisible(false);
        txtcodigo.setVisible(false);
        txtfecha.setEnabled(false);
        txtnombre.setEnabled(false);
        txtdepartamento.setEnabled(false);
        txtdirecion.setEnabled(false);
        txttelefono.setEnabled(false);
        txtcorreo.setEnabled(false);;
        cbotelefono.setEnabled(false);
        cboemail.setEnabled(false);
        
        btguardar.setEnabled(false);
        
        txtnombre.setText("");
        txtdepartamento.setText("");
        txtdirecion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        cboemail.setSelectedIndex(0);
        cbotelefono.setSelectedIndex(0);
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
        jLabel9 = new javax.swing.JLabel();
        lbid1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdepartamento = new javax.swing.JTextField();
        txtdirecion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        cbotelefono = new javax.swing.JComboBox<>();
        cboemail = new javax.swing.JComboBox<>();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtfecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255,255,255,50));
        setMaximumSize(new java.awt.Dimension(485, 395));
        setMinimumSize(new java.awt.Dimension(485, 395));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(485, 395));

        panel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Datos de la empresa", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        panel_categoria.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FECHA");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Datos privados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
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
        jLabel8.setText("<html><center><p>DEPARTAMENTO</p></html>");

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html><center><p>DIRECCIÓN</p></html>");

        lbid1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        lbid1.setForeground(new java.awt.Color(255, 255, 255));
        lbid1.setText("<html><center><p>NOMBRE</p></html>");

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        txtdepartamento.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        txtdirecion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html><center><p>TELÉFONO</p></html>");

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("<html><center><p>CORREO</p></html>");

        txttelefono.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoKeyReleased(evt);
            }
        });

        txtcorreo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

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
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdirecion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbid1)
                .addGap(5, 5, 5)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdirecion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

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

        btguardar.setBackground(new java.awt.Color(190, 74, 77));
        btguardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btguardar.setForeground(new java.awt.Color(255, 255, 255));
        btguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/Ok_24px.png"))); // NOI18N
        btguardar.setText("Guardar");
        btguardar.setContentAreaFilled(false);
        btguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btguardar.setOpaque(true);
        btguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguardarActionPerformed(evt);
            }
        });

        txtfecha.setForeground(new java.awt.Color(153, 153, 153));
        txtfecha.setFocusCycleRoot(true);
        txtfecha.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N

        javax.swing.GroupLayout panel_categoriaLayout = new javax.swing.GroupLayout(panel_categoria);
        panel_categoria.setLayout(panel_categoriaLayout);
        panel_categoriaLayout.setHorizontalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addGap(37, 37, 37)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panel_categoriaLayout.setVerticalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        Ajustes.Modelo.Empresa empresa = new Ajustes.Modelo.Empresa();
        int selecionado = cboemail.getSelectedIndex();
        selecionado = cbotelefono.getSelectedIndex();
        
        
        Calendar cal;
        int d,m,a;
        cal =txtfecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) -1900;
        
        empresa.setFecha(new Date(a,m,d).toString());
        empresa.setNombre(txtnombre.getText());
        empresa.setApartamento(txtdepartamento.getText());
        empresa.setDireccion(txtdirecion.getText());
        empresa.setTelefono((String)cbotelefono.getSelectedItem().toString().concat(txttelefono.getText()));
        empresa.setCorreo(txtcorreo.getText().concat((String)cboemail.getSelectedItem().toString()));
        
        
        //Validar campos texto, cambo box etc
        if( cboemail.getSelectedItem().equals("--"))
        {
            val.valEsp(txtnombre);
            val.valEsp(txtdepartamento);
            val.valEsp(txtdirecion);
            val.valEsp(cbotelefono);
            val.valEsp(txttelefono);
            val.valEsp(txtcorreo);
            val.valEsp(cboemail);
            
        }else
        {
            boolean res= Ajustes.Controlador.Application.onempresa(empresa);
        if( res == true )
        {
            Ajustes.Controlador.Application.showMessageDialog( "Los datos de la empresa fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
            inhabilitar();}
         else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        }
          
    }//GEN-LAST:event_btguardarActionPerformed

    private void txttelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyReleased
        val.digitos(txttelefono, evt);
    }//GEN-LAST:event_txttelefonoKeyReleased

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
    private javax.swing.JComboBox<String> cbotelefono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel lbid1;
    private javax.swing.JPanel panel_categoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdepartamento;
    private javax.swing.JTextField txtdirecion;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
