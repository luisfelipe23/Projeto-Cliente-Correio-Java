package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DAOConection {
    public Connection conectaBD () {
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/autentificacao?user=root&password=67743210";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        
        return conn;
    }
}