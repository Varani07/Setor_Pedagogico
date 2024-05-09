package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.AdmVO;
import model.UsuarioVO;
import model.LogVO;
import persistencia.ConexaoBanco;

public class AdmDAO {
    public String autentificaçãoAdm(String nome) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT password_adm FROM adm WHERE user_adm = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, nome);
            ResultSet rs = pstm.executeQuery();
            AdmVO admvo = new AdmVO();
            
            while(rs.next()){
                admvo.setPassword(rs.getString("password_adm"));
            }
            pstm.close();
            return admvo.getPassword();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ArrayList<UsuarioVO> fillTable() throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_usuario, login, email, cpf FROM usuarios";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            ArrayList<UsuarioVO> arrayusu = new ArrayList<>();
            
            while(rs.next()){
                UsuarioVO usuvo = new UsuarioVO();
                usuvo.setId_usuario(rs.getInt("id_usuario"));
                usuvo.setLogin(rs.getString("login"));
                usuvo.setEmail(rs.getString("email"));
                usuvo.setCpf(rs.getString("cpf"));
                
                arrayusu.add(usuvo);
            }
            pstm.close();
            return arrayusu;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    
    public ArrayList<AdmVO> fillAdmTable() throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_adm, user_adm, perm, cargo FROM adm;";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            ArrayList<AdmVO> arvo = new ArrayList<>();
            
            while(rs.next()){
                AdmVO avo = new AdmVO();
                avo.setId_adm(rs.getInt("id_adm"));
                avo.setUser(rs.getString("user_adm"));
                avo.setPerm(rs.getBoolean("perm"));
                avo.setCargo(rs.getInt("cargo"));
                
                arvo.add(avo);
            }
            pstm.close();
            return arvo;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    
    public ArrayList<UsuarioVO> filterTable(String query) throws SQLException {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_usuario, login, email, cpf FROM usuarios WHERE " + query;
            
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<UsuarioVO> arrayusu = new ArrayList<>();
            
            while(rs.next()){
                UsuarioVO usuvo = new UsuarioVO();
                usuvo.setId_usuario(rs.getInt("id_usuario"));
                usuvo.setLogin(rs.getString("login"));
                usuvo.setEmail(rs.getString("email"));
                usuvo.setCpf(rs.getString("cpf"));
                
                arrayusu.add(usuvo);
            }
            pstm.close();
            return arrayusu;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    
    public ArrayList<AdmVO> filterAdmTable(String query) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_adm, user_adm, perm, cargo FROM adm WHERE " + query;
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<AdmVO> ala = new ArrayList<>();
            while(rs.next()){
                AdmVO avo = new AdmVO();
                avo.setId_adm(rs.getInt("id_adm"));
                avo.setUser(rs.getString("user_adm"));
                avo.setPerm(rs.getBoolean("perm"));
                avo.setCargo(rs.getInt("cargo"));
                
                ala.add(avo);
            }
            pstm.close();
            return ala;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    
    public void cadastrarAdm(AdmVO admvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO adm VALUES (null, '" + admvo.getUser() + "', '" 
                    + admvo.getPassword() + "', " 
                    + admvo.isPerm() + ", " 
                    + admvo.getCargo() + ")";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    
    public void alterarDadosAdm(AdmVO avo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE adm SET user_adm = '" + avo.getUser() 
                    + "', perm = " + avo.isPerm()
                    + ", cargo = " + avo.getCargo()
                    + " WHERE id_adm = " + avo.getId_adm() + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int permAlterarDados(String nome) throws SQLException {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT cargo FROM adm WHERE user_adm = '" + nome + "'";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            int cargo = 0;
            
            while(rs.next()){
                cargo = rs.getInt("cargo");
            }
            pstm.close();
            return cargo;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void alterarSenhaAdm (AdmVO avo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE adm SET password_adm = '" + avo.getPassword() + "' WHERE id_adm = "  + avo.getId_adm() + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void deletarAdm (int id) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "DELETE FROM adm WHERE id_adm = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void log(String info) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO log (info) VALUES ('" + info + "');";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    
    public ResultSet listLogi() {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT info FROM log";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } 
    }
    public ResultSet filtrarLog(String inf){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT info FROM log WHERE info LIKE '%" + inf + "%'";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
