
package Views;

import javax.swing.JInternalFrame;

public class Jframe_Inicio extends javax.swing.JFrame {


    public Jframe_Inicio() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu8 = new javax.swing.JMenu();
        destok_inicio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemCerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Item_registro = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Item_clientesR = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("por verrr .....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        destok_inicio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout destok_inicioLayout = new javax.swing.GroupLayout(destok_inicio);
        destok_inicio.setLayout(destok_inicioLayout);
        destok_inicioLayout.setHorizontalGroup(
            destok_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destok_inicioLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );
        destok_inicioLayout.setVerticalGroup(
            destok_inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destok_inicioLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jMenu1.setBackground(new java.awt.Color(102, 102, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/pagina-de-inicio.png"))); // NOI18N
        jMenu1.setText("INICIO     ");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(3, 1, 3, 6));
        jMenu1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/pagina-de-inicio.png"))); // NOI18N
        jMenu1.add(jSeparator1);

        itemCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        itemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/salir-alt.png"))); // NOI18N
        itemCerrarSesion.setText("Cerrar Sesión");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(itemCerrarSesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/alto.png"))); // NOI18N
        jMenu2.setText("VENTAS     ");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(3, 1, 3, 6));

        Item_registro.setText("Registro");
        Item_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_registroActionPerformed(evt);
            }
        });
        jMenu2.add(Item_registro);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/agregar-producto.png"))); // NOI18N
        jMenu3.setText("PRODUCTOS     ");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(3, 1, 3, 6));
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/nueva-cuenta.png"))); // NOI18N
        jMenu4.setText("CLIENTES     ");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(3, 1, 3, 6));

        Item_clientesR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Item_clientesR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/atencion-al-cliente.png"))); // NOI18N
        Item_clientesR.setText("Registro Clientes");
        Item_clientesR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_clientesRActionPerformed(evt);
            }
        });
        jMenu4.add(Item_clientesR);

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem1.setText("Filtro Clientes");
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/verificar.png"))); // NOI18N
        jMenu6.setText("COMPRAS     ");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/inventario.png"))); // NOI18N
        jMenu7.setText("KARDEX     ");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu7);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Inicio/usuario.png"))); // NOI18N
        jMenu5.setText("USUARIOS     ");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
     
    private void Item_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_registroActionPerformed
        
    }//GEN-LAST:event_Item_registroActionPerformed

    private void Item_clientesRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_clientesRActionPerformed
        JInternal_Clientes JICli = new JInternal_Clientes();
        openInternalFrame(JICli);
    }//GEN-LAST:event_Item_clientesRActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
         Jframe_login loginFrame = new Jframe_login();
         loginFrame.setVisible(true); 

        this.dispose();
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    
    
    
    
    
    
    
    
    
    
    
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
    private javax.swing.JMenuItem Item_clientesR;
    private javax.swing.JMenuItem Item_registro;
    private javax.swing.JDesktopPane destok_inicio;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
