
package sesion63VelascoED_Cola1;

import javax.swing.JOptionPane;

public class TestOperacionesColas extends javax.swing.JFrame {
OperacionesColas cola= new OperacionesColas(5);
    public TestOperacionesColas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnRealizarColaElementosEDCola = new javax.swing.JButton();
        btnImprimirEDCola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Operaciones ED Colas Velasco");

        btnRealizarColaElementosEDCola.setText("Realizar Cola Elementos en ED");
        btnRealizarColaElementosEDCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarColaElementosEDColaActionPerformed(evt);
            }
        });

        btnImprimirEDCola.setText("Imprimir Elementos en ED Cola");
        btnImprimirEDCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirEDColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImprimirEDCola)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblTitulo)
                            .addGap(107, 107, 107))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnRealizarColaElementosEDCola)
                            .addGap(98, 98, 98)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(54, 54, 54)
                .addComponent(btnRealizarColaElementosEDCola)
                .addGap(51, 51, 51)
                .addComponent(btnImprimirEDCola)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarColaElementosEDColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarColaElementosEDColaActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < 10; i++) {
            try {
                cola.insertar(i);
                JOptionPane.showMessageDialog(null, "Llenado de valores \n"+(i+1));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al insertar los datos verificados\n"+e);
            }
        }
    }//GEN-LAST:event_btnRealizarColaElementosEDColaActionPerformed

    private void btnImprimirEDColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirEDColaActionPerformed
        cola.imprimir();
        JOptionPane.showMessageDialog(null, "Cola llena de valores \n Espacio maximo es: \n"+cola.tamMax());
    }//GEN-LAST:event_btnImprimirEDColaActionPerformed

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
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestOperacionesColas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirEDCola;
    private javax.swing.JButton btnRealizarColaElementosEDCola;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
