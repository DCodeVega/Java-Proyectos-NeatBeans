package ejemplosDeEstructuras;
import javax.swing.JOptionPane;
public class form_Matrices extends javax.swing.JFrame {

    int A[][];
    int fil, col;
    Matriz mat = new Matriz();
    Generacion_Matrices genMat = new Generacion_Matrices();

    public form_Matrices() {
        initComponents();
        setBounds(0, 0, 1000, 600);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(27, 107, 640, 436);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Generacion Matrices");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 20, 330, 40);

        jButton1.setText("Tablero Ajedrez");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(800, 110, 130, 60);

        jButton2.setText("Cubo magico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(800, 180, 130, 60);

        jButton3.setText("Triangular Sup");
        getContentPane().add(jButton3);
        jButton3.setBounds(800, 250, 130, 60);

        jButton4.setText("Triangular Inf");
        getContentPane().add(jButton4);
        jButton4.setBounds(800, 320, 130, 60);

        jButton5.setText("Matriz X");
        getContentPane().add(jButton5);
        jButton5.setBounds(800, 390, 130, 60);

        jButton6.setText("Matriz Gusanito");
        getContentPane().add(jButton6);
        jButton6.setBounds(800, 460, 130, 60);

        jButton7.setText("Matriz Diagonal Sec.");
        getContentPane().add(jButton7);
        jButton7.setBounds(980, 110, 140, 60);

        jButton8.setText("Matriz tiro al blanco");
        getContentPane().add(jButton8);
        jButton8.setBounds(980, 180, 140, 60);

        jButton9.setText("Matriz Latina");
        getContentPane().add(jButton9);
        jButton9.setBounds(980, 250, 140, 60);

        jButton10.setText("Matriz Columna de 1");
        getContentPane().add(jButton10);
        jButton10.setBounds(980, 320, 140, 60);

        jButton11.setText("Matriz Caracol");
        getContentPane().add(jButton11);
        jButton11.setBounds(980, 390, 140, 60);

        jButton12.setText("Salir");
        getContentPane().add(jButton12);
        jButton12.setBounds(980, 460, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int n;
        String s = "";
        n = Integer.parseInt(JOptionPane.showInputDialog("Tamano de la matriz", ""));
        A = new int[n][n];
        A = genMat.genera_tablero_ajedrez(n);
        s = mat.mostrarMatInt(A);
        jTextArea1.setText("");
        jTextArea1.append(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int n;
        String s = "";
        n = Integer.parseInt(JOptionPane.showInputDialog("Tamano de la matriz", ""));
        if (n % 2 != 0) {
            A = new int[n][n];
            A = genMat.cubo_magico(n);
            s = mat.mostrarMatInt(A);
            jTextArea1.setText("");
            jTextArea1.append(s);
        } else {
            JOptionPane.showMessageDialog(null, "Tamano de la matriz debe ser Impar");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(form_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Matrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
