package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new DAOConection().conectaBD();
        
        try {
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, objUsuarioDTO.getNome_usuario());
            ps.setString(2, objUsuarioDTO.getSenha_usuario());
            
            ResultSet rs = ps.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuárioDAO: "+ erro);
            return null;
        }
    }
}
