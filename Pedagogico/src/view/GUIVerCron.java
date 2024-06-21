package view;

import services.CronogramaService;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.AreaUService;
import util.DateVerif;

public class GUIVerCron extends javax.swing.JInternalFrame {
    DateVerif dv = new DateVerif();
    String select = "< selecione >";
    

   public GUIVerCron() {
        initComponents();
        preencher_Curso();
        
        preencher_Mes();
        preencher_Professor();
        preencher_Turno();
        preencher_Turma();
        preencher_Ano();
        preencher_Tabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInfo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbTurma = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbModulo = new javax.swing.JComboBox<>();
        jcbUc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbProfessor = new javax.swing.JComboBox<>();
        jcbTurno = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcbMes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jcbAno = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cronogramas");

        jtInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Curso", "Turma", "Módulo", "UC", "Professor", "Data Inicio", "Data Final", "Turno"
            }
        ));
        jScrollPane1.setViewportView(jtInfo);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Curso:");

        jcbCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Turma:");

        jcbTurma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Módulo:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("UC:");

        jcbModulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbModuloActionPerformed(evt);
            }
        });

        jcbUc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Professor:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Turno:");

        jcbProfessor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jcbTurno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Mês:");

        jcbMes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Ano:");

        jcbAno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(501, 501, 501)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbUc, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbUc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jcbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursoActionPerformed
        preencher_Mod();
    }//GEN-LAST:event_jcbCursoActionPerformed

    private void jcbModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbModuloActionPerformed
        preencher_Uc();
    }//GEN-LAST:event_jcbModuloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void preencher_Tabela(){
        CronogramaService cs = services.ServiceFactory.getCronogramaService();
        AreaUService aus = services.ServiceFactory.getAreaUService();
        DefaultTableModel dtm = (DefaultTableModel) jtInfo.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = cs.tabela_Cronograma();
            int c = 0, row = 1;
            
            while(rs.next()){
                String dataI = "", dataF = "", t = "", uc = "", mod = "", curso = "", prof = "", turma = "";
                int ref_uc = 0, ref_mod = 0, ref_cron = 0, ref_prof = 0, ref_curso = 0, ref_turma = 0;
                dtm.setNumRows(row);
                
                dataI = dv.DateSQLtoUtil(rs.getDate("data_inicio"));
                dataF = dv.DateSQLtoUtil(rs.getDate("data_fim"));
                
                if(rs.getString("turno").equals("M")){
                    t = "MANHÃ";
                }else{
                    if(rs.getString("turno").equals("T")){
                        t = "TARDE";
                    }else{
                        t = "NOITE";
                    }
                }
                
                ref_prof = rs.getInt("id_professor");
                ref_uc = rs.getInt("id_uc");
                ref_cron = rs.getInt("id_cronograma");
                ref_curso = cs.curso_TC(ref_cron);
                ref_mod = cs.curso_TM(ref_cron);
                ref_turma = cs.curso_TT(ref_cron);
                
                curso = aus.getCurso(ref_curso);
                uc = cs.getUnidadeCurricular(ref_uc);
                mod = cs.getMod(ref_mod);
                prof = cs.getProfessor(ref_prof);
                turma = cs.getTurma(ref_turma);
                
                jtInfo.setValueAt(curso, c, 0);
                jtInfo.setValueAt(turma, c,1);
                jtInfo.setValueAt(mod, c, 2);
                jtInfo.setValueAt(uc, c, 3);
                jtInfo.setValueAt(prof, c, 4);
                jtInfo.setValueAt(dataI, c, 5);
                jtInfo.setValueAt(dataF, c, 6);
                jtInfo.setValueAt(t, c, 7);
                                            
                c++;
                row = row + 1;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void preencher_Curso(){
        try {
            AreaUService aus = services.ServiceFactory.getAreaUService();
            
            ResultSet cursoR = aus.listarCursos();
            jcbCurso.addItem(this.select);
            while(cursoR.next()){
                jcbCurso.addItem(cursoR.getString("nome_curso"));
            }
        } catch (Exception e) {
        }
    }
    private void preencher_Mod(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbModulo.setModel(cbm);
        jcbModulo.addItem(this.select);
        try {
            AreaUService aus = services.ServiceFactory.getAreaUService();
            int mod;
            if(!jcbCurso.getSelectedItem().equals(this.select)){
                mod = aus.refCurso(jcbCurso.getSelectedItem().toString());
                ResultSet mod1 = aus.listarMod(mod);
                while(mod1.next()){
                    jcbModulo.addItem(mod1.getString("nome_modulo"));
                }
            }
        } catch (Exception e) {
        }
    }
    private void preencher_Uc(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbUc.setModel(cbm);
        try {
            AreaUService aus = services.ServiceFactory.getAreaUService();
            jcbUc.addItem(this.select);
            int mod;
            if(!jcbCurso.getSelectedItem().equals(this.select)){
                mod = aus.refMod(jcbModulo.getSelectedItem().toString());
                ResultSet uc = aus.listaUcM(mod);
                while(uc.next()){
                    jcbUc.addItem(uc.getString("nome_uc"));
                }
            }
        } catch (Exception e) {
        }
    }
    private void preencher_Turma(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbTurma.setModel(cbm);
        jcbTurma.addItem(this.select);
        try {
            AreaUService aus = services.ServiceFactory.getAreaUService();
            ResultSet turmaR = aus.getTurmas();
            while(turmaR.next()){
                jcbTurma.addItem(turmaR.getString("nome_turma"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void preencher_Professor(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbProfessor.setModel(cbm);
        jcbProfessor.addItem(this.select);
        try {
            AreaUService aus = services.ServiceFactory.getAreaUService();
            ResultSet profR = aus.listaProf();
            while(profR.next()){
                jcbProfessor.addItem(profR.getString("nome") + " " + profR.getString("sobrenome") + " // " + profR.getString("cpf"));
            }
        } catch (Exception e) {
        }
    }
    private void preencher_Ano(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbAno.setModel(cbm);
        jcbAno.addItem(this.select);
        Date ano = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String [] anoS = {""};
        anoS = df.format(ano).split("-");
        int anoI = 2024;
        int anoF = anoI + 5;
        int ano1 = Integer.parseInt(anoS[2]);
        int resultado = ano1 - 2024;
        anoF = anoF + resultado;
        int r = anoF - anoI;
        for(int i = 0; i <= r; i++){
            jcbAno.addItem(Integer.toString(anoI));
            anoI = anoI + 1;
        }
    }
    private void preencher_Mes(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbMes.setModel(cbm);
        jcbMes.addItem(this.select);
        for (int i = 1; i <= 12; i++){
            String meses = Integer.toString(i);
            if(meses.length() == 1){
                jcbMes.addItem("0" + meses);
            }else{
                jcbMes.addItem(meses);
            }
        }
    }
    private void preencher_Turno(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbTurma.setModel(cbm);
        jcbTurno.addItem(this.select);
        jcbTurno.addItem("MANHÃ");
        jcbTurno.addItem("TARDE");
        jcbTurno.addItem("NOITE");
    }
    private void buscar(){
        CronogramaService cs = services.ServiceFactory.getCronogramaService();
        AreaUService aus = services.ServiceFactory.getAreaUService();
        DefaultTableModel dtm = (DefaultTableModel) jtInfo.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = cs.tabela_Cronograma();
            int c = 0, row = 1;
            
            while(rs.next()){
                String dataI = "", dataF = "", t = "", uc = "", mod = "", curso = "", prof = "", turma = "";
                int ref_uc = 0, ref_mod = 0, ref_cron = 0, ref_prof = 0, ref_curso = 0, ref_turma = 0;
                dtm.setNumRows(row);
                
                dataI = dv.DateSQLtoUtil(rs.getDate("data_inicio"));
                dataF = dv.DateSQLtoUtil(rs.getDate("data_fim"));
                
                if(rs.getString("turno").equals("M")){
                    t = "MANHÃ";
                }else{
                    if(rs.getString("turno").equals("T")){
                        t = "TARDE";
                    }else{
                        t = "NOITE";
                    }
                }
                
                ref_prof = rs.getInt("id_professor");
                ref_uc = rs.getInt("id_uc");
                ref_cron = rs.getInt("id_cronograma");
                ref_curso = cs.curso_TC(ref_cron);
                ref_mod = cs.curso_TM(ref_cron);
                ref_turma = cs.curso_TT(ref_cron);
                
                curso = aus.getCurso(ref_curso);
                uc = cs.getUnidadeCurricular(ref_uc);
                mod = cs.getMod(ref_mod);
                prof = cs.getProfessor(ref_prof);
                turma = cs.getTurma(ref_turma);
                
                boolean cursoB = false, turmaB = false, modB = false, ucB = false, 
                    profB = false, tB = false,
                    mesB = false, anoB = false, ok = false, superok = false;
                if(jcbCurso.getSelectedItem().equals(this.select)){
                    cursoB = true;
                }
                if(jcbTurma.getSelectedItem().equals(this.select)){
                    turmaB = true;
                }
                if(jcbModulo.getSelectedItem().equals(this.select)){
                    modB = true;
                }
                if(jcbUc.getSelectedItem().equals(this.select)){
                    ucB = true;
                }
                if(jcbProfessor.getSelectedItem().equals(this.select)){
                    profB = true;
                }
                if(jcbTurno.getSelectedItem().equals(this.select)){
                    tB = true;
                }
                if(jcbAno.getSelectedItem().equals(this.select)){
                    anoB = true;
                }
                if(jcbMes.getSelectedItem().equals(this.select)){
                    mesB = true;
                }
        
                if(cursoB){
                        if(modB){
                            if(ucB){
                                if(profB){
                                    if(tB){
                                        if(anoB){
                                            if(mesB){
                                                if(turmaB){
                                                    preencher_Tabela();
                                                    ok = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                if(!ok){
                    if(!cursoB){
                        if(!jcbCurso.getSelectedItem().equals(curso)){
                            superok = true;
                        }
                    }
                    if(!turmaB){
                        if(!jcbTurma.getSelectedItem().equals(turma)){
                            superok = true;
                        }
                    }
                    if(!modB){
                        if(!jcbModulo.getSelectedItem().equals(mod)){
                            superok = true;
                        }
                    }
                    if(!ucB){
                        if(!jcbUc.getSelectedItem().equals(uc)){
                            superok = true;
                        }
                    }
                    if(!profB){
                        if(!jcbProfessor.getSelectedItem().equals(prof)){
                            superok = true;
                        }
                    }
                    if(!tB){
                        if(!jcbTurno.getSelectedItem().equals(t)){
                            superok = true;
                        }
                    }
                    String [] anoI = dataI.split("-"), anoF = dataF.split("-");
                    if(!anoB){
                        if(!jcbAno.getSelectedItem().equals(anoI[2]) && !jcbAno.getSelectedItem().equals(anoF[2])){
                            superok = true;
                        }
                    }
                    if(!mesB){
                        if(!jcbMes.getSelectedItem().equals(anoI[1]) && !jcbMes.getSelectedItem().equals(anoF[1])){
                            superok = true;
                        }
                    }
                }
                if(!superok){
                    jtInfo.setValueAt(curso, c, 0);
                    jtInfo.setValueAt(turma, c,1);
                    jtInfo.setValueAt(mod, c, 2);
                    jtInfo.setValueAt(uc, c, 3);
                    jtInfo.setValueAt(prof, c, 4);
                    jtInfo.setValueAt(dataI, c, 5);
                    jtInfo.setValueAt(dataF, c, 6);
                    jtInfo.setValueAt(t, c, 7);
                                            
                    c++;
                    row = row + 1;
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
               
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbAno;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbMes;
    private javax.swing.JComboBox<String> jcbModulo;
    private javax.swing.JComboBox<String> jcbProfessor;
    private javax.swing.JComboBox<String> jcbTurma;
    private javax.swing.JComboBox<String> jcbTurno;
    private javax.swing.JComboBox<String> jcbUc;
    private javax.swing.JTable jtInfo;
    // End of variables declaration//GEN-END:variables
}
