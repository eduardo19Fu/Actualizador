/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eem.frames;

import eem.clases.Conexion;
import eem.clases.Dml;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author Eduardo
 */
public class ActualizadorVw extends javax.swing.JDialog {

    /**
     * Creates new form ActualizadorVw
     */
    private Conexion conexion;
    private Connection connection;
    private Date fechaAct;
    private DateFormat formato;
    
    public ActualizadorVw(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        initComponents();
        this.setLocationRelativeTo(null);
        conexion = new Conexion();
        connection = conexion.getConnection();
        cargarDocumentos();
        lblClave.setText("");
//        fechaAct = new Date();
        formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDpi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReferencia = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtClave = new javax.swing.JFormattedTextField();
        txtNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboDocumento = new javax.swing.JComboBox<>();
        lblClave = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eem/images/ROTULO.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel3.setText("Empresa Eléctrica Municipal de Jalapa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel2.setText("Clave:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 13, -1, -1));

        txtDpi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDpi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDpiKeyTyped(evt);
            }
        });
        jPanel3.add(txtDpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 218, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setText("Teléfono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        txtReferencia.setColumns(20);
        txtReferencia.setLineWrap(true);
        txtReferencia.setRows(5);
        txtReferencia.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtReferencia);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 342, 80));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel7.setText("E-mail:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 178, 218, -1));

        try {
            txtClave.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-LL-######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });
        jPanel3.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 14, 124, -1));

        txtNit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 218, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setText("DPI:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 218, -1));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel8.setText("Referencia:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setText("NIT:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 365, -1, -1));

        lblNombre.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 358, 565, 30));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel10.setText("Tipo Documento:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        comboDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(comboDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 219, 218, -1));

        lblClave.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        lblClave.setText("Referencia:");
        jPanel3.add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 14, 150, -1));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5);
        flowLayout1.setAlignOnBaseline(true);
        jPanel4.setLayout(flowLayout1);

        btnGuardar.setBackground(new java.awt.Color(255, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setActionCommand("");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setPreferredSize(new java.awt.Dimension(80, 55));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel4.add(btnGuardar);

        btnNuevo.setBackground(new java.awt.Color(255, 153, 0));
        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setActionCommand("");
        btnNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setPreferredSize(new java.awt.Dimension(80, 55));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel4.add(btnNuevo);

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setActionCommand("");
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(80, 55));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDpiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDpiKeyTyped
        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txtDpiKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
//        if(evt.getKeyChar() < '0' || evt.getKeyChar() > '9')
//            evt.consume();
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        StringTokenizer token = new StringTokenizer(txtClave.getText());
        String clave = "";
        if(evt.getKeyChar() == KeyEvent.VK_ENTER){
           while(token.hasMoreElements()){
               clave += token.nextElement();
           }
            buscarUsuario(clave);
            lblClave.setText(clave.toUpperCase());
            txtClave.setText(clave);
            txtClave.setEnabled(false);
            txtClave.setVisible(false);
        }
    }//GEN-LAST:event_txtClaveKeyPressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Dml dml = new Dml();
        int op = JOptionPane.showOptionDialog(this, "¿Seguro que desea actualizar los datos?", "Actualización", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, 
                null, new Object[]{"Aceptar","Cancelar"}, "Cancelar");
        if(op != -1){
            if(!lblClave.getText().isEmpty()){
                fechaAct = new Date();
                if(dml.getActualizarDatos(
                    lblClave.getText(),
                    txtDpi.getText(), 
                    txtNit.getText(),
                    txtTelefono.getText(),
                    txtEmail.getText(),
                    comboDocumento.getSelectedItem().toString(),
                    txtReferencia.getText().toUpperCase())> 0){
                        dml.getRegistroActualizacion(lblClave.getText(), new Timestamp(fechaAct.getTime()));
                        JOptionPane.showMessageDialog(this, new Timestamp(fechaAct.getTime()));
                        JOptionPane.showMessageDialog(this, "*****¡FELICIDADES!, datos actualizados correctamente*****","Felicidades",JOptionPane.INFORMATION_MESSAGE);
                        nuevo();
                }else{
                    JOptionPane.showMessageDialog(this, "No se ha podido llevar a cabo la actualización de datos","Advertencia",JOptionPane.WARNING_MESSAGE);
                    limpiar();
                }
            }else{
                JOptionPane.showMessageDialog(this, "*****Por favor, ingrese una clave válida*****","Advertencia",JOptionPane.WARNING_MESSAGE);
                txtClave.grabFocus();
            }
            
        }else{
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ActualizadorVw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizadorVw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizadorVw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizadorVw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ActualizadorVw(null,true).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> comboDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JFormattedTextField txtClave;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextArea txtReferencia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        txtClave.setText("");
        txtDpi.setText("");
        txtNit.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtReferencia.setText("");
        cargarDocumentos();
    }
    
    private void nuevo(){
        txtClave.setText("");
        txtDpi.setText("");
        txtNit.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtReferencia.setText("");
        comboDocumento.removeAllItems();
        cargarDocumentos();
        lblClave.setText("");
        lblNombre.setText("");
        txtClave.grabFocus();
        txtClave.setEnabled(true);
        txtClave.setVisible(true);
        txtClave.grabFocus();
//        fechaAct = null;
//        fechaAct = new Date();
    }
    
    private void buscarUsuario(String clave){
        String sql = "select concat(p.nombre,' ',p.apellido),p.identificacion,p.nit,p.telefono,p.correo_electronico,p.tipo_identificacion,c.referencia"
                + " from persona as p, cuenta as c"
                + " where p.idpersona = c.idpersona and c.clave = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, clave);
            //JOptionPane.showMessageDialog(this, ps);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                lblNombre.setText(rs.getString(1));
                txtDpi.setText(rs.getString(2));
                txtNit.setText(rs.getString(3));
                txtTelefono.setText(rs.getString(4));
                txtEmail.setText(rs.getString(5));
                comboDocumento.setSelectedItem(rs.getString(6));
                txtReferencia.setText(rs.getString(7));
            }else{
                JOptionPane.showMessageDialog(this, "Clave incorrecta");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void cargarDocumentos(){
        String sql = "select valor from catalogo where tipo_catalogo = 'TIPO_IDENTIFICACION'";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
                comboDocumento.addItem(rs.getString(1));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}