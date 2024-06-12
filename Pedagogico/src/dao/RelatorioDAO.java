package dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import persistencia.ConexaoBanco;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class RelatorioDAO {
    public ResultSet listaTabela() {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SHOW TABLES";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } 
    }
}
