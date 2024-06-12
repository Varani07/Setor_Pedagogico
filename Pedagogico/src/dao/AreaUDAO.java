package dao;

import model.CursoVO;
import java.sql.SQLException;
import persistencia.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import model.AlunoVO;
import model.ModVO;
import model.ProfUcVO;
import model.ProfessorVO;
import model.RepFinanceiroVO;
import model.RepLegalVO;
import model.TurmaVO;
import model.UCVO;

public class AreaUDAO {
    public void cadastrarCurso(CursoVO cvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO cursos VALUES (null, '" + cvo.getNome_curso() + "', '" + cvo.getSigla() + "');";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet listarCursos () throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_curso FROM cursos;";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public int refCurso(String curso) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_curso FROM cursos WHERE nome_curso = '" + curso + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int idc = 0;
            while(rs.next()){
                idc = rs.getInt("id_curso");
            }
            pstm.close();
            return idc;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadastrarMod (ModVO mvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO modulos VALUES (null, '" + mvo.getNome_modulo() + "', " + mvo.getCurso() + ");";
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
    public ResultSet listarMod(int curso) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_modulo FROM modulos WHERE curso = " + curso + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public int refMod (String nome) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_modulo FROM modulos WHERE nome_modulo = '" + nome + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int im = 0; 
            while(rs.next()){
                im = rs.getInt("id_modulo");
            }
            pstm.close();
            return im;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadUC(UCVO uvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO unidades_curriculares VALUES (null, '" 
                    + uvo.getNome_uc() + "', " 
                    + uvo.getCargaHoraria() + ", "
                    + uvo.getModulo() + ", "
                    + uvo.getCurso() + ");";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public String siglaCurso(String curso) throws SQLException {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT sigla FROM cursos WHERE nome_curso = '" + curso + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String sigla = "";
            while(rs.next()){
                sigla = rs.getString("sigla");
            }
            pstm.close();
            return sigla;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadTurma (TurmaVO tvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO turmas VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, tvo.getNome_turma());
            pstm.setString(2, tvo.getAno_turma());
            pstm.setString(3, tvo.getTurno());
            pstm.setBoolean(4, tvo.isM1());
            pstm.setBoolean(5, tvo.isM2());
            pstm.setBoolean(6, tvo.isM3());
            pstm.setBoolean(7, tvo.isM4());
            pstm.setInt(8, tvo.getCurso());
            pstm.setBoolean(9, tvo.isStatus());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadastrarAlunos(AlunoVO avo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO alunos VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, null, ?, ? ,?, ?, null);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setInt(1, avo.getId_aluno());
            pstm.setString(2, avo.getNome());
            pstm.setString(3, avo.getSobrenome());
            pstm.setString(4, avo.getEmail());
            pstm.setString(5, avo.getGenero());
            pstm.setString(6, avo.getCpf());
            pstm.setString(7, avo.getGrau_ins());
            pstm.setString(8, avo.getEtnia());
            pstm.setString(9, avo.getEndereco());
            pstm.setString(10, avo.getBairro());
            pstm.setString(11, avo.getEstado());
            pstm.setString(12, avo.getCidade());
            pstm.setString(13, avo.getEstado_civil());
            pstm.setString(14, avo.getReligiao());
            pstm.setString(15, avo.getPaimae());
            pstm.setString(16, avo.getCelular());
            pstm.setInt(17, avo.getNum());
            pstm.setInt(18, avo.getCurso());
            pstm.setDate(19, avo.getData_nasc());
            pstm.setBoolean(20, avo.isRepfin());
            pstm.setBoolean(21, avo.isRepleg());
            pstm.setBoolean(22, avo.isTrabalha());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void responsavelLegalAluno(RepLegalVO rlvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO responsavel_legal VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, rlvo.getNome());
            pstm.setString(2, rlvo.getSobrenome());
            pstm.setString(3, rlvo.getEmail());
            pstm.setString(4, rlvo.getGenero());
            pstm.setString(5, rlvo.getCpf());
            pstm.setString(6, rlvo.getEtnia());
            pstm.setString(7, rlvo.getEndereco());
            pstm.setString(8, rlvo.getBairro());
            pstm.setString(9, rlvo.getEstado());
            pstm.setString(10, rlvo.getCidade());
            pstm.setString(11, rlvo.getEstado_civil());
            pstm.setString(12, rlvo.getReligiao());
            pstm.setString(13, rlvo.getCelular());
            pstm.setInt(14, rlvo.getNum());
            pstm.setDate(15, rlvo.getData_nasc());
            pstm.setInt(16, rlvo.getAluno());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void responsavelFinanceiroAluno(RepFinanceiroVO rfvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO representante_financeiro VALUES (?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, rfvo.getNome());
            pstm.setString(2, rfvo.getCpf());
            pstm.setDate(3, rfvo.getData_nasc());
            pstm.setInt(4, rfvo.getAluno());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int getIDAluno(String email) throws SQLException {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_aluno FROM alunos WHERE email = '" + email + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int id = 0;
            while(rs.next()){
                id = rs.getInt("id_aluno");
            }
            pstm.close();
            return id;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    } 
    public void setMatricula(AlunoVO avo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE alunos SET matricula = '" + avo.getMatricula() + "' WHERE id_aluno = " + avo.getId_aluno() + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadastrarProfessor(ProfessorVO pvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO professores VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, pvo.getNome());
            pstm.setString(2, pvo.getSobrenome());
            pstm.setString(3, pvo.getEmail());
            pstm.setString(4, pvo.getGenero());
            pstm.setString(5, pvo.getCpf());
            pstm.setString(6, pvo.getGrau_ins());
            pstm.setString(7, pvo.getEtnia());
            pstm.setString(8, pvo.getEndereco());
            pstm.setString(9, pvo.getBairro());
            pstm.setString(10, pvo.getEstado());
            pstm.setString(11, pvo.getCidade());
            pstm.setString(12, pvo.getEstado_civil());
            pstm.setString(13, pvo.getReligiao());
            pstm.setString(14, pvo.getPaimae());
            pstm.setString(15, pvo.getCelular());
            pstm.setInt(16, pvo.getNum());
            pstm.setDate(17, pvo.getData_nasc());
            pstm.setBoolean(18, pvo.isManha());
            pstm.setBoolean(19, pvo.isTarde());
            pstm.setBoolean(20, pvo.isNoite());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet listaProf (){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome, sobrenome, cpf FROM professores;";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public ResultSet listaUc (int curso){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_uc FROM unidades_curriculares WHERE curso = " + curso + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public int getProfId(String cpf) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_professor FROM professores WHERE cpf = '" + cpf + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int id = 0;
            while(rs.next()){
                id = rs.getInt("id_professor");
            }
            pstm.close();
            return id;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int refUc (String nome, int curso) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_uc FROM unidades_curriculares WHERE nome_uc = '" + nome + "' AND curso = " + curso + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            int ref = 0;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                ref = rs.getInt("id_uc");
            }
            pstm.close();
            return ref;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadProfUc(ProfUcVO puvo) throws SQLException {
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO prof_uc VALUES (" + puvo.getId_prof() + ", " + puvo.getId_uc() + ");";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet listaAlunos (){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_aluno, nome, sobrenome, matricula, curso FROM alunos;";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public String getCurso(int ref) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_curso FROM cursos WHERE id_curso = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String curso = "";
            while(rs.next()){
                curso = rs.getString("nome_curso");
            }
            con.close();
            return curso;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet getTurma(int ref){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_turma, ano, turno FROM turmas WHERE status = 1 AND curso = " + ref + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } 
    }
    public int getCursoA (int aluno) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT curso FROM alunos WHERE id_aluno = " + aluno + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            int ref = 0;
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                ref = rs.getInt("curso");
            }
            con.close();
            return ref;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadTurmaA (int turma, int id) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE alunos SET turma = " + turma + " WHERE id_aluno = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int getTurmaId (String turma) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id_turma FROM turmas WHERE nome_turma = '" + turma + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int ref = 0;
            while(rs.next()){
                ref = rs.getInt("id_turma");
            }
            pstm.close();
            return ref;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet listaUcM (int mod){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT nome_uc, cargaHoraria FROM unidades_curriculares WHERE modulo = " + mod + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public String getTurmaTurno (String turma) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT turno FROM turmas WHERE nome_turma = '" + turma + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            String ref = "";
            while(rs.next()){
                ref = rs.getString("turno");
            }
            pstm.close();
            return ref;
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
}
