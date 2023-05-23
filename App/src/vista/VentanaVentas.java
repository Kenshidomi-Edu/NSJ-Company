package vista;

import ConexionBD.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;

public class VentanaVentas extends javax.swing.JDialog {

    public VentanaVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaVentas.setModel(modeloTabla);
        modeloTabla.addColumn("Codigo");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Stock");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        cajaIngresoProducto = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        cajaDescuentoSubtotal = new javax.swing.JTextField();
        cajaTotal = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        etiquetaTotal = new javax.swing.JLabel();
        botonPagar = new javax.swing.JButton();
        imagenUSer = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        botonAnularVenta = new javax.swing.JButton();
        botonAnularProducto = new javax.swing.JButton();
        botonDescuento = new javax.swing.JButton();
        botonX = new javax.swing.JButton();
        eitquetaF2 = new javax.swing.JLabel();
        etiquetaF5 = new javax.swing.JLabel();
        etiquetaF3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panel.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 150, 40));
        panel.add(cajaIngresoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 40, 300, 40));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("0");
        panel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 97, 35));

        tablaVentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Barra", "Descripcion", "Cantidad", "Precio", "Descto", "Total Lineas"
            }
        ));
        jScrollPane1.setViewportView(tablaVentas);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 172, 900, 270));

        cajaDescuentoSubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaDescuentoSubtotal.setText("0");
        panel.add(cajaDescuentoSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 97, 35));

        cajaTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cajaTotal.setText("0");
        panel.add(cajaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 121, 35));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setText("0");
        panel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 97, 35));

        etiquetaTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiquetaTotal.setText("Total");
        panel.add(etiquetaTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, -1, -1));

        botonPagar.setBackground(new java.awt.Color(102, 255, 255));
        botonPagar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        botonPagar.setText("$PAGAR");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });
        panel.add(botonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 250, 140));

        imagenUSer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.jpg"))); // NOI18N
        panel.add(imagenUSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 40, 40));

        nombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreUsuario.setText("Usuario1");
        panel.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        botonAnularVenta.setBackground(new java.awt.Color(51, 51, 255));
        botonAnularVenta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAnularVenta.setForeground(new java.awt.Color(255, 255, 255));
        botonAnularVenta.setText("<html>Anular Venta</html>");
        panel.add(botonAnularVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 160, 70));

        botonAnularProducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAnularProducto.setText("<html>Anular Producto</html>");
        botonAnularProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAnularProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel.add(botonAnularProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 150, 90));

        botonDescuento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonDescuento.setText("Descuento");
        panel.add(botonDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, 180, 70));

        botonX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonX.setText("X");
        botonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXActionPerformed(evt);
            }
        });
        panel.add(botonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 130, 70));

        eitquetaF2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eitquetaF2.setText("F2");
        panel.add(eitquetaF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 30, 30));

        etiquetaF5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaF5.setText("F5");
        panel.add(etiquetaF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 30, 30));

        etiquetaF3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etiquetaF3.setText("F3");
        panel.add(etiquetaF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 30, 30));

        jButton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton2.setText("Ir a menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_clientes.jpg"))); // NOI18N
        panel.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        VentanaPago ventanaP = new VentanaPago();
        ventanaP.setVisible(true);

    }//GEN-LAST:event_botonPagarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXActionPerformed
        int num = Integer.parseInt(cajaIngresoProducto.getText());
        cajaIngresoProducto.setText(num + "*");
        
        
    }//GEN-LAST:event_botonXActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String codigoBarras = cajaIngresoProducto.getText();
        int posicionAsterisco = codigoBarras.indexOf("*");
        //agregarProductoATabla();
        if (cajaIngresoProducto.getText().equals("")) {
            //JOptionPane.showMessageDialog(null, "EVTSS");
        } else if (posicionAsterisco != -1) {
            agregarProductoATablaX();
        }
        agregarProductoATablaX();
    }//GEN-LAST:event_botonBuscarActionPerformed

    public void agregarProductoATabla() {
        //DefaultTableModel modeloTabla = new DefaultTableModel();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
        tablaVentas.setModel(modeloTabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        // Código de barras del producto a consultar
        String codigoBarras = cajaIngresoProducto.getText();

        String where = "";

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            if (!"".equals(codigoBarras)) { //si el campo no esta vacio
                where = " where codigoI=" + codigoBarras;
            }

            // Preparar la consulta
            ps = conexion.prepareStatement("select codigoI,nombre,precio,stock from producto" + where);
            // Ejecutar la consulta
            rs = ps.executeQuery();

            while (rs.next()) {

                // Obtener los datos del registro
                String codigoBarra = rs.getString("codigoI");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = 1;
                int stock = rs.getInt("stock");

                modeloTabla.addRow(new Object[]{codigoBarra, nombre, precio, cantidad, stock});

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        limpiarCajas();
    }

    public void agregarProductoATablaX() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaVentas.getModel();
        tablaVentas.setModel(modeloTabla);

        PreparedStatement ps = null;
        ResultSet rs = null;

        // Código de barras del producto a consultar
        String codigoBarras = cajaIngresoProducto.getText();
        Pattern pattern = Pattern.compile("(\\d+)\\s*\\*");
        Matcher matcher = pattern.matcher(codigoBarras);
        String where = "";

        try {
            Conexion con = new Conexion();
            Connection conexion = con.getconectar();

            if (!"".equals(codigoBarras)) { //si el campo no esta vacio
                where = " where codigoI=" + codigoBarras;
            }

            // Preparar la consulta
            ps = conexion.prepareStatement("select codigoI,nombre,precio,stock from producto" + where);
            // Ejecutar la consulta
            rs = ps.executeQuery();
            while (matcher.find() && rs.next()) {
                String numeoStr = matcher.group(1);
                // Obtener los datos del registro
                    String codigoBarra = rs.getString("codigoI");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    int cantidad = Integer.parseInt(numeoStr);
                    int stock = rs.getInt("stock");

                    modeloTabla.addRow(new Object[]{codigoBarra, nombre, precio, cantidad, stock});
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (rs != null) {
                    rs.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        limpiarCajas();
    }

    public void limpiarCajas() {
        cajaIngresoProducto.setText("");
    }

    public void obtenerNumeroAntesDeAsterisco(String texto) {
        String codigoBarras = cajaIngresoProducto.getText();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(codigoBarras);
        while (matcher.find()) {
            String numeoStr = matcher.group(1);
            int numero = Integer.parseInt(numeoStr);

        }

    }

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
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaVentas dialog = new VentanaVentas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnularProducto;
    private javax.swing.JButton botonAnularVenta;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonDescuento;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton botonX;
    private javax.swing.JTextField cajaDescuentoSubtotal;
    private javax.swing.JTextField cajaIngresoProducto;
    private javax.swing.JTextField cajaTotal;
    private javax.swing.JLabel eitquetaF2;
    private javax.swing.JLabel etiquetaF3;
    private javax.swing.JLabel etiquetaF5;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel imagenUSer;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
