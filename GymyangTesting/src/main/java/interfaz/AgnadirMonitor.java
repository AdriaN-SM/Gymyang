/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import EntityDAO.MonitorDAOImpl;
import gymyang.Gymyang;
import javax.swing.JOptionPane;
import modelo.Monitor;

/**
 * Ventana para añadir un nuevo monitor
 * @author Adrián
 */
public class AgnadirMonitor extends javax.swing.JFrame {
    MonitorDAOImpl mdaoi = new MonitorDAOImpl(Gymyang.em);
    public Monitor monitor;
    /**
     * Creates new form AgnadirMonitor
     */
    public AgnadirMonitor() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Añadir Monitor");
        monitor = null;
        jButtonAgnadir.setVisible(false);
        jButtonEliminar.setVisible(false);
        if (Gymyang.usuarioActual.getNombre().equals("admin")) {
            jButtonAgnadir.setVisible(true);
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

        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jSpinnerEdad = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFrase = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButtonAgnadir = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSpinnerEdad.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinnerEdad, ""));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Edad:");

        jLabel4.setText("Frase:");

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jLabel5.setText("Descripción:");

        jButtonAgnadir.setText("Añadir");
        jButtonAgnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgnadirActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAgnadir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jTextFieldFrase)
                            .addComponent(jTextFieldApellidos)
                            .addComponent(jTextFieldNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 110, Short.MAX_VALUE)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFrase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgnadir)
                    .addComponent(jButtonEliminar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgnadirActionPerformed
        if(monitor == null) {
            if(jTextFieldNombre.getText()!=null &&
           jTextFieldApellidos.getText()!=null &&
           jTextFieldFrase.getText()!=null &&
           jTextAreaDescripcion.getText()!=null && 
           jSpinnerEdad.getComponentCount()>0) {
                Gymyang.transaction.begin();

                Monitor m = new Monitor(jTextFieldNombre.getText(), 
                                        jTextFieldApellidos.getText(), 
                                        jSpinnerEdad.getComponentCount(), 
                                        jTextFieldFrase.getText(), 
                                        jTextAreaDescripcion.getText());
                mdaoi.save(m);
                Gymyang.transaction.commit();
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Monitor añadido con éxito!!", "Añadido", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Los datos introducidos no son correctos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            
            Monitor m = mdaoi.find(monitor.getId());
            Gymyang.transaction.begin();
            m.setNombre(monitor.getNombre());
            m.setApellidos(monitor.getApellidos());
            m.setEdad(monitor.getEdad());
            m.setFrase(monitor.getFrase());
            m.setDescripcion(monitor.getDescripcion());
            mdaoi.update(m);
            Gymyang.transaction.commit();
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Monitor modificado con éxito!!", "Modificado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }//GEN-LAST:event_jButtonAgnadirActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Gymyang.transaction.begin();
        if (mdaoi.delete(monitor)) {
            Gymyang.transaction.commit();
            this.setVisible(false);
            JOptionPane.showMessageDialog(this, "Monitor eliminado con éxito!!", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "No se ha encontrado el monitor a eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(AgnadirMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgnadirMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgnadirMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgnadirMonitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgnadirMonitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAgnadir;
    public javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner jSpinnerEdad;
    public javax.swing.JTextArea jTextAreaDescripcion;
    public javax.swing.JTextField jTextFieldApellidos;
    public javax.swing.JTextField jTextFieldFrase;
    public javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
