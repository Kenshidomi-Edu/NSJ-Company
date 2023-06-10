package vista;

import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan Jara
 */
public class VentanaPago extends javax.swing.JFrame {
    
    ButtonGroup botonGrupo = new ButtonGroup();

    public VentanaPago() {
        initComponents();
    }

    public VentanaPago(String texto) {
        initComponents();
        this.setLocationRelativeTo(null);
        cajaSaldoTotal.setText(texto);
        cajaPago.setText(String.valueOf(0));
        cajaSubtotal.setText(texto);
        totalRedondeado.setText(texto);
        cuadrarEntero(totalRedondeado);
        
        
        if (cajaDescuento.getText().equals(0)) {
            totalAEditar.setText(texto);
            cuadrarEntero(totalRedondeado);

        } else {
            int descuento = Integer.parseInt(cajaDescuento.getText());
            int totalVenta = Integer.parseInt(texto);
            totalAEditar.setText(String.valueOf(totalVenta - descuento));
            cuadrarEntero(totalRedondeado);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_cliente1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton_busca_cliente = new javax.swing.JButton();
        jButton_Boleta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        boton2k = new javax.swing.JButton();
        boton1k = new javax.swing.JButton();
        boton500 = new javax.swing.JButton();
        boton10k = new javax.swing.JButton();
        boton5k = new javax.swing.JButton();
        boton10 = new javax.swing.JButton();
        botonPagoJusto = new javax.swing.JButton();
        boton20k = new javax.swing.JButton();
        boton100 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPago = new javax.swing.JTable();
        cajaVuelto = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonAtras1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cajaSaldoTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cajaSubtotal = new javax.swing.JLabel();
        cajaDescuento = new javax.swing.JLabel();
        totalAEditar = new javax.swing.JLabel();
        totalRedondeado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonQuitar = new javax.swing.JButton();
        botonEfectivo = new javax.swing.JToggleButton();
        botonTransbank = new javax.swing.JToggleButton();
        botonCupon = new javax.swing.JToggleButton();
        jLabel_wallpaper = new javax.swing.JLabel();
        imagenFondoVerde = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pago");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cliente:");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jComboBox_cliente1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_cliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleeccione cliente:", "Item 2", "Item 3", "Item 4" }));
        panel1.add(jComboBox_cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 150, -1));

        jButton_busca_cliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_busca_cliente.setText("Buscar");
        panel1.add(jButton_busca_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, -1));

        jButton_Boleta.setBackground(new java.awt.Color(255, 153, 0));
        jButton_Boleta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_Boleta.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Boleta.setText("<html>Boleta</html>");
        panel1.add(jButton_Boleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 140, 110));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("<html>Factura</html>");
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 140, 110));

        boton2k.setBackground(new java.awt.Color(255, 153, 0));
        boton2k.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton2k.setForeground(new java.awt.Color(255, 255, 255));
        boton2k.setText("2.000");
        boton2k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2kActionPerformed(evt);
            }
        });
        panel1.add(boton2k, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 110, 60));

        boton1k.setBackground(new java.awt.Color(255, 153, 0));
        boton1k.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton1k.setForeground(new java.awt.Color(255, 255, 255));
        boton1k.setText("1.000");
        boton1k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1kActionPerformed(evt);
            }
        });
        panel1.add(boton1k, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 520, 110, 60));

        boton500.setBackground(new java.awt.Color(255, 153, 0));
        boton500.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton500.setForeground(new java.awt.Color(255, 255, 255));
        boton500.setText("500");
        boton500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton500ActionPerformed(evt);
            }
        });
        panel1.add(boton500, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 520, 100, 60));

        boton10k.setBackground(new java.awt.Color(255, 153, 0));
        boton10k.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton10k.setForeground(new java.awt.Color(255, 255, 255));
        boton10k.setText("10.000");
        boton10k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10kActionPerformed(evt);
            }
        });
        panel1.add(boton10k, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 110, 60));

        boton5k.setBackground(new java.awt.Color(255, 153, 0));
        boton5k.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton5k.setForeground(new java.awt.Color(255, 255, 255));
        boton5k.setText("5.000");
        boton5k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5kActionPerformed(evt);
            }
        });
        panel1.add(boton5k, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, 100, 60));

        boton10.setBackground(new java.awt.Color(255, 153, 0));
        boton10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton10.setForeground(new java.awt.Color(255, 255, 255));
        boton10.setText("10");
        boton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton10ActionPerformed(evt);
            }
        });
        panel1.add(boton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 110, 50));

        botonPagoJusto.setBackground(new java.awt.Color(204, 204, 0));
        botonPagoJusto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonPagoJusto.setForeground(new java.awt.Color(0, 0, 0));
        botonPagoJusto.setText("<html>Pago justo</html>");
        botonPagoJusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagoJustoActionPerformed(evt);
            }
        });
        panel1.add(botonPagoJusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 590, 100, 100));

        boton20k.setBackground(new java.awt.Color(255, 153, 0));
        boton20k.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton20k.setForeground(new java.awt.Color(255, 255, 255));
        boton20k.setText("20.000");
        boton20k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton20kActionPerformed(evt);
            }
        });
        panel1.add(boton20k, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 110, 60));

        boton100.setBackground(new java.awt.Color(255, 153, 0));
        boton100.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        boton100.setForeground(new java.awt.Color(255, 255, 255));
        boton100.setText("100");
        boton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton100ActionPerformed(evt);
            }
        });
        panel1.add(boton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 110, 50));

        tablaPago.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Forma de Pago", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPago.setToolTipText("");
        tablaPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaPago);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 610, 90));
        panel1.add(cajaVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 310, 40));

        botonAtras.setBackground(new java.awt.Color(0, 153, 102));
        botonAtras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAtras.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras.setText("<html>Anular venta</html>");
        panel1.add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 130, 90));

        botonAtras1.setBackground(new java.awt.Color(0, 153, 102));
        botonAtras1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonAtras1.setForeground(new java.awt.Color(255, 255, 255));
        botonAtras1.setText("Volver");
        botonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtras1ActionPerformed(evt);
            }
        });
        panel1.add(botonAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 130, 90));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 320, 20));
        panel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 320, 20));

        cajaSaldoTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel1.add(cajaSaldoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 478, 120, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Saldo:");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, -1, -1));
        panel1.add(cajaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 438, 120, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Pago:");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setText("Sub-Total");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setText("Descuento Global");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel7.setText("TOTAL");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 320, 20));

        cajaSubtotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cajaSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cajaSubtotal.setText("0");
        panel1.add(cajaSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, -1, -1));

        cajaDescuento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cajaDescuento.setText("0");
        panel1.add(cajaDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, -1, -1));

        totalAEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalAEditar.setText("0");
        panel1.add(totalAEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, -1, -1));

        totalRedondeado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        totalRedondeado.setText("0");
        panel1.add(totalRedondeado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("A Pagar");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, -1, -1));

        botonQuitar.setBackground(new java.awt.Color(255, 153, 0));
        botonQuitar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonQuitar.setForeground(new java.awt.Color(255, 255, 255));
        botonQuitar.setText("Quitar");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });
        panel1.add(botonQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 648, 220, 40));

        botonEfectivo.setBackground(new java.awt.Color(0, 153, 102));
        botonEfectivo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        botonEfectivo.setText("EFECTIVO");
        botonEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEfectivoActionPerformed(evt);
            }
        });
        panel1.add(botonEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 170, 60));

        botonTransbank.setBackground(new java.awt.Color(0, 153, 102));
        botonTransbank.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonTransbank.setForeground(new java.awt.Color(255, 255, 255));
        botonTransbank.setText("TRANSBANK");
        botonTransbank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransbankActionPerformed(evt);
            }
        });
        panel1.add(botonTransbank, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 190, 60));

        botonCupon.setBackground(new java.awt.Color(0, 153, 102));
        botonCupon.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonCupon.setForeground(new java.awt.Color(255, 255, 255));
        botonCupon.setText("CUPON");
        botonCupon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuponActionPerformed(evt);
            }
        });
        panel1.add(botonCupon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 140, 60));

        jLabel_wallpaper.setBackground(new java.awt.Color(0, 204, 51));
        panel1.add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 470, 750));
        jLabel_wallpaper.getAccessibleContext().setAccessibleName("Producto:");
        jLabel_wallpaper.getAccessibleContext().setAccessibleDescription("");

        imagenFondoVerde.setBackground(new java.awt.Color(204, 204, 0));
        panel1.add(imagenFondoVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton5kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5kActionPerformed
        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(5000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 5000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton5kActionPerformed

    private void botonPagoJustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagoJustoActionPerformed
        String pagoJusto = cajaSaldoTotal.getText();
        cajaPago.setText(pagoJusto);
        calcularVuelto(cajaPago, cajaSaldoTotal);
    }//GEN-LAST:event_botonPagoJustoActionPerformed

    private void boton2kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2kActionPerformed
        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(2000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 2000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton2kActionPerformed

    private void boton10kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10kActionPerformed
        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(10000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
            cuadrarEntero(totalAEditar);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 10000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton10kActionPerformed

    private void boton500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton500ActionPerformed
        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(500));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 500));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton500ActionPerformed

    private void boton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton10ActionPerformed
        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(10));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 10));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton10ActionPerformed

    private void boton1kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1kActionPerformed
        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(1000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 1000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton1kActionPerformed

    private void boton20kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton20kActionPerformed

        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(20000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 20000));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton20kActionPerformed

    private void boton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton100ActionPerformed
        int cajaPagoActual = Integer.parseInt(cajaPago.getText());

        if (cajaPago.getText().equals(0)) {
            cajaPago.setText(String.valueOf(100));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        } else {
            cajaPago.setText(String.valueOf(cajaPagoActual + 100));
            calcularVuelto(cajaPago, cajaSaldoTotal);
        }
    }//GEN-LAST:event_boton100ActionPerformed

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        cajaPago.setText(String.valueOf(0));
        cajaVuelto.setText(String.valueOf(0));
    }//GEN-LAST:event_botonQuitarActionPerformed

    private void botonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtras1ActionPerformed
        dispose();
    }//GEN-LAST:event_botonAtras1ActionPerformed

    private void botonEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEfectivoActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPago.getModel();

        if (button.isSelected()) {
            botonTransbank.setSelected(false);
            botonCupon.setSelected(false);
            modeloTabla.setValueAt("Efectivo", 0, 0);
            modeloTabla.setValueAt(totalRedondeado.getText(), 0, 1);
        }
    }//GEN-LAST:event_botonEfectivoActionPerformed

    private void botonTransbankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransbankActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPago.getModel();

        if (button.isSelected()) {
            botonEfectivo.setSelected(false);
            botonCupon.setSelected(false);
            modeloTabla.setValueAt("Transbank", 0, 0);
            modeloTabla.setValueAt(totalRedondeado.getText(), 0, 1);
        }
    }//GEN-LAST:event_botonTransbankActionPerformed

    private void botonCuponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuponActionPerformed
        JToggleButton button = (JToggleButton) evt.getSource();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPago.getModel();

        if (button.isSelected()) {
            botonEfectivo.setSelected(false);
            botonTransbank.setSelected(false);
            modeloTabla.setValueAt("Cupon", 0, 0);
            modeloTabla.setValueAt(totalRedondeado.getText(), 0, 1);
        }
    }//GEN-LAST:event_botonCuponActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPago().setVisible(true);
            }
        });
    }

    public Icon setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));

        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }

    public void calcularVuelto(JTextField caja1, JTextField caja2) {
        int num1 = Integer.parseInt(caja1.getText());
        int num2 = Integer.parseInt(caja2.getText());

        int total = num1 - num2;

        cajaVuelto.setText(String.valueOf(total));
    }

    public void cuadrarEntero(JLabel label) {
        String texto = label.getText();
        double numero = Double.parseDouble(texto);
        long numeroRedondeado = Math.round(numero);
        String textoRedondeado = String.valueOf(numeroRedondeado);
        label.setText(textoRedondeado);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton10;
    private javax.swing.JButton boton100;
    private javax.swing.JButton boton10k;
    private javax.swing.JButton boton1k;
    private javax.swing.JButton boton20k;
    private javax.swing.JButton boton2k;
    private javax.swing.JButton boton500;
    private javax.swing.JButton boton5k;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonAtras1;
    private javax.swing.JToggleButton botonCupon;
    private javax.swing.JToggleButton botonEfectivo;
    private javax.swing.JButton botonPagoJusto;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JToggleButton botonTransbank;
    private javax.swing.JLabel cajaDescuento;
    private javax.swing.JTextField cajaPago;
    private javax.swing.JTextField cajaSaldoTotal;
    private javax.swing.JLabel cajaSubtotal;
    private javax.swing.JTextField cajaVuelto;
    private javax.swing.JLabel imagenFondoVerde;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_Boleta;
    private javax.swing.JButton jButton_busca_cliente;
    private javax.swing.JComboBox<String> jComboBox_cliente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tablaPago;
    private javax.swing.JLabel totalAEditar;
    private javax.swing.JLabel totalRedondeado;
    // End of variables declaration//GEN-END:variables

    //metodo para  cargar los clientes en el jCombobox 
}
