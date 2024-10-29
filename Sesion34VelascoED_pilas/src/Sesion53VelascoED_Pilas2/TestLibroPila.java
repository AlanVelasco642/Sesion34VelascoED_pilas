
package Sesion53VelascoED_Pilas2;

import java.util.Stack;
import javax.swing.JOptionPane;

public class TestLibroPila extends javax.swing.JFrame {
//Declaracion de pila libros
    Stack<Libro>pila=new Stack<Libro>();
    Libro libro1=new Libro("Ceballos", "C++", 2024, "ED. RAMA");
    Libro libro2=new Libro("Deitel", "JAVA", 2023, "ED. Mc Graw Hill");
    Libro libro3=new Libro("Grossman", "Angular", 2024, "ED. Planeta");
    Libro libro4=new Libro("Ceballos", "C", 2024, "ED. RAMA");
    Libro libro5=new Libro("Garcia", "Android", 2023, "ED. Trillas");

    
    
    public TestLibroPila() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnConsultarLibrosPila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Operaciones Libros Biblioteca Velasco");

        btnConsultarLibrosPila.setText("Consultar Libros");
        btnConsultarLibrosPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarLibrosPilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConsultarLibrosPila)
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addComponent(btnConsultarLibrosPila)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarLibrosPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarLibrosPilaActionPerformed
        //Agregar informacion del libro
        pila.push(libro1);
        pila.push(libro2);
        pila.push(libro3);
        pila.push(libro4);
        pila.push(libro5);
        //imprimir informacion de libros (EN LA PILA)
        
        while (!pila.isEmpty()) {//inicia while
            JOptionPane.showMessageDialog(null, "Datos de Libros"
                                               +"\n Autor:"+pila.peek().getAutor()
                                               +"\n Titulo:"+pila.peek().getTitulo()
                                               +"\n Fecha de lanzamiento:"+pila.peek().getAnio()
                                               +"\n Editorial"+pila.peek().getEditorial());
            pila.pop();//Ulyimo elemento de la pila           
        }//termina while
        
    }//GEN-LAST:event_btnConsultarLibrosPilaActionPerformed

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
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestLibroPila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLibroPila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarLibrosPila;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
