/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import centrodeatención.Centro;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class Centros_frame extends javax.swing.JFrame {

    /**
     * Creates new form Centros_frame
     */
    ArrayList<Centro> lista_centros1 = new ArrayList();
    public Centros_frame() {
        
    }

    public Centros_frame(frame_principal frame_principal) {
        initComponents();
        setSize(695, 678);
        setResizable(false);
        frame_interno_agregar_medico.setVisible(false);
        lista_centros1 = frame_principal.lista_centros;
        mostrarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listado_centros = new javax.swing.JTable();
        frame_interno_agregar_medico = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();
        input_nombres = new javax.swing.JTextField();
        input_codigo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        input_residencia = new javax.swing.JTextField();
        btn_enviar_actualizar = new javax.swing.JButton();
        btn_agregar_paciente = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        panel_borrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_borrar = new javax.swing.JButton();
        input_borrar_codigo = new javax.swing.JTextField();
        btn_panel_actualizar = new javax.swing.JButton();
        panel_actualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        input_actualizar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listado_centros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código centro", "Nombre", "Dirección centro"
            }
        ));
        jScrollPane1.setViewportView(listado_centros);

        frame_interno_agregar_medico.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Nombre:");

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Código:");

        btn_enviar.setText("Agregar centro");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        input_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombresActionPerformed(evt);
            }
        });

        input_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_codigoActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel20.setText("Dirección de centro:");

        input_residencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_residenciaActionPerformed(evt);
            }
        });

        btn_enviar_actualizar.setText("Actualizar centro");
        btn_enviar_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviar_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frame_interno_agregar_medicoLayout = new javax.swing.GroupLayout(frame_interno_agregar_medico);
        frame_interno_agregar_medico.setLayout(frame_interno_agregar_medicoLayout);
        frame_interno_agregar_medicoLayout.setHorizontalGroup(
            frame_interno_agregar_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_interno_agregar_medicoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(frame_interno_agregar_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frame_interno_agregar_medicoLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(10, 10, 10)
                        .addComponent(input_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(input_residencia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(frame_interno_agregar_medicoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(input_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frame_interno_agregar_medicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(frame_interno_agregar_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_enviar_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        frame_interno_agregar_medicoLayout.setVerticalGroup(
            frame_interno_agregar_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame_interno_agregar_medicoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(frame_interno_agregar_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_residencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(frame_interno_agregar_medicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frame_interno_agregar_medicoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btn_enviar_actualizar))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_enviar)
                .addContainerGap())
        );

        btn_agregar_paciente.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btn_agregar_paciente.setText("Agregar centro");
        btn_agregar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_pacienteActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btn_eliminar.setText("Eliminar centro");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        panel_borrar.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Digite el código del médico");
        panel_borrar.add(jLabel4);
        jLabel4.setBounds(10, 10, 200, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setText("a eliminar:");
        panel_borrar.add(jLabel5);
        jLabel5.setBounds(10, 30, 80, 24);

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });
        panel_borrar.add(btn_borrar);
        btn_borrar.setBounds(120, 30, 80, 23);
        panel_borrar.add(input_borrar_codigo);
        input_borrar_codigo.setBounds(80, 30, 30, 20);

        btn_panel_actualizar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btn_panel_actualizar.setText("Actualizar centro");
        btn_panel_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_panel_actualizarActionPerformed(evt);
            }
        });

        panel_actualizar.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Digite el código del médico");
        panel_actualizar.add(jLabel3);
        jLabel3.setBounds(10, 10, 200, 20);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("a actualizar:");
        panel_actualizar.add(jLabel2);
        jLabel2.setBounds(10, 30, 80, 24);

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        panel_actualizar.add(btn_actualizar);
        btn_actualizar.setBounds(140, 30, 100, 20);
        panel_actualizar.add(input_actualizar);
        input_actualizar.setBounds(100, 30, 30, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_agregar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_panel_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(frame_interno_agregar_medico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar_paciente)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_panel_actualizar))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frame_interno_agregar_medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        try{
            String nombres, apellidos, sexo, residencia, centro, motivo, medico, fecha;
            int codigo;
            nombres = input_nombres.getText();
            codigo = Integer.parseInt(input_codigo.getText());
            residencia = input_residencia.getText();

            if(!"".equals(nombres)&&!"".equals(codigo)&&!"".equals(residencia)){
                Centro centro_aux = new Centro();
                centro_aux.setNombre(nombres);
                centro_aux.setCodigo(codigo);
                centro_aux.setDireccion(residencia);
                lista_centros1.add(centro_aux);
            }

        }catch(Exception e){}
        mostrarTabla();
        frame_interno_agregar_medico.setVisible(false);
        input_nombres.setText("");
        input_codigo.setText("");
        input_residencia.setText("");
    }//GEN-LAST:event_btn_enviarActionPerformed
    
    public void mostrarTabla(){
        String matriz[][] = new String[lista_centros1.size()][10];
        for(int i=0; i<lista_centros1.size();i++){
            matriz[i][0]=lista_centros1.get(i).getCodigoString();
            matriz[i][1]=lista_centros1.get(i).getNombre();
            matriz[i][2]=lista_centros1.get(i).getDireccion();

        }
        listado_centros.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Código centro", "Nombre", "Dirección centro"
            } 
            
        ){
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            };
            
        });
 
    }
    
    private void input_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombresActionPerformed

    private void input_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_codigoActionPerformed

    private void input_residenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_residenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_residenciaActionPerformed

    private void btn_enviar_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviar_actualizarActionPerformed
        for(int i=0;i<lista_centros1.size();i++){
            if(input_codigo.getText().equals(lista_centros1.get(i).getCodigoString())){
                try{
                    String nombres, apellidos, sexo, residencia, centro, motivo, medico, fecha;
                    int codigo;
                    nombres = input_nombres.getText();
                    residencia = input_residencia.getText();

                    if(!"".equals(nombres)&&!"".equals(residencia)){
                        lista_centros1.get(i).setNombre(nombres);
                        lista_centros1.get(i).setDireccion(residencia);
                    }

                }catch(Exception e){}

            }
        }
        frame_interno_agregar_medico.setVisible(false);
        mostrarTabla();
        input_nombres.setText("");
        input_codigo.setText("");
        input_residencia.setText("");
        input_actualizar.setText("");
        panel_actualizar.setVisible(false);
    }//GEN-LAST:event_btn_enviar_actualizarActionPerformed

    private void btn_agregar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_pacienteActionPerformed
        input_nombres.setText("");
        input_codigo.setText("");
        input_residencia.setText("");
        frame_interno_agregar_medico.setVisible(true);
        panel_borrar.setVisible(false);
        btn_enviar_actualizar.setVisible(false);
        panel_actualizar.setVisible(false);
        btn_enviar.setVisible(true);
    }//GEN-LAST:event_btn_agregar_pacienteActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        frame_interno_agregar_medico.setVisible(false);
        panel_borrar.setVisible(true);
        panel_actualizar.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        for(int i=0;i<lista_centros1.size();i++){
            if(input_borrar_codigo.getText().equals(lista_centros1.get(i).getCodigoString())){
                lista_centros1.remove(i);
            }
        }
        input_borrar_codigo.setText("");
        panel_borrar.setVisible(false);
        mostrarTabla();        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void btn_panel_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_panel_actualizarActionPerformed
        for(int i=0;i<lista_centros1.size();i++){
            if(lista_centros1.isEmpty() == false){
                try{
                    panel_actualizar.setVisible(true);

                }catch(Exception e){}
                System.out.println("No hay pacientes.");

            }
        }
    }//GEN-LAST:event_btn_panel_actualizarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        for(int i=0;i<lista_centros1.size();i++){
            if(Integer.parseInt(input_actualizar.getText()) == lista_centros1.get(i).getCodigoInt()){
                panel_borrar.setVisible(false);
                input_codigo.setText(lista_centros1.get(i).getCodigoString());
                input_nombres.setText(lista_centros1.get(i).getNombre());
                input_residencia.setText(lista_centros1.get(i).getDireccion());

                frame_interno_agregar_medico.setVisible(true);
                btn_enviar.setVisible(false);
                btn_enviar_actualizar.setVisible(true);
            }
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Centros_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Centros_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Centros_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Centros_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Centros_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar_paciente;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JButton btn_enviar_actualizar;
    private javax.swing.JButton btn_panel_actualizar;
    private javax.swing.JPanel frame_interno_agregar_medico;
    private javax.swing.JTextField input_actualizar;
    private javax.swing.JTextField input_borrar_codigo;
    private javax.swing.JTextField input_codigo;
    private javax.swing.JTextField input_nombres;
    private javax.swing.JTextField input_residencia;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado_centros;
    private javax.swing.JPanel panel_actualizar;
    private javax.swing.JPanel panel_borrar;
    // End of variables declaration//GEN-END:variables
}
