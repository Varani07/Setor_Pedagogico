package util;

import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import services.CronogramaService;

public class DateVerif {
    public boolean dataValidator(int mes_select, int mes_atual, int dia_select, int dia_atual, int ano_select, int ano_atual, Date data_select){
        CronogramaService cs = services.ServiceFactory.getCronogramaService();
        
        boolean dm = true;
        
        if(ano_select == ano_atual){
            if(mes_select < mes_atual){
            JOptionPane.showMessageDialog(null, "Mês inválido!");
            dm = false;
            }else{
                if(mes_select == mes_atual){
                    if(dia_select < dia_atual){
                        JOptionPane.showMessageDialog(null, "Dia inválido!");
                        dm = false;
                    }
                }
            }
        }
        
        SimpleDateFormat weeks = new SimpleDateFormat("EEEE");
        String days_week = weeks.format(data_select);
        
        if(days_week.equals("sábado") || days_week.equals("domingo")){
            JOptionPane.showMessageDialog(null, "Data selecionada é inválida: " + days_week);
            dm = false;
        }else{
            try {
            ResultSet rs = cs.getFeriados();
            
                while(rs.next()){
                    if(rs.getInt("dia") == dia_select && rs.getInt("mes") == mes_select){
                        JOptionPane.showMessageDialog(null, "Data selecionada é inválida: " + rs.getString("nome"));
                        dm = false;
                    }
                }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        return dm;
    }
    
    public boolean calcularBissexto (String ano){
        boolean bissexto = false, termZero = false, div400 = false;
        
        String [] anorepartido = ano.split("");
        if(anorepartido[2].equals("0") && anorepartido[3].equals("0")){
            termZero = Integer.parseInt(ano) % 400 == 0;
        }else{
            div400 = Integer.parseInt(ano) % 4 == 0;
        }
        
        bissexto = termZero || div400;
        return bissexto;
    }
    
    public String calcularDataUc (String data, int cargaH){
        int cargaH_dias = cargaH / 3;
        String[] data_r = data.split("-");
        int dia = Integer.parseInt(data_r[0]), mes = Integer.parseInt(data_r[1]), ano = Integer.parseInt(data_r[2]);
        for (int i = 1; i < cargaH_dias; i++){
            dia = dia + 1;
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia>30){
                    dia = 1;
                    mes++;
                }
            }else{
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10){
                    if(dia>31){
                        dia = 1;
                        mes++;
                    }
                }else{
                    if(mes == 12){
                        if(dia>31){
                            dia = 1;
                            mes = 1;
                            ano++;
                        }
                    }else{
                        if(mes == 2){
                            if(calcularBissexto(Integer.toString(ano))){
                                if(dia>29){
                                    dia = 1;
                                    mes++;
                                }
                            }else{
                                if(dia>28){
                                    dia = 1;
                                    mes++;
                                }
                            }
                        }
                    }
                }
            }
            CronogramaService cs = services.ServiceFactory.getCronogramaService();
            
            String diaSt = Integer.toString(dia), mesSt = Integer.toString(mes);
            
            if(diaSt.length() == 1){
                diaSt = "0" + diaSt;
            }
            if(mesSt.length() == 1){
                mesSt = "0" + mesSt;
            }
            
            String data_select1 = diaSt + "-" + mesSt + "-" + ano;
            SimpleDateFormat weeks = new SimpleDateFormat("EEEE");
            SimpleDateFormat rtra = new SimpleDateFormat("dd-MM-yyyy");
            String days_week = "";
            try {
                Date data_select = rtra.parse(data_select1);
                days_week = weeks.format(data_select);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            if(days_week.equals("sábado") || days_week.equals("domingo")){
                i = i - 1;
            }else{
                try {
                ResultSet rs = cs.getFeriados();
            
                    while(rs.next()){
                        if(rs.getInt("dia") == dia && rs.getInt("mes") == mes){
                            i = i - 1;
                        }
                    }
            
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        String diaStf = Integer.toString(dia), mesStf = Integer.toString(mes);
            
        if(diaStf.length() == 1){
            diaStf = "0" + diaStf;
        }
        if(mesStf.length() == 1){
            mesStf = "0" + mesStf;
        }
        String data_fim = diaStf + "-" + mesStf + "-" + ano;
        return data_fim;
    }
    public String DateSQLtoUtil (Date data){
        SimpleDateFormat rtra = new SimpleDateFormat("yyyy-MM-dd");
        String dataf = rtra.format(data);
        String[] dataS = dataf.split("");
        String dataC = dataS[8] + dataS[9] + dataS[7] + dataS[5] + dataS[6] + dataS[4] + dataS[0] + dataS[1] + dataS[2] + dataS[3]; 
        return dataC;
    }
    public boolean testDataIncompativel (String data_iS, String data_fS, String data_iP, String data_fP){
        boolean teste = false, lp1 = false, lp2 = false;
        
        String[] data_S = data_iS.split("-");
        int diaS = Integer.parseInt(data_S[0]), mesS = Integer.parseInt(data_S[1]), anoS = Integer.parseInt(data_S[2]);
        
        String[] data_Sf = data_fS.split("-");
        int diaSf = Integer.parseInt(data_Sf[0]), mesSf = Integer.parseInt(data_Sf[1]), anoSf = Integer.parseInt(data_Sf[2]);
        
        String[] data_P = data_iP.split("-");
        int diaP = Integer.parseInt(data_P[0]), mesP = Integer.parseInt(data_P[1]), anoP = Integer.parseInt(data_P[2]);
        
        String[] data_Pf = data_fP.split("-");
        int diaPf = Integer.parseInt(data_Pf[0]), mesPf = Integer.parseInt(data_Pf[1]), anoPf = Integer.parseInt(data_Pf[2]);
        
        int dia_loop = diaP, mes_loop = mesP, ano_loop = anoP;
        
        while(!lp1){
            if(diaP != dia_loop){
                diaS = diaS + 1;
                
                if(mesS == 4 || mesS == 6 || mesS == 9 || mesS == 11){
                    if(diaS>30){
                        diaS = 1;
                        mesS++;
                    }
                }else{
                    if(mesS == 1 || mesS == 3 || mesS == 5 || mesS == 7 || mesS == 8 || mesS == 10){
                        if(diaS>31){
                            diaS = 1;
                            mesS++;
                        }
                    }else{
                        if(mesS == 12){
                            if(diaS>31){
                                diaS = 1;
                                mesS = 1;
                                anoS++;
                            }
                        }else{
                            if(mesS == 2){
                                if(calcularBissexto(Integer.toString(anoS))){
                                    if(diaS>29){
                                        diaS = 1;
                                        mesS++;
                                    }
                                }else{
                                    if(diaS>28){
                                        diaS = 1;
                                        mesS++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            if(diaS == diaP && mesS == mesP && anoS == anoP){
                teste = true;
            } 
            
            diaP = dia_loop;
            mesP = mes_loop;
            anoP = ano_loop;
            
            while(!lp2){
                diaP = diaP + 1;
                
                if(mesP == 4 || mesP == 6 || mesP == 9 || mesP == 11){
                    if(diaP>30){
                        diaP = 1;
                        mesP++;
                    }
                }else{
                    if(mesP == 1 || mesP == 3 || mesP == 5 || mesP == 7 || mesP == 8 || mesP == 10){
                        if(diaP>31){
                            diaP = 1;
                            mesP++;
                        }
                    }else{
                        if(mesP == 12){
                            if(diaP>31){
                                diaP = 1;
                                mesP = 1;
                                anoP++;
                            }
                        }else{
                            if(mesP == 2){
                                if(calcularBissexto(Integer.toString(anoP))){
                                    if(diaP>29){
                                        diaP = 1;
                                        mesP++;
                                    }
                                }else{
                                    if(diaP>28){
                                        diaP = 1;
                                        mesP++;
                                    }
                                }
                            }
                        }
                    }
                }
                
                if(diaS == diaP && mesS == mesP && anoS == anoP){
                    teste = true;
                }
                
                if(diaP == diaPf && mesP == mesPf && anoP == anoPf){
                    lp2 = true;
                }
                
            }
            
            if(diaS == diaSf && mesS == mesSf && anoS == anoSf){
                lp1 = true;
            }else{
                lp2 = false;
            }
            
            if(teste){
                lp1 = true;
            }
        }
        
        return teste;
    }
    
}


