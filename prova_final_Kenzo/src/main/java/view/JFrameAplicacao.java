package view;

import dominio.NoBuscaBinaria;
import dominio.Produto;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.table.DefaultTableModel;


public class JFrameAplicacao extends javax.swing.JFrame {
  public NoBuscaBinaria arvore = new NoBuscaBinaria(new Produto(0, "inicial", 10, 1));
  
  public JFrameAplicacao() {
    initComponents();
    setLocationRelativeTo(null);
    DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    modelo.addColumn("Código");
    modelo.addColumn("Nome");
    modelo.addColumn("Valor Unitário");
    modelo.addColumn("Quantidade em Estoque");
    
    this.tblProdutos.setModel(modelo);
    NoBuscaBinaria.montaArvore(arvore, null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovoProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblAlturaArvore = new javax.swing.JLabel();
        lblPesquisarProduto = new javax.swing.JLabel();
        txtPesquisarProduto = new javax.swing.JTextField();
        lblSemResultadosPesquisa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de produtos");
        setResizable(false);

        btnNovoProduto.setText("Novo Produto");
        btnNovoProduto.setFocusPainted(false);
        btnNovoProduto.setMaximumSize(new java.awt.Dimension(129, 40));
        btnNovoProduto.setMinimumSize(new java.awt.Dimension(129, 40));
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProdutos);

        lblAlturaArvore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAlturaArvore.setText("Altura da Árvore: ");

        lblPesquisarProduto.setLabelFor(txtPesquisarProduto);
        lblPesquisarProduto.setToolTipText("Pesquisar Produtos pelo Código");

        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyTyped(evt);
            }
        });

        lblSemResultadosPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSemResultadosPesquisa.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlturaArvore, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSemResultadosPesquisa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPesquisarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarProduto)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblPesquisarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisarProduto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlturaArvore, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lblSemResultadosPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void txtPesquisarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyReleased
    DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    modelo.addColumn("Código");
    modelo.addColumn("Nome");
    modelo.addColumn("Valor Unitário");
    modelo.addColumn("Quantidade em Estoque");
    
    Set<Produto> produtos = new LinkedHashSet<>();
    NoBuscaBinaria.obtemProdutosCadastrados(arvore, produtos);
    if(!this.txtPesquisarProduto.getText().isEmpty())
      produtos.stream()
              .filter(produto -> produto.getCodigo() == Integer.parseInt(this.txtPesquisarProduto.getText()) && produto.getCodigo() > 0)
              .forEach(produto -> modelo.addRow(new String[] {produto.getCodigo()+"", produto.getNome(), produto.getValorUnitario()+"", 
        produto.getQuantidadeEmEstoque()+""} ));
    else
      produtos.stream()
              .filter(produto -> produto.getCodigo() > 0)
              .forEach(produto -> modelo.addRow(new String[] {produto.getCodigo()+"", produto.getNome(), produto.getValorUnitario()+"", 
      produto.getQuantidadeEmEstoque()+""} ));
    this.tblProdutos.setModel(modelo);
    
    if(this.tblProdutos.getModel().getRowCount() == 0)
      this.lblSemResultadosPesquisa.setText("Não há produto para o código informado!");
    else
      this.lblSemResultadosPesquisa.setText("");
      
  }//GEN-LAST:event_txtPesquisarProdutoKeyReleased

  private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
    JDialogNovoProduto novoProduto = new JDialogNovoProduto(this, false);
    novoProduto.setVisible(true);
  }//GEN-LAST:event_btnNovoProdutoActionPerformed

  private void txtPesquisarProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyTyped
    String caracteres="0987654321";

    if(!(caracteres.contains(evt.getKeyChar()+""))){
        evt.consume();

    }
  }//GEN-LAST:event_txtPesquisarProdutoKeyTyped
  
  public void listar() throws Exception{
    DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    modelo.addColumn("Código");
    modelo.addColumn("Nome");
    modelo.addColumn("Valor Unitário");
    modelo.addColumn("Quantidade em Estoque");
    
    Set<Produto> produtos = new LinkedHashSet<>();
    NoBuscaBinaria.obtemProdutosCadastrados(arvore, produtos);
    produtos.stream()
            .filter(produto -> produto.getCodigo() > 0)
            .forEach(produto -> modelo.addRow(new String[] {produto.getCodigo()+"", produto.getNome(), produto.getValorUnitario()+"", 
      produto.getQuantidadeEmEstoque()+""} ));
    
    this.tblProdutos.setModel(modelo);
    
  }
  
  public void atualizarAlturaDaAlvore() {
    this.lblAlturaArvore.setText("Altura da Árvore: " + (NoBuscaBinaria.calcularAlturaDaArvore(arvore) - 1));
  }
  
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
        if ("Windows".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(JFrameAplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new JFrameAplicacao().setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlturaArvore;
    private javax.swing.JLabel lblPesquisarProduto;
    private javax.swing.JLabel lblSemResultadosPesquisa;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtPesquisarProduto;
    // End of variables declaration//GEN-END:variables
}