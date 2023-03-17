/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package interfaz;


import gymyang.Gymyang;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import modelo.Usuario;

/**
 * Panel para mostrar el perfil del usuario
 * @author david
 */
public class Perfil extends javax.swing.JPanel {

    /**
     * Creates new form Perfil
     */
    public Perfil() {
        initComponents();
        
        Usuario u = Gymyang.usuarioActual;
        jLabelNombre.setText("<html><p><b>Nombre:  </b>"+u.getNombre()+"</p></html>");
        jLabelApellido.setText("<html><p><b>Apellidos:  </b>"+u.getApellidos()+"</p></html>");
        jLabelContraseña.setText("<html><p><b>Contraseña:  </b>"+u.getPassword()+"</p></html>");
        jLabelEmail.setText("<html><p><b>E-mail:  </b>"+u.getEmail()+"</p></html>");
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato.format(u.getFechaNac());
        jLabelNacimiento.setText("<html><p><b>Fecha Nacimiento:  </b>"+fecha+"</p></html>");
        jLabel1.setText("<html><h1>"+"PERFIL"+"<h1></html>");
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
        jLabelIconoPerfil = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelNacimiento = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();

        jLabel1.setText("PERFIL");

        jLabelIconoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Avatar2.png"))); // NOI18N

        jLabelNombre.setText("jLabel2");

        jLabelContraseña.setText("jLabel2");

        jLabelEmail.setText("jLabel2");

        jLabelNacimiento.setText("jLabel2");

        jLabelApellido.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelIconoPerfil)
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelContraseña)
                            .addComponent(jLabelEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(53, 53, 53)
                                .addComponent(jLabelApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconoPerfil)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApellido)
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelContraseña)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNacimiento)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIconoPerfil;
    private javax.swing.JLabel jLabelNacimiento;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
}
