package util;

import java.text.SimpleDateFormat;
import java.util.Date;
import view.GUIAreaUsuario;

public class LogUtil {
    public String criarLogUsuario(String acao, String obj, String alvo){
        Date d = new Date();
        SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String clog = GUIAreaUsuario.jlUsername.getText().toUpperCase() 
                + " " + acao.toUpperCase() 
                + " " + obj.toUpperCase() 
                + " " + alvo.toUpperCase() 
                + " " + formatd.format(d);
        return clog;
    }
}
