/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.EstoqueController;
import Controller.FuncionarioController;
import Controller.ProdutoController;
import Controller.ProdutoVendidoController;
import Controller.VendaController;
import Model.Estoque;
import Model.Funcionario;
import Model.ProdutoVendido;
import Model.Venda;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author info206
 */
public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form VendaView
     */
    public VendaView() {
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

        jLabel1 = new javax.swing.JLabel();
        dataVenda = new javax.swing.JTextField();
        menu = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        limpa = new javax.swing.JButton();
        combo_cliente = new javax.swing.JComboBox();
        combo_funcionario = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        QuantidadeProdutov = new javax.swing.JTextField();
        combo_Produto = new javax.swing.JComboBox();
        Salvar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Data");

        dataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVendaActionPerformed(evt);
            }
        });

        menu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        menu.setText("Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        Salvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        limpa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        limpa.setText("Limpar");
        limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaActionPerformed(evt);
            }
        });

        combo_cliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_clienteMouseClicked(evt);
            }
        });

        combo_funcionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_funcionarioMouseClicked(evt);
            }
        });
        combo_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_funcionarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantidade");

        combo_Produto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_ProdutoMouseClicked(evt);
            }
        });
        combo_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ProdutoActionPerformed(evt);
            }
        });

        Salvar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salvar1.setText("Add");
        Salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(limpa)
                        .addGap(105, 105, 105)
                        .addComponent(Salvar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(menu))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(190, 190, 190)
                                    .addComponent(combo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(QuantidadeProdutov, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Salvar1)))))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantidadeProdutov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salvar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu)
                    .addComponent(Salvar)
                    .addComponent(limpa))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        try {
            try {
               // TODO add your handling code here:
        VendaController vendaController = new VendaController();
             //capturar o id do produto
                ClienteController c = new ClienteController();
                
                int id_cliente = c.getIdByNome_cliente((String)combo_cliente.getSelectedItem());
                System.out.println(id_cliente);
             
                
               
                Venda v = new Venda (0,0,0,0,0);
               vendaController.inserirVenda(v);
           } catch (SQLException ex) {
               Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
           }
            
            VendaController vendaController = new VendaController();
        FuncionarioController F = new FuncionarioController();
                 int id_funcionario = F.getIdBynome_Funcionario((String)combo_funcionario.getSelectedItem());
                System.out.println(id_funcionario);
                 Venda v = new Venda (0,0,0,0,0);
               vendaController.inserirVenda(v);
        } catch (SQLException ex) {
            Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
            // TODO add your handling code here:

            ProdutoVendidoController produtoVendidoController = new ProdutoVendidoController();
            //capturar o id do produto
            ProdutoController p = new ProdutoController();

            int id_produto = p.getIdByNome_produto((String)combo_Produto.getSelectedItem());
            System.out.println(id_produto);

            ProdutoVendido PV = new ProdutoVendido (0,0,id_produto);;
            produtoVendidoController.inserirProdutoVendido(PV);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutovendidoView.class.getName()).log(Level.SEVERE, null, ex);
        }

              
    }//GEN-LAST:event_SalvarActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Principal frame = new Principal();  
  
           frame.setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    private void limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaActionPerformed
        // TODO add your handling code here:
        dataVenda.setText("");
    }//GEN-LAST:event_limpaActionPerformed

    private void combo_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_clienteMouseClicked
        try {
            // TODO add your handling code here:
            ClienteController c = new ClienteController();
                    Vector v = c.getNomes();
                    combo_cliente.setModel(new DefaultComboBoxModel(v));
        } catch (SQLException ex) {
            Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combo_clienteMouseClicked

    private void combo_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_funcionarioMouseClicked
        try {
            // TODO add your handling code here:
            FuncionarioController f = new FuncionarioController();
                            Vector v = f.getNomes();
                            combo_funcionario.setModel(new DefaultComboBoxModel(v));
        } catch (SQLException ex) {
            Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combo_funcionarioMouseClicked

    private void combo_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_funcionarioActionPerformed

    private void combo_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_ProdutoMouseClicked
        try {
            // TODO add your handling code here:
            ProdutoController p = new ProdutoController();
            Vector v = p.getNomes();
            combo_Produto.setModel(new DefaultComboBoxModel(v));
        } catch (SQLException ex) {
            Logger.getLogger(ProdutovendidoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combo_ProdutoMouseClicked

    private void combo_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_ProdutoActionPerformed

    private void Salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar1ActionPerformed
        try {
            // TODO add your handling code here:

            ProdutoVendidoController produtoVendidoController = new ProdutoVendidoController();
            //capturar o id do produto
            ProdutoController p = new ProdutoController();

            int id_produto = p.getIdByNome_produto((String)combo_Produto.getSelectedItem());
            System.out.println(id_produto);

            ProdutoVendido PV = new ProdutoVendido (0,0,id_produto);
            produtoVendidoController.inserirProdutoVendido(PV);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutovendidoView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_Salvar1ActionPerformed

    private void dataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVendaActionPerformed

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QuantidadeProdutov;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton Salvar1;
    private javax.swing.JComboBox combo_Produto;
    private javax.swing.JComboBox combo_cliente;
    private javax.swing.JComboBox combo_funcionario;
    private javax.swing.JTextField dataVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton limpa;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
