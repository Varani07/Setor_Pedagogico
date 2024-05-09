package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.CursoVO;
import services.AdmService;
import services.AreaUService;
import util.LoopingVerification;
import util.SQLErrorMessage;
import util.Utilidades;

public class GUICadCurso extends javax.swing.JInternalFrame {
    Utilidades util = new Utilidades();
    LoopingVerification loop = new LoopingVerification();
    SQLErrorMessage erroslq = new SQLErrorMessage();

    public GUICadCurso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpCadCurso = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfCurso = new javax.swing.JTextField();
        jbtnCadastrar = new javax.swing.JButton();
        jlErro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfSigla = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Curso");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha o nome do curso");

        jtfCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtfCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCursoKeyReleased(evt);
            }
        });

        jbtnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnCadastrar.setForeground(new java.awt.Color(51, 255, 51));
        jbtnCadastrar.setText("Cadastrar");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });
        jbtnCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnCadastrarKeyPressed(evt);
            }
        });

        jlErro.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));
        jlErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Sigla:");

        jtfSigla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtfSigla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSiglaKeyReleased(evt);
            }
        });

        jlpCadCurso.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadCurso.setLayer(jtfCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadCurso.setLayer(jbtnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadCurso.setLayer(jlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadCurso.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCadCurso.setLayer(jtfSigla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpCadCursoLayout = new javax.swing.GroupLayout(jlpCadCurso);
        jlpCadCurso.setLayout(jlpCadCursoLayout);
        jlpCadCursoLayout.setHorizontalGroup(
            jlpCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpCadCursoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCadastrar)
                .addGap(126, 126, 126))
            .addGroup(jlpCadCursoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpCadCursoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jlpCadCursoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jlpCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))
        );
        jlpCadCursoLayout.setVerticalGroup(
            jlpCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCadCursoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jtfCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jlpCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCadastrar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpCadCurso)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpCadCurso)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarCurso(){
        try {
            if(jtfCurso.getText().isBlank() || jtfCurso.getText().isEmpty()){
                jlErro.setText("Nome inválido!");
            }else{
                if(!loop.loopingLimiteChar(jtfCurso.getText(), 35)){
                    JOptionPane.showMessageDialog(null, "Número de caracteres excedido para o nome do curso!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(jtfSigla.getText().isEmpty() || !loop.loopingLimiteChar(jtfSigla.getText(), 10)){
                        jlErro.setText("Sigla inválida!");
                    }else{
                        jlErro.setText("");
                        CursoVO cvo = new CursoVO();
                        cvo.setSigla(jtfSigla.getText().toUpperCase());
                        cvo.setNome_curso(jtfCurso.getText().toUpperCase());
                        AreaUService aus = services.ServiceFactory.getAreaUService();
                        aus.cadastrarCurso(cvo);
                        try {
                            AdmService as = services.ServiceFactory.getAdmService();
                            Date d = new Date();
                            SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    
                            String log = 
                                GUIAreaUsuario.jlUsername.getText().toUpperCase() 
                                    + " CRIOU CURSO " 
                                    + jtfCurso.getText().toUpperCase()
                                    + " "
                                    + formatd.format(d);
                    
                            as.log(log);
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
                        }
                    }
                }
            }
        } catch (SQLException e) {
            if(e.getMessage().equals("Duplicate entry '" + jtfCurso.getText().toUpperCase() + "' for key 'nome_curso'")){
                JOptionPane.showMessageDialog(null, "Nome " + jtfCurso.getText() + " indisponível!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }else{
                if(e.getMessage().equals(erroslq.sqlError(jtfSigla.getText().toUpperCase(), "sigla"))){
                    JOptionPane.showMessageDialog(null, "Sigla " + jtfSigla.getText().toUpperCase() + " indisponível", "ERRO", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jbtnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar o curso " + jtfCurso.getText() + "?", 
                    "ALERTA!", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
                cadastrarCurso();
                util.limparTelalp(jlpCadCurso);
            }
        }
    }//GEN-LAST:event_jbtnCadastrarKeyPressed

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar o curso " + jtfCurso.getText() + "?", 
                    "ALERTA!", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
            cadastrarCurso();
            util.limparTelalp(jlpCadCurso);
        }
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jtfCursoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCursoKeyReleased
        if(!loop.loopingLimiteChar(jtfCurso.getText(), 35)){
            jlErro.setText("Número de caracteres excedido!");
        }else{
            jlErro.setText(null);
        }
    }//GEN-LAST:event_jtfCursoKeyReleased

    private void jtfSiglaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSiglaKeyReleased
        if(!loop.loopingLimiteChar(jtfSigla.getText(), 10)){
            jlErro.setText("Número de caracteres excedido!");
        }else{
            jlErro.setText(null);
        }
    }//GEN-LAST:event_jtfSiglaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JLabel jlErro;
    private javax.swing.JLayeredPane jlpCadCurso;
    private javax.swing.JTextField jtfCurso;
    private javax.swing.JTextField jtfSigla;
    // End of variables declaration//GEN-END:variables
}
