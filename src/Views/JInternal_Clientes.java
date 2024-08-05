
package Views;

import ModelDAO.ClienteDAO;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JInternal_Clientes extends javax.swing.JInternalFrame {
    
    DefaultTableModel tableCliente = new DefaultTableModel();
    ClienteDAO clidao = new ClienteDAO();


    public JInternal_Clientes() {
        initComponents();
        mostrarCabezera();
        listarClientes();
        
        tbCliente.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent mouse_evt){
                JTable table = (JTable) mouse_evt.getSource();
                Point point = mouse_evt.getPoint();
                
                int filas = table.rowAtPoint(point);
                if(mouse_evt.getClickCount() == 2){
                    String codigo = tbCliente.getValueAt(tbCliente.getSelectedRow(), 0).toString();
                    String nombres = tbCliente.getValueAt(tbCliente.getSelectedRow(), 1).toString();
                    String apellidos = tbCliente.getValueAt(tbCliente.getSelectedRow(), 2).toString();
                    String dni = tbCliente.getValueAt(tbCliente.getSelectedRow(), 3).toString();
                    String fechaNac = tbCliente.getValueAt(tbCliente.getSelectedRow(), 4).toString();
                    String telefono = tbCliente.getValueAt(tbCliente.getSelectedRow(), 5).toString();

                    txtNombres.setText(nombres);
                    txtApellidos.setText(apellidos);
                    txtDni.setText(dni);
                    txtTelefono.setText(telefono);
                   
                   
                }  
                
            }
            
        });
    }
    
    

    private void listarClientes(){

        DefaultTableModel tableCliente = (DefaultTableModel) tbCliente.getModel();
        tableCliente.setRowCount(0);  // Limpiar la tabla
        
        ArrayList<HashMap<String, Object>> listaClientes = clidao.listClient();
        
        for (HashMap<String, Object> cliente : listaClientes) {
            Object[] dataClient = {
                cliente.get("idcliente"),
                cliente.get("nombres"), 
                cliente.get("apellidos"), 
                cliente.get("dni"),
                cliente.get("fechaNac"),
                cliente.get("telefono"),
                cliente.get("estado")
            };    
            tableCliente.addRow(dataClient);
        }
    }
    
    public void mostrarCabezera(){
        tableCliente.addColumn("COD");
        tableCliente.addColumn("NOMBRES");
        tableCliente.addColumn("APELLIDOS");
        tableCliente.addColumn("DNI");
        tableCliente.addColumn("FECHA NAC");
        tableCliente.addColumn("TELEFONO");
        tableCliente.addColumn("ESTADO");
        
        tbCliente.setModel(tableCliente);
        anchosColumnas(tbCliente);
        
    }
    
    private void anchosColumnas(JTable table) {
        int[] anchos = {60, 130, 140, 100, 100, 100, 80};

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechanNac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1202, 551));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        (tbCliente).setFocusable(false);
        (tbCliente) = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jScrollPane1.setViewportView(tbCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 560, 340));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("NOMBRES:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 41, -1, -1));
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 70, 152, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("APELLIDOS:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 41, -1, -1));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 70, 158, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("DNI:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 148, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("FECHA NACIMIENTO(opc):");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel2.add(txtFechanNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("TELEFONO(opc):");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 148, 130, -1));

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconsInterface/salvar.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 33, -1, -1));

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconsInterface/editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 94, 129, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconsInterface/borrar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 159, 129, -1));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconsInterface/recargar.png"))); // NOI18N
        btnLimpiar.setText("RESETEAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 221, 129, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 580, 390));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Presione doble click sobre una de las filas para realizar una acción..");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 510, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("MODULO CLIENTES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechanNac;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
