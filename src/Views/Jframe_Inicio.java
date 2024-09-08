
package Views;

import Views.cliente.JInternal_ClientesR;
import Views.cliente.JInternal_ClientesG;
import Views.usuario.JInternal_UsuariosR;
import Views.usuario.JInternal_UsuariosG;
import Views.repuestos.JInternal_Marcas_Categ;
import Views.repuestos.JInternal_RepuestosR;
import Views.repuestos.JInternal_RepuestosG1;
import Views.repuestos.JInternal_ConsultaRepuestos;
import javax.swing.JInternalFrame;

public class Jframe_Inicio extends javax.swing.JFrame {


    public Jframe_Inicio() {
        initComponents();
        this.setLocationRelativeTo(this);
        setExtendedState(Jframe_Inicio.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu8 = new javax.swing.JMenu();
        destok_inicio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        itemProductosR = new javax.swing.JMenuItem();
        itemProductoG = new javax.swing.JMenuItem();
        itemConsultaRepu = new javax.swing.JMenuItem();
        itemMar_Cat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Item_registro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Item_clientesR = new javax.swing.JMenuItem();
        JGestionarC = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        ItemUsuarioR = new javax.swing.JMenuItem();
        ItemUsuarioG = new javax.swing.JMenuItem();
        itemCerrarSesion = new javax.swing.JMenuItem();

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("BY LUIS_D");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(515, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        destok_inicio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout destok_inicioLayout = new javax.swing.GroupLayout(destok_inicio);
        destok_inicio.setLayout(destok_inicioLayout);
        destok_inicioLayout.setHorizontalGroup(
            destok_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        destok_inicioLayout.setVerticalGroup(
            destok_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/dia-laboral.png"))); // NOI18N
        jMenu3.setText("REPUESTOS     ");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(3, 1, 3, 6));

        itemProductosR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemProductosR.setText("NUEVO REPUESTO");
        itemProductosR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosRActionPerformed(evt);
            }
        });
        jMenu3.add(itemProductosR);

        itemProductoG.setText("GESTIONAR  REPUESTOS");
        itemProductoG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductoGActionPerformed(evt);
            }
        });
        jMenu3.add(itemProductoG);

        itemConsultaRepu.setText("CONSULTA REPUESTOS");
        itemConsultaRepu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaRepuActionPerformed(evt);
            }
        });
        jMenu3.add(itemConsultaRepu);

        itemMar_Cat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemMar_Cat.setText("REG. MARCAS/CAT");
        itemMar_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMar_CatActionPerformed(evt);
            }
        });
        jMenu3.add(itemMar_Cat);

        jMenuBar1.add(jMenu3);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/alto.png"))); // NOI18N
        jMenu2.setText("VENTAS     ");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(3, 1, 3, 6));

        Item_registro.setText("NUEVA VENTA");
        jMenu2.add(Item_registro);

        jMenuBar1.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/verificar.png"))); // NOI18N
        jMenu6.setText("COMPRAS     ");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/inventario.png"))); // NOI18N
        jMenu7.setText("KARDEX     ");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu7);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/nueva-cuenta.png"))); // NOI18N
        jMenu4.setText("CLIENTES     ");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(3, 1, 3, 6));

        Item_clientesR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Item_clientesR.setText("NUEVO CLIENTE");
        Item_clientesR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_clientesRActionPerformed(evt);
            }
        });
        jMenu4.add(Item_clientesR);

        JGestionarC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JGestionarC.setText("GESTIONAR CLIENTES");
        JGestionarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGestionarCActionPerformed(evt);
            }
        });
        jMenu4.add(JGestionarC);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/usuario.png"))); // NOI18N
        jMenu5.setText("USUARIOS     ");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ItemUsuarioR.setText("NUEVO USUARIO");
        ItemUsuarioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUsuarioRActionPerformed(evt);
            }
        });
        jMenu5.add(ItemUsuarioR);

        ItemUsuarioG.setText("GESTIONAR USUARIOS");
        ItemUsuarioG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemUsuarioGActionPerformed(evt);
            }
        });
        jMenu5.add(ItemUsuarioG);

        itemCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemCerrarSesion.setText("CERRAR SESIÓN");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu5.add(itemCerrarSesion);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destok_inicio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destok_inicio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Este metodo permite que solo un JInternal este abierto 
    private void openInternalFrame(JInternalFrame frame) {
        for (JInternalFrame openFrame : destok_inicio.getAllFrames()) {
            openFrame.dispose();
        }
        destok_inicio.add(frame);
        frame.setVisible(true);
     }
     
    private void Item_clientesRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_clientesRActionPerformed
       JInternal_ClientesR JIClir = new JInternal_ClientesR();
        openInternalFrame(JIClir);
    }//GEN-LAST:event_Item_clientesRActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
         Jframe_login loginFrame = new Jframe_login();
         loginFrame.setVisible(true); 

        this.dispose();
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void itemMar_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMar_CatActionPerformed
        JInternal_Marcas_Categ JImar = new JInternal_Marcas_Categ();
        destok_inicio.add(JImar);
        JImar.setVisible(true);
        
    }//GEN-LAST:event_itemMar_CatActionPerformed

    private void JGestionarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGestionarCActionPerformed
        JInternal_ClientesG JICli = new JInternal_ClientesG();
        openInternalFrame(JICli);
    }//GEN-LAST:event_JGestionarCActionPerformed

    private void itemProductoGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductoGActionPerformed
        JInternal_RepuestosG1 JIrepu = new JInternal_RepuestosG1();
        openInternalFrame(JIrepu);
    }//GEN-LAST:event_itemProductoGActionPerformed

    private void ItemUsuarioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuarioRActionPerformed
       JInternal_UsuariosR JIusuR = new JInternal_UsuariosR();
        openInternalFrame(JIusuR); 
    }//GEN-LAST:event_ItemUsuarioRActionPerformed

    private void ItemUsuarioGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuarioGActionPerformed
        JInternal_UsuariosG JIusuG = new JInternal_UsuariosG();
        openInternalFrame(JIusuG);
    }//GEN-LAST:event_ItemUsuarioGActionPerformed

    private void itemProductosRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosRActionPerformed
       JInternal_RepuestosR JIrepuR = new JInternal_RepuestosR();
        openInternalFrame(JIrepuR);
    }//GEN-LAST:event_itemProductosRActionPerformed

    private void itemConsultaRepuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaRepuActionPerformed
        JInternal_ConsultaRepuestos JIQueryR = new JInternal_ConsultaRepuestos();
        openInternalFrame(JIQueryR);
    }//GEN-LAST:event_itemConsultaRepuActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jframe_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemUsuarioG;
    private javax.swing.JMenuItem ItemUsuarioR;
    private javax.swing.JMenuItem Item_clientesR;
    private javax.swing.JMenuItem Item_registro;
    private javax.swing.JMenuItem JGestionarC;
    private javax.swing.JDesktopPane destok_inicio;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemConsultaRepu;
    private javax.swing.JMenuItem itemMar_Cat;
    private javax.swing.JMenuItem itemProductoG;
    private javax.swing.JMenuItem itemProductosR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
