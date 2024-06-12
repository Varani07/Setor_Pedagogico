package view;

import java.awt.event.KeyEvent;
import services.AreaUService;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import model.ProfUcVO;
import util.LogUtil;
import util.SQLErrorMessage;

public class GUICadProfUC extends javax.swing.JInternalFrame {
    SQLErrorMessage erro = new SQLErrorMessage();
    LogUtil logu = new LogUtil();

    public GUICadProfUC() {
        initComponents();
        preencher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jcbProfessores = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbUc = new javax.swing.JComboBox<>();
        jbtnInserir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcbCursos = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Inserir Professor em UC");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Professores");

        jcbProfessores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("UC");

        jcbUc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jbtnInserir.setBackground(new java.awt.Color(0, 0, 0));
        jbtnInserir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnInserir.setForeground(new java.awt.Color(255, 255, 0));
        jbtnInserir.setText("Inserir");
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

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Curso");

        jcbCursos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jcbCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursosActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbProfessores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbUc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnInserir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbCursos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbUc, 0, 375, Short.MAX_VALUE)
                    .addComponent(jcbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbProfessores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnInserir)
                .addGap(198, 198, 198))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbUc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jbtnInserir)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void preencher(){
        int ref = 0;
        AreaUService aus = services.ServiceFactory.getAreaUService();
        try {
            ResultSet rs = aus.listaProf();
            while(rs.next()){
                jcbProfessores.addItem(rs.getString("nome") + " " + rs.getString("sobrenome") + "//" + rs.getString("cpf"));
            }
        } catch (Exception e) {
        }
        try {
            ResultSet rs = aus.listarCursos();
            while(rs.next()){
                jcbCursos.addItem(rs.getString("nome_curso"));
            }
        } catch (Exception e) {
        }
        try {
            ref = aus.refCurso(jcbCursos.getSelectedItem().toString());
        } catch (Exception e) {
        }
    }
    
    private void fixUC (){
        int ref = 0;
        AreaUService aus = services.ServiceFactory.getAreaUService();
        try {
            ref = aus.refCurso(jcbCursos.getSelectedItem().toString());
        } catch (Exception e) {
        }
        try {
            ResultSet rs = aus.listaUc(ref);
            while(rs.next()){
                jcbUc.addItem(rs.getString("nome_uc"));
            }
        } catch (Exception e) {
        }
    }
    
    private void limparcbUc(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbUc.setModel(cbm);
    }
    
    private boolean excessoes(){
        boolean ex = false;
        if(jcbUc.getSelectedItem().equals(null)){
            ex = true;
        }
        return ex;
    }
    
    private void cadprofuc(){
        ProfUcVO puvo = new ProfUcVO();
        AreaUService aus = services.ServiceFactory.getAreaUService();
        try {
            String cpf[] = jcbProfessores.getSelectedItem().toString().split("//");
            try {
                puvo.setId_prof(aus.getProfId(cpf[1]));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            try{
                puvo.setId_uc(aus.refUc(jcbUc.getSelectedItem().toString(), aus.refCurso(jcbCursos.getSelectedItem().toString())));
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
            aus.cadProfUc(puvo);
            
            try{
                aus.log(logu.criarLogUsuario("Adicionou", "Unidade curricular", jcbUc.getSelectedItem().toString() + " ao professor " + cpf[0]));
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Unidade curricular adicionada a professor com sucesso!");
        } catch (SQLException e) {
            if(e.getMessage().equals(erro.sqlError(puvo.getId_prof() + "-" + puvo.getId_uc(), "PRIMARY"))){
                JOptionPane.showMessageDialog(null, "Unidade curricular já foi vinculada a este professor!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, e.getMessage());  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void restaurar(){
        jcbProfessores.setSelectedIndex(0);
        jcbCursos.setSelectedIndex(0);
        limparcbUc();
        fixUC();
    }
    
    private void jbtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInserirActionPerformed
        try {
            if(!excessoes()){
                if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar o professor(a) " + jcbProfessores.getSelectedItem().toString() + " a unidade curricular " + jcbUc.getSelectedItem().toString() + " do curso " + jcbCursos.getSelectedItem().toString() + "?", "AVISO!", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
                    cadprofuc();
                    restaurar();
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_jbtnInserirActionPerformed

    private void jbtnInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnInserirKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try {
                if(!excessoes()){
                    if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar o professor(a) " + jcbProfessores.getSelectedItem().toString() + " a unidade curricular " + jcbUc.getSelectedItem().toString() + " do curso " + jcbCursos.getSelectedItem().toString() + "?", "AVISO!", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
                        cadprofuc();
                        restaurar();
                    }
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
        }
    }//GEN-LAST:event_jbtnInserirKeyPressed

    private void jcbCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursosActionPerformed
        limparcbUc();
        fixUC();
    }//GEN-LAST:event_jcbCursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jbtnInserir;
    private javax.swing.JComboBox<String> jcbCursos;
    private javax.swing.JComboBox<String> jcbProfessores;
    private javax.swing.JComboBox<String> jcbUc;
    // End of variables declaration//GEN-END:variables
}
