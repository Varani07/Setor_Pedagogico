package services;

public class ServiceFactory {
    private static UsuarioService userv = new UsuarioService();
    private static AdmService aserv = new AdmService();
    private static AreaUService auserv = new AreaUService();
    private static RelatorioService rserv = new RelatorioService();
    private static CronogramaService cserv = new CronogramaService();
    
    public static UsuarioService getUsuarioService(){
        return userv;
    }
    public static AdmService getAdmService(){
        return aserv;
    }
    public static AreaUService getAreaUService(){
        return auserv;
    } 
    public static RelatorioService getRelatorioService(){
        return rserv;
    }
    public static CronogramaService getCronogramaService(){
        return cserv;
    }
}
