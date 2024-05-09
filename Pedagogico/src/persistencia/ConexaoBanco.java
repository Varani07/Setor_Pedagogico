package persistencia;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoBanco {
    public Connection novaConexao(){
        Connection c = null;
        try {
            String url = "jdbc:mysql://localhost:3306/pedagogico?user=root&password=";
            c = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!" + e.getMessage());
        }
        return c;
    }
}
