package view;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import model.CronogramaVO;
import model.DataProfVO;
import services.AreaUService;
import services.CronogramaService;
import util.CalcularIdade;
import util.DateToSql;
import util.DateVerif;
import util.LogUtil;
import util.LoopingVerification;

public class GUICadCron extends javax.swing.JInternalFrame {
    DateVerif dv = new DateVerif();
    LoopingVerification loop = new LoopingVerification();
    CalcularIdade idade = new CalcularIdade();
    DateToSql dts = new DateToSql();
    LogUtil logu = new LogUtil();
    
    private static String data_ucprof, data_ucprof_fim, uc_Sttc;

    public GUICadCron() {
        initComponents();
        preencherData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgMod = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jcbDias = new javax.swing.JComboBox<>();
        jcbMes = new javax.swing.JComboBox<>();
        jcbAno = new javax.swing.JComboBox<>();
        jbtnData = new javax.swing.JButton();
        jftfData = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jcbCurso = new javax.swing.JComboBox<>();
        jcbTurma = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jftfData_fim = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jrbModA = new javax.swing.JRadioButton();
        jrbModB = new javax.swing.JRadioButton();
        jrbModC = new javax.swing.JRadioButton();
        jrbModD = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUCProf = new javax.swing.JTable();
        jbtnInserir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcbNew = new javax.swing.JComboBox<>();
        jbtnEscolherP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Criar Cronograma");

        jcbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesActionPerformed(evt);
            }
        });

        jcbAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAnoActionPerformed(evt);
            }
        });

        jbtnData.setBackground(new java.awt.Color(0, 0, 0));
        jbtnData.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnData.setForeground(new java.awt.Color(255, 255, 0));
        jbtnData.setText("Inserir Data");
        jbtnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDataActionPerformed(evt);
            }
        });
        jbtnData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnDataKeyPressed(evt);
            }
        });

        try {
            jftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jcbCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jcbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursoActionPerformed(evt);
            }
        });

        jcbTurma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Até");

        jftfData_fim.setEditable(false);
        try {
            jftfData_fim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Módulo:");

        jbgMod.add(jrbModA);
        jrbModA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbModA.setSelected(true);
        jrbModA.setText("A");

        jbgMod.add(jrbModB);
        jrbModB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbModB.setText("B");

        jbgMod.add(jrbModC);
        jrbModC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbModC.setText("C");

        jbgMod.add(jrbModD);
        jrbModD.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbModD.setText("D");

        jtUCProf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtUCProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidade Curricular", "Professor", "Data - Início", "Data - Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUCProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUCProfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtUCProf);

        jbtnInserir.setBackground(new java.awt.Color(0, 0, 0));
        jbtnInserir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnInserir.setForeground(new java.awt.Color(255, 255, 0));
        jbtnInserir.setText("Inserir Unidades Curriculares na Tabela");
        jbtnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInserirActionPerformed(evt);
            }
        });
        jbtnInserir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnInserirKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clique na tabela para preenche-la com os professores que aparecerem na caixinha embaixo");

        jcbNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jbtnEscolherP.setBackground(new java.awt.Color(0, 0, 0));
        jbtnEscolherP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnEscolherP.setForeground(new java.awt.Color(255, 255, 0));
        jbtnEscolherP.setText("Escolher Professor");
        jbtnEscolherP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEscolherPActionPerformed(evt);
            }
        });
        jbtnEscolherP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnEscolherPKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Preencha todos os campos para prosseguir!");

        jLayeredPane1.setLayer(jcbDias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbAno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jftfData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jftfData_fim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbModA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbModB, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbModC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbModD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnInserir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbNew, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnEscolherP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbModA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbModB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbModC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbModD)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnInserir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jftfData)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jcbDias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jftfData_fim, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnData))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcbNew, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jbtnEscolherP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnData))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jftfData_fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbModA)
                    .addComponent(jrbModB)
                    .addComponent(jrbModC)
                    .addComponent(jrbModD)
                    .addComponent(jbtnInserir)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jbtnEscolherP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void preencherData(){
        Date data_atual = new Date();
        SimpleDateFormat f_ano = new SimpleDateFormat("yyyy");
        int ano_c = Integer.parseInt(f_ano.format(data_atual));
        
        for (int ano = 0; ano < 4; ano++) {
            String rec = Integer.toString(ano_c);
            jcbAno.addItem(rec);
            ano_c ++;
        }
        
        for (int i = 1; i <= 12; i++){
            String meses = Integer.toString(i);
            jcbMes.addItem(meses);
        }
        
        AreaUService aus = services.ServiceFactory.getAreaUService();
        try {
            ResultSet rs = aus.listarCursos();
            while(rs.next()){
                jcbCurso.addItem(rs.getString("nome_curso"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void preenchertabela(){
        jftfData_fim.setText(null);
        AreaUService aus = services.ServiceFactory.getAreaUService();
        int ref=0;
        try {
            if(jrbModA.isSelected()){
                ref = aus.refMod("Modulo A (" + jcbCurso.getSelectedItem().toString() + ")");
            }else{
                if(jrbModB.isSelected()){
                    ref = aus.refMod("Modulo B (" + jcbCurso.getSelectedItem().toString() + ")");
                }else{
                    if(jrbModC.isSelected()){
                        ref = aus.refMod("Modulo C (" + jcbCurso.getSelectedItem().toString() + ")");
                    }else{
                        if(jrbModD.isSelected()){
                            ref = aus.refMod("Modulo D (" + jcbCurso.getSelectedItem().toString() + ")");
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        int row = 0;
        int ri = 1;
        
        try {
            DefaultTableModel dtm = (DefaultTableModel) jtUCProf.getModel();
            
            if(jtUCProf.getRowCount() > 0){
                dtm.removeRow(dtm.getRowCount()-1);
            }
            ResultSet rs = aus.listaUcM(ref);
            data_ucprof = jftfData.getText();
            while(rs.next()){
                
                row = row + 1;
                dtm.setNumRows(row);
                dtm.addRow(new Object[]{
                    rs.getString("nome_uc")
                });
                
                if(ri == 1){
                    jtUCProf.setValueAt(data_ucprof, ri, 2);
                    
                }else{
                    data_ucprof = dv.calcularDataUc(data_ucprof_fim, 6);
                    jtUCProf.setValueAt(data_ucprof, ri, 2);
                }
                int ch = rs.getInt("cargaHoraria");
                data_ucprof_fim = dv.calcularDataUc(data_ucprof, ch);
                jtUCProf.setValueAt(data_ucprof_fim, ri, 3);
                
                ri = ri + 1;
                jftfData_fim.setText(data_ucprof_fim);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void preencherTurma(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements(); 
        jcbTurma.setModel(cbm);
        AreaUService aus = services.ServiceFactory.getAreaUService();
        try {
            ResultSet rs = aus.getTurma(aus.refCurso(jcbCurso.getSelectedItem().toString()));
            while(rs.next()){
                jcbTurma.addItem(rs.getString("nome_turma"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void preencherMod(){
        CronogramaService cs = services.ServiceFactory.getCronogramaService();
        try {
            ResultSet rs = cs.getModTurma(jcbTurma.getSelectedItem().toString());
            while(rs.next()){
                if(rs.getInt("mod1") == 1){
                    jrbModA.setEnabled(false);
                    
                    if(rs.getInt("mod2") == 0){
                        jrbModB.setSelected(true);
                    }else{
                        if(rs.getInt("mod3") == 0){
                            jrbModC.setSelected(true);
                        }else{
                            if(rs.getInt("mod4") == 0){
                                jrbModD.setSelected(true);
                            }
                        }
                    }
                    
                }else{
                    jrbModA.setEnabled(true);
                }
                
                if(rs.getInt("mod2") == 1){
                    jrbModB.setEnabled(false);
                    
                    if(rs.getInt("mod1") == 0){
                        jrbModA.setSelected(true);
                    }else{
                        if(rs.getInt("mod3") == 0){
                            jrbModC.setSelected(true);
                        }else{
                            if(rs.getInt("mod4") == 0){
                                jrbModD.setSelected(true);
                            }
                        }
                    }
                    
                }else{
                    jrbModB.setEnabled(true);
                }
                
                if(rs.getInt("mod3") == 1){
                    jrbModC.setEnabled(false);
                    
                    if(rs.getInt("mod2") == 0){
                        jrbModB.setSelected(true);
                    }else{
                        if(rs.getInt("mod1") == 0){
                            jrbModA.setSelected(true);
                        }else{
                            if(rs.getInt("mod4") == 0){
                                jrbModD.setSelected(true);
                            }
                        }
                    }
                    
                }else{
                    jrbModC.setEnabled(true);
                }
                
                if(rs.getInt("mod4") == 1){
                    jrbModD.setEnabled(false);
                    
                    if(rs.getInt("mod3") == 0){
                        jrbModC.setSelected(true);
                    }else{
                        if(rs.getInt("mod2") == 0){
                            jrbModB.setSelected(true);
                        }else{
                            if(rs.getInt("mod1") == 0){
                                jrbModA.setSelected(true);
                            }
                        }
                    }
                    
                }else{
                    jrbModD.setEnabled(true);
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void anoB (){
        if(jcbMes.getSelectedItem() != null){
            if(jcbMes.getSelectedItem().equals("2") && dv.calcularBissexto(jcbAno.getSelectedItem().toString())){
            DefaultComboBoxModel cbm = new DefaultComboBoxModel();
            cbm.removeAllElements();
            jcbDias.setModel(cbm);
                for (int i = 1; i <= 29; i++){
                    String dias = Integer.toString(i);
                    jcbDias.addItem(dias);
                }
            }else{
                if(jcbMes.getSelectedItem().equals("2") && !dv.calcularBissexto(jcbAno.getSelectedItem().toString())){
                    DefaultComboBoxModel cbm = new DefaultComboBoxModel();
                    cbm.removeAllElements();
                    jcbDias.setModel(cbm);
                    for (int i = 1; i <= 28; i++){
                        String dias = Integer.toString(i);
                        jcbDias.addItem(dias);
                    }
                }
            }
        }
    }
    
    private void ajustarDias(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbDias.setModel(cbm);
         
        if(jcbMes.getSelectedItem().equals("2") && dv.calcularBissexto(jcbAno.getSelectedItem().toString())){
            for (int i = 1; i <= 29; i++){
                String dias = Integer.toString(i);
                jcbDias.addItem(dias);
            }
        }else{
            if(jcbMes.getSelectedItem().equals("2")){
                for (int i = 1; i <= 28; i++){
                    String dias = Integer.toString(i);
                    jcbDias.addItem(dias);
                }
            }else{
                if(jcbMes.getSelectedItem().equals("4") || jcbMes.getSelectedItem().equals("6") || jcbMes.getSelectedItem().equals("9") || jcbMes.getSelectedItem().equals("11")){
                    for (int i = 1; i <= 30; i++){
                        String dias = Integer.toString(i);
                        jcbDias.addItem(dias);
                    }
                }else{
                    for (int i = 1; i <= 31; i++){
                        String dias = Integer.toString(i);
                        jcbDias.addItem(dias);
                    }
                }
            }
        }
    }
    
    public void cleanDate(){
        jcbAno.setSelectedIndex(0);
        jcbMes.setSelectedIndex(0);
        ajustarDias();
        jftfData.setText(null);
    }
    
    private void cadastrarData(){
        String mes = jcbMes.getSelectedItem().toString(), dia = jcbDias.getSelectedItem().toString(), ano = jcbAno.getSelectedItem().toString();
        if(dia.length() == 1){
            dia = "0" + dia;
        }
        if(mes.length() == 1){
            mes = "0" + mes;
        }
        jftfData.setText(dia + mes + jcbAno.getSelectedItem().toString());
        
        SimpleDateFormat dataf = new SimpleDateFormat("dd-MM-yyyy");
        Date data_atual = new Date();
        String d_at = dataf.format(data_atual);
        String[] dat_repartida = d_at.split("-");
        int dia_atual = Integer.parseInt(dat_repartida[0]);
        int mes_atual = Integer.parseInt(dat_repartida[1]);
        int ano_atual = Integer.parseInt(dat_repartida[2]);
        int dia_select = Integer.parseInt(dia);
        int mes_select = Integer.parseInt(mes);
        int ano_select = Integer.parseInt(ano);
        
        Date data_select = new Date();
        
        try {
            data_select = dataf.parse(dia + "-" + mes + "-" + jcbAno.getSelectedItem().toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        if(!dv.dataValidator(mes_select, mes_atual, dia_select, dia_atual, ano_select, ano_atual, data_select)){
            cleanDate();
        }
    }
    
    private void getProf(){
        DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        dcb.removeAllElements();
        jcbNew.setModel(dcb);
        
        AreaUService aus = services.ServiceFactory.getAreaUService();
        CronogramaService cs = services.ServiceFactory.getCronogramaService();
        String uc = (String) jtUCProf.getValueAt(jtUCProf.getSelectedRow(), 0);
        uc_Sttc = uc;
        
        int ref = 0;
        try {
            ref = aus.refUc(uc, aus.refCurso(jcbCurso.getSelectedItem().toString()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        String turno = "";
        try {
            turno = aus.getTurmaTurno(jcbTurma.getSelectedItem().toString());
        } catch (Exception e) {
        }
        try {
            ResultSet rs = cs.getProf(ref);
            while(rs.next()){
                
                String inf = cs.getProfUc(rs.getInt("id_prof"));
                String[] infS = inf.split(" // ");
                String turnprof = infS[2];
                String[] tpS = turnprof.split("");
                
                if(turno.equals("M")){
                    if(tpS[0].equals("1")){
                        jcbNew.addItem(infS[0] + " // " + infS[1]);
                    }
                }else{
                    if(turno.equals("T")){
                        if(tpS[1].equals("1")){
                            jcbNew.addItem(infS[0] + " // " + infS[1]);
                        }
                    }else{
                        if(turno.equals("N")){
                            if(tpS[2].equals("1")){
                                jcbNew.addItem(infS[0] + " // " + infS[1]);
                            }
                        }
                    }
                }
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void setProf(){
        boolean ocupado = false, ok = false;
        
        String uc_list="", prof = "";
        int uc_select = 0;
        for(int i = 1; i<jtUCProf.getRowCount(); i++){
            uc_list = (String) jtUCProf.getValueAt(i, 0);
            if(uc_list.equals(uc_Sttc)){
                uc_select = i;
            }
        }
        AreaUService aus = services.ServiceFactory.getAreaUService();
            
        String turno = "";
        try {
            turno = aus.getTurmaTurno(jcbTurma.getSelectedItem().toString());
        } catch (Exception e) {
        }
        
        int ref = 0;
        String[] cpf = jcbNew.getSelectedItem().toString().split(" // ");
        try {
            ref = aus.getProfId(cpf[1]);
        } catch (Exception e) {
        }
        
        String data_iS="", data_fS="", data_iP = "", data_fP="";
        
        CronogramaService cs = services.ServiceFactory.getCronogramaService();
        try {
            ResultSet rs = cs.getDataP(ref, turno);
        
            while(rs.next()){
                data_iS = (String) jtUCProf.getValueAt(uc_select, 2);
                data_fS = (String) jtUCProf.getValueAt(uc_select, 3);         
                data_iP = dv.DateSQLtoUtil(rs.getDate("data_inicio"));
                data_fP = dv.DateSQLtoUtil(rs.getDate("data_fim"));
                ocupado = dv.testDataIncompativel(data_iS, data_fS, data_iP, data_fP);
            }
            
        } catch (Exception e) {
        }
        
        if(!ocupado){
            jtUCProf.setValueAt(jcbNew.getSelectedItem(), uc_select, 1);
            
            for(int i = 1; i<jtUCProf.getRowCount(); i++){
                prof = (String) jtUCProf.getValueAt(i, 1);
                if(prof == null){
                    ok = true;
                }
            }
            if(!ok){
                if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar este Cronograma?", "CONFIRMAÇÃO", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
                    CronogramaVO cvo = new CronogramaVO();
                    SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
                    
                    
                    try {
                        cvo.setData_inicio(dts.convertDatatosql(data.parse(jftfData.getText())));
                        cvo.setData_fim(dts.convertDatatosql(data.parse(jftfData_fim.getText())));
                        cvo.setId_curso(aus.refCurso(jcbCurso.getSelectedItem().toString()));
                        cvo.setId_turma(aus.getTurmaId(jcbTurma.getSelectedItem().toString()));
                        int refe=0;
                        String mod = "";
                        if(jrbModA.isSelected()){
                            refe = aus.refMod("Modulo A (" + jcbCurso.getSelectedItem().toString() + ")");
                            mod = "mod1";
                        }else{
                            if(jrbModB.isSelected()){
                                refe = aus.refMod("Modulo B (" + jcbCurso.getSelectedItem().toString() + ")");
                                mod = "mod2";
                            }else{
                                if(jrbModC.isSelected()){
                                    refe = aus.refMod("Modulo C (" + jcbCurso.getSelectedItem().toString() + ")");
                                    mod = "mod3";
                                }else{
                                    if(jrbModD.isSelected()){
                                        refe = aus.refMod("Modulo D (" + jcbCurso.getSelectedItem().toString() + ")");
                                        mod = "mod4";
                                    }
                                }
                            }
                        }
                        cvo.setId_mod(refe);
                        cs.setCronograma(cvo);
                        int idc = 0;
                        idc = cs.getCronogramaId(cvo);
                        
                        for(int i = 1; i<jtUCProf.getRowCount(); i++){
                            DataProfVO dvo = new DataProfVO();
                            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                            dvo.setId_cronograma(idc);
                            String[] idp = jtUCProf.getValueAt(i, 1).toString().split(" // ");
                            dvo.setId_professor(aus.getProfId(idp[1]));
                            dvo.setId_uc(aus.refUc(jtUCProf.getValueAt(i, 0).toString(), aus.refCurso(jcbCurso.getSelectedItem().toString())));
                            dvo.setTurno(aus.getTurmaTurno(jcbTurma.getSelectedItem().toString()));
                            dvo.setData_inicio(dts.convertDatatosql(df.parse((String) jtUCProf.getValueAt(i, 2))));
                            dvo.setData_fim(dts.convertDatatosql(df.parse((String) jtUCProf.getValueAt(i, 3))));
                            cs.setDataProf(dvo);
                            JOptionPane.showMessageDialog(null, "Professor(a) " + jtUCProf.getValueAt(i, 1).toString() + " e unidade curricular " + jtUCProf.getValueAt(i, 0).toString() + " cadastrados com sucesso no cronograma!");
                        }
                        
                        JOptionPane.showMessageDialog(null, "Cronograma cadastrado com sucesso!");
                        aus.log(logu.criarLogUsuario("cadastrou", "cronograma", "da turma " + jcbTurma.getSelectedItem().toString()));
                        
                        cs.updateMod(jcbTurma.getSelectedItem().toString(), mod);
                        dispose();
                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }else{
                    preenchertabela();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "O professor escolhido está ocupado nessa data!");
        }
    }
    
    private void jbtnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDataActionPerformed
        cadastrarData();
        jftfData_fim.setText(null);
    }//GEN-LAST:event_jbtnDataActionPerformed

    private void jbtnDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnDataKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrarData();
            jftfData_fim.setText(null);
        }
    }//GEN-LAST:event_jbtnDataKeyPressed

    private void jcbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesActionPerformed
        ajustarDias();
    }//GEN-LAST:event_jcbMesActionPerformed

    private void jcbAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAnoActionPerformed
        anoB();
    }//GEN-LAST:event_jcbAnoActionPerformed

    private void jcbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursoActionPerformed
        preencherTurma();
    }//GEN-LAST:event_jcbCursoActionPerformed

    private void jcbTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTurmaActionPerformed
        preencherMod();
    }//GEN-LAST:event_jcbTurmaActionPerformed

    private void jbtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInserirActionPerformed
        if(loop.loopingData(jftfData.getText())){
            preenchertabela();
        }else{
            JOptionPane.showMessageDialog(null, "Escolha uma data antes!");
        }
    }//GEN-LAST:event_jbtnInserirActionPerformed

    private void jbtnInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnInserirKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(loop.loopingData(jftfData.getText())){
                preenchertabela();
            }else{
                JOptionPane.showMessageDialog(null, "Escolha uma data antes!");
            }
        }
    }//GEN-LAST:event_jbtnInserirKeyPressed

    private void jtUCProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUCProfMouseClicked
        getProf();
    }//GEN-LAST:event_jtUCProfMouseClicked

    private void jbtnEscolherPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEscolherPActionPerformed
        setProf();
    }//GEN-LAST:event_jbtnEscolherPActionPerformed

    private void jbtnEscolherPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnEscolherPKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            setProf();
        }
    }//GEN-LAST:event_jbtnEscolherPKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jbgMod;
    private javax.swing.JButton jbtnData;
    private javax.swing.JButton jbtnEscolherP;
    private javax.swing.JButton jbtnInserir;
    private javax.swing.JComboBox<String> jcbAno;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbDias;
    private javax.swing.JComboBox<String> jcbMes;
    private javax.swing.JComboBox<String> jcbNew;
    private javax.swing.JComboBox<String> jcbTurma;
    private javax.swing.JFormattedTextField jftfData;
    private javax.swing.JFormattedTextField jftfData_fim;
    private javax.swing.JRadioButton jrbModA;
    private javax.swing.JRadioButton jrbModB;
    private javax.swing.JRadioButton jrbModC;
    private javax.swing.JRadioButton jrbModD;
    private javax.swing.JTable jtUCProf;
    // End of variables declaration//GEN-END:variables
}
