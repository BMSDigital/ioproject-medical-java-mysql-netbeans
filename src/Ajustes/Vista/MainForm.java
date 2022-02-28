/**Main principal del sistema..
    *Fraibert Bracho    
    *Cedula: 22270634
    *Mi primer Systema auditado
    *Derecho reservado 
*/
package Ajustes.Vista;

import Egoist.Swing.Animator;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

public class MainForm extends javax.swing.JFrame
{
    private java.awt.Image backImage;
    
    //Declaracion de variable para el estado de la base de datos         
    private boolean sqlState;
    
    private JPanel content;

    public MainForm()
    {
        // Pintar Background
        javax.swing.JPanel contentPane = new javax.swing.JPanel()
        {
            @Override
            public void paintComponent( java.awt.Graphics g )
            {
                super.paintComponent(g); 
                if( backImage != null )
                    g.drawImage(backImage, 0, 0, this);
            }
        };
        setContentPane(contentPane);
        initComponents();
        logi.setVisible(false);
        //Centrar el formulario
        //this.setLocationRelativeTo(null);
        //Colocacion de logos en el formulario
        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/Recursos/Logos/Logo.png")));
        
    }
    
    // escribe o reemplaza el contenido de un articulo con contenido nuevo
    public void setContent( JPanel n_content )
    {
        int n_contentWidth = n_content.getMaximumSize().width;//devueve el ancho de dimension en doble presicion
        int n_contentHeight = n_content.getMaximumSize().height;//devueve la altura de dimension en doble presicion
        int n_contentX = (int)(getWidth()*1.5); //devuelve la parte horizontal
        int n_contentY = (int)(getHeight()* 0.5f - n_contentHeight* 0.5 - 29);
        int disA = -(int)(getWidth()) - 8;
        int disB = -(int)( n_contentWidth* 0.5f );
        
        // animaciones
        if( this.content != null )
        {
            class postMethod extends Egoist.Swing.Animator
            {
                //se utiliza para indicar que el valor de una variable sera modificada
                volatile JPanel o_content = content;
                
                @Override
                public Egoist.Swing.Animator init(Object o, int i, long l, Animator.BEHAVIOUR bhvr, Object o1){ return(null); }
                @Override
                public void load()
                {
                    //devuelve los datos predefinido
                    MainForm mainForm = Ajustes.Controlador.Application.getScreen();
                        
                    if( mainForm != null )
                    {
                        //el nuevo panel es diferente de null
                        if(o_content!=null)
                        {   
                            //elimina todos los elementos de una lista que se contienen en la coleccion especifica
                            o_content.removeAll();
                            //elimina el componente especificado desde el recipiente
                            mainForm.getContentPane().remove(o_content);
                        }
                        //el formulario se ajusta al tamaño
                        mainForm.pack();
                        //vuelve a pintar el rectangulo en tiempo milisegundo
                        mainForm.repaint(); 
                    }
                }
                @Override
                public void render(){}
                @Override
                public void finish(){}
                @Override
                public boolean isBroken()
                {
                    return(false);
                }
            }
            
            Egoist.Swing.Animator.build( Egoist.Swing.Animator.ANIMATION.Transition ).
                    init( new java.awt.Point( disA, 0 ), 20, 700, Egoist.Swing.Animator.BEHAVIOUR.AccelUp, this.content ).
                        enqueue( Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Transition).
                            init( new java.awt.Point( disB, 0 ), 20, 600, Egoist.Swing.Animator.BEHAVIOUR.Rect, this.content ).
                                enqueue( new postMethod() ) ).
                                    start();
        }
  
        if( n_content != null )
        {
            this.content = n_content;
            this.content.setSize( n_contentWidth, n_contentHeight );
            this.content.setLocation( n_contentX, n_contentY );
            this.getContentPane().add(this.content, 0);

            Egoist.Swing.Animator.build( Egoist.Swing.Animator.ANIMATION.Transition).
                    init( new java.awt.Point( disA, 0 ), 20, 600, Egoist.Swing.Animator.BEHAVIOUR.Rect, this.content ).
                        enqueue( Egoist.Swing.Animator.build(Egoist.Swing.Animator.ANIMATION.Transition).
                                init( new java.awt.Point( disB, 0 ), 20, 700, Egoist.Swing.Animator.BEHAVIOUR.AccelDown, this.content ) ).
                                    start(); 

        }
        //se ajusta al tamaño
        pack();
        //vuelve a pintar el rectangulo
        repaint();
    }
    //reversion de la animacion
    public void setReverseContent( JPanel n_content )
    {
        
    }
    public void setImmediatelyContent( JPanel n_content )
    {
        if(n_content!=null)
        {
            
        }
        else
        {
            this.content.removeAll();
            remove(this.content);
            
            this.pack();
            this.repaint();
        }
    }
    public void setContentVisible( boolean contentState )
    {
        this.content.setVisible(contentState);
    }
    public void setMenuVisible( boolean menuVisible )
    {
        if( menuVisible )
        {
            menu.setVisible(true);
        }
        else
        {
            menu.setVisible(false);
        }
    }
     public void setSqlIconState( boolean sqlState )
    {
        if( this.sqlState != sqlState || !this.sqlIcon.isEnabled() )
        {
            this.sqlState = sqlState;
            java.awt.Image icon;
        
            if( this.sqlState )
                icon = Ajustes.Controlador.Application.getImage("connected", 32, 32 );
            else
                icon = Ajustes.Controlador.Application.getImage("disconnected", 32, 32 );

            this.sqlIcon.setIcon( new javax.swing.ImageIcon(icon));
            if( !this.sqlIcon.isEnabled() )
                this.sqlIcon.setEnabled(true);
        }
    }
    @Override
    public void setSize( int width, int height )
    {
        setPreferredSize( new java.awt.Dimension(width, height) );
        super.setSize(width, height);
    }
    public java.awt.Image getBackImage()
    {
        return(backImage);
    }
    public void setBackImage( java.awt.Image backImage )
    {
        this.backImage = backImage;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        sqlIcon = new javax.swing.JLabel();
        logi = new javax.swing.JLabel();
        login1 = new Ajustes.Vista.Login();
        menu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        Modulo = new javax.swing.JMenu();
        Inventario = new javax.swing.JMenuItem();
        Ventas_cuentasxcobrar = new javax.swing.JMenuItem();
        smAsignatura = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        smExportar = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        smCerrarSecion = new javax.swing.JMenuItem();
        smSalir = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        mpaciete = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        Tablas_inventario = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Bitacora = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        Mantenimiento = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        Nuevo_Usuario = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Preferencias = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMinimumSize(null);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        sqlIcon.setText(" ");
        sqlIcon.setEnabled(false);
        sqlIcon.setMaximumSize(new java.awt.Dimension(32, 32));
        sqlIcon.setMinimumSize(new java.awt.Dimension(32, 32));
        sqlIcon.setPreferredSize(new java.awt.Dimension(32, 32));

        logi.setBackground(new java.awt.Color(255,255,255,75));
        logi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logi.setForeground(new java.awt.Color(255, 255, 255));
        logi.setText("jLabel6");

        menuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/01.png"))); // NOI18N
        menuInicio.setText("Inicio");
        menuInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuInicio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        menuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInicioMouseClicked(evt);
            }
        });
        menu.add(menuInicio);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/02.png"))); // NOI18N
        jMenu4.setText("Atención Médica");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jMenuItem11.setText("Historia Médica");
        jMenu4.add(jMenuItem11);
        jMenu4.add(jSeparator11);

        jMenuItem10.setText("Consultas Médica");
        jMenu4.add(jMenuItem10);
        jMenu4.add(jSeparator12);

        jMenu5.setText("Agendamiento");

        jMenuItem13.setText("Imagenologia");
        jMenu5.add(jMenuItem13);
        jMenu5.add(jSeparator15);

        jMenuItem16.setText("Consultas");
        jMenu5.add(jMenuItem16);
        jMenu5.add(jSeparator16);

        jMenuItem15.setText("Laboratorio");
        jMenu5.add(jMenuItem15);

        jMenu4.add(jMenu5);

        menu.add(jMenu4);

        Modulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/03.png"))); // NOI18N
        Modulo.setText("Administración");
        Modulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        Inventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        Inventario.setText("Inventario");
        Inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioActionPerformed(evt);
            }
        });
        Modulo.add(Inventario);

        Ventas_cuentasxcobrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Ventas_cuentasxcobrar.setText("Ventas y cuentas por cobrar");
        Modulo.add(Ventas_cuentasxcobrar);

        smAsignatura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        smAsignatura.setText("Compras y cuentas por pagar");
        Modulo.add(smAsignatura);
        Modulo.add(jSeparator1);

        smExportar.setText("Exportar...");
        Modulo.add(smExportar);
        Modulo.add(jSeparator2);

        smCerrarSecion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        smCerrarSecion.setText("Cerrar Sesión");
        Modulo.add(smCerrarSecion);

        smSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        smSalir.setText("Salir");
        Modulo.add(smSalir);

        menu.add(Modulo);

        menuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/07.png"))); // NOI18N
        menuConsultas.setText("Servicios Médicos");
        menuConsultas.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        mpaciete.setText("Nuevo paciente");
        mpaciete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpacieteActionPerformed(evt);
            }
        });
        menuConsultas.add(mpaciete);
        menuConsultas.add(jSeparator9);

        jMenu6.setText("Agenda");

        jMenuItem18.setText("Imagenologia");
        jMenu6.add(jMenuItem18);

        jMenuItem19.setText("Consultas");
        jMenu6.add(jMenuItem19);

        jMenuItem20.setText("Laboratorio");
        jMenu6.add(jMenuItem20);

        menuConsultas.add(jMenu6);
        menuConsultas.add(jSeparator10);

        jMenuItem21.setText("Facturación");
        menuConsultas.add(jMenuItem21);

        menu.add(menuConsultas);

        Tablas_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/MenuBar/09.png"))); // NOI18N
        Tablas_inventario.setText("Configuración");
        Tablas_inventario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jMenu2.setText("Tablas de Inventario");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Categoria ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator13);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Marca");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);
        jMenu2.add(jSeparator14);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setText("Unidades");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        Tablas_inventario.add(jMenu2);
        Tablas_inventario.add(jSeparator8);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Empresa");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Tablas_inventario.add(jMenuItem6);
        Tablas_inventario.add(jSeparator7);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Proveedores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Tablas_inventario.add(jMenuItem5);
        Tablas_inventario.add(jSeparator3);

        Bitacora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Bitacora.setText("Bitácora");
        Bitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BitacoraActionPerformed(evt);
            }
        });
        Tablas_inventario.add(Bitacora);
        Tablas_inventario.add(jSeparator6);

        Mantenimiento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        Mantenimiento.setText("Mantenimiento");
        Tablas_inventario.add(Mantenimiento);
        Tablas_inventario.add(jSeparator5);

        Nuevo_Usuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        Nuevo_Usuario.setText("Nuevo Usuario");
        Nuevo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_UsuarioActionPerformed(evt);
            }
        });
        Tablas_inventario.add(Nuevo_Usuario);
        Tablas_inventario.add(jSeparator4);

        Preferencias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Preferencias.setText("Preferencias");
        Preferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreferenciasActionPerformed(evt);
            }
        });
        Tablas_inventario.add(Preferencias);

        jMenu1.setText("Doctores");

        jMenuItem3.setText("Especialización Médica");
        jMenu1.add(jMenuItem3);

        jMenuItem7.setText("Añadir Doctor");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Administrar Médicos");
        jMenu1.add(jMenuItem8);

        Tablas_inventario.add(jMenu1);

        menu.add(Tablas_inventario);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1012, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sqlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(logi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 565, Short.MAX_VALUE)
                .addComponent(sqlIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1216, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        backImage = Ajustes.Controlador.Application.getThemeItem("01", evt.getComponent().getWidth(), evt.getComponent().getHeight() );
    }//GEN-LAST:event_formComponentResized

    private void PreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreferenciasActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Preferencias());
    }//GEN-LAST:event_PreferenciasActionPerformed

    private void BitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BitacoraActionPerformed
        Ajustes.Controlador.Application.callMainOption(new ListadoBitacora());
    }//GEN-LAST:event_BitacoraActionPerformed

    private void Nuevo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_UsuarioActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Usuarios() );
    }//GEN-LAST:event_Nuevo_UsuarioActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         Ajustes.Controlador.Application.callMainOption(new Proveedor());
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Empresa());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void InventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Inventarios());
    }//GEN-LAST:event_InventarioActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Unidad_Inventario());
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Marca_Inventario());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new Categoria_Inventario());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInicioMouseClicked
        Ajustes.Controlador.Application.callMainOption(new Menu_Modulos());
    }//GEN-LAST:event_menuInicioMouseClicked

    private void mpacieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpacieteActionPerformed
       //Ajustes.Controlador.Application.callMainOption(new Paciente());
    }//GEN-LAST:event_mpacieteActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Ajustes.Controlador.Application.callMainOption(new AñadirDoctores());
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    @Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Bitacora;
    private javax.swing.JMenuItem Inventario;
    private javax.swing.JMenuItem Mantenimiento;
    private javax.swing.JMenu Modulo;
    private javax.swing.JMenuItem Nuevo_Usuario;
    private javax.swing.JMenuItem Preferencias;
    private javax.swing.JMenu Tablas_inventario;
    private javax.swing.JMenuItem Ventas_cuentasxcobrar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    public static javax.swing.JLabel logi;
    private Ajustes.Vista.Login login1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem mpaciete;
    private javax.swing.JMenuItem smAsignatura;
    private javax.swing.JMenuItem smCerrarSecion;
    private javax.swing.JMenu smExportar;
    private javax.swing.JMenuItem smSalir;
    private javax.swing.JLabel sqlIcon;
    // End of variables declaration//GEN-END:variables
}
