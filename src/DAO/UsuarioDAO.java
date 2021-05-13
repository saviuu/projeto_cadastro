package DAO;

import DTO.UsuarioDTO;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) throws NoSuchAlgorithmException {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "select * from usuario where usuario = ? and senha = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return null;
        }
    }
    
    public boolean cadastraUsuario(UsuarioDTO objusuariodto) throws NoSuchAlgorithmException {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "insert into usuario (usuario, senha) values (?, ?)";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            int rs = pstm.executeUpdate();
            return rs > 0;
            
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return false;
        }
    }
    
    public boolean alteraUsuario(UsuarioDTO objusuariodto) throws NoSuchAlgorithmException {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "update usuario set senha = ?, cpf = ?, usuario = ? where id = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getSenha_usuario());
//            pstm.setString(1, objusuariodto.getCpf());
            pstm.setInt(2, objusuariodto.getId_Usuario());
            
            int rs = pstm.executeUpdate();
            
            return rs > 0;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return false;
        }
    }
}
