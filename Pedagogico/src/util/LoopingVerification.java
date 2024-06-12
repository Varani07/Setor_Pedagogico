package util;

import javax.swing.JOptionPane;

public class LoopingVerification {
    public boolean loopingNumjftf(String nume){
        int num = 11, numC = 0;
        boolean numB = false;
                
        numC = 0;
        for(int i = 0; i < nume.length(); i++){
            if(nume.charAt(i) >= '0' && nume.charAt(i) <= '9'){
                numC ++;
            }
        }
        numB = numC >= num;
        
        return numB;
    }
    public boolean loopingEmail(String email){
        int simbolo = 2, simboloC = 0;
        boolean simboloB = false;
        String simboloS = "@.";
                
        simboloC = 0;
        for(int i = 0; i < email.length(); i++){
            for(int j = 0; j < simboloS.length(); j++){
                if(email.charAt(i) == simboloS.charAt(j)){
                    simboloC ++;
                }
            }
        }
        simboloB = simboloC >= simbolo && email.length() <= 40;
        
        return simboloB;
    }
    public boolean loopingLimiteChar (String nome, int limite){
        boolean tamanho = nome.length() <= limite && nome.length() > 0;
        return tamanho;
    }
    public boolean loopingNumjtf(String nume, int ref){
        try {
            int numC = 0;
            boolean numB = false, equalzero = false, all = false;
                
            numC = 0;
            for(int i = 0; i < nume.length(); i++){
                if(nume.charAt(i) >= '0' && nume.charAt(i) <= '9'){
                    numC ++;
                }
            }
            numB = numC <= ref;
            equalzero = Integer.parseInt(nume) > 0;
            all = numB && equalzero;
        
            return all;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean loopingData(String nume){
        int num = 8, numC = 0;
        boolean numB = false;
                
        numC = 0;
        for(int i = 0; i < nume.length(); i++){
            if(nume.charAt(i) >= '0' && nume.charAt(i) <= '9'){
                numC ++;
            }
        }
        numB = numC == num;
        
        return numB;
    }
}
