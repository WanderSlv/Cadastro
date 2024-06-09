package visao;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;
import visao.Mensagem;

public class GerenciarFerramenta extends javax.swing.JFrame {

    private Ferramenta objetoferramenta;

    public GerenciarFerramenta() {
        initComponents();
        this.objetoferramenta = new Ferramenta(); // carrega objetoamigo de amigo
        this.carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFerramenta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        JTFFerramentas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        JTFPreco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JBRemoverFerramenta = new javax.swing.JToggleButton();
        JBAtualizarFerramenta = new javax.swing.JToggleButton();
        JBVoltar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Ferramenta", "Marca", "Preço"
            }
        ));
        JTableFerramenta.setToolTipText("");
        JTableFerramenta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JTableFerramentaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableFerramenta);

        jLabel1.setText("Ferramenta");

        JTFFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentasActionPerformed(evt);
            }
        });

        jLabel2.setText("Marca");

        JTFPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPrecoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        JBRemoverFerramenta.setText("Remover Ferramenta");
        JBRemoverFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRemoverFerramentaActionPerformed(evt);
            }
        });

        JBAtualizarFerramenta.setText("Atualizar Ferramenta");
        JBAtualizarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAtualizarFerramentaActionPerformed(evt);
            }
        });

        JBVoltar.setText("Voltar");
        JBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JTFFerramentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(JTFMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBAtualizarFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBRemoverFerramenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFerramentas)
                    .addComponent(JBRemoverFerramenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFMarca)
                    .addComponent(JBAtualizarFerramenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JBVoltar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFerramentaMouseClicked
        if (this.JTableFerramenta.getSelectedRow() != -1) {
            String ferramenta = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 1).toString();
            String preco = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 2).toString();
            String marca = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 3).toString();

            this.JTFFerramentas.setText(ferramenta);
            this.JTFPreco.setText(preco);
            this.JTFMarca.setText(marca);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableFerramentaMouseClicked

    private void JTFPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPrecoActionPerformed

    private void JTFFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentasActionPerformed

    private void JBRemoverFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRemoverFerramentaActionPerformed
        String nomeAmigo = JOptionPane.showInputDialog(null, "Nome:");
        String foneAmigo = JOptionPane.showInputDialog(null, "Marca:");
        Ferramenta ferramentaDel = new Ferramenta(nomeAmigo, foneAmigo, 0.0);
        ferramentaDel.deletaFerramenta();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBRemoverFerramentaActionPerformed

    private void JBAtualizarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAtualizarFerramentaActionPerformed
        String editNome = JOptionPane.showInputDialog("Nome da ferramenta: ");
        String editMarca = JOptionPane.showInputDialog("Marca da ferramenta: ");
        Ferramenta ferramentaEdit = new Ferramenta(editNome, editMarca, 0.0);
        int ferramentaid = ferramentaEdit.getFerramentaid(editNome, editMarca);
        if(ferramentaid == -1){
           JOptionPane.showMessageDialog(null, "Dados não encontrados!"); 
        }else{
            // Definindo o look and feel do sistema operacional
           try {
               UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
               e.printStackTrace();
           }

           // Opções de botões
           String[] options = {"Nome", "Marca", "Custo", "Cancelar"};

           // Mensagem da caixa de diálogo
           String message = "Qual dado você gostaria de alterar?";

           // Título da caixa de diálogo
           String title = "Editando dados de ferramenta";

           // Exibindo o JOptionPane com botões personalizados
           int option = JOptionPane.showOptionDialog(
                   null,                                 // Componente pai
                   message,                              // Mensagem
                   title,                                // Título
                   JOptionPane.YES_NO_CANCEL_OPTION,     // Tipo de opção
                   JOptionPane.QUESTION_MESSAGE,         // Tipo de mensagem
                   null,                                 // Ícone
                   options,                              // Botões personalizados
                   options[0]                            // Botão padrão
           );

           // Tratamento da opção selecionada
           switch (option) {
               case 0: // Salvar
                   editNome = JOptionPane.showInputDialog("Novo nome: ");
                   ferramentaEdit.setNome(editNome);
                   break;
               case 1: // Não Salvar
                   editMarca = JOptionPane.showInputDialog("Nova Marca: ");
                   ferramentaEdit.setMarca(editMarca);
                   break;
               case 2: // Cancelar
                   double editCusto = Double.parseDouble(JOptionPane.showInputDialog("Novo Custo: "));
                   ferramentaEdit.setCusto(editCusto);
                   break;
               case 3: // Cancelar
                   JOptionPane.showMessageDialog(null, "Operação cancelada!");
                   break;
               default:
                   System.out.println("Nenhuma opção selecionada");
                   break;
           }
        }        
        // TODO add your handling code here:
    }//GEN-LAST:event_JBAtualizarFerramentaActionPerformed

    private void JBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVoltarActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVoltarActionPerformed

    private void JTableFerramentaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JTableFerramentaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableFerramentaAncestorAdded

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramenta.getModel();
        modelo.setNumRows(0); // Posiciona na primeira linha da tabela
        // Carrega a lista de objetos aluno
        ArrayList<Ferramenta> minhaLista = objetoferramenta.getMinhaListaFerramenta();
        for (Ferramenta a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getNome(),
                a.getMarca(),
                a.getCusto(),});
        }
    }

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
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JBAtualizarFerramenta;
    private javax.swing.JToggleButton JBRemoverFerramenta;
    private javax.swing.JToggleButton JBVoltar;
    private javax.swing.JTextField JTFFerramentas;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFPreco;
    private javax.swing.JTable JTableFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
