package services;

import dao.AdmDAO;
import java.sql.SQLException;
import dao.DAOFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.AdmVO;

public class AdmService {
    AdmDAO adao = DAOFactory.getAdmDAO();
    public String autentificaçãoAdm(String nome) throws SQLException{
        return adao.autentificaçãoAdm(nome);
    }
    public ArrayList fillTable() throws SQLException{
        return adao.fillTable();
    }
    public ArrayList filterTable(String query) throws SQLException{
        return adao.filterTable(query);
    }
    public void cadastrarAdm(AdmVO avo) throws SQLException{
        adao.cadastrarAdm(avo);
    }
    public ArrayList<AdmVO> fillAdmTable() throws SQLException{
        return adao.fillAdmTable();
    }
    public ArrayList<AdmVO> filterAdmTable(String query) throws SQLException{
        return adao.filterAdmTable(query);
    }
    public void alterarDadosAdm(AdmVO avo) throws SQLException{
        adao.alterarDadosAdm(avo);
    }
    public int permAlterarDados (String nome) throws SQLException {
        return adao.permAlterarDados(nome);
    }
    public void alterarSenhaAdm (AdmVO avo) throws SQLException {
        adao.alterarSenhaAdm(avo);
    }
    public void deletarAdm (int id) throws SQLException {
        adao.deletarAdm(id);
    }
    public void log(String info) throws SQLException{
        adao.log(info);
    }
    public ResultSet listLogi() {
        return adao.listLogi();
    }
    public ResultSet filtrarLog(String inf){
        return adao.filtrarLog(inf);
    }
}
