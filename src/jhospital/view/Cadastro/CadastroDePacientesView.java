/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.view.Cadastro;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import jhospital.controller.PacienteController;

/**
 *
 * @author Rebecca
 */
public class CadastroDePacientesView extends javax.swing.JPanel {

  private void limparDados() {
      textFieldNome.setText("");
      textFieldEmail.setText("");
      textFieldEndereco.setText("");
      textFieldTelefone.setText("");
      textFieldQuarto.setText("");
      textFieldDoenca.setText("");
      textFieldDiasInternado.setText("");
      comboBoxPlanoDeSaude.setSelectedIndex(0);
  }
          
    
    public CadastroDePacientesView (JTabbedPane tabbedPanel) {
        
        this.tabbedPane= tabbedPanel;
        
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

        labelCadastroDePacientes = new javax.swing.JLabel();
        separadorSuperior = new javax.swing.JSeparator();
        labelNome = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelQuarto = new javax.swing.JLabel();
        labelDiasInternado = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        textFieldEndereco = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldQuarto = new javax.swing.JTextField();
        textFieldDiasInternado = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelDoenca = new javax.swing.JLabel();
        labelPlanodeSaude = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        textFieldDoenca = new javax.swing.JTextField();
        comboBoxPlanoDeSaude = new javax.swing.JComboBox<>();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        labelCadastroDePacientes.setText("Cadastro de Pacientes");

        labelNome.setText("Nombre Completo:");

        labelEndereco.setText("Endereço:");

        labelEmail.setText("Email:");

        labelQuarto.setText("Quarto:");

        labelDiasInternado.setText("Dias Internado:");

        textFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEnderecoActionPerformed(evt);
            }
        });

        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        labelTelefone.setText("Telefone;");

        labelDoenca.setText("Doença:");

        labelPlanodeSaude.setText("Plano de Saúde:");

        comboBoxPlanoDeSaude.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        comboBoxPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPlanoDeSaudeActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorSuperior)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labelDiasInternado)
                            .addComponent(labelQuarto)
                            .addComponent(labelEmail)
                            .addComponent(labelEndereco)
                            .addComponent(labelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelDoenca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldDoenca, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTelefone))
                            .addComponent(textFieldEndereco)
                            .addComponent(textFieldNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldDiasInternado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelPlanodeSaude)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBoxPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelCadastroDePacientes)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelCadastroDePacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separadorSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(textFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmail)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelefone)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuarto)
                    .addComponent(textFieldQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDoenca)
                    .addComponent(textFieldDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiasInternado)
                    .addComponent(textFieldDiasInternado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPlanodeSaude)
                    .addComponent(comboBoxPlanoDeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonCancelar))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEnderecoActionPerformed

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void comboBoxPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPlanoDeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPlanoDeSaudeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
     
        if (JOptionPane.showConfirmDialog(this, "deseja mesmo fechar o cadastro, sem salvar?","Confirmação", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
          tabbedPane.remove(this);
          tabbedPane.validate();
          tabbedPane.repaint();
        }
        
        
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
if (textFieldNome != null && !textFieldNome.getText().equals("")&& textFieldEmail != null && !textFieldEmail.getText().equals("")
        && textFieldEndereco != null && !textFieldEndereco.getText().equals("") && textFieldDoenca != null && !textFieldDoenca.getText().equals("")
        ) {
    PacienteController pc = new PacienteController();
    
    try { 
        pc.inserir (textFieldNome.getText(),
                    textFieldEmail.getText(),
                    textFieldEndereco.getText(),
                    textFieldTelefone.getText(),
                    textFieldQuarto.getText(),
                    textFieldDoenca.getText(),
                    textFieldDiasInternado.getText(),
                    (String)comboBoxPlanoDeSaude.getSelectedItem());
        JOptionPane.showMessageDialog(this,"Contato Salvo com Suceso!","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        limparDados();
    
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,"Não foi posivel Salvar contato\n" + e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }} else
{ 
        JOptionPane.showMessageDialog(this, "O nome, email, endereco e doença do" + "paciente são campos obrigatorios!", "Error", JOptionPane.ERROR_MESSAGE);
}      
        
    }//GEN-LAST:event_buttonSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<String> comboBoxPlanoDeSaude;
    private javax.swing.JLabel labelCadastroDePacientes;
    private javax.swing.JLabel labelDiasInternado;
    private javax.swing.JLabel labelDoenca;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPlanodeSaude;
    private javax.swing.JLabel labelQuarto;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JSeparator separadorSuperior;
    private javax.swing.JTextField textFieldDiasInternado;
    private javax.swing.JTextField textFieldDoenca;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldEndereco;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldQuarto;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
    private JTabbedPane tabbedPane;}
