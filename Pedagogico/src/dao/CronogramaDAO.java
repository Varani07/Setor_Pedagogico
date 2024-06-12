package dao;

import java.sql.ResultSet;
import persistencia.ConexaoBanco;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.CronogramaVO;
import model.DataProfVO;
import model.FeriadoVO;
import java.sql.Date;

public class CronogramaDAO {
    public ResultSet getFeriados(){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT dia, mes, nome FROM feriados;";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public ResultSet getModTurma(String nome){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT mod1, mod2, mod3, mod4 FROM turmas WHERE nome_turma = '" + nome + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public ResultSet getProf(int id_uc){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_prof FROM prof_uc WHERE id_uc = " + id_uc + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public String getProfUc (int id_prof) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome, sobrenome, cpf, manha, tarde, noite FROM professores WHERE id_professor = " + id_prof + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String prof_info = "";
            while(rs.next()){
                prof_info = rs.getString("nome") + " " + rs.getString("sobrenome") + " // " + rs.getString("cpf")
                        + " // " + rs.getInt("manha") + rs.getInt("tarde") + rs.getInt("noite");
            }
            pstm.close();
            return prof_info;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet getDataP (int id, String turno){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT data_inicio, data_fim FROM data_prof WHERE id_professor = " + id + " AND turno = '" + turno + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public void setCronograma (CronogramaVO cvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO cronograma VALUES (null, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setDate(1, cvo.getData_inicio());
            pstm.setDate(2, cvo.getData_fim());
            pstm.setInt(3, cvo.getId_curso());
            pstm.setInt(4, cvo.getId_mod());
            pstm.setInt(5, cvo.getId_turma());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int getCronogramaId (CronogramaVO cvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_cronograma FROM cronograma WHERE data_inicio = ? AND data_fim = ? AND id_curso = ? AND id_modulo = ? AND id_turma = ?;";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setDate(1, cvo.getData_inicio());
            pstm.setDate(2, cvo.getData_fim());
            pstm.setInt(3, cvo.getId_curso());
            pstm.setInt(4, cvo.getId_mod());
            pstm.setInt(5, cvo.getId_turma());
            
            int ref = 0;
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()){
                ref = rs.getInt("id_cronograma");
            }
            
            pstm.close();
            return ref;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void setDataProf (DataProfVO dvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO data_prof VALUES (null, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setDate(1, dvo.getData_inicio());
            pstm.setDate(2, dvo.getData_fim());
            pstm.setString(3, dvo.getTurno());
            pstm.setInt(4, dvo.getId_cronograma());
            pstm.setInt(5, dvo.getId_professor());
            pstm.setInt(6, dvo.getId_uc());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void updateMod(String turma, String mod) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE turmas SET " + mod + " = 1 WHERE nome_turma = '" + turma + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet tabela_Cronograma(){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_professor, id_uc, id_cronograma, turno, data_inicio, data_fim FROM data_prof;";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } 
    }
    public int curso_TC (int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_curso FROM cronograma WHERE id_cronograma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            int c = 0;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                c = rs.getInt("id_curso");
            }
            pstm.close();
            return c;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int curso_TM (int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_modulo FROM cronograma WHERE id_cronograma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            int m = 0;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                m = rs.getInt("id_modulo");
            }
            pstm.close();
            return m;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int curso_TT (int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_turma FROM cronograma WHERE id_cronograma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            int t = 0;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                t = rs.getInt("id_turma");
            }
            pstm.close();
            return t;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public String getUnidadeCurricular(int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_uc FROM unidades_curriculares WHERE id_uc = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String curso = "";
            while(rs.next()){
                curso = rs.getString("nome_uc");
            }
            con.close();
            return curso;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public String getMod(int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_modulo FROM modulos WHERE id_modulo = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String curso = "";
            while(rs.next()){
                curso = rs.getString("nome_modulo");
            }
            con.close();
            return curso;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public String getProfessor(int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome, sobrenome, cpf FROM professores WHERE id_professor = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String curso = "";
            while(rs.next()){
                curso = rs.getString("nome") + " " + rs.getString("sobrenome") + " // " + rs.getString("cpf");
            }
            con.close();
            return curso;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public String getTurma(int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_turma FROM turmas WHERE id_turma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String curso = "";
            while(rs.next()){
                curso = rs.getString("nome_turma");
            }
            con.close();
            return curso;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadastrar_Feriado (FeriadoVO fvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO feriados VALUES (?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, fvo.getDia());
            pstm.setInt(2, fvo.getMes());
            pstm.setString(3, fvo.getNome());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet ver_feriado () {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT data_inicio, data_fim, id_cronograma FROM cronograma;";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public ResultSet ver_feriado2 (int ref){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id, data_inicio, data_fim, turno, id_professor, id_uc FROM data_prof WHERE id_cronograma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public int pegar_ch (int ref) throws SQLException {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT cargaHoraria FROM unidades_curriculares WHERE id_uc = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            int re = 0;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                re = rs.getInt("cargaHoraria");
            }
            return re;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void setar_Novas_Datas (Date data_i, Date data_f, int id) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE data_prof SET data_inicio = ?, data_fim = ? WHERE id = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setDate(1, data_i);
            pstm.setDate(2, data_f);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet ajeitar_Novas_Datas (int ref, int id){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT data_inicio, data_fim, id_uc, id, id_professor, turno FROM data_prof WHERE id_cronograma =" + ref + " AND id != " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public ResultSet ad (String turno, int id, int prof){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT data_inicio, data_fim, id, id_uc, id_cronograma FROM data_prof WHERE turno = '" + turno + "' AND id_professor = " + prof + " AND id != " + id + ";";
            PreparedStatement pstm = con.prepareStatement(turno);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public void setar_Data_Inicio_Cronograma (Date data, int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE cronograma SET data_inicio = ? WHERE id_cronograma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setDate(1, data);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void setar_Data_Fim_Cronograma (Date data, int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE cronograma SET data_fim = ? WHERE id_cronograma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setDate(1, data);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet get_Cronograma_Info (int ref){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT data_inicio, data_fim FROM cronograma WHERE id_cronograma = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } 
    }
}
