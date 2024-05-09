package services;

import dao.DAOFactory;
import dao.UsuarioDAO;
import model.UsuarioVO;
import java.sql.SQLException;

public class UsuarioService {
    UsuarioDAO udao = DAOFactory.getUsuarioDAO();
    public void cadastrarUsuarios(UsuarioVO uvo) throws SQLException{
        udao.cadastrarUsuarios(uvo);
    }
    public String verificarUsuario(String nome)throws SQLException{
        return udao.autentificaçãoUsuario(nome);
    }
    public void alterarDadosUsuarios(UsuarioVO uvo) throws SQLException{
        udao.alterarDadosUsuarios(uvo);
    }
    public void alterarSenhaUsuario(UsuarioVO uvo) throws SQLException{
        udao.alterarSenhaUsuario(uvo);
    }
    public void deletarUsuario(UsuarioVO uvo) throws SQLException{
        udao.deletarUsuario(uvo);
    }
}
