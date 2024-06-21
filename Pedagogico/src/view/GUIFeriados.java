package view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.FeriadoVO;
import services.CronogramaService;
import util.CalcularIdade;
import util.DateToSql;
import util.DateVerif;
import util.LogUtil;
import util.LoopingVerification;
import java.sql.ResultSet;

public class GUIFeriados extends javax.swing.JInternalFrame {
    DateVerif dv = new DateVerif();
    LoopingVerification loop = new LoopingVerification();
    CalcularIdade idade = new CalcularIdade();
    DateToSql dts = new DateToSql();
    LogUtil logu = new LogUtil();

    public GUIFeriados() {
        initComponents();
        preencherData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnFeriado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jcbDia = new javax.swing.JComboBox<>();
        jcbMes = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Adicionar Feriado");

        jbtnFeriado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnFeriado.setText("Adicionar Feriado");
        jbtnFeriado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFeriadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Dia:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Mês:");

        jtfNome.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jcbDia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jcbMes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jbtnFeriado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 196, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jbtnFeriado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesActionPerformed
        ajustarDias();
    }//GEN-LAST:event_jcbMesActionPerformed

    private void jbtnFeriadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFeriadoActionPerformed
        String dia = jcbDia.getSelectedItem().toString(), mes = jcbMes.getSelectedItem().toString();
        if(dia.length() == 1){
            dia = "0" + dia;
        }
        if(mes.length() == 1){
            mes = "0" + mes;
        }
        if(JOptionPane.showConfirmDialog(null, "Deseja mesmo cadastrar o feriado: " + jtfNome.getText() + " " + dia + "/" + mes + "?", "AVISO", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
            cadastrar_Feriado();
        }
    }//GEN-LAST:event_jbtnFeriadoActionPerformed

    
    private void preencherData(){
        for (int i = 1; i <= 12; i++){
            String meses = Integer.toString(i);
            jcbMes.addItem(meses);
        }
    }
    
    private void ajustarDias(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbDia.setModel(cbm);
        Date data_atual = new Date();
        SimpleDateFormat f_ano = new SimpleDateFormat("yyyy");
        String ano_c = f_ano.format(data_atual);
         
        if(jcbMes.getSelectedItem().equals("2") && dv.calcularBissexto(ano_c)){
            for (int i = 1; i <= 29; i++){
                String dias = Integer.toString(i);
                jcbDia.addItem(dias);
            }
        }else{
            if(jcbMes.getSelectedItem().equals("2")){
                for (int i = 1; i <= 28; i++){
                    String dias = Integer.toString(i);
                    jcbDia.addItem(dias);
                }
            }else{
                if(jcbMes.getSelectedItem().equals("4") || jcbMes.getSelectedItem().equals("6") || jcbMes.getSelectedItem().equals("9") || jcbMes.getSelectedItem().equals("11")){
                    for (int i = 1; i <= 30; i++){
                        String dias = Integer.toString(i);
                        jcbDia.addItem(dias);
                    }
                }else{
                    for (int i = 1; i <= 31; i++){
                        String dias = Integer.toString(i);
                        jcbDia.addItem(dias);
                    }
                }
            }
        }
    }
    
    private void cadastrar_Feriado(){
        // cadastrar feriado
        boolean cronograma = false;
        String op ="";
        if(jtfNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo em branco!");
        }else{
            CronogramaService cs = services.ServiceFactory.getCronogramaService();
            FeriadoVO fvo = new FeriadoVO();
            fvo.setDia(Integer.parseInt(jcbDia.getSelectedItem().toString()));
            fvo.setMes(Integer.parseInt(jcbMes.getSelectedItem().toString()));
            fvo.setNome(jtfNome.getText());
            
            try {
                cs.cadastrar_Feriado(fvo);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            String data_feriado="", dataF_feriado="", data_Cronograma="", dataF_Cronograma="";
            String [] iano = {""}, fano = {""};
            
            try {
                ResultSet rs = cs.ver_feriado();
                while(rs.next()){
                    //verificar se a data do feriado está presente em algum cronograma
                    data_Cronograma = dv.DateSQLtoUtil(rs.getDate("data_inicio"));
                    dataF_Cronograma = dv.DateSQLtoUtil(rs.getDate("data_fim"));
                    String dia_f = jcbDia.getSelectedItem().toString(), mes_f = jcbMes.getSelectedItem().toString(), ano_f = "";
                    if(dia_f.length() == 1){
                        dia_f = "0" + dia_f;
                    }
                    if(mes_f.length() == 1){
                        mes_f = "0" + mes_f;
                    }
                    iano = data_Cronograma.split("-");
                    fano = dataF_Cronograma.split("-");
                    data_feriado = dia_f + "-" + mes_f + "-" + iano[2];
                    dataF_feriado = dia_f + "-" + mes_f + "-" + fano[2];
                    
                    //verificar se existem anos diferentes entre a data de inicio e a data final do cronograma (só sabemos que a data coincide, não sabemos qual é dentro do cronograma)
                    if(dv.testDataIncompativel(data_Cronograma, dataF_Cronograma, data_feriado, data_feriado)){
                        int ref_c = rs.getInt("id_cronograma");
                        int carga_h = 0;
                        //REPETINDO PROCESSO DE CADASTRO DA DATA INICIAL
                        ResultSet r = cs.ver_feriado2(ref_c);
                        while(r.next()){
                            boolean vai = true;
                            String data_Uc = dv.DateSQLtoUtil(r.getDate("data_inicio")), dataF_Uc = dv.DateSQLtoUtil(r.getDate("data_fim"));
                            //agora vamos ver qual das datas em data_prof coincide com o feriado
                            if(dv.testDataIncompativel(data_Uc, dataF_Uc, data_feriado, data_feriado)){
                                //se a data de inicio for igual, vamos alterar tanto a data de inicio quanto a final
                                if(data_Uc.equals(data_feriado)){
                                    if(data_Cronograma.equals(data_Uc)){
                                        vai = false;
                                    }
                                    SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                                    carga_h = cs.pegar_ch(r.getInt("id_uc"));
                                    data_Uc = dv.calcularDataUc(data_Uc, 6);
                                    dataF_Uc = dv.calcularDataUc(data_Uc, carga_h);
                                    cs.setar_Novas_Datas(dts.convertDatatosql(f.parse(data_Uc)), dts.convertDatatosql(f.parse(dataF_Uc)), r.getInt("id"));
                                    if(!vai){
                                        cs.setar_Data_Inicio_Cronograma(dts.convertDatatosql(f.parse(data_Uc)), ref_c);
                                    }
                                    cs.setar_Data_Fim_Cronograma(dts.convertDatatosql(f.parse(dataF_Uc)), ref_c);
                                    //fazer com que verifique se a data alterada vai impactar o professor, isso também tem que verificar se a data que foi alterada vai impactar
                                    int id_Cron = ref_c, id_Uc = r.getInt("id"), contador = 0, cahT = 0;
                                    String data_D = data_Uc, dataF_D = dataF_Uc;
                                    do{
                                        contador = 0;
                                        cahT = 0;
                                        ResultSet s = cs.ajeitar_Novas_Datas(id_Cron, id_Uc);
                                        while(s.next()){
                                            String data_T = dv.DateSQLtoUtil(s.getDate("data_inicio"));
                                            String dataF_T = dv.DateSQLtoUtil(s.getDate("data_fim"));
                                            if(dv.testDataIncompativel(data_T, dataF_T, data_D, dataF_D)){
                                                contador = contador + 1;
                                                id_Uc = s.getInt("id");
                                                cahT = cs.pegar_ch(s.getInt("id_uc"));
                                                data_D = dv.calcularDataUc(dataF_D, 6);
                                                dataF_D = dv.calcularDataUc(data_D, cahT);
                                                cs.setar_Novas_Datas(dts.convertDatatosql(f.parse(data_D)), dts.convertDatatosql(f.parse(dataF_D)), id_Uc);
                                                cs.setar_Data_Fim_Cronograma(dts.convertDatatosql(f.parse(dataF_D)), id_Cron);
                                                
                                                //verifiquei se existe alguma outra data nesse cronograma que precisa de alteração, se sim, agora vamos criar um looping para alterar a data dos professores que coincidir com essa que acabos de alterar
                                                
                                                int contador2 = 0, id_Prof = s.getInt("id_professor"), id_Uc2 = id_Uc, cahP = 0, id_cronP = 0;
                                                String turno = s.getString("turno"), data_T1 = data_D, dataF_T1 = dataF_D;
                                                do{
                                                    ResultSet p = cs.ad(turno, id_Prof, id_Uc2);
                                                    while(p.next()){
                                                        String data_P = dv.DateSQLtoUtil(p.getDate("data_inicio"));
                                                        String dataF_P = dv.DateSQLtoUtil(p.getDate("data_fim"));
                                                        cahP = 0;
                                                        id_cronP = p.getInt("id_cronograma");
                                                        if(dv.testDataIncompativel(data_T1, dataF_T1, data_P, dataF_P)){
                                                            ResultSet p_cron = cs.get_Cronograma_Info(id_cronP);
                                                            while(p_cron.next()){
                                                                boolean data_inicio_cron = true;
                                                                if(data_P.equals(dv.DateSQLtoUtil(p_cron.getDate("data_inicio")))){
                                                                    data_inicio_cron = false;
                                                                }
                                                                contador2 = contador2 + 1;
                                                                id_Uc2 = p.getInt("id");
                                                                cahP = cs.pegar_ch(p.getInt("id_uc"));
                                                                data_T1 = dv.calcularDataUc(dataF_T1, 6);
                                                                dataF_T1 = dv.calcularDataUc(data_T1, cahP);
                                                                cs.setar_Novas_Datas(dts.convertDatatosql(f.parse(data_T1)), dts.convertDatatosql(f.parse(dataF_T1)), id_Uc2);
                                                                if(!data_inicio_cron){
                                                                    cs.setar_Data_Inicio_Cronograma(dts.convertDatatosql(f.parse(data_T1)), id_cronP);
                                                                }
                                                                cs.setar_Data_Fim_Cronograma(dts.convertDatatosql(f.parse(dataF_T1)), id_cronP);
                                                            }
                                                        }
                                                    }
                                                }while(contador2 != 0);
                                            }
                                        }
                                    }while(contador != 0);
                                
                                    
                                }
                            }
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                        }
                    }else{
                        if(dv.testDataIncompativel(data_Cronograma, dataF_Cronograma, dataF_feriado, dataF_feriado)){
                            cronograma = true;
                            op = "ano_fi";
                        }
                    }
                    //Listar cronogramas
                    //Listar ucs do cronograma em que a data coincidir
                    //Verificar se tem a mesma data de início
                    //Alterar data da uc 
                    //Alterar se tiver mesmo professor mesmo turno na mesma data
                    //Alterar 
                    
                    
                    /*if(cronograma){
                        int ref_c = rs.getInt("id_cronograma");
                        int carga_h = 0;
                        boolean vai = true;
                        
                        ResultSet r = cs.ver_feriado2(ref_c);
                        while(r.next()){
                            String dp_i = dv.DateSQLtoUtil(r.getDate("data_inicio")), dp_f = "", dp_in = "", dp_fn = "";
                            if(op.equals("ano_in")){
                                if(dp_i.equals(data_feriado)){
                                    //se a data for igual, vamos alterar tanto a data de inicio quanto a final
                                    if(data_Cronograma.equals(dp_i)){
                                        vai = false;
                                    }
                                    SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
                                    carga_h = cs.pegar_ch(r.getInt("id_uc"));
                                    dp_i = dv.calcularDataUc(dp_i, 6);
                                    dp_f = dv.calcularDataUc(dp_i, carga_h);
                                    dp_in = dp_i;
                                    dp_fn = dp_f;
                                    cs.setar_Novas_Datas(dts.convertDatatosql(f.parse(dp_i)), dts.convertDatatosql(f.parse(dp_f)), r.getInt("id"));
                                    if(!vai){
                                        cs.setar_Data_Inicio_Cronograma(dts.convertDatatosql(f.parse(dp_i)), ref_c);
                                    }
                                    //fazer com que verifique se a data alterada vai impactar o professor, isso também tem que verificar se a data que foi alterada vai impactar
                                    
                                    ResultSet set = cs.ad(r.getString("turno"), r.getInt("id"), r.getInt("id_professor"));
                                    String turno_data_i = "", turno_data_fim = "", turno_data_i2 = "", turno_data_fim2 = "";
                                    String ndp_in = dp_i;
                                    String ndp_fn = dp_f;
                                    boolean inicio = false, fim = false;
                                    int carh = 0;
                                    while(set.next()){
                                        turno_data_i = dv.DateSQLtoUtil(set.getDate("data_inicio"));
                                        turno_data_fim = dv.DateSQLtoUtil(set.getDate("data_fim"));
                                        if(dv.testDataIncompativel(turno_data_i, turno_data_fim, ndp_in, ndp_fn)){
                                            ResultSet damnRS = cs.get_Cronograma_Info(set.getInt("id_cronograma"));
                                            while(damnRS.next()){
                                                turno_data_i2 = dv.DateSQLtoUtil(damnRS.getDate("data_inicio"));
                                                turno_data_fim2 = dv.DateSQLtoUtil(damnRS.getDate("data_fim"));
                                                if(turno_data_i.equals(turno_data_i2)){
                                                    inicio = true;
                                                }
                                            }
                                            carh = cs.pegar_ch(set.getInt("id_uc"));
                                            turno_data_i = dv.calcularDataUc(ndp_fn, 6);
                                            turno_data_fim = dv.calcularDataUc(turno_data_i, carh);
                                            cs.setar_Novas_Datas(dts.convertDatatosql(f.parse(turno_data_i)), dts.convertDatatosql(f.parse(turno_data_fim)), set.getInt("id"));
                                            if(inicio){
                                                cs.setar_Data_Inicio_Cronograma(dts.convertDatatosql(f.parse(turno_data_i)), set.getInt("id_cronograma"));
                                            }
                                            //fiz com que mudasse a data se tiver um professor no mesmo turno mesma data, mas preciso fazer agora com que ele mude todos as datas do mesmo cronograma e verificar se isso alterou alguma outra data
                                                    
                                        }
                                        
                                    }
                                    
                                    boolean certo = false, sera = false;
                                    while(!certo){
                                        if(sera){
                                            certo = true;
                                        }
                                        while(set.next()){
                                            
                                            while(set.next()){
                                            
                                            }
                                        }
                                    }
                                    
                                    ResultSet s = cs.ajeitar_Novas_Datas(ref_c, r.getInt("id"));
                                    while(s.next()){
                                        carga_h = cs.pegar_ch(s.getInt("id_uc"));
                                        dp_in = dv.calcularDataUc(dp_fn, 6);
                                        dp_fn = dv.calcularDataUc(dp_in, carga_h);
                                        cs.setar_Novas_Datas(dts.convertDatatosql(f.parse(dp_in)), dts.convertDatatosql(f.parse(dp_fn)), s.getInt("id"));
                                    }
                                    cs.setar_Data_Fim_Cronograma(dts.convertDatatosql(f.parse(dp_fn)), ref_c);
                                    
                                    
                                }else{
                                    //se a data for diferente, mudar apenas a data final
                                }
                                
                            }else{
                                if(op.equals("ano_fi")){
                                    if(dp_i.equals(dataF_feriado)){
                                        
                                    }
                                    
                                }
                            }
                            
                            
                        }
                    }*/
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnFeriado;
    private javax.swing.JComboBox<String> jcbDia;
    private javax.swing.JComboBox<String> jcbMes;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
