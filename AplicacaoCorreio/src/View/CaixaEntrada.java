package View;

import Comunicação.Consultas;
import static Comunicação.Consultas.usuario;
import Comunicação.Email;
import DAO.EmailDAO;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CaixaEntrada extends javax.swing.JFrame {
    public CaixaEntrada() {
        initComponents();
        mostrarEmails();
        CaixadeEntrada.setText("CAIXA DE ENTRADA - "+ Consultas.usuario);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotaoEnviarEmail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEmails = new javax.swing.JTable();
        botaoDeletar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        caixaTexto = new javax.swing.JTextArea();
        botaoVisualizar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        CaixadeEntrada = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BotaoEnviarEmail.setText("ESCREVER");
        BotaoEnviarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarEmailActionPerformed(evt);
            }
        });

        tabelaEmails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "De", "Assunto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaEmails);
        if (tabelaEmails.getColumnModel().getColumnCount() > 0) {
            tabelaEmails.getColumnModel().getColumn(0).setMaxWidth(30);
            tabelaEmails.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        botaoDeletar.setText("DELETAR");
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });
        botaoDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botaoDeletarKeyReleased(evt);
            }
        });

        caixaTexto.setColumns(20);
        caixaTexto.setRows(5);
        jScrollPane3.setViewportView(caixaTexto);

        botaoVisualizar.setText(">");
        botaoVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        CaixadeEntrada.setFont(new java.awt.Font("Source Sans Pro", 1, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoEnviarEmail)
                    .addComponent(botaoDeletar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CaixadeEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoVisualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoAtualizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoAtualizar)
                    .addComponent(CaixadeEntrada))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(botaoVisualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(BotaoEnviarEmail)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEnviarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarEmailActionPerformed
        EnviarEmail objEnviarEmail = new EnviarEmail();
        objEnviarEmail.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotaoEnviarEmailActionPerformed

    
    
    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
        if (tabelaEmails.getSelectedRow() != -1) {
            Email e = new Email();
            EmailDAO dao = new EmailDAO();
            
            e.setId((int) tabelaEmails.getValueAt(tabelaEmails.getSelectedRow(), 0));
            dao.delete(e);
            caixaTexto.setText(" ");
            
            mostrarEmails();
        }
        else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione um email para excluir!");
        }
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void botaoDeletarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoDeletarKeyReleased
        
    }//GEN-LAST:event_botaoDeletarKeyReleased

    private void botaoVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarActionPerformed
        if (tabelaEmails.getSelectedRow() != -1) {
            caixaTexto.setText(" ");
            Email em = new Email();
            EmailDAO dao = new EmailDAO();
            String mensagem;
            
            int id = (int) tabelaEmails.getValueAt(tabelaEmails.getSelectedRow(), 0);
            mensagem = dao.exibirMensagem(id);
            caixaTexto.setText(mensagem);
            caixaTexto.setFont(new Font("Comic Sans", Font.BOLD, 15));
            caixaTexto.setEditable(false);
        }
    }//GEN-LAST:event_botaoVisualizarActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        CaixaEntrada nce = new CaixaEntrada();
        nce.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(CaixaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaEntrada().setVisible(true);
            }
        });
    }
    
    private void mostrarEmails () {
        DefaultTableModel modelo = (DefaultTableModel) tabelaEmails.getModel();
        modelo.setNumRows(0);
        EmailDAO edao = new EmailDAO();
        
        for (Email e: edao.exibirEmails(Consultas.usuario)) {
            modelo.addRow(new Object[] {
                e.getId(),
                e.getAutor(),
                e.getAssunto()
            });
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEnviarEmail;
    private javax.swing.JLabel CaixadeEntrada;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoVisualizar;
    private javax.swing.JTextArea caixaTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaEmails;
    // End of variables declaration//GEN-END:variables
}