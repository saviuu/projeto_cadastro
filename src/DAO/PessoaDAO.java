package DAO;

import DTO.PessoaDTO;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PessoaDAO {

    Connection conn;

    public ResultSet buscaPessoaCPF(PessoaDTO objpessoadto) throws NoSuchAlgorithmException {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from pessoas where cpf = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objpessoadto.getCpf());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PessoaDAO:" + erro);
            return null;
        }
    }
    
    public ResultSet buscaPessoaNome(PessoaDTO objpessoadto) throws NoSuchAlgorithmException {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select * from pessoas where nome like ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, "%" + objpessoadto.getNome()+ "%");

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PessoaDAO:" + erro);
            return null;
        }
    }

    public boolean cadastraPessoa(PessoaDTO objpessoadto) throws NoSuchAlgorithmException {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "insert into pessoas (cpf, nome, cep, endereco, numero, bairro, complemento, municipio, uf, rg) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objpessoadto.getCpf());
            pstm.setString(2, objpessoadto.getNome());
            pstm.setString(3, objpessoadto.getCep());
            pstm.setString(4, objpessoadto.getEndereco());
            pstm.setString(5, objpessoadto.getNumero());
            pstm.setString(6, objpessoadto.getBairro());
            pstm.setString(7, objpessoadto.getComplemento());
            pstm.setString(8, objpessoadto.getMunicipio());
            pstm.setString(9, objpessoadto.getUf());
            pstm.setString(10, objpessoadto.getRg());

            int rs = pstm.executeUpdate();
            return rs > 0;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PessoaDAO:" + erro);
            return false;
        }
    }
    
    public boolean alteraPessoa(PessoaDTO objpessoadto) throws NoSuchAlgorithmException {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "update pessoas set cpf = ?, nome = ?, cep = ?, endereco = ?, numero = ?, bairro = ?, complemento = ?, municipio = ?, uf = ?, rg = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objpessoadto.getCpf());
            pstm.setString(2, objpessoadto.getNome());
            pstm.setString(3, objpessoadto.getCep());
            pstm.setString(4, objpessoadto.getEndereco());
            pstm.setString(5, objpessoadto.getNumero());
            pstm.setString(6, objpessoadto.getBairro());
            pstm.setString(7, objpessoadto.getComplemento());
            pstm.setString(8, objpessoadto.getMunicipio());
            pstm.setString(9, objpessoadto.getUf());
            pstm.setString(10, objpessoadto.getRg());

            int rs = pstm.executeUpdate();
            return rs > 0;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PessoaDAO:" + erro);
            return false;
        }
    }
   }
