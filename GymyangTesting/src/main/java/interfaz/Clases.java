/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import modelo.Clase;

/**
 *
 * @author Adrián
 */
public class Clases extends javax.swing.JPanel {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("GymyangPU");
    private EntityManager em = emf.createEntityManager();
    /**
     * Creates new form Clases
     */
    public Clases() {
        initComponents();
        
        Query consulta = em.createNamedQuery("Clase.findNombres");
        List<String> listaClases = consulta.getResultList();
        String[] arrListaClases = new String[listaClases.size()];
        arrListaClases = listaClases.toArray(arrListaClases);
        jComboBoxClases.setModel(new DefaultComboBoxModel<>(arrListaClases));
        Clase c;
        Query clase = em.createNamedQuery("Clase.findByNombre");
        clase.setParameter("nombre", jComboBoxClases.getSelectedItem().toString());
        c = (Clase) clase.getSingleResult();
        jLabelHoraInicio.setText(c.getHoraInicio());
        jLabelHoraFin.setText(c.getHoraFin());
        jLabelDescripcion.setText(c.getDescripcion());
        jLabelPlazas.setText(c.getPlazas().toString());
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
        jLabel2 = new javax.swing.JLabel();
        jButtonApuntar = new javax.swing.JButton();
        jButtonDesapuntar = new javax.swing.JButton();
        jComboBoxClases = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabelHoraInicio = new javax.swing.JLabel();
        jLabelHoraFin = new javax.swing.JLabel();
        jLabelPlazas = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 560));

        jLabel1.setText("CLASES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/boxeo.jpeg"))); // NOI18N

        jButtonApuntar.setText("Apuntarse");

        jButtonDesapuntar.setText("Desapuntarse");
        jButtonDesapuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesapuntarActionPerformed(evt);
            }
        });

        jComboBoxClases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClasesActionPerformed(evt);
            }
        });

        jLabelHoraInicio.setText("jLabel3");

        jLabelHoraFin.setText("jLabel3");

        jLabelPlazas.setText("jLabel3");

        jLabelDescripcion.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHoraInicio)
                    .addComponent(jLabelHoraFin)
                    .addComponent(jLabelPlazas)
                    .addComponent(jLabelDescripcion))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelHoraInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHoraFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPlazas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescripcion)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jButtonApuntar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDesapuntar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxClases, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDesapuntar)
                    .addComponent(jButtonApuntar))
                .addContainerGap(160, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDesapuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesapuntarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDesapuntarActionPerformed

    private void jComboBoxClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClasesActionPerformed
        Clase c;
        Query clase = em.createNamedQuery("Clase.findByNombre");
        clase.setParameter("nombre", jComboBoxClases.getSelectedItem().toString());
        c = (Clase) clase.getSingleResult();
        jLabelHoraInicio.setText(c.getHoraInicio());
        jLabelHoraFin.setText(c.getHoraFin());
        jLabelDescripcion.setText(c.getDescripcion());
        jLabelPlazas.setText(c.getPlazas().toString());
    }//GEN-LAST:event_jComboBoxClasesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApuntar;
    private javax.swing.JButton jButtonDesapuntar;
    private javax.swing.JComboBox<String> jComboBoxClases;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelHoraFin;
    private javax.swing.JLabel jLabelHoraInicio;
    private javax.swing.JLabel jLabelPlazas;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
