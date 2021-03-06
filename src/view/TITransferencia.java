/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Dao.EstoqueDAO;
import Dao.ProdutoDAO;
import Model.Estoque;
import Model.Produtos;
import Utils.codigoProdutoEstoque;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Heitor Lopes
 */
public class TITransferencia extends javax.swing.JFrame {

    /**
     * Creates new form TITransferencia
     */
    public TITransferencia() {
        initComponents();
        setLocationRelativeTo(null);
        atualizarTabelaEstoqueDe();
        preencherComboBox();

    }

    public void preencherComboBox() {
        comboBoxPara.removeAllItems();
        EstoqueDAO estoqueDAO = new EstoqueDAO();

        ArrayList<Estoque> estoques = estoqueDAO.listar();

        if (estoques.size() != 0) {
            for (Estoque estoque : estoques) {
                comboBoxPara.addItem(estoque.getLoja());

            }
        } else {
            comboBoxPara.addItem("0");
            comboBoxPara.setEnabled(false);
        }
    }

    public static void atualizarTabelaEstoqueDe() {

        TabelaEstoqueDe.removeAll();
        
        for (int i = 0; i < 100; i++) {
            TabelaEstoqueDe.setValueAt("", i, 0);

        }

        ProdutoDAO produtoDAO = new ProdutoDAO();

        ArrayList<Produtos> produtos = produtoDAO.buscarPorEstoque(codigoProdutoEstoque.codigoProduto);

        int cont = 0;
        for (Produtos produto : produtos) {
            TabelaEstoqueDe.setValueAt(produto.getDescricao(), cont, 0);
            cont++;
        }

    }

    public static void atualizarTabelaEstoquePara() {
        TabelaEstoquePara.removeAll();

        for (int i = 0; i < 100; i++) {
            TabelaEstoquePara.setValueAt("", i, 0);

        }

        ProdutoDAO produtoDAO = new ProdutoDAO();

        ArrayList<Produtos> produtos = produtoDAO.buscarPorEstoque(comboBoxPara.getSelectedIndex() + 1);

        int cont = 0;
        for (Produtos produto : produtos) {
            TabelaEstoquePara.setValueAt(produto.getDescricao(), cont, 0);
            cont++;
        }

        TabelaEstoquePara.validate();
        TabelaEstoquePara.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mid = new javax.swing.JPanel();
        midLeft = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TabelaEstoqueDe = new javax.swing.JTable();
        midMid = new javax.swing.JPanel();
        midMid1 = new javax.swing.JPanel();
        comboBoxPara = new javax.swing.JComboBox<String>();
        midMid2 = new javax.swing.JPanel();
        midMid3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        midMid4 = new javax.swing.JPanel();
        midMid5 = new javax.swing.JPanel();
        midRight = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TabelaEstoquePara = new javax.swing.JTable();
        bot = new javax.swing.JPanel();
        botTop = new javax.swing.JPanel();
        botMid = new javax.swing.JPanel();
        botMid1 = new javax.swing.JPanel();
        botMid2 = new javax.swing.JPanel();
        TransfeirBtn = new javax.swing.JButton();
        botMid3 = new javax.swing.JPanel();
        botMid4 = new javax.swing.JPanel();
        VoltarBtn = new javax.swing.JButton();
        botMid5 = new javax.swing.JPanel();
        botBot = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(494, 299));
        setPreferredSize(new java.awt.Dimension(500, 450));
        getContentPane().setLayout(new java.awt.GridLayout(3, 0));

        top.setBackground(new java.awt.Color(118, 180, 247));
        top.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/transferencia.png"))); // NOI18N
        top.add(jLabel1);

        getContentPane().add(top);

        mid.setBackground(new java.awt.Color(118, 180, 247));
        mid.setLayout(new java.awt.GridLayout(1, 3));

        midLeft.setBackground(new java.awt.Color(118, 180, 247));
        midLeft.setLayout(new java.awt.GridLayout(1, 0));

        TabelaEstoqueDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaEstoqueDe.setMinimumSize(new java.awt.Dimension(120, 64));
        jScrollPane6.setViewportView(TabelaEstoqueDe);

        midLeft.add(jScrollPane6);

        mid.add(midLeft);

        midMid.setBackground(new java.awt.Color(118, 180, 247));
        midMid.setLayout(new java.awt.GridLayout(5, 0));

        midMid1.setBackground(new java.awt.Color(118, 180, 247));
        midMid1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        comboBoxPara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxPara.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboBoxPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxParaActionPerformed(evt);
            }
        });
        midMid1.add(comboBoxPara);

        midMid.add(midMid1);

        midMid2.setBackground(new java.awt.Color(118, 180, 247));

        javax.swing.GroupLayout midMid2Layout = new javax.swing.GroupLayout(midMid2);
        midMid2.setLayout(midMid2Layout);
        midMid2Layout.setHorizontalGroup(
            midMid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );
        midMid2Layout.setVerticalGroup(
            midMid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        midMid.add(midMid2);

        midMid3.setBackground(new java.awt.Color(118, 180, 247));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("------>");
        midMid3.add(jLabel2);

        midMid.add(midMid3);

        midMid4.setBackground(new java.awt.Color(118, 180, 247));

        javax.swing.GroupLayout midMid4Layout = new javax.swing.GroupLayout(midMid4);
        midMid4.setLayout(midMid4Layout);
        midMid4Layout.setHorizontalGroup(
            midMid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );
        midMid4Layout.setVerticalGroup(
            midMid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        midMid.add(midMid4);

        midMid5.setBackground(new java.awt.Color(118, 180, 247));
        midMid5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));
        midMid.add(midMid5);

        mid.add(midMid);

        midRight.setBackground(new java.awt.Color(118, 180, 247));
        midRight.setLayout(new java.awt.GridLayout(1, 0));

        TabelaEstoquePara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(TabelaEstoquePara);

        midRight.add(jScrollPane7);

        mid.add(midRight);

        getContentPane().add(mid);

        bot.setBackground(new java.awt.Color(118, 180, 247));
        bot.setLayout(new java.awt.GridLayout(3, 0));

        botTop.setBackground(new java.awt.Color(118, 180, 247));

        javax.swing.GroupLayout botTopLayout = new javax.swing.GroupLayout(botTop);
        botTop.setLayout(botTopLayout);
        botTopLayout.setHorizontalGroup(
            botTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        botTopLayout.setVerticalGroup(
            botTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        bot.add(botTop);

        botMid.setBackground(new java.awt.Color(118, 180, 247));
        botMid.setLayout(new java.awt.GridLayout(1, 5));

        botMid1.setBackground(new java.awt.Color(118, 180, 247));

        javax.swing.GroupLayout botMid1Layout = new javax.swing.GroupLayout(botMid1);
        botMid1.setLayout(botMid1Layout);
        botMid1Layout.setHorizontalGroup(
            botMid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        botMid1Layout.setVerticalGroup(
            botMid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        botMid.add(botMid1);

        botMid2.setBackground(new java.awt.Color(118, 180, 247));

        TransfeirBtn.setText("Transferir");
        TransfeirBtn.setPreferredSize(new java.awt.Dimension(110, 40));
        TransfeirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransfeirBtnActionPerformed(evt);
            }
        });
        botMid2.add(TransfeirBtn);

        botMid.add(botMid2);

        botMid3.setBackground(new java.awt.Color(118, 180, 247));

        javax.swing.GroupLayout botMid3Layout = new javax.swing.GroupLayout(botMid3);
        botMid3.setLayout(botMid3Layout);
        botMid3Layout.setHorizontalGroup(
            botMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        botMid3Layout.setVerticalGroup(
            botMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        botMid.add(botMid3);

        botMid4.setBackground(new java.awt.Color(118, 180, 247));

        VoltarBtn.setText("Voltar");
        VoltarBtn.setPreferredSize(new java.awt.Dimension(110, 40));
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });
        botMid4.add(VoltarBtn);

        botMid.add(botMid4);

        botMid5.setBackground(new java.awt.Color(118, 180, 247));

        javax.swing.GroupLayout botMid5Layout = new javax.swing.GroupLayout(botMid5);
        botMid5.setLayout(botMid5Layout);
        botMid5Layout.setHorizontalGroup(
            botMid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );
        botMid5Layout.setVerticalGroup(
            botMid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        botMid.add(botMid5);

        bot.add(botMid);

        botBot.setBackground(new java.awt.Color(118, 180, 247));

        javax.swing.GroupLayout botBotLayout = new javax.swing.GroupLayout(botBot);
        botBot.setLayout(botBotLayout);
        botBotLayout.setHorizontalGroup(
            botBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        botBotLayout.setVerticalGroup(
            botBotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        bot.add(botBot);

        getContentPane().add(bot);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
        setVisible(false);
        new TIEstoque().setVisible(true);
    }//GEN-LAST:event_VoltarBtnActionPerformed

    private void comboBoxParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxParaActionPerformed
        atualizarTabelaEstoquePara();
    }//GEN-LAST:event_comboBoxParaActionPerformed

    private void TransfeirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransfeirBtnActionPerformed
        ProdutoDAO produtoDAO = new ProdutoDAO();
        EstoqueDAO estoqueDAO = new EstoqueDAO();

        int[] de = TabelaEstoqueDe.getSelectedRows();

        ArrayList<Produtos> produtosDe = new ArrayList<>();

        for (int i : de) {
            produtosDe.add(produtoDAO.buscar(TabelaEstoqueDe.getValueAt(i, 0) + ""));
        }

        for (Produtos produtos : produtosDe) {
            Produtos aux = new Produtos(produtos.getCodigo(), produtos.getDescricao(), produtos.getQuantidade(), produtos.getPreco(), produtos.getFornecedor(), estoqueDAO.buscar(comboBoxPara.getItemAt(comboBoxPara.getSelectedIndex())).getCodigo());
            produtoDAO.alterar(aux);
        }
        
        atualizarTabelaEstoqueDe();
        atualizarTabelaEstoquePara();
//        
//        int[] para = TabelaEstoquePara.getSelectedRows();
//
//        for (int i : para) {
//            JOptionPane.showMessageDialog(null, TabelaEstoquePara.getValueAt(i, 0));
//        }
    }//GEN-LAST:event_TransfeirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TITransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TITransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TITransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TITransferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TITransferencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable TabelaEstoqueDe;
    private static javax.swing.JTable TabelaEstoquePara;
    private javax.swing.JButton TransfeirBtn;
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JPanel bot;
    private javax.swing.JPanel botBot;
    private javax.swing.JPanel botMid;
    private javax.swing.JPanel botMid1;
    private javax.swing.JPanel botMid2;
    private javax.swing.JPanel botMid3;
    private javax.swing.JPanel botMid4;
    private javax.swing.JPanel botMid5;
    private javax.swing.JPanel botTop;
    private static javax.swing.JComboBox<String> comboBoxPara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel mid;
    private javax.swing.JPanel midLeft;
    private javax.swing.JPanel midMid;
    private javax.swing.JPanel midMid1;
    private javax.swing.JPanel midMid2;
    private javax.swing.JPanel midMid3;
    private javax.swing.JPanel midMid4;
    private javax.swing.JPanel midMid5;
    private javax.swing.JPanel midRight;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
