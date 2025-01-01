
package igu;

import controller.Cliente;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.CarneDAO;

public class JMeat extends javax.swing.JFrame {
    
    public javax.swing.JComboBox<String> getCmbMeat() { 
        return cmbMeat;
    }

    public JMeat() {
        initComponents();
        inicializarListeners();
        btnGuardar.setEnabled(false); 
        btnPedir.setEnabled(false);
        this.setLocationRelativeTo(this);
        comboBoxCarne = getCmbMeat();
    }
    
    private JComboBox<String> comboBoxCarne;

    
    public Cliente obtenerDatosFormulario() {
    String nombre = txtClientName.getText().trim();
    String telefono = txtClientPhone.getText().trim();
    String correo = txtCorreo.getText().trim();
    String nota = txtNoteClient.getText().trim();
    return new Cliente(nombre, telefono, correo, nota);
}
    
    private void validarFormulario() {
    boolean habilitar = !txtClientName.getText().trim().isEmpty() &&
                        !txtClientPhone.getText().trim().isEmpty() &&
                        !txtCorreo.getText().trim().isEmpty() &&
                        !txtNoteClient.getText().trim().isEmpty();

    btnGuardar.setEnabled(habilitar);
}

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMeat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtClientPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNoteClient = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbMeat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtKilograms = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEspecificaciones = new javax.swing.JTextField();
        btnPedir = new javax.swing.JButton();
        progressBar = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMeat.setBackground(new java.awt.Color(43, 45, 66));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Sistema de Pedidos de Cortes de Carne");

        jPanel1.setBackground(new java.awt.Color(43, 45, 66));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Información del Cliente");

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre:");

        txtClientName.setBackground(new java.awt.Color(141, 153, 174));
        txtClientName.setForeground(new java.awt.Color(43, 45, 66));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Teléfono:");

        txtClientPhone.setBackground(new java.awt.Color(141, 153, 174));
        txtClientPhone.setForeground(new java.awt.Color(43, 45, 66));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(141, 153, 174));
        txtCorreo.setForeground(new java.awt.Color(43, 45, 66));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Nota: (Opcional)");

        txtNoteClient.setBackground(new java.awt.Color(141, 153, 174));
        txtNoteClient.setForeground(new java.awt.Color(43, 45, 66));

        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNoteClient)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(9, 9, 9)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(16, 16, 16)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtClientName, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                        .addComponent(txtCorreo)
                                        .addComponent(txtClientPhone))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtClientPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNoteClient, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(43, 45, 66));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Selección de cortes de carne");

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Cantidad en kilogramos:");

        txtKilograms.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setText("Especificaciones (Opcional)");

        txtEspecificaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPedir.setText("Pedir");
        btnPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKilograms, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbMeat, 0, 300, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(txtEspecificaciones)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnPedir)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cmbMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEspecificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtKilograms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPedir)
                .addGap(14, 14, 14))
        );

        jButton1.setText("Ver menú");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMeatLayout = new javax.swing.GroupLayout(panelMeat);
        panelMeat.setLayout(panelMeatLayout);
        panelMeatLayout.setHorizontalGroup(
            panelMeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMeatLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelMeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(panelMeatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMeatLayout.setVerticalGroup(
            panelMeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMeatLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelMeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("File");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconography/disco-flexible.png"))); // NOI18N
        jMenuItem1.setText("Guardar pedido");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconography/hoja-de-calculo.png"))); // NOI18N
        jMenuItem2.setText("Generar ticket");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconography/cerrar.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Edit");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconography/lapiz-3d.png"))); // NOI18N
        jMenuItem4.setText("Modificar pedido");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconography/papelera-de-reciclaje.png"))); // NOI18N
        jMenuItem5.setText("Eliminar pedido");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconography/ajuste.png"))); // NOI18N
        jMenuItem6.setText("Configurar IVA");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconography/devolver.png"))); // NOI18N
        jMenuItem7.setText("Deshaser cambios");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        CarneDAO carneDAO = new CarneDAO();
        Cliente cliente = obtenerDatosFormulario();
        boolean resultado = carneDAO.guardarCliente(cliente);
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Cliente guardado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar el cliente");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JMenu menu = new JMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirActionPerformed
    CarneDAO carneDAO = new CarneDAO();
    Cliente cliente = obtenerDatosFormulario();
    List<String> tiposCarne = carneDAO.obtenerTiposCarne();
    List<Double> preciosCarne = carneDAO.obtenerPreciosCarne();

    if (tiposCarne != null && !tiposCarne.isEmpty() && preciosCarne != null && !preciosCarne.isEmpty()) {
        // Obtener datos del pedido
        String tipoCarneSeleccionado = (String) cmbMeat.getSelectedItem();
        String especificaciones = txtEspecificaciones.getText().trim(); // Obtén las especificaciones opcionales
        double cantidadKg = 0;
        try {
            cantidadKg = Double.parseDouble(txtKilograms.getText().trim()); // Obtén la cantidad en kg
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico válido para los kilogramos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buscar el índice del tipo de carne seleccionado
        int index = tiposCarne.indexOf(tipoCarneSeleccionado);
        double precioPorKg = preciosCarne.get(index);

        double precioTotal = cantidadKg * precioPorKg;

        // Generar el ticket
        String ticket = "Cliente: " + cliente.getNombre() + "\n"
                + "Tipo de Carne: " + tipoCarneSeleccionado + "\n"
                + "Especificaciones: " + especificaciones + "\n"
                + "Cantidad: " + cantidadKg + " kg\n"
                + "Precio Total: $" + precioTotal;

        System.out.println(ticket);

        // Opcional: Mostrar el ticket en un diálogo
        JOptionPane.showMessageDialog(this, ticket, "Ticket de Pedido", JOptionPane.INFORMATION_MESSAGE);

        // Guardar el pedido en la base de datos si es necesario
        // carneDAO.guardarPedido(cliente, tipoCarneSeleccionado, especificaciones, cantidadKg, precioTotal);

        JOptionPane.showMessageDialog(this, "Cliente y pedido guardados exitosamente");
    } else {
        JOptionPane.showMessageDialog(this, "Error al obtener los tipos de carne o precios.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnPedirActionPerformed

    private void cargarTiposCarne() {
        CarneDAO carneDAO = new CarneDAO();
        List<String> tiposCarne = carneDAO.obtenerTiposCarne();
        comboBoxCarne.removeAllItems();
        for (String tipo : tiposCarne) {
            comboBoxCarne.addItem(tipo);
        }
    }
    
    public void recargarTiposCarne() {
        cargarTiposCarne(); 
    }
    
    // Llama a este método para inicializar los listeners
private void inicializarListeners() {
    txtClientName.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void removeUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void insertUpdate(DocumentEvent e) { actualizarProgreso(); }
    });

    txtClientPhone.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void removeUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void insertUpdate(DocumentEvent e) { actualizarProgreso(); }
    });

    txtCorreo.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void removeUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void insertUpdate(DocumentEvent e) { actualizarProgreso(); }
    });

    txtNoteClient.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void removeUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void insertUpdate(DocumentEvent e) { actualizarProgreso(); }
    });

    txtEspecificaciones.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void removeUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void insertUpdate(DocumentEvent e) { actualizarProgreso(); }
    });

    txtKilograms.getDocument().addDocumentListener(new DocumentListener() {
        public void changedUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void removeUpdate(DocumentEvent e) { actualizarProgreso(); }
        public void insertUpdate(DocumentEvent e) { actualizarProgreso(); }
    });

    cmbMeat.addActionListener(e -> actualizarProgreso());
}

private void actualizarProgreso() {
    int progreso = 0;
    int totalCampos = 7; // Nombre, Teléfono, Correo, Nota, Carne, Especificaciones, Kilogramos

    if (!txtClientName.getText().trim().isEmpty()) progreso++;
    if (!txtClientPhone.getText().trim().isEmpty()) progreso++;
    if (!txtCorreo.getText().trim().isEmpty()) progreso++;
    if (!txtNoteClient.getText().trim().isEmpty()) progreso++;
    if (cmbMeat.getSelectedItem() != null) progreso++;
    if (!txtEspecificaciones.getText().trim().isEmpty()) progreso++;
    if (!txtKilograms.getText().trim().isEmpty()) progreso++;

    int progresoPorcentaje = (progreso * 100) / totalCampos;
    progressBar.setValue(progresoPorcentaje);
    
    if (progresoPorcentaje == 100) {
        btnGuardar.setEnabled(true);
        btnPedir.setEnabled(true);
    } else {
        btnGuardar.setEnabled(false); 
        btnPedir.setEnabled(false);
    }
}



    
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
            java.util.logging.Logger.getLogger(JMeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnPedir;
    public javax.swing.JComboBox<String> cmbMeat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelMeat;
    private javax.swing.JProgressBar progressBar;
    public javax.swing.JTextField txtClientName;
    public javax.swing.JTextField txtClientPhone;
    public javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEspecificaciones;
    private javax.swing.JTextField txtKilograms;
    public javax.swing.JTextField txtNoteClient;
    // End of variables declaration//GEN-END:variables
}
