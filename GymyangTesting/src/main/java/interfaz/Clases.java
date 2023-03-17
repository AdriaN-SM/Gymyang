/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import gymyang.Gymyang;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import modelo.Clase;

/**
 * Panel para visualizar las clases
 * @author Adrián
 */
public class Clases extends javax.swing.JPanel {
    private EntityManagerFactory emf = Gymyang.emf;
    private EntityManager em = Gymyang.em;
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
        jLabelHoraInicio.setText("<html><p><b>Hora Inicio:  </b>"+c.getHoraInicio()+"</p></html>");
        jLabelHoraFin.setText("<html><p><b>Hora Fin:  </b>"+c.getHoraFin()+"</p></html>");
        jLabelDescripcion.setText("<html><p><b>Descripción:  </b>"+c.getDescripcion()+"</p></html>");
        jLabelPlazas.setText("<html><p><b>Plazas:  </b>"+c.getPlazas().toString()+"</p></html>");
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/"+c.getNombre()+".jpeg"))); // NOI18N
        jLabelClase.setText("<html><h1>"+"CLASES"+"<h1></html>");
        jLabelContactos.setText("<html><h3>"+"Contactos:"+"<h3></html>");
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelClase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonApuntar = new javax.swing.JButton();
        jButtonDesapuntar = new javax.swing.JButton();
        jComboBoxClases = new javax.swing.JComboBox<>();
        jLabelContactos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelHoraInicio = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelPlazas = new javax.swing.JLabel();
        jLabelHoraFin = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(800, 560));

        jLabelClase.setText("CLASES");

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

        jLabelContactos.setText("CONTACTOS:");
        jLabelContactos.setMaximumSize(new java.awt.Dimension(100, 14));

        jLabel8.setText("Dirección : C/Albondiga 5");

        jLabel9.setText("Correo: gymyang@gmail.com");

        jLabel10.setText("Horario: Lunes a Sábado 8:00 - 22:00");

        jLabel11.setText("Domingos y festivos : A descansar ");

        jLabelHoraInicio.setText("jLabel3");

        jLabelDescripcion.setText("jLaberl3");

        jLabelPlazas.setText("jLabel3");

        jLabelHoraFin.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelHoraInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(jLabelHoraFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPlazas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jButtonApuntar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDesapuntar))
                            .addComponent(jLabelContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jComboBoxClases, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelClase, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelClase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonApuntar)
                            .addComponent(jButtonDesapuntar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHoraInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHoraFin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPlazas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
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
        jLabelHoraInicio.setText("<html><p><b>Hora Inicio:  </b>"+c.getHoraInicio()+"</p></html>");
        jLabelHoraFin.setText("<html><p><b>Hora Fin:  </b>"+c.getHoraFin()+"</p></html>");
        jLabelDescripcion.setText("<html><p><b>Descripción:  </b>"+c.getDescripcion()+"</p></html>");
        jLabelPlazas.setText("<html><p><b>Plazas:  </b>"+c.getPlazas().toString()+"</p></html>");
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/"+c.getNombre()+".jpeg"))); // NOI18N
    }//GEN-LAST:event_jComboBoxClasesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApuntar;
    private javax.swing.JButton jButtonDesapuntar;
    private javax.swing.JComboBox<String> jComboBoxClases;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClase;
    private javax.swing.JLabel jLabelContactos;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelHoraFin;
    private javax.swing.JLabel jLabelHoraInicio;
    private javax.swing.JLabel jLabelPlazas;
    // End of variables declaration//GEN-END:variables
}
