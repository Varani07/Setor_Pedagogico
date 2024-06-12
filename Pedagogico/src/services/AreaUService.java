package services;

import dao.AreaUDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import model.CursoVO;
import java.sql.ResultSet;
import model.AlunoVO;
import model.ModVO;
import model.ProfUcVO;
import model.ProfessorVO;
import model.RepFinanceiroVO;
import model.RepLegalVO;
import model.TurmaVO;
import model.UCVO;

public class AreaUService {
    AreaUDAO audao = DAOFactory.getAreaUDAO();
    public void cadastrarCurso(CursoVO cvo) throws SQLException{
        audao.cadastrarCurso(cvo);
    }
    public ResultSet listarCursos() throws SQLException{
        return audao.listarCursos();
    }
    public int refCurso(String curso) throws SQLException{
        return audao.refCurso(curso);
    }
    public void cadastrarMod (ModVO mvo) throws SQLException{
        audao.cadastrarMod(mvo);
    }
    public void log(String info) throws SQLException{
        audao.log(info);
    }
    public ResultSet listarMod(int curso) throws SQLException{
        return audao.listarMod(curso);
    }
    public int refMod (String nome) throws SQLException{
        return audao.refMod(nome);
    }
    public void cadUC(UCVO uvo) throws SQLException{
        audao.cadUC(uvo);
    }
    public String siglaCurso(String curso) throws SQLException {
        return audao.siglaCurso(curso);
    }
    public void cadTurma (TurmaVO tvo) throws SQLException{
        audao.cadTurma(tvo);
    }
    public void cadastrarAlunos(AlunoVO avo) throws SQLException{
        audao.cadastrarAlunos(avo);
    }
    public void responsavelLegalAluno(RepLegalVO rlvo) throws SQLException{
        audao.responsavelLegalAluno(rlvo);
    }
    public void responsavelFinanceiroAluno(RepFinanceiroVO rfvo) throws SQLException{
        audao.responsavelFinanceiroAluno(rfvo);
    }
    public int getIDAluno(String email) throws SQLException {
        return audao.getIDAluno(email);
    }
    public void setMatricula(AlunoVO avo) throws SQLException{
        audao.setMatricula(avo);
    }
    public void cadastrarProfessor(ProfessorVO pvo) throws SQLException{
        audao.cadastrarProfessor(pvo);
    }
    public ResultSet listaProf (){
        return audao.listaProf();
    }
    public ResultSet listaUc (int curso){
        return audao.listaUc(curso);
    }
    public int getProfId(String cpf) throws SQLException{
        return audao.getProfId(cpf);
    }
    public int refUc (String nome, int curso) throws SQLException{
        return audao.refUc(nome, curso);
    }
    public void cadProfUc(ProfUcVO puvo) throws SQLException {
        audao.cadProfUc(puvo);
    }
    public ResultSet listaAlunos (){
        return audao.listaAlunos();
    }
    public String getCurso(int ref)  throws SQLException {
        return audao.getCurso(ref);
    }
    public ResultSet getTurma(int ref){
        return audao.getTurma(ref);
    }
    public int getCursoA (int aluno) throws SQLException{
        return audao.getCursoA(aluno);
    }
    public void cadTurmaA (int turma, int id) throws SQLException{
        audao.cadTurmaA(turma, id);
    }
    public int getTurmaId (String turma) throws SQLException{
        return audao.getTurmaId(turma);
    }
    public ResultSet listaUcM (int mod){
        return audao.listaUcM(mod);
    }
    public String getTurmaTurno (String turma) throws SQLException{
        return audao.getTurmaTurno(turma);
    }
}
