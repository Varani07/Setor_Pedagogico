package dao;



public class DAOFactory {
    private static UsuarioDAO uDAO = new UsuarioDAO();
    private static AdmDAO aDAO = new AdmDAO();
    private static AreaUDAO audao = new AreaUDAO();
    private static RelatorioDAO rdao = new RelatorioDAO();
    private static CronogramaDAO cdao = new CronogramaDAO();
    
    public static UsuarioDAO getUsuarioDAO(){
        return uDAO;
    }
    public static AdmDAO getAdmDAO(){
        return aDAO;
    }
    public static AreaUDAO getAreaUDAO(){
        return audao;
    }
    public static RelatorioDAO getRelatorioDAO(){
        return rdao;
    }
    public static CronogramaDAO getCronogramaDAO(){
        return cdao;
    }
}
