/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajustes.Vista;

import Ajustes.Controlador.Validations;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Oku
 */
public class Preferencias extends javax.swing.JPanel
{
    public Preferencias()
    {
        initComponents();
        
        //Validaciones txtfield y jbutton el campo txtusuario
        Validations Style = new Validations();
    
        //Validacion jbutton acceder y salir
        Style.setEgoistStyle_4(btnexit);
        Style.setEgoistStyle_3(cboacceder);

        tree.getSelectionModel().setSelectionMode( TreeSelectionModel.SINGLE_TREE_SELECTION);
        
        javax.swing.tree.TreeCellRenderer renderer = new javax.swing.tree.DefaultTreeCellRenderer() 
        {
             @Override
            public java.awt.Color getBackgroundNonSelectionColor() {
                return (null);
            }

            @Override
            public java.awt.Color getBackgroundSelectionColor() {
                return ( new java.awt.Color( 130, 130, 130, 150 ) );
            }

            @Override
            public java.awt.Color getBackground() {
                return (null);
            }
            
            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) 
            {
                super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);
                if(leaf) 
                    setIcon(null);
                else 
                    setIcon( new javax.swing.ImageIcon(Ajustes.Controlador.Application.getThemeItem("configuration", 16, 16)) );

                return this;
            }
        };
        
        tree.setCellRenderer(renderer);
        tree.addMouseListener( new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent mouse)
            {
                TreePath path = tree.getPathForLocation(mouse.getX(), mouse.getY());
                if( path != null )
                    showPopUp(path); 
            }
        });
        
        showPopUp(null);
    }
    private void showPopUp( TreePath path )
    {
        javax.swing.JPanel newPopup = null;
        
        if( path != null && path.getPathCount() > 0 )
        {
            switch( path.getPathComponent(1).toString() )
            {
                case "Entorno":
                {
                    if( path.getPathCount() > 2 )
                    {
                        switch( path.getPathComponent(2).toString() )
                        {
                            case "Inicio":
                            {
                                newPopup = new Preferencias_Entorno_Inicio();
                            }break;
                            case "Diseño":
                            {

                            }break;
                            default:
                            {
                                newPopup = new Preferencias_Entorno_General();
                            }break;
                        }
                    }
                    else
                        newPopup = new Preferencias_Entorno_General();
                }break;
                case "Base de datos":
                {
                    if( path.getPathCount() > 2 )
                    {
                        switch( path.getPathComponent(2).toString() )
                        {
                            case "Tablas":
                            {
                                newPopup = new Preferencias_BD_Tablas();
                            }break;
                            default:
                            {
                                newPopup = new Preferencias_BD_General();
                            } break;
                        }
                    }
                }break;
            }
            
        }
        else
            newPopup = new Preferencias_Entorno_General();
            
        if( newPopup != null )
        {
            newPopup.setName( "mainpopup" );
            newPopup.setSize(popup.getSize());

            for( int i = 0; i < popup.getComponentCount(); ++i )
                if( popup.getComponent(i).getName() != null && popup.getComponent(i).getName().equals("mainpopup") )
                    popup.remove(i);
            
            popup.add(newPopup, 0);
            popup.setViewportView(newPopup);
            popup.getViewport().setOpaque(false);
        }
        
        revalidate();
    }

    @Override
    public void paint(Graphics g)
    {
        repaint();
        super.paint(g);
    }
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        welcome = new javax.swing.JLabel();
        popup = new javax.swing.JScrollPane();
        btnexit = new javax.swing.JButton();
        cboacceder = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(520, 340));
        setMinimumSize(new java.awt.Dimension(520, 340));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(520, 340));
        setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color( 0, 0, 0, 0 ));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tree.setBackground(new java.awt.Color( 0, 0, 0, 0 )
        );
        tree.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tree.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Entorno");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("General");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Inicio");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Base de datos");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("General");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tablas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Transferencias SQL");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Bitácora");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("General");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        tree.setDoubleBuffered(true);
        tree.setRootVisible(false);
        tree.setToggleClickCount(1);
        jScrollPane1.setViewportView(tree);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 38, 100, 230);

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("CentraleSansCnd", 1, 14)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Configuración");
        welcome.setFocusable(false);
        welcome.setPreferredSize(new java.awt.Dimension(400, 45));
        welcome.setRequestFocusEnabled(false);
        welcome.setVerifyInputWhenFocusTarget(false);
        add(welcome);
        welcome.setBounds(0, 10, 520, 30);

        popup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        popup.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        popup.setDoubleBuffered(true);
        popup.setMaximumSize(new java.awt.Dimension(380, 256));
        popup.setMinimumSize(new java.awt.Dimension(380, 256));
        popup.setOpaque(false);
        popup.setPreferredSize(new java.awt.Dimension(380, 256));
        add(popup);
        popup.setBounds(124, 38, 370, 230);

        btnexit.setBackground(new java.awt.Color(255, 254, 255)
        );
        btnexit.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnexit.setForeground(new java.awt.Color(49, 152, 211));
        btnexit.setText("Salir");
        btnexit.setBorderPainted(false);
        btnexit.setContentAreaFilled(false);
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnexit.setMaximumSize(new java.awt.Dimension(83, 25));
        btnexit.setMinimumSize(new java.awt.Dimension(83, 25));
        btnexit.setOpaque(true);
        btnexit.setPreferredSize(new java.awt.Dimension(83, 25));
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        add(btnexit);
        btnexit.setBounds(310, 280, 80, 25);

        cboacceder.setBackground(new java.awt.Color(255, 254, 255));
        cboacceder.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cboacceder.setForeground(new java.awt.Color(49, 152, 211));
        cboacceder.setText("Aceptar");
        cboacceder.setBorderPainted(false);
        cboacceder.setContentAreaFilled(false);
        cboacceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cboacceder.setOpaque(true);
        add(cboacceder);
        cboacceder.setBounds(410, 280, 83, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton cboacceder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane popup;
    private javax.swing.JTree tree;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
