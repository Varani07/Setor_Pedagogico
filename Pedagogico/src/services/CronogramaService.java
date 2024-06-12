package services;

import dao.CronogramaDAO;
import dao.DAOFactory;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.CronogramaVO;
import model.DataProfVO;
import model.FeriadoVO;

public class CronogramaService {
    CronogramaDAO cdao = DAOFactory.getCronogramaDAO();
    
    public ResultSet getFeriados(){
        return cdao.getFeriados();
    }
    public ResultSet getModTurma(String nome){
        return cdao.getModTurma(nome);
    }
    public ResultSet getProf(int id_uc){
        return cdao.getProf(id_uc);
    }
    public String getProfUc (int id_prof) throws SQLException{
        return cdao.getProfUc(id_prof);
    }
    public ResultSet getDataP (int id, String turno){
        return cdao.getDataP(id, turno);
    }
    public void setCronograma (CronogramaVO cvo) throws SQLException{
        cdao.setCronograma(cvo);
    }
    public int getCronogramaId (CronogramaVO cvo) throws SQLException{
        return cdao.getCronogramaId(cvo);
    }
    public void setDataProf (DataProfVO dvo) throws SQLException{
        cdao.setDataProf(dvo);
    }
    public void updateMod(String turma, String mod) throws SQLException{
        cdao.updateMod(turma, mod);
    }
    public ResultSet tabela_Cronograma(){
        return cdao.tabela_Cronograma();
    }
    public int curso_TC (int ref) throws SQLException{
        return cdao.curso_TC(ref);
    }
    public int curso_TM (int ref) throws SQLException{
        return cdao.curso_TM(ref);
    }
    public int curso_TT (int ref) throws SQLException{
        return cdao.curso_TT(ref);
    }
    public String getUnidadeCurricular(int ref) throws SQLException{
        return cdao.getUnidadeCurricular(ref);
    }
    public String getMod(int ref) throws SQLException{
        return cdao.getMod(ref);
    }
    public String getProfessor(int ref) throws SQLException{
        return cdao.getProfessor(ref);
    }
    public String getTurma(int ref) throws SQLException{
        return cdao.getTurma(ref);
    }
    public void cadastrar_Feriado (FeriadoVO fvo) throws SQLException{
        cdao.cadastrar_Feriado(fvo);
    }
    public ResultSet ver_feriado () {
        return cdao.ver_feriado();
    }
    public ResultSet ver_feriado2 (int ref){
        return cdao.ver_feriado2(ref);
    }
    public int pegar_ch (int ref) throws SQLException {
        return cdao.pegar_ch(ref);
    }
    public void setar_Novas_Datas (Date data_i, Date data_f, int id) throws SQLException{
        cdao.setar_Novas_Datas(data_i, data_f, id);
    }
    public ResultSet ajeitar_Novas_Datas (int ref, int id){
        return cdao.ajeitar_Novas_Datas(ref, id);
    }
    public ResultSet ad (String turno, int id, int prof){
        return cdao.ad(turno, id, prof);
    }
    public void setar_Data_Inicio_Cronograma (Date data, int ref) throws SQLException{
        cdao.setar_Data_Inicio_Cronograma(data, ref);
    }
    public void setar_Data_Fim_Cronograma (Date data, int ref) throws SQLException{
        cdao.setar_Data_Fim_Cronograma(data, ref);
    }
    public ResultSet get_Cronograma_Info (int ref){
        return cdao.get_Cronograma_Info(ref);
    }
}
