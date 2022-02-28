/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajustes.Vista;

import static Ajustes.Controlador.Application.crearBitacora;
import Ajustes.Controlador.ConexBD;
import Ajustes.Controlador.Conexion;
import Ajustes.Controlador.Validations;
import EgoistSwing.Util.AppView;
import EgoistSwing.Util.ButtonFlash;
import EgoistSwing.Util.ExpandOnFocus;
import EgoistSwing.Util.TextFieldColorOnFocus;
import EgoistSwing.Util.ToolTip;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fraibert Bracho
 */
public class Historia_Medica extends javax.swing.JPanel {
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Cedula> cedula;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Correo> correo;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Estado> estado;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Estado_Civil> estado_civil;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Grado_instrucion> grado;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Sexo> sexo;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Telf> telf;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Tipo_paciente> tipo;
     java.util.ArrayList<Ajustes.Modelo.Dato_Personal.Parentesco> parentesco;
     Ajustes.Modelo.Paciente paciente;
     
     
    //para obtener la fecha actual del sistema
    Calendar fecha_actual=new GregorianCalendar();
    Conexion mysql = new Conexion();
    Connection cn= mysql.Conectar();
    
    public Historia_Medica() {
        initComponents();
        setEgoistStyle();
        cargarCedula();
        cargarCorreo();
        cargarEstado();
        cargarEstadoCivil();
        cargarGrado();
        cargarParentesco();
        cargarSexo();
        cargarTelefo();
        cargarTipo();
        cargarcedula1();
        cargarTelefo1();
        btmodificar.setEnabled(false);
        cancelar1.setEnabled(false);
    }
    //validaciones
    Validations val = new Validations();
    
    public void eliminar(){
        try 
        {  
            
           
            PreparedStatement pst= cn.prepareStatement("DELETE FROM paciente_temp");
            pst.executeUpdate();
           
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Historia_Medica.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    Color colorA=new Color(255,255,255,255);
    Color colorB=new Color(255,255,255,100);
    Color foregroundA=new Color(49,152,211);
    Color foregroundB=new Color(255,255,255);
    
  
   public void setEgoistStyle(){   
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcedula, "<html><left>Introduzca la cedula del paciente, la primera letra en mayúscula.</left></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtnombre, "<html><left>Introduzca el nombre del paciente, la primera letra en mayúscula.</left></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtapellido, "<html><lef>Introduzca el apellido del paciente, la primera letra en mayúscula.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),titulostxt, "<html><lef>Introduzca la dirección del paciente, la primera letra en mayúscula.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcorreo, "<html><lef>Introduzca el correo electronico del paciente.</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtprofesion, "<html><left>Introduzca la profesión del paciente, la primera letra en mayúscula.</left></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtocupacion, "<html><left>Introduzca la ocupación del paciente.</left></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txttelefono,"<html><lef>Introduzca su numero de telefono ya que nos ayuda a mantener tu cuenta segura</lef></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcot_nombre, "<html><left>Introduzca el nombre del representante del paciente.</left></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcot_apellido, "<html><left>Introduzca el apellido del representante del paciente.</left></html>",200)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtcotcedula, "<html><left>Introduzca la cedula del representante del paciente.</left></html>",300)).build();
        (new ToolTip(AppView.loadImage("tooltip.png"),txtelefono,"<html><lef>Introduzca el numero de telefono del representante en caso de emergencia</lef></html>",300)).build();
        
        
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcedula)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtnombre)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtapellido)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcorreo)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtprofesion)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtocupacion)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txttelefono)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcot_nombre)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcot_apellido)).build();
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtcotcedula)).build();
        
        (new TextFieldColorOnFocus(colorA, colorB, foregroundA, foregroundB,txtelefono)).build();
        
    }

  public void limpiar(){
   txtcedula.setText("");
   txtnombre.setText("");
   txtapellido.setText("");
   titulostxt.setText("");
   txtcorreo.setText("");
   cbogrado.setSelectedIndex(0);
   txtprofesion.setText("");
   txtocupacion.setText("");
   txttelefono.setText("");
   txtcot_nombre.setText("");
   txtcot_apellido.setText("");
   txtcotcedula.setText("");
   txtelefono.setText("");
   txtfecha_nacimiento.setDate(null);
   areacedula.setSelectedIndex(0);
   cbosexo.setSelectedIndex(0);
   cbolugar_nacimiento.setSelectedIndex(0);
   cbotipo_paciente.setSelectedIndex(0);
   areacorreo.setSelectedIndex(0);
   cboestadocivil.setSelectedIndex(0);
   areatelefono.setSelectedIndex(0);
   cotareacedula.setSelectedIndex(0);
   cboparentesco.setSelectedIndex(0);
   cotareatelefo.setSelectedIndex(0);
   finalizar.setEnabled(true);
   btmodificar.setEnabled(false);
   cancelar1.setEnabled(false);
       
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
    
  public void cargarEstado()
    {
        estado = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Estado());
        if( estado != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Estado c : estado)
                ((DefaultComboBoxModel)model).addElement(c.getEstado());

            cbolugar_nacimiento.setModel(model);
        }
    }
  
  public void cargarEstadoCivil()
    {
        estado_civil = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Estado_Civil());
        if( estado_civil != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Estado_Civil c : estado_civil)
                ((DefaultComboBoxModel)model).addElement(c.getEstado());

            cboestadocivil.setModel(model);
        }
    }
  
   public void cargarGrado()
    {
        grado = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Grado_instrucion());
        if( grado != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Grado_instrucion c : grado)
                ((DefaultComboBoxModel)model).addElement(c.getGrado());

            cbogrado.setModel(model);
        }
    }
   
   public void cargarParentesco()
    {
        parentesco = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Parentesco());
        if( parentesco != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Parentesco c : parentesco)
                ((DefaultComboBoxModel)model).addElement(c.getParentesco());

            cboparentesco.setModel(model);
        }
    }
   
   public void cargarSexo()
    {
        sexo = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Sexo());
        if( sexo != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Sexo c : sexo)
                ((DefaultComboBoxModel)model).addElement(c.getSexo());

            cbosexo.setModel(model);
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
   
   public void cargarTipo()
    {
        tipo = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Tipo_paciente());
        if( tipo != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Tipo_paciente c : tipo)
                ((DefaultComboBoxModel)model).addElement(c.getTipo_paci());

            cbotipo_paciente.setModel(model);
        }
    }
   
   public void cargarcedula1()
    {
        cedula = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Cedula());
        if( cedula != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Cedula c : cedula)
                ((DefaultComboBoxModel)model).addElement(c.getCedula());

            cotareacedula.setModel(model);
        }
    }
   
   public void cargarTelefo1()
    {
        telf = Ajustes.Controlador.Application.loadDbItems( new Ajustes.Modelo.Dato_Personal.Telf());
        if( telf != null )
        {
            ComboBoxModel model = new DefaultComboBoxModel<>();
            for( Ajustes.Modelo.Dato_Personal.Telf c : telf)
                ((DefaultComboBoxModel)model).addElement(c.getTelf());

            cotareatelefo.setModel(model);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_categoria1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbolugar_nacimiento = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cbotipo_paciente = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        areacedula = new javax.swing.JComboBox<>();
        txtcedula = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbosexo = new javax.swing.JComboBox<>();
        txtfecha_nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel47 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        actualizarbtn = new javax.swing.JButton();
        buscarbtn = new javax.swing.JButton();
        previousseccionbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        titulostxt = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        panel_categoria3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtprofesion = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        cboestadocivil = new javax.swing.JComboBox<>();
        areacorreo = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        txtocupacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtcot_nombre = new javax.swing.JTextField();
        txtcot_apellido = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cotareacedula = new javax.swing.JComboBox<>();
        txtcotcedula = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        cboparentesco = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        cotareatelefo = new javax.swing.JComboBox<>();
        txtelefono = new javax.swing.JTextField();
        areatelefono = new javax.swing.JComboBox<>();
        txttelefono = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        nextbtn = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        btmodificar = new javax.swing.JButton();
        cancelar1 = new javax.swing.JButton();
        cbogrado = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(33,116,162,30));
        setMaximumSize(new java.awt.Dimension(1029, 616));
        setMinimumSize(new java.awt.Dimension(1029, 616));

        panel_categoria1.setBackground(new java.awt.Color(33,116,162,30));
        panel_categoria1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Nuevo Paciente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<html><center><p>NOMBRE</p></html>");

        txtnombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("<html><center><p>SEXO</p></html>");

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("<html><center><p>FECHA NACIMIENTO</p></html>");

        jLabel20.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("<html><center><p>LUGAR DE NACIMIENTO</p></html>");

        cbolugar_nacimiento.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbolugar_nacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cbolugar_nacimiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbolugar_nacimiento.setOpaque(false);

        jLabel21.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("<html><center><p>TIPO PACIENTE</p></html>");

        cbotipo_paciente.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbotipo_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cbotipo_paciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbotipo_paciente.setOpaque(false);

        jLabel46.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("<html><center><p>CEDULA</p></html>");

        areacedula.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areacedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        areacedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areacedula.setOpaque(false);

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

        txtapellido.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("<html><center><p>APELLIDO</p></html>");

        cbosexo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cbosexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbosexo.setOpaque(false);

        txtfecha_nacimiento.setForeground(new java.awt.Color(153, 153, 153));
        txtfecha_nacimiento.setFocusCycleRoot(true);
        txtfecha_nacimiento.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        txtfecha_nacimiento.setPreferredSize(new java.awt.Dimension(95, 23));

        jLabel47.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("<html><center><p>DIRECIÖN</p></html>");

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

        buscarbtn.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        buscarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/finish.png"))); // NOI18N
        buscarbtn.setText("Buscar");
        buscarbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        buscarbtn.setContentAreaFilled(false);
        buscarbtn.setOpaque(true);
        buscarbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        buscarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarbtnMouseExited(evt);
            }
        });
        buscarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbtnActionPerformed(evt);
            }
        });

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

        titulostxt.setColumns(20);
        titulostxt.setRows(5);
        titulostxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                titulostxtKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(titulostxt);

        javax.swing.GroupLayout panel_categoria1Layout = new javax.swing.GroupLayout(panel_categoria1);
        panel_categoria1.setLayout(panel_categoria1Layout);
        panel_categoria1Layout.setHorizontalGroup(
            panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoria1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoria1Layout.createSequentialGroup()
                        .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_categoria1Layout.createSequentialGroup()
                                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbosexo, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtapellido)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoria1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtfecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panel_categoria1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_categoria1Layout.createSequentialGroup()
                                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(areacedula, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addGap(27, 27, 27))
                    .addGroup(panel_categoria1Layout.createSequentialGroup()
                        .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_categoria1Layout.createSequentialGroup()
                                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbolugar_nacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_categoria1Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95))
                                    .addComponent(cbotipo_paciente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_categoria1Layout.createSequentialGroup()
                                    .addComponent(previousseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        panel_categoria1Layout.setVerticalGroup(
            panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoria1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areacedula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buscarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_categoria1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_categoria1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbolugar_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbotipo_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_categoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previousseccionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
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

        jLabel38.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("<html><center><p>GRADO DE INSTRUCIÖN</p></html>");

        jLabel39.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("<html><center><p>PROFECIÖN</p></html>");

        txtprofesion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtprofesion.setPreferredSize(new java.awt.Dimension(6, 22));
        txtprofesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprofesionKeyTyped(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("<html><center><p>ESTADO CIVIL</p></html>");

        cboestadocivil.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboestadocivil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboestadocivil.setOpaque(false);

        areacorreo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areacorreo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        areacorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areacorreo.setOpaque(false);

        jLabel48.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("<html><center><p>OCUPACIÖN</p></html>");

        txtocupacion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtocupacion.setPreferredSize(new java.awt.Dimension(6, 22));
        txtocupacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtocupacionKeyTyped(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51,51,51,100));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "En caso de emergencia contactar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setOpaque(false);

        jLabel22.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("<html><center><p>NOMBRE</p></html>");

        txtcot_nombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcot_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcot_nombreKeyTyped(evt);
            }
        });

        txtcot_apellido.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcot_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcot_apellidoKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("<html><center><p>APELLIDO</p></html>");

        cotareacedula.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cotareacedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cotareacedula.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cotareacedula.setOpaque(false);

        txtcotcedula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txtcotcedula.setPreferredSize(new java.awt.Dimension(6, 22));
        txtcotcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcotcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcotcedulaKeyTyped(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("<html><center><p>CEDULA</p></html>");

        jLabel42.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("<html><center><p>PARENTESCO</p></html>");

        cboparentesco.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cboparentesco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cboparentesco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cboparentesco.setOpaque(false);

        jLabel51.setFont(new java.awt.Font("Segoe UI Symbol", 1, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("<html><center><p>TELËFONO</p></html>");

        cotareatelefo.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cotareatelefo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cotareatelefo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cotareatelefo.setOpaque(false);

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcot_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcot_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cotareacedula, 0, 162, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64)))
                            .addGap(18, 18, 18)
                            .addComponent(txtcotcedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cotareatelefo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcot_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcot_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cotareacedula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcotcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(cboparentesco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cotareatelefo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );

        areatelefono.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        areatelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        areatelefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areatelefono.setOpaque(false);

        txttelefono.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        txttelefono.setPreferredSize(new java.awt.Dimension(6, 22));
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
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
        nextbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextbtnMouseExited(evt);
            }
        });
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        finalizar.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        finalizar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/complete.png"))); // NOI18N
        finalizar.setText("Guardar");
        finalizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        finalizar.setContentAreaFilled(false);
        finalizar.setOpaque(true);
        finalizar.setPreferredSize(new java.awt.Dimension(100, 25));
        finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finalizarMouseExited(evt);
            }
        });
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        btmodificar.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        btmodificar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/finish.png"))); // NOI18N
        btmodificar.setText("Modificar");
        btmodificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btmodificar.setContentAreaFilled(false);
        btmodificar.setOpaque(true);
        btmodificar.setPreferredSize(new java.awt.Dimension(100, 25));
        btmodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmodificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmodificarMouseExited(evt);
            }
        });
        btmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodificarActionPerformed(evt);
            }
        });

        cancelar1.setBackground(new java.awt.Color( 255, 255, 255, 125 ));
        cancelar1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botones/del.png"))); // NOI18N
        cancelar1.setText("Eliminar");
        cancelar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cancelar1.setContentAreaFilled(false);
        cancelar1.setOpaque(true);
        cancelar1.setPreferredSize(new java.awt.Dimension(100, 25));
        cancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelar1MouseExited(evt);
            }
        });
        cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar1ActionPerformed(evt);
            }
        });

        cbogrado.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        cbogrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        cbogrado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbogrado.setOpaque(false);

        javax.swing.GroupLayout panel_categoria3Layout = new javax.swing.GroupLayout(panel_categoria3);
        panel_categoria3.setLayout(panel_categoria3Layout);
        panel_categoria3Layout.setHorizontalGroup(
            panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoria3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoria3Layout.createSequentialGroup()
                            .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel_categoria3Layout.createSequentialGroup()
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(areacorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_categoria3Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(panel_categoria3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cboestadocivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(panel_categoria3Layout.createSequentialGroup()
                            .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_categoria3Layout.createSequentialGroup()
                                    .addComponent(cbogrado, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoria3Layout.createSequentialGroup()
                            .addComponent(btmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_categoria3Layout.createSequentialGroup()
                        .addComponent(areatelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        panel_categoria3Layout.setVerticalGroup(
            panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoria3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoria3Layout.createSequentialGroup()
                        .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_categoria3Layout.createSequentialGroup()
                                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(areacorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cboestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoria3Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbogrado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoria3Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoria3Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(areatelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_categoria3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panel_categoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_categoria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_categoria1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_categoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void previousseccionbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousseccionbtnMouseExited
        previousseccionbtn.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_previousseccionbtnMouseExited

    private void previousseccionbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousseccionbtnMouseEntered
        previousseccionbtn.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_previousseccionbtnMouseEntered

    private void actualizarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseExited
        actualizarbtn.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_actualizarbtnMouseExited

    private void actualizarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarbtnMouseEntered
        actualizarbtn.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_actualizarbtnMouseEntered

    private void actualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarbtnActionPerformed
        limpiar();
    }//GEN-LAST:event_actualizarbtnActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        Ajustes.Modelo.Paciente paciente = new Ajustes.Modelo.Paciente();

        //Ingresar combobox cedula
        int selecionado = areacedula.getSelectedIndex();
        paciente.setAreacedula((String)areacedula.getItemAt(selecionado));
        //Ingresar campo de texto cedula
        paciente.setCedula(txtcedula.getText());
        //Ingresar campo de texto nombre
        paciente.setNombre(txtnombre.getText());
        //Ingresar campo de texto apellido
        paciente.setApellido(txtapellido.getText());
        //Ingresar combobox sexo
        selecionado = cbosexo.getSelectedIndex();
        paciente.setSexo((String)cbosexo.getItemAt(selecionado));
        //Ingresar Jcalendar
        String selectdate = ((JTextField)txtfecha_nacimiento.getDateEditor().getUiComponent()).getText();
        paciente.setFecha_nacimiento(selectdate);
        //Ingresar combobox lugar de nacimiento
        selecionado = cbolugar_nacimiento.getSelectedIndex();
        paciente.setLugar_nacimiento((String)cbolugar_nacimiento.getItemAt(selecionado));
        //Ingresar combobox tipo paciente
        selecionado = cbotipo_paciente.getSelectedIndex();
        paciente.setTipo_paciente((String)cbotipo_paciente.getItemAt(selecionado));
        //Ingresar campo de texto direcion
        paciente.setDireccion(titulostxt.getText());
        //Ingresar campo de texto correo
        paciente.setCorreo(txtcorreo.getText());
        //Ingresar combobox correo
        selecionado = areacorreo.getSelectedIndex();
        paciente.setAreacorreo((String)areacorreo.getItemAt(selecionado));
        //Ingresar combobox estado civil
        selecionado = cboestadocivil.getSelectedIndex();
        paciente.setEstado_civil((String)cboestadocivil.getItemAt(selecionado));
        //Ingresar combobox instrucion
        selecionado = cbogrado.getSelectedIndex();
        paciente.setGrado_instrucion((String)cbogrado.getItemAt(selecionado));
        //Ingresar campo de texo profesion
        paciente.setProfesion(txtprofesion.getText());
        //Ingresar campo de texo ocupacion
        paciente.setOcupacion(txtocupacion.getText());
        
        //Ingresar combobox area telefono
        selecionado = areatelefono.getSelectedIndex();
        paciente.setAreatelefono((String)areatelefono.getItemAt(selecionado));
        //Ingresar campo de texo telefono
        paciente.setTelefono(txttelefono.getText());
        
        //Ingresar campo de texo cot nombre
        paciente.setCoct_nombre(txtcot_nombre.getText());
        //Ingresar campo de texo cot apellido
        paciente.setCoct_apellido(txtcot_apellido.getText());
        //Ingresar combobox area cedula
        selecionado = cotareacedula.getSelectedIndex();
        paciente.setCoct_areacedula((String)cotareacedula.getItemAt(selecionado));
        //Ingresar campo de texto cot cedula
        paciente.setCoct_cedula(txtcotcedula.getText());
        //Ingresar combobox area parentesco
        selecionado = cboparentesco.getSelectedIndex();
        paciente.setCoct_parentesco((String)cboparentesco.getItemAt(selecionado));
        //Ingresar combobox area parentesco
        selecionado = cotareatelefo.getSelectedIndex();
        paciente.setCoct_areatelefono((String)cotareatelefo.getItemAt(selecionado));
        //Ingresar campo de texto cot telefono
        paciente.setCoct_telefono(txtelefono.getText());

        //Validar campos texto, cambo box etc
        if( txtelefono.getText().equals(""))
        {
            val.valEsp(areacedula);
            val.valEsp(txtcedula);
            val.valEsp(txtnombre);
            val.valEsp(txtapellido);
            val.valEsp(cbosexo);
            val.valEsp4(txtfecha_nacimiento);
            val.valEsp(cbolugar_nacimiento);
            val.valEsp(cbotipo_paciente);
            val.valEsp(titulostxt);
            val.valEsp(txtcorreo);
            val.valEsp(areacorreo);
            val.valEsp(cboestadocivil);
            val.valEsp(cbogrado);
            val.valEsp(txtprofesion);
            val.valEsp(txtocupacion);
            val.valEsp(areatelefono);
            val.valEsp(txttelefono);
            val.valEsp(txtcot_nombre);
            val.valEsp(txtcot_apellido);
            val.valEsp(cotareacedula);
            val.valEsp(txtcotcedula);
            val.valEsp(cboparentesco);
            val.valEsp(cotareatelefo);
            val.valEsp(txtelefono);
        }else
        {
            boolean res= Ajustes.Controlador.Application.onpaciente(paciente);
            if( res == true )
            {
                Ajustes.Controlador.Application.showMessageDialog( "El paciente fue registrado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
                limpiar();
            }
            else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        }
    }//GEN-LAST:event_finalizarActionPerformed

    private void buscarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbtnActionPerformed
        paciente = new Ajustes.Modelo.Paciente();
        String area;
        paciente.setCedula(txtcedula.getText());
        
        area = (String) areacedula.getSelectedItem().toString();
        paciente.setAreacedula(area);
        
        
        java.util.ArrayList<Ajustes.Modelo.Paciente> pacientes = Ajustes.Controlador.Application.loadDbItems(paciente, "cedula", "'" + paciente.getCedula() + "'" );

        if( pacientes != null )
        {   
            if( pacientes.size() > 0 && pacientes.get(0).getAreacedula().equals(paciente.getAreacedula()))
            { 
                txtnombre.setText(pacientes.get(0).getNombre());
                txtapellido.setText(pacientes.get(0).getApellido());
                cbosexo.setSelectedItem(pacientes.get(0).getSexo());
                cbolugar_nacimiento.setSelectedItem(pacientes.get(0).getLugar_nacimiento());
                cbotipo_paciente.setSelectedItem(pacientes.get(0).getTipo_paciente());
                titulostxt.setText(pacientes.get(0).getDireccion());
                txtcorreo.setText(pacientes.get(0).getCorreo());
                areacorreo.setSelectedItem(pacientes.get(0).getAreacorreo());
                cboestadocivil.setSelectedItem(pacientes.get(0).getEstado_civil());
                cbogrado.setSelectedItem(pacientes.get(0).getGrado_instrucion());
                txtprofesion.setText(pacientes.get(0).getProfesion());
                txtocupacion.setText(pacientes.get(0).getOcupacion());
                
                areatelefono.setSelectedItem(pacientes.get(0).getAreatelefono());
                txttelefono.setText(pacientes.get(0).getTelefono());
                
                txtcot_nombre.setText(pacientes.get(0).getCoct_nombre());
                txtcot_apellido.setText(pacientes.get(0).getCoct_apellido());
                
                cotareacedula.setSelectedItem(pacientes.get(0).getCoct_areacedula());
                txtcotcedula.setText(pacientes.get(0).getCoct_cedula());
                
                cboparentesco.setSelectedItem(pacientes.get(0).getCoct_parentesco());
                cotareatelefo.setSelectedItem(pacientes.get(0).getCoct_areatelefono());
                txtelefono.setText(pacientes.get(0).getCoct_telefono());
                try {
                    java.util.Date date = new SimpleDateFormat("dd-MMM-yyyy").parse(pacientes.get(0).getFecha_nacimiento());
                    txtfecha_nacimiento.setDate(date);
                } catch (ParseException ex) {
                    Logger.getLogger(Historia_Medica.class.getName()).log(Level.SEVERE, null, ex);
                }
                finalizar.setEnabled(false);
                btmodificar.setEnabled(true);
                cancelar1.setEnabled(true);
            }
            else
                Ajustes.Controlador.Application.showMessageDialog( "El Paciente no se encuentra creado porfavor indicar si:", "Deseas crear el registro", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
               
        }
        else
            Ajustes.Controlador.Application.showSqlErrorMessageDialog();
        
        Ajustes.Controlador.Application.repaintScreen();
    }//GEN-LAST:event_buscarbtnActionPerformed

    private void buscarbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbtnMouseEntered
        buscarbtn.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_buscarbtnMouseEntered

    private void buscarbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbtnMouseExited
        buscarbtn.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_buscarbtnMouseExited

    private void previousseccionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousseccionbtnActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Menu_Modulos());
    }//GEN-LAST:event_previousseccionbtnActionPerformed

    private void finalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseEntered
        finalizar.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_finalizarMouseEntered

    private void finalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarMouseExited
        finalizar.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_finalizarMouseExited

    private void btmodificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmodificarMouseEntered
        btmodificar.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_btmodificarMouseEntered

    private void btmodificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmodificarMouseExited
        btmodificar.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_btmodificarMouseExited

    private void cancelar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar1MouseEntered
        cancelar1.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_cancelar1MouseEntered

    private void cancelar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelar1MouseExited
        cancelar1.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_cancelar1MouseExited

    private void nextbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbtnMouseEntered
        nextbtn.setBackground( new java.awt.Color( 255, 255, 255, 175 ) );
    }//GEN-LAST:event_nextbtnMouseEntered

    private void nextbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextbtnMouseExited
        nextbtn.setBackground( new java.awt.Color( 255, 255, 255, 125 ) );
    }//GEN-LAST:event_nextbtnMouseExited

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        Ajustes.Controlador.Application.callMainOption(new AgendarPaciente());
    }//GEN-LAST:event_nextbtnActionPerformed

    private void cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar1ActionPerformed

    String cedula  =txtcedula.getText();
        if (new ConexBD ().ejecutar("delete FROM paciente WHERE cedula='"+cedula +"'")){
            limpiar();
            Ajustes.Controlador.Application.showMessageDialog( "El paciente fue eliminado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
  }
    }//GEN-LAST:event_cancelar1ActionPerformed

    private void btmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodificarActionPerformed
        String arecedula  =(String)areacedula.getSelectedItem().toString();
        String cedula  = txtcedula.getText();
        String nombre= txtnombre.getText();
        String apellido =txtapellido.getText() ;  
        String sexo  =(String)cbosexo.getSelectedItem().toString();
        String selectdate = ((JTextField)txtfecha_nacimiento.getDateEditor().getUiComponent()).getText();
        String fecha_nacimiento = selectdate;
        String lugar_nacimiento  =(String)cbolugar_nacimiento.getSelectedItem().toString();
        String tipo_paciente  =(String)cbotipo_paciente.getSelectedItem().toString();
        String direccion  = titulostxt.getText();
        String correo  = txtcorreo.getText();
        String areacorreo1  =(String)areacorreo.getSelectedItem().toString();
        String estado_civil  =(String)cboestadocivil.getSelectedItem().toString();
        String grado_instrucion  =(String)cbogrado.getSelectedItem().toString();
        String profesion  = txtprofesion.getText();
        String ocupacion  = txtocupacion.getText();
        String areatelefono1  =(String)areatelefono.getSelectedItem().toString();
        String telefono  = txttelefono.getText();
        String nombre_2= txtcot_nombre.getText();
        String apellido_2= txtcot_apellido.getText();
        String coct_cedula  =(String)cotareacedula.getSelectedItem().toString();
        String coct_areacedula= txtcotcedula.getText();
        String coct_parentesco  =(String)cboparentesco.getSelectedItem().toString();
        String coct_areatelefono  =(String)cotareatelefo.getSelectedItem().toString();
        String coct_telefono= txtelefono.getText();
    if (new ConexBD ().ejecutar("update paciente set areacedula ='"  +arecedula +"', cedula ='"  +cedula+"',  nombre='"  +nombre +"',  apellido='"  +apellido +"', sexo='" +sexo+"', fecha_nacimiento='" +fecha_nacimiento+"', lugar_nacimiento='" +lugar_nacimiento+"', tipo_paciente='" +tipo_paciente+"', direccion='" +direccion+"', correo='" +correo+"', areacorreo='" +areacorreo1+"', estado_civil='" +estado_civil+"', grado_instrucion='" +grado_instrucion+"', profesion='" +profesion+"', ocupacion='" +ocupacion+"', areatelefono='" +areatelefono1+"', telefono='" +telefono+"', coct_nombre='" +nombre_2+"', coct_apellido='" +apellido_2+"', coct_cedula='" +coct_cedula+"', coct_areacedula='" +coct_areacedula+"', coct_parentesco='" +coct_parentesco+"', coct_areatelefono='" +coct_areatelefono+"', coct_telefono='" +coct_telefono+"'  where cedula='" +cedula +"'"))
      {
          limpiar();
            Ajustes.Controlador.Application.showMessageDialog( "La modificación de los datos del paciente fue eliminado satisfactoriamente", "Exito en la transacion", 1, new String[]{"Aceptar"}, new String[]{"accept"} );
      }
    }//GEN-LAST:event_btmodificarActionPerformed

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        val.teclasEspeciales(evt, txtcedula);
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        val.digitos(txtcedula, evt);
        val.espacioMaximo(txtcedula, evt, 9);
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txttelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyPressed
        val.teclasEspeciales(evt, txttelefono);
    }//GEN-LAST:event_txttelefonoKeyPressed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        val.digitos(txttelefono, evt);
        val.espacioMaximo(txttelefono, evt, 7);
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelefonoKeyPressed
        val.teclasEspeciales(evt, txtelefono);
    }//GEN-LAST:event_txtelefonoKeyPressed

    private void txtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtelefonoKeyTyped
        val.digitos(txtelefono, evt);
        val.espacioMaximo(txtelefono, evt, 7);
    }//GEN-LAST:event_txtelefonoKeyTyped

    private void txtcotcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcotcedulaKeyPressed
        val.teclasEspeciales(evt, txtcotcedula);
    }//GEN-LAST:event_txtcotcedulaKeyPressed

    private void txtcotcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcotcedulaKeyTyped
        val.digitos(txtcotcedula, evt);
        val.espacioMaximo(txtcotcedula, evt, 9);
    }//GEN-LAST:event_txtcotcedulaKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtnombre, evt, 24);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtapellido, evt, 24);
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void titulostxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titulostxtKeyTyped
        val.espacioMaximo(titulostxt, evt, 50);
    }//GEN-LAST:event_titulostxtKeyTyped

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        val.espacioMaximo(txtcorreo, evt, 24);
    }//GEN-LAST:event_txtcorreoKeyTyped

    private void txtprofesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprofesionKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtprofesion, evt, 24);
    }//GEN-LAST:event_txtprofesionKeyTyped

    private void txtocupacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtocupacionKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtocupacion, evt, 24);
    }//GEN-LAST:event_txtocupacionKeyTyped

    private void txtcot_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcot_nombreKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtcot_nombre, evt, 24);
    }//GEN-LAST:event_txtcot_nombreKeyTyped

    private void txtcot_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcot_apellidoKeyTyped
        val.letras(evt);
        val.espacioMaximo(txtcot_apellido, evt, 24);
    }//GEN-LAST:event_txtcot_apellidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarbtn;
    private javax.swing.JComboBox<String> areacedula;
    private javax.swing.JComboBox<String> areacorreo;
    private javax.swing.JComboBox<String> areatelefono;
    private javax.swing.JButton btmodificar;
    private javax.swing.JButton buscarbtn;
    private javax.swing.JButton cancelar1;
    private javax.swing.JComboBox<String> cboestadocivil;
    private javax.swing.JComboBox<String> cbogrado;
    private javax.swing.JComboBox<String> cbolugar_nacimiento;
    private javax.swing.JComboBox<String> cboparentesco;
    private javax.swing.JComboBox<String> cbosexo;
    private javax.swing.JComboBox<String> cbotipo_paciente;
    private javax.swing.JComboBox<String> cotareacedula;
    private javax.swing.JComboBox<String> cotareatelefo;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton nextbtn;
    private javax.swing.JPanel panel_categoria1;
    private javax.swing.JPanel panel_categoria3;
    private javax.swing.JButton previousseccionbtn;
    private javax.swing.JTextArea titulostxt;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcot_apellido;
    private javax.swing.JTextField txtcot_nombre;
    private javax.swing.JTextField txtcotcedula;
    private javax.swing.JTextField txtelefono;
    private com.toedter.calendar.JDateChooser txtfecha_nacimiento;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtocupacion;
    private javax.swing.JTextField txtprofesion;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
