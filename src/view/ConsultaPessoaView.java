/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.PessoaDAO;
import DTO.PessoaDTO;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class ConsultaPessoaView extends javax.swing.JFrame {

           
    public ConsultaPessoaView() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePessoas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInputNome = new javax.swing.JTextField();
        txtButtonPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtInputCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/bb80728cb8cb030a872d6945fd39bcec.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "RG", "CEP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePessoas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 1120, 323));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 90, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        txtInputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 106, 393, -1));

        txtButtonPesquisar.setText("Pesquisar");
        txtButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(txtButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 214, 167, -1));

        jButton1.setText("Editar Cadastro/Pessoa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 150, -1));

        try {
            txtInputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtInputCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 400, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/bb80728cb8cb030a872d6945fd39bcec.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtButtonPesquisarActionPerformed
        try {
            PessoaDTO objpessoadto = new PessoaDTO();
            objpessoadto.setNome(txtInputNome.getText());
            objpessoadto.setCpf(txtInputCPF.getText().replaceAll("\\.", "").replaceAll("-", "").trim());
            
            PessoaDAO objpessoadao = new PessoaDAO();
            ResultSet rsusuariodao = null;
            
            if(!objpessoadto.getCpf().isEmpty()){
                rsusuariodao = objpessoadao.buscaPessoaCPF(objpessoadto);
            } else{
                rsusuariodao = objpessoadao.buscaPessoaNome(objpessoadto);
            }

            //chamar tela que eu quero abrir
            DefaultTableModel dtm = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            dtm.addColumn("ID");
            dtm.addColumn("Nome");
            dtm.addColumn("CPF");
            dtm.addColumn("RG");
            dtm.addColumn("CEP");
            
	
        

            while (rsusuariodao.next()) {
                dtm.addRow(new String[]{rsusuariodao.getString("id"),rsusuariodao.getString("nome"), rsusuariodao.getString("cpf"), rsusuariodao.getString("rg"), rsusuariodao.getString("cep")});
            }

            jTablePessoas.setModel(dtm);

        } catch (NoSuchAlgorithmException | SQLException ex) {
            Logger.getLogger(ConsultaPessoaView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtButtonPesquisarActionPerformed

    private void txtInputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputNomeActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int id = Integer.parseInt(jTablePessoas.getModel().getValueAt(jTablePessoas.getSelectedRow(),0).toString());
        CadastroPessoaMenuView cadastroPessoa = new CadastroPessoaMenuView(id);
       cadastroPessoa.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPessoaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPessoaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePessoas;
    private javax.swing.JButton txtButtonPesquisar;
    private javax.swing.JFormattedTextField txtInputCPF;
    private javax.swing.JTextField txtInputNome;
    // End of variables declaration//GEN-END:variables
}
