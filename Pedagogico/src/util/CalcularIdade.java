package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcularIdade {
    public int Calculo (Date data_nasc){
        int idade = 0;
        
        SimpleDateFormat ano = new SimpleDateFormat("yyyy");
        SimpleDateFormat mes = new SimpleDateFormat("MM");
        SimpleDateFormat dia = new SimpleDateFormat("dd");
        
        Date atual = new Date();
        
        idade = Integer.parseInt(ano.format(atual)) - Integer.parseInt(ano.format(data_nasc));
        
        if(Integer.parseInt(mes.format(atual)) < Integer.parseInt(mes.format(data_nasc))){
            idade--;
        }else{
            if(Integer.parseInt(dia.format(atual)) < Integer.parseInt(dia.format(data_nasc))){
                idade--;
            }
        }
        
        return idade;
    }
}
