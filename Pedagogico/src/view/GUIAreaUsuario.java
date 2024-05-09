package view;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class GUIAreaUsuario extends javax.swing.JFrame implements InternalFrameListener{
    public static String user;
    private boolean flagCadCurso = false, flagCadMod = false, flagCadUc = false, flagCadTurma = false,
            flagCadAluno = false, flagCadProf = false, flagCadProfUc = false, flagGUICadAlunoTurma = false;

    public GUIAreaUsuario() {
        initComponents();
        setarUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlOpcoes = new javax.swing.JList<>();
        jdpAreaUsuario = new javax.swing.JDesktopPane();
        jlUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnClose.setBackground(new java.awt.Color(255, 0, 0));
        jbtnClose.setForeground(new java.awt.Color(0, 0, 0));
        jbtnClose.setText("X");
        jbtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Área do Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnClose))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jlOpcoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlOpcoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlOpcoes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cadastrar Curso", "Cadastrar Modulo", " ", "Cadastrar UC", "Cad. Prof. UC", " ", "Cadastrar Turma", "Cad. Aluno Turma", " ", "Cadastrar Aluno", "Cadastrar Professor", " ", "Criar Cronograma", "Ver Cronograma" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlOpcoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlOpcoes);

        jlUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlUsername.setForeground(new java.awt.Color(255, 0, 0));
        jlUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));

        jdpAreaUsuario.setLayer(jlUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpAreaUsuarioLayout = new javax.swing.GroupLayout(jdpAreaUsuario);
        jdpAreaUsuario.setLayout(jdpAreaUsuarioLayout);
        jdpAreaUsuarioLayout.setHorizontalGroup(
            jdpAreaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jdpAreaUsuarioLayout.setVerticalGroup(
            jdpAreaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdpAreaUsuario)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdpAreaUsuario)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setarUsuario(){
        user = jlUsername.getText();
    }
    
    private void abrirOpcoes(){
        if(jlOpcoes.getSelectedValue().equals("Cadastrar Curso")){
            if(!flagCadCurso){
                GUICadCurso cadc = new GUICadCurso();
                jdpAreaUsuario.add(cadc);
                cadc.setVisible(true);
                flagCadCurso = true;
                cadc.addInternalFrameListener(this);
            }
        }else{
            if(jlOpcoes.getSelectedValue().equals("Cadastrar Modulo")){
                if(!flagCadMod){
                    GUICadModulo guicm = new GUICadModulo();
                    jdpAreaUsuario.add(guicm);
                    guicm.setVisible(true);
                    flagCadMod = true;
                    guicm.addInternalFrameListener(this);
                }
            }else{
                if(jlOpcoes.getSelectedValue().equals("Cadastrar UC")){
                    if(!flagCadUc){
                        GUICadUC gcu = new GUICadUC();
                        jdpAreaUsuario.add(gcu);
                        gcu.setVisible(true);
                        flagCadUc = true;
                        gcu.addInternalFrameListener(this);
                    }
                }else{
                    if(jlOpcoes.getSelectedValue().equals("Cadastrar Turma")){
                        if(!flagCadTurma){
                            GUICadTurma gct = new GUICadTurma();
                            jdpAreaUsuario.add(gct);
                            gct.setVisible(true);
                            flagCadTurma = true;
                            gct.addInternalFrameListener(this);
                        }
                    }else{
                        if(jlOpcoes.getSelectedValue().equals("Cadastrar Aluno")){
                            if(!flagCadAluno){
                                GUICadAluno gca = new GUICadAluno();
                                jdpAreaUsuario.add(gca);
                                gca.setVisible(true);
                                flagCadAluno = true;
                                gca.addInternalFrameListener(this);
                            }
                        }else{
                            if(jlOpcoes.getSelectedValue().equals("Cadastrar Professor")){
                                if(!flagCadProf){
                                    GUICadProf gcp = new GUICadProf();
                                    jdpAreaUsuario.add(gcp);
                                    gcp.setVisible(true);
                                    flagCadProf = true;
                                    gcp.addInternalFrameListener(this);
                                }
                            }else{
                                if(jlOpcoes.getSelectedValue().equals("Cad. Prof. UC")){
                                    if(!flagCadProfUc){
                                        GUICadProfUC gcpu = new GUICadProfUC();
                                        jdpAreaUsuario.add(gcpu);
                                        gcpu.setVisible(true);
                                        flagCadProfUc = true;
                                        gcpu.addInternalFrameListener(this);
                                    }
                                }else{
                                    if(jlOpcoes.getSelectedValue().equals("Cad Aluno Turma")){
                                        
                                    }else{
                                        if(jlOpcoes.getSelectedValue().equals("Criar Cronograma")){
                                            
                                        }else{
                                            if(jlOpcoes.getSelectedValue().equals("Ver Cronograma")){
                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void jbtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseActionPerformed
        GUILogin guilog = new GUILogin();
        dispose();
        guilog.setVisible(true);
        user = null;
    }//GEN-LAST:event_jbtnCloseActionPerformed

    private void jlOpcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlOpcoesMouseClicked
        abrirOpcoes();
    }//GEN-LAST:event_jlOpcoesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIAreaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAreaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAreaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAreaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAreaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnClose;
    private javax.swing.JDesktopPane jdpAreaUsuario;
    private javax.swing.JList<String> jlOpcoes;
    public static javax.swing.JLabel jlUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof GUICadCurso){
            flagCadCurso = false;
        }
        if(e.getInternalFrame() instanceof GUICadModulo){
            flagCadMod = false;
        }
        if(e.getInternalFrame() instanceof GUICadUC){
            flagCadUc = false;
        }
        if(e.getInternalFrame() instanceof GUICadTurma){
            flagCadTurma = false;
        }
        if(e.getInternalFrame() instanceof GUICadAluno){
            flagCadAluno = false;
        }
        if(e.getInternalFrame() instanceof GUICadProf){
            flagCadProf = false;
        }
        if(e.getInternalFrame() instanceof GUICadProfUC){
            flagCadProfUc = false;
        }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
    }
}
