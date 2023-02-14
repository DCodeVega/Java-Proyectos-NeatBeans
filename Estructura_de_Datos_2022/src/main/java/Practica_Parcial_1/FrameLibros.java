package Practica_Parcial_1;
/**
 *
 * @author Diego Vega
 */
import javax.swing.JOptionPane;
public class FrameLibros extends javax.swing.JFrame {

    vectorLibros V[];
    vectorLibros datLib;
    int cantidad, tam;

    /**
     * Creates new form FrameLibros
     */
    public FrameLibros() {
        initComponents();
        setBounds(0, 0, 1100, 700);
        setLocationRelativeTo(null);

    }
    String[] botones = {"ID", "Titulo", "Autor", "Editorial", "Nro de ejemplar", "ISBN", "Precio", "Año publicado", "Finalizar"};

    /*
    5. en un vector almacene los datos de un libro con los siguientes atributos:
    (ID,Titulo,Autor,Editorial,Nro de ejemplar,ISBN,Precio,Año Publicado)
    realizar los siguientes operaciones:
    •Realizar el TDA
    •Crear el vector
    •Adicionar
    •Eliminar un libro
    •modificar los datos de un libro
    •listar todos libros
    •Buscar Libros por Autor
    pag 73.
     */
    public void crear() {
        cantidad = Integer.parseInt(jTextField9.getText());
        tam = 0;
        V = new vectorLibros[cantidad];
    }

    public void adicionar() {

        String id, titulo, autor, editorial, nroDeEjemplar, isbn, precio, añoPublicado;

        id = jTextField1.getText();
        titulo = jTextField2.getText();
        autor = jTextField3.getText();
        editorial = jTextField4.getText();
        nroDeEjemplar = jTextField5.getText();
        isbn = jTextField6.getText();
        precio = jTextField7.getText();
        añoPublicado = jTextField8.getText();
        datLib = new vectorLibros(id, titulo, autor, editorial, nroDeEjemplar, isbn, precio, añoPublicado);
        V[tam] = datLib;
        tam++;
    }

    public void mostrar() {
        int i;

        jTextArea1.setText("");
        jTextArea1.append("Id\tTitulo\t\tAutor\t\tEditorial\tNro. de Ejemplar\tISBN\tPrecio\tAño Publicado\n");
        for (i = 0; i < tam; i++) {
            jTextArea1.append(V[i].getId() + "\t" + V[i].getTitulo() + "\t" + V[i].getAutor() + "\t" + V[i].getEditorial() + "\t" + V[i].getNroDeEjemplar() + "\t\t" + V[i].getIsbn() + "\t" + V[i].getPrecio() + "\t" + V[i].getAñoPublicado() + "\n");
        }
    }

    public void eliminar() {
        String busId = "";
        boolean sw = false;
        int i;
        busId = JOptionPane.showInputDialog("Introdusca ID del Libro a Eliminar");
        for (i = 0; i < tam; i++) {
            if (V[i].id.equals(busId.toLowerCase())) {
                int c = JOptionPane.showConfirmDialog(this, "Estas Seguro de Eliminar el Libro: " + V[i].getTitulo());
                if (c == 0) {
                    V[i].setId("----------");
                    V[i].setTitulo("----------");
                    V[i].setAutor("----------");
                    V[i].setEditorial("----------");
                    V[i].setNroDeEjemplar("----------");
                    V[i].setIsbn("----------");
                    V[i].setPrecio("----------");
                    V[i].setAñoPublicado("----------");
                    JOptionPane.showMessageDialog(null, "LIBRO ELIMINADO CON EXITO", "INFORMACION DEL LIBRO", WIDTH);
                    sw = true;
                } else if (c == 1) {
                    JOptionPane.showMessageDialog(null, "GRACIAS POR NO ELIMINAR EL LIBRO", "INFORMACION DEL LIBRO", ICONIFIED);
                    sw = true;
                } else {
                    JOptionPane.showMessageDialog(null, "ACCION CANCELADA", "INFORMACION DEL LIBRO", ERROR);
                    sw = true;
                }
            }
        }
        if (sw == false) {
            jTextArea1.setText("");
            JOptionPane.showMessageDialog(null, "No existe el Libro");
        }
    }

    public void modificar() {
        boolean rot = true;
        String busTitulo = "";
        boolean pe = false;
        busTitulo = JOptionPane.showInputDialog(this, "Ingrese Titulo del Libro a Modificar: ","Titulo");
        for (int i = 0; i < tam; i++) {
            if (V[i].titulo.equals(busTitulo.toLowerCase())) {
                pe=true;
                OUTER:
                while (rot == true) {
                    int b = JOptionPane.showOptionDialog(this, "Seleccione Opcion a Modificar: ", "MODIFICAR LIBRO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_OPTION, null, botones, botones[8]);
                    switch (b) {
                        case 0:
                            String auxI = JOptionPane.showInputDialog(this, "Ingrese Nuevo ID: ",V[i].getId());
                            V[i].setId(auxI);
                            break;
                        case 1:
                            String auxT = JOptionPane.showInputDialog(this, "Ingrese Nuevo Titulo: ",V[i].getTitulo());
                            V[i].setTitulo(auxT);
                            break;
                        case 2:
                            String auxA = JOptionPane.showInputDialog(this, "Ingrese Nuevo Autor: ",V[i].getAutor());
                            V[i].setAutor(auxA);
                            break;
                        case 3:
                            String auxE = JOptionPane.showInputDialog(this, "Ingrese Nuevo Editorial: ",V[i].getEditorial());
                            V[i].setEditorial(auxE);
                            break;
                        case 4:
                            String auxN = JOptionPane.showInputDialog(this, "Ingrese Nuevo Nro. de Ejemplares: ",V[i].getNroDeEjemplar());
                            V[i].setNroDeEjemplar(auxN);
                            break;
                        case 5:
                            String auxIs = JOptionPane.showInputDialog(this, "Ingrese Nuevo ISBN: ",V[i].getIsbn());
                            V[i].setIsbn(auxIs);
                            break;
                        case 6:
                            String auxP = JOptionPane.showInputDialog(this, "Ingrese Nuevo Precio: ",V[i].getPrecio());
                            V[i].setPrecio(auxP);
                            break;
                        case 7:
                            String auxAñ = JOptionPane.showInputDialog(this, "Ingrese Nuevo Año de Publicacion: ",V[i].getAñoPublicado());
                            V[i].setAñoPublicado(auxAñ);
                            break;
                        default:
                            break OUTER;
                    }
                }

            }
        }
        if (pe == false) {
            jTextArea1.setText("");
            JOptionPane.showMessageDialog(null, "No existe el Libro");
        }
    }

    public void buscar() {
        String busAutor = "";
        boolean sw = false;
        int i;
        jTextArea1.setText("");
        jTextArea1.append("Id\tTitulo\tAutor\tEditorial\tNro. de Ejemplar\tISBN\t\tPrecio\t\tAño Publicado\n");
        busAutor = JOptionPane.showInputDialog("Introdusca Autor");
        for (i = 0; i < tam; i++) {
            if (V[i].autor.equals(busAutor.toLowerCase())) {
                jTextArea1.append(V[i].getId() + "\t" + V[i].getTitulo() + "\t" + V[i].getAutor() + "\t" + V[i].getEditorial() + "\t" + V[i].getNroDeEjemplar() + "\t\t" + V[i].getIsbn() + "\t\t" + V[i].getPrecio() + "\t\t" + V[i].getAñoPublicado() + "\n");
                sw = true;
                JOptionPane.showMessageDialog(null, "AUTOR ENCONTRADO", "INFORMACION DEL LIBRO", WIDTH);
            }
        }
        if (sw == false) {
            jTextArea1.setText("");
            JOptionPane.showMessageDialog(null, "No existe el Libro");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa de: Diego Vega Martinez");
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 60, 30, 40);

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.setText("1-1052/2020");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 60, 250, 40);

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.setText("estructura de datos");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(530, 60, 240, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Titulo :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 60, 50, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Autor :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 100, 50, 40);

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField3.setText("Adrian E. Quisbert");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(150, 100, 250, 40);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Editorial :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 100, 80, 40);

        jTextField4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField4.setText("java Books");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(530, 100, 240, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Nro de Ejemplar :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 120, 40);

        jTextField5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField5.setText("63");
        getContentPane().add(jTextField5);
        jTextField5.setBounds(150, 140, 250, 40);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("ISBN :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 140, 50, 40);

        jTextField6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField6.setText("3564324");
        getContentPane().add(jTextField6);
        jTextField6.setBounds(530, 140, 240, 40);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Precio :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 180, 60, 40);

        jTextField7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField7.setText("120 Bs");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(150, 180, 250, 40);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Año Publicado :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(410, 180, 120, 40);

        jTextField8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField8.setText("2020");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(530, 180, 240, 40);

        jButton1.setBackground(new java.awt.Color(0, 255, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ADICIONAR LIBRO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(840, 40, 220, 40);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("ELIMINAR LIBRO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(840, 90, 220, 40);

        jButton3.setBackground(new java.awt.Color(204, 255, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("MODIFICAR DATOS DE LIBRO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(840, 140, 220, 40);

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("BUSCAR LIBRO POR AUTOR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(840, 190, 220, 40);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("LISTAR TODOS LOS LIBROS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(840, 240, 220, 40);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel9.setText("PROGRAMA: \"LIBROS\"");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(350, 10, 390, 40);

        jTextArea1.setBackground(new java.awt.Color(0, 102, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 1060, 330);

        jTextField9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField9.setText("50");
        getContentPane().add(jTextField9);
        jTextField9.setBounds(460, 270, 50, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Tamaño de Vector :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 270, 130, 30);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("CREAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(520, 270, 90, 30);

        jLabel10.setText("Estudiante:Juan Diego Vega Martinez");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(780, 660, 190, 15);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1100, 680);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        adicionar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        mostrar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        crear();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
