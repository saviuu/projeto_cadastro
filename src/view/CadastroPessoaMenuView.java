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
import view.ConsultaPessoaView;
import view.LoginView;

public class CadastroPessoaMenuView extends javax.swing.JFrame {

    private PessoaDTO objpessoadtoAlterar = null;

    public CadastroPessoaMenuView(int idPessoa) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        if (idPessoa > 0) {
            try {

                PessoaDAO objpessoadao = new PessoaDAO();
                ResultSet rsusuariodao = objpessoadao.buscaPessoaID(idPessoa);

                if (rsusuariodao.next()) {
                    txtInputCPF.setText(rsusuariodao.getString("cpf"));
                    txtInputNome.setText(rsusuariodao.getString("nome"));
                    txtInputEndereco.setText(rsusuariodao.getString("endereco"));
                    txtInputNumero.setText(rsusuariodao.getString("numero"));
                    txtInputBairro.setText(rsusuariodao.getString("bairro"));
                    txtInputComplemento.setText(rsusuariodao.getString("complemento"));
                    txtInputMunicipio.setText(rsusuariodao.getString("municipio"));
                    txtInputRG.setText(rsusuariodao.getString("rg"));
                    txtInputCEP.setText(rsusuariodao.getString("cep"));
                    txtInputUF.setText(rsusuariodao.getString("uf"));

                    PessoaDTO objpessoadto = new PessoaDTO();
                    objpessoadto.setId_Pessoa(idPessoa);

                    this.objpessoadtoAlterar = objpessoadto;

                }
            } catch (NoSuchAlgorithmException | SQLException ex) {
                Logger.getLogger(ConsultaPessoaView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public CadastroPessoaMenuView() {
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

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtInputNome = new javax.swing.JTextField();
        txtInputEndereco = new javax.swing.JTextField();
        txtInputNumero = new javax.swing.JTextField();
        txtInputBairro = new javax.swing.JTextField();
        txtInputComplemento = new javax.swing.JTextField();
        txtInputMunicipio = new javax.swing.JTextField();
        txtInputUF = new javax.swing.JTextField();
        txtInputRG = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtInputCPF = new javax.swing.JFormattedTextField();
        txtInputCEP = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/bb80728cb8cb030a872d6945fd39bcec.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 69, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 69, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CEP:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 69, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Endereço:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 69, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 69, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bairro:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 69, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Complemento:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Município:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 69, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UF:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 69, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RG:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 69, -1));

        txtInputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtInputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 485, -1));
        getContentPane().add(txtInputEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 163, -1));
        getContentPane().add(txtInputNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 68, -1));
        getContentPane().add(txtInputBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 216, -1));
        getContentPane().add(txtInputComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 216, -1));
        getContentPane().add(txtInputMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 163, -1));
        getContentPane().add(txtInputUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 39, -1));
        getContentPane().add(txtInputRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 100, -1));

        jButton1.setText("Procurar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 180, -1));

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 180, -1));

        try {
            txtInputCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtInputCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, -1));

        try {
            txtInputCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtInputCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, -1));

        jButton3.setText("Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 180, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/bb80728cb8cb030a872d6945fd39bcec.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConsultaPessoaView consultaPessoa = new ConsultaPessoaView();
        consultaPessoa.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            if (this.objpessoadtoAlterar != null) {
                Alterar();
            } else {
                Cadastrar();
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            if (this.objpessoadtoAlterar != null) {
                Excluir();
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Cadastrar() throws NoSuchAlgorithmException {
        String cpf, nome, cep, endereco, numero, bairro, complemento, municipio, uf, rg;
        cpf = txtInputCPF.getText();
        numero = txtInputNumero.getText();
        nome = txtInputNome.getText();
        cep = txtInputCEP.getText();
        endereco = txtInputEndereco.getText();
        bairro = txtInputBairro.getText();
        complemento = txtInputComplemento.getText();
        municipio = txtInputMunicipio.getText();
        uf = txtInputUF.getText();
        rg = txtInputRG.getText();

        PessoaDTO objpessoadto = new PessoaDTO();
        objpessoadto.setNome(nome);
        objpessoadto.setNumero(numero);
        objpessoadto.setCpf(cpf);
        objpessoadto.setCep(cep);
        objpessoadto.setEndereco(endereco);
        objpessoadto.setBairro(bairro);
        objpessoadto.setComplemento(complemento);
        objpessoadto.setMunicipio(municipio);
        objpessoadto.setUf(uf);
        objpessoadto.setRg(rg);

        PessoaDAO objusuariodao = new PessoaDAO();
        boolean rsusuariodao = objusuariodao.cadastraPessoa(objpessoadto);
        if (rsusuariodao) {
            //chamar tela que eu quero abrir
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");

            txtInputCPF.setText("");
            txtInputNumero.setText("");
            txtInputNome.setText("");
            txtInputCEP.setText("");
            txtInputEndereco.setText("");
            txtInputBairro.setText("");
            txtInputComplemento.setText("");
            txtInputMunicipio.setText("");
            txtInputUF.setText("");
            txtInputRG.setText("");

        } else {
            //enviar mensagem "incorreto"
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o cadastro!");
        }
    }

    private void Alterar() throws NoSuchAlgorithmException {

        String cpf, nome, cep, endereco, numero, bairro, complemento, municipio, uf, rg;
        cpf = txtInputCPF.getText();
        numero = txtInputNumero.getText();
        nome = txtInputNome.getText();
        cep = txtInputCEP.getText();
        endereco = txtInputEndereco.getText();
        bairro = txtInputBairro.getText();
        complemento = txtInputComplemento.getText();
        municipio = txtInputMunicipio.getText();
        uf = txtInputUF.getText();
        rg = txtInputRG.getText();

        objpessoadtoAlterar.setNome(nome);
        objpessoadtoAlterar.setNumero(numero);
        objpessoadtoAlterar.setCpf(cpf);
        objpessoadtoAlterar.setCep(cep);
        objpessoadtoAlterar.setEndereco(endereco);
        objpessoadtoAlterar.setBairro(bairro);
        objpessoadtoAlterar.setComplemento(complemento);
        objpessoadtoAlterar.setMunicipio(municipio);
        objpessoadtoAlterar.setUf(uf);
        objpessoadtoAlterar.setRg(rg);

        PessoaDAO objusuariodao = new PessoaDAO();
        boolean rsusuariodao = objusuariodao.alteraPessoa(objpessoadtoAlterar);
        if (rsusuariodao) {
            //chamar tela que eu quero abrir
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");

            txtInputCPF.setText("");
            txtInputNumero.setText("");
            txtInputNome.setText("");
            txtInputCEP.setText("");
            txtInputEndereco.setText("");
            txtInputBairro.setText("");
            txtInputComplemento.setText("");
            txtInputMunicipio.setText("");
            txtInputUF.setText("");
            txtInputRG.setText("");

            this.objpessoadtoAlterar = null;

        } else {
            //enviar mensagem "incorreto"
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o cadastro!");
        }
    }

    private void Excluir() throws NoSuchAlgorithmException {

        PessoaDAO objusuariodao = new PessoaDAO();
        boolean rsusuariodao = objusuariodao.exlcuiPessoa(objpessoadtoAlterar);
        if (rsusuariodao) {
            //chamar tela que eu quero abrir
            JOptionPane.showMessageDialog(null, "Deletado com Sucesso!");

            txtInputCPF.setText("");
            txtInputNumero.setText("");
            txtInputNome.setText("");
            txtInputCEP.setText("");
            txtInputEndereco.setText("");
            txtInputBairro.setText("");
            txtInputComplemento.setText("");
            txtInputMunicipio.setText("");
            txtInputUF.setText("");
            txtInputRG.setText("");

            this.objpessoadtoAlterar = null;

        } else {
            //enviar mensagem "incorreto"
            JOptionPane.showMessageDialog(null, "Não foi possível efetuar o cadastro!");
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPessoaMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPessoaMenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtInputBairro;
    private javax.swing.JFormattedTextField txtInputCEP;
    private javax.swing.JFormattedTextField txtInputCPF;
    private javax.swing.JTextField txtInputComplemento;
    private javax.swing.JTextField txtInputEndereco;
    private javax.swing.JTextField txtInputMunicipio;
    private javax.swing.JTextField txtInputNome;
    private javax.swing.JTextField txtInputNumero;
    private javax.swing.JTextField txtInputRG;
    private javax.swing.JTextField txtInputUF;
    // End of variables declaration//GEN-END:variables
}