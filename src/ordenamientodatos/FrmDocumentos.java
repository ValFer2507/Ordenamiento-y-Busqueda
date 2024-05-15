
package ordenamientodatos;

import javax.swing.JOptionPane;

public class FrmDocumentos extends javax.swing.JFrame {

    public FrmDocumentos() {
        initComponents();

        String nombreArchivo = System.getProperty("user.dir")
                + "/src/datos/Datos.csv";
        Documento.obtenerDatosDesdeArchivo(nombreArchivo);
        Documento.mostrarDatos(tblDocumentos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnOrdenarBurbuja = new javax.swing.JButton();
        btnOrdenarRapido = new javax.swing.JButton();
        btnOrdenarInsercion = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        cmbCriterio = new javax.swing.JComboBox();
        txtTiempo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        cmbBuscarPor = new javax.swing.JComboBox<>();
        txtNombreBuscado = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocumentos = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnOrdenarBurbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ordenar.png"))); // NOI18N
        btnOrdenarBurbuja.setToolTipText("Ordenar Burbuja");
        btnOrdenarBurbuja.setFocusable(false);
        btnOrdenarBurbuja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrdenarBurbuja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrdenarBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarBurbujaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOrdenarBurbuja);

        btnOrdenarRapido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/OrdenarRapido.png"))); // NOI18N
        btnOrdenarRapido.setToolTipText("Ordenar Rápido");
        btnOrdenarRapido.setFocusable(false);
        btnOrdenarRapido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrdenarRapido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOrdenarRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarRapidoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOrdenarRapido);

        btnOrdenarInsercion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/OrdenarInsercion.png"))); // NOI18N
        btnOrdenarInsercion.setToolTipText("Ordenar Inserción");
        btnOrdenarInsercion.setFocusable(false);
        btnOrdenarInsercion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOrdenarInsercion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnOrdenarInsercion);
        jToolBar1.add(jSeparator3);

        cmbCriterio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre Completo, Tipo de Documento", "Tipo de Documento, Nombre Completo" }));
        cmbCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCriterioActionPerformed(evt);
            }
        });
        jToolBar1.add(cmbCriterio);

        txtTiempo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTiempo.setToolTipText("");
        jToolBar1.add(txtTiempo);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Buscar.png"))); // NOI18N
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);
        jToolBar1.add(jSeparator1);

        cmbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre Comp", "Apellido 1", "Documento" }));
        cmbBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBuscarPorActionPerformed(evt);
            }
        });
        jToolBar1.add(cmbBuscarPor);

        txtNombreBuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBuscadoActionPerformed(evt);
            }
        });
        jToolBar1.add(txtNombreBuscado);

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/vinoculares.png"))); // NOI18N
        btnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionar.setFocusable(false);
        btnSeleccionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSeleccionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSeleccionar);
        jToolBar1.add(jSeparator2);

        tblDocumentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDocumentos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarBurbujaActionPerformed
        System.out.println("Ordenamiento BURBUJA");
        if (cmbCriterio.getSelectedIndex() >= 0) {
            Util.iniciarCronometro();
            //Documento.ordenarBurbujaRecursivo(0, cmbCriterio.getSelectedIndex());
            Documento.ordenarBurbuja(cmbCriterio.getSelectedIndex());
            txtTiempo.setText(Util.getTextoTiempoCronometro());
            Documento.mostrarDatos(tblDocumentos);
        }
    }//GEN-LAST:event_btnOrdenarBurbujaActionPerformed

    private void btnOrdenarRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarRapidoActionPerformed
        System.out.println("Ordenamiento RAPIDO");
        if (cmbCriterio.getSelectedIndex() >= 0) {
            Util.iniciarCronometro();
            Documento.ordenarRapido(0, Documento.documentos.size() - 1, cmbCriterio.getSelectedIndex());
            txtTiempo.setText(Util.getTextoTiempoCronometro());
            Documento.mostrarDatos(tblDocumentos);
        }
    }//GEN-LAST:event_btnOrdenarRapidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        System.out.println("Ordenamiento Arbol Binario");
        Util.iniciarCronometro();
        ArbolBinario ab = Documento.obtenerArbolBinario(cmbCriterio.getSelectedIndex());
        txtTiempo.setText(Util.getTextoTiempoCronometro());
        
        ab.mostrar(tblDocumentos);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreBuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBuscadoActionPerformed

    private void cmbBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBuscarPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBuscarPorActionPerformed

    private void cmbCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCriterioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCriterioActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        String nombreABuscar = txtNombreBuscado.getText();
        int criterioBusqueda = cmbBuscarPor.getSelectedIndex();
        System.out.println(criterioBusqueda);
        
        System.out.println("Buscando a: " + nombreABuscar);
        // Realiza la búsqueda en el árbol binario
        
        String nombreBuscado = txtNombreBuscado.getText();
        ArbolBinario ab = Documento.obtenerArbolBinario(cmbCriterio.getSelectedIndex());
        Util.iniciarCronometro();
        
        // Realiza la búsqueda en el árbol binario
        Nodo nodoEncontrado = ab.buscarYSeleccionar(nombreBuscado, criterioBusqueda);

        if(nodoEncontrado != null) {
            // Obtén la posición del nodo encontrado en la tabla
            int indiceFila = ab.obtenerIndiceFilaNodo(tblDocumentos, nodoEncontrado);

            // Selecciona la fila correspondiente en la tabla
            if (indiceFila != -1) {
                tblDocumentos.setRowSelectionInterval(indiceFila, indiceFila);
                tblDocumentos.scrollRectToVisible(tblDocumentos.getCellRect(indiceFila, 0, true));
            }
            JOptionPane.showMessageDialog(null, txtNombreBuscado.getText()+" encontrado!");
        }else{
            JOptionPane.showMessageDialog(null, "No existe un registro con el nombre '"+ nombreBuscado+"'");
        }

        txtTiempo.setText(Util.getTextoTiempoCronometro());
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDocumentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDocumentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnOrdenarBurbuja;
    private javax.swing.JButton btnOrdenarInsercion;
    private javax.swing.JButton btnOrdenarRapido;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cmbBuscarPor;
    private javax.swing.JComboBox cmbCriterio;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblDocumentos;
    private javax.swing.JTextField txtNombreBuscado;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
