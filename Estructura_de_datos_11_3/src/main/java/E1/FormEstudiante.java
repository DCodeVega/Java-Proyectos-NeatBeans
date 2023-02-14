
package E1;

import javax.swing.JOptionPane;

public class FormEstudiante extends javax.swing.JFrame {

    DatosEstudiante dest;
    int ce;
    public FormEstudiante() {
        initComponents();
        setBounds (300,300,1200,800);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Datos de Estudiante");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 20, 260, 60);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("C.I.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 120, 40, 60);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Paterno");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 120, 110, 60);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Materno");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 210, 100, 60);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Nombre");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 220, 110, 60);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Direccion");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 330, 110, 60);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Carrera");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 320, 110, 60);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Nota");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 430, 60, 60);

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 130, 290, 40);

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(630, 124, 280, 40);

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 220, 290, 40);

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(630, 224, 280, 40);

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(170, 340, 290, 40);

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(630, 324, 280, 40);

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(170, 440, 290, 40);

        jTextArea1.setBackground(new java.awt.Color(0, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 204, 204));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 510, 1130, 240);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(990, 40, 130, 70);

        jButton2.setText("Adicionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(990, 110, 130, 70);

        jButton3.setText("Listar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(990, 180, 130, 70);

        jButton4.setText("Buscar");
        getContentPane().add(jButton4);
        jButton4.setBounds(990, 250, 130, 70);

        jButton5.setText("Ordenar");
        getContentPane().add(jButton5);
        jButton5.setBounds(990, 320, 130, 70);

        jButton6.setText("Salir");
        getContentPane().add(jButton6);
        jButton6.setBounds(990, 390, 130, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    ce= Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Estudiantes",""));
    dest=new DatosEstudiante(ce);                                               //DatosEstudiante manda al constructor el valor q pusiste en ce
    JOptionPane.showMessageDialog(null, "El vector se creo");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String ci,pat,mat,nom,dir,car;
    double not;
    ci = jTextField1.getText();
    pat = jTextField2.getText();
    mat = jTextField3.getText();
    nom = jTextField4.getText();
    dir = jTextField5.getText();
    car = jTextField6.getText();
    not = Double.parseDouble(jTextField7.getText());
    Estudiante de=new Estudiante(ci, pat, mat, nom, dir, car, not);
    dest.adicionar(de);                                                         //todo lo q se guardo en lo llenado de la estructura sera igual al valor "de"
                                                                                // y de ira a "adicionar" donde toda esa informacion se guardara en un vector
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String s="";
    s=dest.listar();
    jTextArea1.setText("");
    jTextArea1.append(s);                                                       // se crea "s" por q igual en "listar" hay "s", luego s ejecuta a listar
                                         // "setText" es la ventana de muestra en la estrfuctura y "append" es pa q se limpie la ventana de muestra
                                         // en listar " s = s +ve[j].getTodo(); " dice q s muestre el vector 0 con el "get Todo" osea todos esos atributos q son iguales a todo
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
