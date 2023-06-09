/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas.Pantallas;

import entidades.Paciente;
import javax.swing.JFrame;
/**
 *
 * @author Estudiante
 */
public class JFrameEditarPacientes extends javax.swing.JFrame {
    
    private JFramePacientes padre;
    private Paciente paciente;
    
    public Paciente getPaciente(){
        return paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    
    /**
     * Creates new form JFrameEditarPacientes
     */
    public JFrameEditarPacientes(JFramePacientes padre) {
        initComponents();
        this.padre = padre;
    }
    
    
    private void crearNuevoPaciente(){
    
        paciente = new Paciente();
        paciente.setNombre(txtNombre.getText().trim());
        paciente.setDni(txtDni.getText().trim());
        paciente.setTelefono(txtTelef.getText().trim());
        
        int sexo = this.cbSexo.getSelectedIndex();
        
        paciente.setSexoBiologico(sexo);
        this.padre.agregarNuevoPaciente(paciente);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtTelef = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setText("Paciente");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblDni.setText("DNI");

        lblTelefono.setText("Telefono");

        lblSexo.setText("Sexo");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblDni))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(lblTitulo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblSexo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelef, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       salir(); 
       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        crearNuevoPaciente();
        salir();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void salir(){
        padre.setVisible(true);
         
        this.setVisible(false);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelef;
    // End of variables declaration//GEN-END:variables
}
