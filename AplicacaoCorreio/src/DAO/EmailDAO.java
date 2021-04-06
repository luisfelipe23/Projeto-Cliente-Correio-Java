package DAO;

import Comunicação.Consultas;
import Comunicação.Email;
import DTO.EmailDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmailDAO {

    Connection con;

    public void autenticacaoUsuario(EmailDTO objEmailDTO) {
        con = new DAOConection().conectaBD();

        try {
            String sql = "INSERT INTO email (destinatario, assunto, mensagem, autor) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, objEmailDTO.getDestinatario());
            pst.setString(2, objEmailDTO.getAssunto());
            pst.setString(3, objEmailDTO.getMensagem());
            pst.setString(4, objEmailDTO.getAutor());

            pst.executeUpdate();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmailDAO: " + erro);
        }
    }

    public List<Email> exibirEmails(String user) {
        Connection conn = new DAOConection().conectaBD();
        PreparedStatement state = null;
        ResultSet ress = null;
        String consulta = "SELECT * FROM email WHERE destinatario = '" + user + "'";
        List<Email> mensagens = new ArrayList<>();

        try {
            state = conn.prepareStatement(consulta);
            ress = state.executeQuery();

            while (ress.next()) {
                Email email = new Email();

                email.setId(ress.getInt("id_email"));
                email.setAutor(ress.getString("autor"));
                email.setDestinatario(ress.getString("destinatario"));
                email.setAssunto(ress.getString("assunto"));
                email.setMensagem(ress.getString("mensagem"));

                mensagens.add(email);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir emails: " + ex);
        }

        return mensagens;
    }

    public void delete(Email e) {
        Connection cn = new DAOConection().conectaBD();
        PreparedStatement prep = null;

        try {
            prep = cn.prepareStatement("DELETE FROM email WHERE id_email = ?");
            prep.setInt(1, e.getId());

            prep.executeUpdate();

            JOptionPane.showMessageDialog(null, "Email removido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
        }
    }

    public String exibirMensagem(int id) {
        Connection conn = new DAOConection().conectaBD();
        PreparedStatement state = null;
        ResultSet ress = null;
        String consulta = "SELECT * FROM email WHERE id_email = " + id + "";

        try {
            state = conn.prepareStatement(consulta);
            ress = state.executeQuery();

            Email email = new Email();
            while (ress.next()) {
                email.setId(ress.getInt("id_email"));
                email.setAutor(ress.getString("autor"));
                email.setDestinatario(ress.getString("destinatario"));
                email.setAssunto(ress.getString("assunto"));
                email.setMensagem(ress.getString("mensagem"));
            }
            return "Autor: " + email.getAutor() + "\nAssunto: " + email.getAssunto() + "\nMensagem: \n\n" + email.getMensagem() + "\n\n";
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir mensagem: " + ex);
            return null;
        }
    }

}
