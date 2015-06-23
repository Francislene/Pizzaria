/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EstoqueController;
import Controller.ProdutoController;
import Controller.ProdutoVendidoController;
import Model.Estoque;
import Model.ProdutoVendido;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author info206
 */
public class ProdutovendidoView extends javax.swing.JFrame {

    /**
     * Creates new form ProdutovendidoView
     */
    public ProdutovendidoView() {
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
        QuantidadeProdutov = new javax.swing.JTextField();
        combo_Produto = new javax.swing.JComboBox();
        Salvar = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        Limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Quantidade");

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

        Salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Menu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        Limpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Limpar.setText("Limpar");
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Menu))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuantidadeProdutov, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantidadeProdutov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Menu)
                    .addComponent(Limpar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_ProdutoActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        // TODO add your handling code here:
         QuantidadeProdutov.setText(""); 
    }//GEN-LAST:event_LimparActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
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

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
         Principal frame = new Principal();  
  
           frame.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

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

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutovendidoView().setVisible(true);
            }
        });
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Menu;
    private javax.swing.JTextField QuantidadeProdutov;
    private javax.swing.JButton Salvar;
    private javax.swing.JComboBox combo_Produto;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
