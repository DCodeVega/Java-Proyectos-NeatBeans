/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventanas_internas;

/**
 *
 * @author USUARIO
 */
public class Parciales_Y_Examenes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Parciales_Y_Examenes
     */
    public Parciales_Y_Examenes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Practica Nº1 ");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("1. DADO UN VECTOR V , SUMAR TODO LOS ELEMENTOS PRIMOS\n\n2. DADO UN VECTOR V, INTERCAMBIAR EL ELEMENTO MENOR CON EL MAYOR\n\n3. DADO UN VECTOR V, SUMAR TODO LOS ELEMENTOS PERFECTOS\n\n4. EN UN VECTOR V, GENERAR LOS N PRIMEROS NUMEROS PRIMOS\n\n5. EN UN VECTOR ALMACE LOS DATOS DE UN LIBRO CON LOS SIGUIENTES ATRIBUTOS\n (ID,TITULO,AUTOR,EDITORIAL,NRO_EJEMPLAR,ISBN,PRECIO,AÑO_PUB) \nREALIZAR LAS SIGUIENTES OPERACIONES\n• REALIZAR EL TDA\n• CREAR EL VECTOR\n• ADICIONAR\n• ELIMINAR UN X LIBRO\n• MODIFICAR LOS DATOS DE UN LIBRO\n• LISTAR TODO LOS LIBROS\n• BUSCAR LIBROS POR AUTOR\n\n6. EN UN ARRAYLIST ALMACENAR LOS DATOS DE UN PRODUCTO CON LOS SIGUIENTES\n ATRIBUTOS:\n(ID,DESC,MARCA,PROCEDENCIA,CANTIDAD,PRECIO,STOCKMAX,STOCKMIN),\n REALIZAR LAS SIGUIENTES OPERACIONES.\na. REALIZAR EL TDA\nb. ADICIONAR UN PRODUCTO\nc. ELIMINAR UN X PRODUCTO\nd. MODIFICAR UN X PRODUCTO\ne. LISTAR TODO LOS PRODUCTOS\nf. BUSCAR PRODUCTOS POR DESCRIPCION\ng. ORDENAR LOS PRODUCTOS POR PRECIO");
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejercicio 1,2,3 y 4", "Ejercicio 5", "Ejercicio 6" }));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Ejecutar ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1)
                        .addGap(0, 274, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
