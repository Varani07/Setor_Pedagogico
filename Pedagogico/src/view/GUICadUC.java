package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import services.AreaUService;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import model.UCVO;
import util.LoopingVerification;
import java.sql.SQLException;
import util.LogUtil;
import util.SQLErrorMessage;

public class GUICadUC extends javax.swing.JInternalFrame {
    LoopingVerification loop = new LoopingVerification();
    SQLErrorMessage sqlerro = new SQLErrorMessage();
    LogUtil logu = new LogUtil();

    public GUICadUC() {
        initComponents();
        listarCursos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpCadUC = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlUC = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jcbMod = new javax.swing.JComboBox<>();
        jtfUc = new javax.swing.JTextField();
        jlCargaHoraria = new javax.swing.JLabel();
        jtfch = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbtnCad = new javax.swing.JButton();
        jlErro = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Unidade Curricular");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Curso:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Modulo:");

        jlUC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlUC.setText("UC:");

        jcbCurso.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jcbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursoActionPerformed(evt);
            }
        });

        jcbMod.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N

        jtfUc.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jtfUc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfUcMouseClicked(evt);
            }
        });
        jtfUc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfUcKeyReleased(evt);
            }
        });

        jlCargaHoraria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlCargaHoraria.setText("Carga Horária:");
        jlCargaHoraria.setEnabled(false);

        jtfch.setEnabled(false);
        jtfch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfchKeyReleased(evt);
            }
        });

        jlpCadUC.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadUC.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadUC.setLayer(jlUC, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadUC.setLayer(jcbCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadUC.setLayer(jcbMod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadUC.setLayer(jtfUc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadUC.setLayer(jlCargaHoraria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadUC.setLayer(jtfch, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpCadUCLayout = new javax.swing.GroupLayout(jlpCadUC);
        jlpCadUC.setLayout(jlpCadUCLayout);
        jlpCadUCLayout.setHorizontalGroup(
            jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCadUCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpCadUCLayout.createSequentialGroup()
                        .addComponent(jlUC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfUc))
                    .addGroup(jlpCadUCLayout.createSequentialGroup()
                        .addGroup(jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpCadUCLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlpCadUCLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlpCadUCLayout.createSequentialGroup()
                                .addComponent(jlCargaHoraria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jlpCadUCLayout.setVerticalGroup(
            jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCadUCLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUC)
                    .addComponent(jtfUc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpCadUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCargaHoraria)
                    .addComponent(jtfch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtnCad.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnCad.setForeground(new java.awt.Color(0, 255, 0));
        jbtnCad.setText("Cadastrar");
        jbtnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadActionPerformed(evt);
            }
        });
        jbtnCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnCadKeyPressed(evt);
            }
        });

        jlErro.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));
        jlErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLayeredPane3.setLayer(jbtnCad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jbtnCad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane3)
                    .addComponent(jlpCadUC))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpCadUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarCursos(){
        try {
            AreaUService aus = services.ServiceFactory.getAreaUService();
            ResultSet rs = aus.listarCursos();
            while(rs.next()){
                jcbCurso.addItem(rs.getString("nome_curso"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void listarMod(){
        int refc = 0;
        AreaUService aus = services.ServiceFactory.getAreaUService();
        try {
            try {
                refc = aus.refCurso(jcbCurso.getSelectedItem().toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            ResultSet rs = aus.listarMod(refc);
            while(rs.next()){
                jcbMod.addItem(rs.getString("nome_modulo"));
            }
        } catch (Exception e) {
        }
    }
    private void cadastrarUC(){
        UCVO ucvo = new UCVO();
        AreaUService aus = services.ServiceFactory.getAreaUService();
        if(jtfUc.getText().isBlank()){
            jlErro.setText("Nome inválido!");
        }else{
            if(!loop.loopingLimiteChar(jtfUc.getText(), 80)){
                JOptionPane.showMessageDialog(null, "Nome inválido!");
            }else{
                if(jtfch.getText().isEmpty() || !loop.loopingNumjtf(jtfch.getText(), 5)){
                    jlErro.setText("Informe uma carga horária válida!");
                }else{
                    try {
                        try {
                            ucvo.setCurso(aus.refCurso((String) jcbCurso.getSelectedItem()));
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        try {
                            ucvo.setModulo(aus.refMod(jcbMod.getSelectedItem().toString()));
                        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    
                        ucvo.setNome_uc(jtfUc.getText().toLowerCase());
                        ucvo.setCargaHoraria(Integer.parseInt(jtfch.getText()));
                    
                        aus.cadUC(ucvo);
                        String log = logu.criarLogUsuario("criou", "UC", jtfUc.getText().toLowerCase() + " (" + jcbCurso.getSelectedItem() + ")");
                        try{
                            aus.log(log);
                        }catch(Exception e){
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                        JOptionPane.showMessageDialog(null, "UC registrada com Sucesso!", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                        if(e.getMessage().equals(sqlerro.sqlError(jtfUc.getText(), "nome_uc"))){
                            JOptionPane.showMessageDialog(null, "UC " + jtfUc.getText() + " já existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            }
        }
    }
    private void limparTela(){
        jtfUc.setText(null);
        jtfch.setText(null);
        jcbCurso.setSelectedIndex(0);
        jtfch.setEnabled(false);
        limparMod();
        listarMod();
    }
    private void limparMod(){
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        dcm.removeAllElements();
        jcbMod.setModel(dcm);
    }
    
    private void jbtnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadActionPerformed
        try {
            if(!jcbMod.getSelectedItem().equals(null)){
                if(JOptionPane.showConfirmDialog(null, "Deseja criar a UC " + jtfUc.getText() + " dentro de " + jcbMod.getSelectedItem() + "?",
                        "AVISO!", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
                    cadastrarUC();
                    limparTela();
                    limparMod();
                    listarMod();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Preencha os campos!");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Preencha os campos!");
        }
    }//GEN-LAST:event_jbtnCadActionPerformed

    private void jbtnCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadKeyPressed
        try {
            if(!jcbMod.getSelectedItem().equals(null)){
                if(JOptionPane.showConfirmDialog(null, "Deseja criar a UC " + jtfUc.getText() + " dentro de " + jcbMod.getSelectedItem() + "?",
                        "AVISO!", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
                    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                        cadastrarUC();
                        limparTela();
                        limparMod();
                        listarMod();
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "Preencha os campos!");
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Preencha os campos!");
        }
    }//GEN-LAST:event_jbtnCadKeyPressed

    private void jtfUcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUcMouseClicked
        if(jtfUc.isFocusOwner()){
            jlErro.setText(null);
        }
    }//GEN-LAST:event_jtfUcMouseClicked

    private void jtfUcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUcKeyReleased
        if(!jtfUc.getText().isEmpty()){
            jtfch.setEnabled(true);
            jlCargaHoraria.setEnabled(true);
        }else{
            jtfch.setEnabled(false);
            jlCargaHoraria.setEnabled(false);
            jtfch.setText(null);
        }
        if(!loop.loopingLimiteChar(jtfUc.getText(), 80)){
            int num = jtfUc.getText().length();
            jlErro.setText((num - 80) + " caracteres acima do permitido!");
        }else{
            jlErro.setText(null);
        }
    }//GEN-LAST:event_jtfUcKeyReleased

    private void jcbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursoActionPerformed
        limparMod();
        listarMod();
    }//GEN-LAST:event_jcbCursoActionPerformed

    private void jtfchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfchKeyReleased
        try{
           if(!loop.loopingNumjtf(jtfch.getText(), 5)){
                jlErro.setText("Carga Horária Inválida!");
            }else{
                jlErro.setText(null);
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Este campo não permite letras!", "ERRO", JOptionPane.ERROR_MESSAGE);
            jtfch.setText(null);
        }
    }//GEN-LAST:event_jtfchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JButton jbtnCad;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbMod;
    private javax.swing.JLabel jlCargaHoraria;
    private javax.swing.JLabel jlErro;
    private javax.swing.JLabel jlUC;
    private javax.swing.JLayeredPane jlpCadUC;
    private javax.swing.JTextField jtfUc;
    private javax.swing.JTextField jtfch;
    // End of variables declaration//GEN-END:variables
}
