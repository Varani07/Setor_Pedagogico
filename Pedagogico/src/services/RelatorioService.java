package services;

import dao.DAOFactory;
import dao.RelatorioDAO;
import java.sql.ResultSet;

public class RelatorioService {
    RelatorioDAO rdao = DAOFactory.getRelatorioDAO();
    
    public ResultSet listaTabela() {
        return rdao.listaTabela();
    }
}
