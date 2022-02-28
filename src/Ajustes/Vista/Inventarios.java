
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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.codec.digest.DigestUtils;

public class Inventarios extends javax.swing.JPanel
{
   java.util.ArrayList<Ajustes.Modelo.Marca> marca;
   java.util.ArrayList<Ajustes.Modelo.Categoria> categoria;
   java.util.ArrayList<Ajustes.Modelo.Unidades> unidad;
    
    public Inventarios() {
        initComponents();
        cargarMarcas();
        cargarCategoria();
        cargarUnidad();
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
        (new ExpandOnFocus(new java.awt.Dimension(274,50), new java.awt.Dimension(10,0), 200, txtfecha)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(264,50), new java.awt.Dimension(10,0), 200, txtcodigo)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(328,50), new java.awt.Dimension(10,0), 200, txtnombre)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(162,50), new java.awt.Dimension(10,0), 200, txtmodelo)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(156,50), new java.awt.Dimension(10,0), 200, txtserial)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(162,50), new java.awt.Dimension(10,0), 200, cbomarca)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(156,50), new java.awt.Dimension(10,0), 200, cbocategoria)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(162,50), new java.awt.Dimension(10,0), 200, cbounidad_medida)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(159,50), new java.awt.Dimension(10,0), 200, txtstock)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(159,50), new java.awt.Dimension(10,0), 200, txtubicacion)).build();
        
        (new ExpandOnFocus(new java.awt.Dimension(159,50), new java.awt.Dimension(10,0), 200, cboestado)).build();
        
        // Creando efecto de nombre de campo de texto
        (new TextFieldName("Codigo", txtcodigo)).build();
        
        // Creando efecto de cambio de color de campos de texto
        Color colorA = new Color(255, 255, 255, 255);
        Color colorB = new Color(255, 255, 255, 100);
        Color foregroundA = new Color(49, 152, 211);
        Color foregroundB = new Color(255, 255, 255);

        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtcodigo)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtnombre)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtmodelo)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtserial)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtstock)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB, txtubicacion)).build();
        
       
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtnombre, "<html><left>Introduzca el nombre del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtmodelo, "<html><left>Introduzca el modelo del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtserial, "<html><left>Introduzca el serial del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),cbomarca, "<html><left>Introduzca la marca del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),cbocategoria, "<html><left>Introduzca la categoria del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),cbounidad_medida, "<html><left>Introduzca la unidad de medida del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtstock, "<html><left>Introduzca la unidad el stock del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),txtubicacion, "<html><left>Introduzca la ubicacion del producto.</left></html>",200)).build();
        
        (new ToolTip(AppView.loadImage("tooltip.png"),cboestado, "<html><left>Introduzca el estado del producto.</left></html>",200)).build();
        
        // Creando efecto de seleccion de boton
        (new ButtonFlash(btnuevo, new java.awt.Color(45, 164, 134, 0))).build();
        
        (new ButtonFlash(btguardar, new java.awt.Color(45, 164, 134, 0))).build();
        
    }
    public void habilitar(){
        txtfecha.setEnabled(false);
        lbid.setVisible(false);
        txtfecha.setCalendar(fecha_actual);
        txtfecha.setVisible(false);
        txtcodigo.setEnabled(true);
        txtnombre.setEnabled(true);
        txtmodelo.setEnabled(true);
        txtserial.setEnabled(true);
        cbomarca.setEnabled(true);
        cbocategoria.setEnabled(true);
        cbounidad_medida.setEnabled(true);
        txtstock.setEnabled(true);
        txtubicacion.setEnabled(true);
        cboestado.setEnabled(true);
        

        
        btguardar.setEnabled(true);
        
        txtcodigo.setText("");
        txtnombre.setText("");
        txtmodelo.setText("");
        txtserial.setText("");
        txtstock.setText("");
        txtubicacion.setText("");
        
        //cboemail.setSelectedIndex(0);
        cbomarca.setSelectedIndex(0);
        cbocategoria.setSelectedIndex(0);
        cbounidad_medida.setSelectedIndex(0);
        cboestado.setSelectedIndex(0);
        
        
    }
    
    public void inhabilitar(){
        lbid.setVisible(false);
        txtcodigo.setEnabled(false);
        txtfecha.setEnabled(false);
        txtfecha.setVisible(false);
        txtnombre.setEnabled(false);
        txtmodelo.setEnabled(false);
        txtserial.setEnabled(false);
        cbomarca.setEnabled(false);
        cbocategoria.setEnabled(false);
        cbounidad_medida.setEnabled(false);
        txtstock.setEnabled(false);
        txtubicacion.setEnabled(false);
        cboestado.setEnabled(false);
        
        btguardar.setEnabled(false);
        
        //txtfecha.setText("");
        txtcodigo.setText("");
        txtnombre.setText("");
        txtmodelo.setText("");
        txtserial.setText("");
        txtstock.setText("");
        txtubicacion.setText("");
        
        //cboemail.setSelectedIndex(0);
        cbomarca.setSelectedIndex(0);
        cbocategoria.setSelectedIndex(0);
        cbounidad_medida.setSelectedIndex(0);
        cboestado.setSelectedIndex(0); 
    }
    
    public void cargarMarcas()
    {
        marca = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Marca() );
        if( marca != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Marca c : marca)
                ((DefaultComboBoxModel)model).addElement(c.getMarca());

            cbomarca.setModel(model);
        }
    }
    
    public void cargarCategoria()
    {
        categoria = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Categoria() );
        if( categoria != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Categoria c : categoria)
                ((DefaultComboBoxModel)model).addElement(c.getCategoria());

            cbocategoria.setModel(model);
        }
    }
    
    public void cargarUnidad()
    {
        unidad = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Unidades() );
        if( unidad != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Unidades c : unidad)
                ((DefaultComboBoxModel)model).addElement(c.getMedida());

            cbounidad_medida.setModel(model);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_categoria = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtfecha = new com.toedter.calendar.JDateChooser();
        lbid = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtmodelo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtserial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbomarca = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbocategoria = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbounidad_medida = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtubicacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        btnuevo = new javax.swing.JButton();
        btguardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255,255,255,50));
        setMaximumSize(new java.awt.Dimension(430, 530));
        setMinimumSize(new java.awt.Dimension(430, 530));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(430, 530));

        panel_categoria.setBackground(new java.awt.Color(0,0,0,10));
        panel_categoria.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Nuevo Registro", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Codigo");

        txtfecha.setForeground(new java.awt.Color(153, 153, 153));
        txtfecha.setFocusCycleRoot(true);
        txtfecha.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtfecha.setPreferredSize(new java.awt.Dimension(95, 23));

        lbid.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        lbid.setForeground(new java.awt.Color(255, 255, 255));
        lbid.setText("<html><center><p>FECHA</p></html>");

        txtcodigo.setBackground(new java.awt.Color( 255, 255, 255, 100 ));
        txtcodigo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigo.setText("Codigo");

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<html><center><p>NOMBRE</p></html>");

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<html><center><p>MODELO</p></html>");

        txtmodelo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtmodelo.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("<html><center><p>SERIAL</p></html>");

        txtserial.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtserial.setPreferredSize(new java.awt.Dimension(6, 22));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("<html><center><p>MARCA</p></html>");

        cbomarca.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbomarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        cbomarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbomarca.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<html><center><p>CATEGORIA</p></html>");

        cbocategoria.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbocategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        cbocategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbocategoria.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("<html><center><p>UNIDAD MEDIDA</p></html>");

        cbounidad_medida.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbounidad_medida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "0414", "0424", "0416", "0426", "0412", "0251", "0253", "Otro" }));
        cbounidad_medida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbounidad_medida.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<html><center><p>STOCK</p></html>");

        txtstock.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtstock.setPreferredSize(new java.awt.Dimension(6, 23));
        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstockKeyReleased(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("<html><center><p>UBICACIÓN</p></html>");

        txtubicacion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtubicacion.setPreferredSize(new java.awt.Dimension(6, 23));

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html><center><p>ESTADO</p></html>");

        cboestado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Nuevo", "Bueno", "Usado", "Dañado" }));
        cboestado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestado.setOpaque(false);

        javax.swing.GroupLayout panel_categoriaLayout = new javax.swing.GroupLayout(panel_categoria);
        panel_categoria.setLayout(panel_categoriaLayout);
        panel_categoriaLayout.setHorizontalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_categoriaLayout.createSequentialGroup()
                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panel_categoriaLayout.createSequentialGroup()
                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbounidad_medida, 0, 162, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmodelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbomarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel_categoriaLayout.createSequentialGroup()
                                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(95, 95, 95))
                                            .addComponent(cbocategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(txtstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoriaLayout.createSequentialGroup()
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_categoriaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_categoriaLayout.createSequentialGroup()
                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbid))
                                .addGap(26, 26, 26)
                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcodigo)))
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_categoriaLayout.createSequentialGroup()
                                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(130, 130, 130)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))))
        );
        panel_categoriaLayout.setVerticalGroup(
            panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbid))
                    .addGroup(panel_categoriaLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoriaLayout.createSequentialGroup()
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel_categoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbounidad_medida, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoriaLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(231, 231, 231))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(panel_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        habilitar();
        btguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnuevoActionPerformed

    private void btguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguardarActionPerformed
        Ajustes.Modelo.Inventario inventario = new Ajustes.Modelo.Inventario();
        int selecionado = cboestado.getSelectedIndex();
        
        
        Calendar cal;
        int d,m,a;
        cal =txtfecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) -1900;
        
        inventario.setFecha(new Date(a,m,d).toString());
        inventario.setNombre(txtnombre.getText());
        inventario.setModelo(txtmodelo.getText());
        inventario.setSerial(txtserial.getText());
        inventario.setUbicacion(txtubicacion.getText());
        inventario.setEstado((String)cboestado.getSelectedItem().toString());
        inventario.setStock(Integer.parseInt(txtstock.getText()));    
        
        //Validar campos texto, cambo box etc
        if( cboestado.getSelectedItem().equals("--"))
        {
            val.valEsp(txtnombre);
            val.valEsp(txtmodelo);
            val.valEsp(txtserial);
            val.valEsp(txtstock);
            val.valEsp(txtubicacion);
            val.valEsp(cboestado);
        }else
        {
            boolean res= Ajustes.Controlador.Application.oninventario(inventario);
        if( res == true )
        {
            Ajustes.Controlador.Application.showMessageDialog( "El articulo del inventario fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
            inhabilitar();}
         else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        }
          
    }//GEN-LAST:event_btguardarActionPerformed

    private void txtstockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyReleased
        val.digitos(txtstock, evt);
    }//GEN-LAST:event_txtstockKeyReleased

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
    private javax.swing.JComboBox<String> cbocategoria;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cbomarca;
    private javax.swing.JComboBox<String> cbounidad_medida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbid;
    private javax.swing.JPanel panel_categoria;
    private javax.swing.JTextField txtcodigo;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtserial;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txtubicacion;
    // End of variables declaration//GEN-END:variables
}
