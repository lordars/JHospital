/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.view;

import javax.swing.JOptionPane;
import jhospital.view.Cadastro.CadastroDeEnfermeiroView;
import jhospital.view.Cadastro.CadastroDeMedicoView;
import jhospital.view.Cadastro.CadastroDePacientesView;
import jhospital.view.Cadastro.CadastroDeVisitantesView;

/**
 *
 * @author Rebecca
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        tabbedPanePrincipal = new javax.swing.JTabbedPane();
        menuPrincipal = new javax.swing.JMenuBar();
        mensuArquivo = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuItemCadastroDePaciente = new javax.swing.JMenuItem();
        menuItemCadastroDeVisitante = new javax.swing.JMenuItem();
        menuItemCadastroDeMedico = new javax.swing.JMenuItem();
        menuItemCadastroDeEnfermeiro = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuItemConsultaDePaciente = new javax.swing.JMenuItem();
        menuItemConsultaDeVisitante = new javax.swing.JMenuItem();
        menuItemConsultaDeMedico = new javax.swing.JMenuItem();
        menuItemConsultaDeEnfermeiro = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JHospital");
        setName("telaPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 400));

        mensuArquivo.setText("Arquivo");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        mensuArquivo.add(menuItemSair);

        menuPrincipal.add(mensuArquivo);

        menuCadastro.setText("Cadastro");

        menuItemCadastroDePaciente.setText("Cadastro de Paciente");
        menuItemCadastroDePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroDePacienteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroDePaciente);

        menuItemCadastroDeVisitante.setText("Cadastro de visitante");
        menuItemCadastroDeVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroDeVisitanteActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroDeVisitante);

        menuItemCadastroDeMedico.setText("Cadastro de Medico");
        menuItemCadastroDeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroDeMedicoActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroDeMedico);

        menuItemCadastroDeEnfermeiro.setText("Cadastro de Enfermero");
        menuItemCadastroDeEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastroDeEnfermeiroActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadastroDeEnfermeiro);

        menuPrincipal.add(menuCadastro);

        menuConsulta.setText("Consulta");

        menuItemConsultaDePaciente.setText("Consulta de Paciente");
        menuConsulta.add(menuItemConsultaDePaciente);

        menuItemConsultaDeVisitante.setText("Consulta de Visitante");
        menuConsulta.add(menuItemConsultaDeVisitante);

        menuItemConsultaDeMedico.setText("Consulta de Medico");
        menuConsulta.add(menuItemConsultaDeMedico);

        menuItemConsultaDeEnfermeiro.setText("Consulta de Enfermeiro");
        menuConsulta.add(menuItemConsultaDeEnfermeiro);

        menuPrincipal.add(menuConsulta);

        menuAyuda.setText("Ayuda");

        menuItemSobre.setText("Sobre");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemSobre);

        menuPrincipal.add(menuAyuda);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPanePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
if (JOptionPane.showConfirmDialog(this, "Deseja mesmo fechar o Sistema?",
        "Confirmação",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
    System.exit(0);
    
}      
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemCadastroDePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroDePacienteActionPerformed
        tabbedPanePrincipal.add("Cadastro de Paciente",
        new CadastroDePacientesView(tabbedPanePrincipal));     
        tabbedPanePrincipal.revalidate();
        tabbedPanePrincipal.repaint();
          
               
    }//GEN-LAST:event_menuItemCadastroDePacienteActionPerformed

    private void menuItemCadastroDeVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroDeVisitanteActionPerformed
  tabbedPanePrincipal.add("Cadastro de Visitante",
        new CadastroDeVisitantesView(tabbedPanePrincipal));     
        tabbedPanePrincipal.revalidate();
        tabbedPanePrincipal.repaint();       
    }//GEN-LAST:event_menuItemCadastroDeVisitanteActionPerformed

    private void menuItemCadastroDeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroDeMedicoActionPerformed
  tabbedPanePrincipal.add("Cadastro de Medico",
        new CadastroDeMedicoView(tabbedPanePrincipal));     
        tabbedPanePrincipal.revalidate();
        tabbedPanePrincipal.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCadastroDeMedicoActionPerformed

    private void menuItemCadastroDeEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastroDeEnfermeiroActionPerformed
  tabbedPanePrincipal.add("Cadastro de Enfermeiro",
        new CadastroDeEnfermeiroView(tabbedPanePrincipal));     
        tabbedPanePrincipal.revalidate();
        tabbedPanePrincipal.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCadastroDeEnfermeiroActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
      
        
        JOptionPane.showMessageDialog(this, "Trabajo de la escuela Evolution Cursos Realizado por Adrián Ricardo Iazbeck Scalia v1.0", "Sobre",
        JOptionPane.INFORMATION_MESSAGE) ;
    }//GEN-LAST:event_menuItemSobreActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mensuArquivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem menuItemCadastroDeEnfermeiro;
    private javax.swing.JMenuItem menuItemCadastroDeMedico;
    private javax.swing.JMenuItem menuItemCadastroDePaciente;
    private javax.swing.JMenuItem menuItemCadastroDeVisitante;
    private javax.swing.JMenuItem menuItemConsultaDeEnfermeiro;
    private javax.swing.JMenuItem menuItemConsultaDeMedico;
    private javax.swing.JMenuItem menuItemConsultaDePaciente;
    private javax.swing.JMenuItem menuItemConsultaDeVisitante;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JTabbedPane tabbedPanePrincipal;
    // End of variables declaration//GEN-END:variables
}
