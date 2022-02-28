
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

public class Categoria_Inventario extends javax.swing.JPanel{
    ArrayList<Categoria> listaBase = new ArrayList();
    ArrayList<Categoria> listaFiltro = new ArrayList();
    ArrayList<ArrayList<Categoria>> historial = new ArrayList();
    int index = 0;
    
    public Categoria_Inventario() {
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
        
        (new ExpandOnFocus(new java.awt.Dimension(140,50), new java.awt.Dimension(30,0), 200, txtcodigo)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(135,50), new java.awt.Dimension(10,0), 200, txtcategoria)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(140,50), new java.awt.Dimension(10,0), 200, txtdescripcion)).build();

        // Creando efecto de nombre de campo de texto
        (new TextFieldName("Codigo", txtcodigo)).build();
        
        // Creando efecto de cambio de color de campos de texto
        Color colorA = new Color(255, 255, 255, 255);
        Color colorB = new Color(255, 255, 255, 100);
        Color foregroundA = new Color(49, 152, 211);
        Color foregroundB = new Color(255, 255, 255);

        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtcodigo)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtcategoria)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtdescripcion)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcategoria, "<html><left>Introduzca el nombre de la categoria del producto.</left></html>",300)).build();
        
        // Creando efecto de seleccion de boton
        (new ButtonFlash(btnuevo, new java.awt.Color(45, 164, 134, 0))).build();
        
        (new ButtonFlash(btguardar, new java.awt.Color(45, 164, 134, 0))).build();
        
    }
    public void habilitar(){
        txtfecha.setEnabled(false);
        lbid.setVisible(false);
        txtfecha.setCalendar(fecha_actual);
        txtcodigo.setVisible(false);
        txtcategoria.setEnabled(true);
        txtdescripcion.setEnabled(true);

        
        btguardar.setEnabled(true);
        txtcodigo.setText("");
        txtcategoria.setText("");
        txtdescripcion.setText("");
    }
    
    public void inhabilitar(){
        lbid.setVisible(false);
        txtcodigo.setVisible(false);
        txtfecha.setEnabled(false);
        txtcategoria.setEnabled(false);
        txtdescripcion.setEnabled(false);
        
        btguardar.setEnabled(false);
        
        //txtfecha.setText("");
        txtcategoria.setText("");
        txtdescripcion.setText("");
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
        txtcategoria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();
        txtfecha = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255,255,255,50));
        setMaximumSize(new java.awt.Dimension(320, 320));
        setMinimumSize(new java.awt.Dimension(320, 320));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(320, 320));

        panel_categoria.setBackground(new java.awt.Color(0,0,0,10));
        panel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Categorias de Artículos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FECHA");

        jPanel4.setBackground(new java.awt.Color(51,51,51,100));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Artículos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
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
        jLabel8.setText("<html><center><p>CATEGORIA</p></html>");

        txtcategoria.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html><center><p>DESCRIPCION</p></html>");

        txtdescripcion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtcategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
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
                    .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout panel_categoriaLayout = new javax.swing.GroupLayout(panel_categoria);
        panel_categoria.setLayout(panel_categoriaLayout);
        panel_categoriaLayout.setHorizontalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(201, 201, 201))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panel_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        Ajustes.Modelo.Categoria categoria = new Ajustes.Modelo.Categoria();
        
        Calendar cal;
        int d,m,a;
        cal =txtfecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) -1900;
        
        categoria.setFecha(new Date(a,m,d).toString());
        categoria.setCategoria(txtcategoria.getText());
        categoria.setDescripcion(txtdescripcion.getText());
        
        //Validar campos texto, cambo box etc
        if( txtdescripcion.getText().equals(""))
        {
            val.valEsp(txtcategoria);
            val.valEsp(txtdescripcion);
            
        }else
        {
            boolean res= Ajustes.Controlador.Application.oncategoria(categoria);
        if( res == true )
        {
            Ajustes.Controlador.Application.showMessageDialog( "La categoria del producto fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
            inhabilitar();}
         else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        }
          
    }//GEN-LAST:event_btguardarActionPerformed

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbid;
    private javax.swing.JPanel panel_categoria;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private com.toedter.calendar.JDateChooser txtfecha;
    // End of variables declaration//GEN-END:variables
}
