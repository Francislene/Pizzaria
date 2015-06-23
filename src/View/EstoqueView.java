/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EstoqueController;
import Controller.ProdutoController;
import Model.Estoque;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author info206
 */
public class EstoqueView extends javax.swing.JFrame {

    /**
     * Creates new form EstoqueView
     */
    public EstoqueView() {
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
        QuantidadeEstoque = new javax.swing.JTextField();
        botaoMenu = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        combo_Produto = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Quantidade");

        botaoMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoMenu.setText("Menu");
        botaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuActionPerformed(evt);
            }
        });

        botaoSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(QuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoLimpar)
                        .addGap(91, 91, 91)
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(botaoMenu)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(QuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoMenu)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoLimpar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuActionPerformed
        // TODO add your handling code here:
        Principal frame = new Principal();  
  
           frame.setVisible(true);
    }//GEN-LAST:event_botaoMenuActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try {
            // TODO add your handling code here:
     EstoqueController estoqueController = new EstoqueController();
          //capturar o id do produto
             ProdutoController p = new ProdutoController();
             
             int id_produto = p.getIdByNome_produto((String)combo_Produto.getSelectedItem());
             System.out.println(id_produto);

            Estoque e = new Estoque (Integer.parseInt(QuantidadeEstoque.getText()),id_produto);
                            
                          
                           estoqueController.inserirEstoque(e);
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        // TODO add your handling code here:
        QuantidadeEstoque.setText(""); 
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void combo_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_ProdutoMouseClicked
        try {
            // TODO add your handling code here:
            ProdutoController p = new ProdutoController();
                Vector v = p.getNomes();
                combo_Produto.setModel(new DefaultComboBoxModel(v));
        } catch (SQLException ex) {
            Logger.getLogger(EstoqueView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combo_ProdutoMouseClicked

    private void combo_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_ProdutoActionPerformed

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstoqueView().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QuantidadeEstoque;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoMenu;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox combo_Produto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
