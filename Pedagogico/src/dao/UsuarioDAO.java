package dao;

import model.UsuarioVO;
import java.sql.SQLException;
import persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    public void cadastrarUsuarios(UsuarioVO uvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        
        try {
            String sql = "INSERT INTO usuarios VALUES (null, ?, ?, ?, ?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, uvo.getLogin());
            pstm.setString(2, uvo.getSenha());
            pstm.setString(3, uvo.getEmail());
            pstm.setString(4, uvo.getCpf());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public String autentificaçãoUsuario(String nome) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT senha FROM usuarios WHERE login = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, nome);
            ResultSet rs = pstm.executeQuery();
            UsuarioVO usuvo = new UsuarioVO();
            
            while(rs.next()){
                usuvo.setSenha(rs.getString("senha"));
            }
            pstm.close();
            return usuvo.getSenha();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void alterarDadosUsuarios(UsuarioVO uvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE usuarios SET login= '" + uvo.getLogin() 
                    + "', email = '" + uvo.getEmail() 
                    + "', cpf = '" + uvo.getCpf()
                    + "' WHERE id_usuario = " + uvo.getId_usuario();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
            
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void alterarSenhaUsuario(UsuarioVO uvo)throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE usuarios SET senha = '" + uvo.getSenha() 
                    +"' WHERE id_usuario = " + uvo.getId_usuario();
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void deletarUsuario(UsuarioVO uvo)throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try{
            String sql = "DELETE FROM usuarios WHERE id_usuario =" + uvo.getId_usuario() + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e){
            throw new SQLException(e.getMessage());
        }finally{
            con.close();
        }
    }
}
