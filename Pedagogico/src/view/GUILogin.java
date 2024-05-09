package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.AdmVO;
import model.UsuarioVO;
import org.jasypt.util.password.rfc2307.RFC2307SSHAPasswordEncryptor;
import services.AdmService;
import services.UsuarioService;

public class GUILogin extends javax.swing.JFrame {

    public GUILogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jbtnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jbtnSignin = new javax.swing.JButton();
        jlErro = new javax.swing.JLabel();
        jcbPerfil = new javax.swing.JComboBox<>();
        jcbMostrarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jbtnClose.setBackground(new java.awt.Color(255, 0, 0));
        jbtnClose.setForeground(new java.awt.Color(0, 0, 0));
        jbtnClose.setText("X");
        jbtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnClose))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Usuário:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Senha:");

        jtfUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jpfPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jbtnLogin.setBackground(new java.awt.Color(0, 204, 51));
        jbtnLogin.setForeground(new java.awt.Color(0, 0, 0));
        jbtnLogin.setText("Login");
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        jbtnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnLoginKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Não possui uma conta?");

        jbtnSignin.setBackground(new java.awt.Color(255, 255, 0));
        jbtnSignin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnSignin.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSignin.setText("Sign in");
        jbtnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSigninActionPerformed(evt);
            }
        });
        jbtnSignin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnSigninKeyPressed(evt);
            }
        });

        jlErro.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));
        jlErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jcbPerfil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador" }));

        jcbMostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbMostrarSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnSignin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jtfUser)
                            .addComponent(jpfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbMostrarSenha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(jbtnLogin)
                .addGap(196, 196, 196))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMostrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jbtnSignin))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadastro(){
        GUISignin guisignin = new GUISignin();
        dispose();
        guisignin.setVisible(true);
    }
    private void login(){
        if(jtfUser.getText().isEmpty() || jpfPassword.getText().isEmpty()){
            jlErro.setText("Preencha todos os campos!");
        }else{
            boolean status = false;
            if(jcbPerfil.getSelectedItem().equals("Administrador")){
                try {
                    RFC2307SSHAPasswordEncryptor encrypt = new RFC2307SSHAPasswordEncryptor();
                    AdmVO admvo = new AdmVO();
                    admvo.setUser(jtfUser.getText());
                    admvo.setPassword(jpfPassword.getText().toLowerCase());
            
                    AdmService as = services.ServiceFactory.getAdmService();
                    String password = as.autentificaçãoAdm(jtfUser.getText()); 
                    status = encrypt.checkPassword(jpfPassword.getText().toLowerCase(), password);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao efetuar login Adm GUILogin" + e.getMessage());
                }
                if(status == true){
                    GUIAreaAdm guiareaadm = new GUIAreaAdm();
                    guiareaadm.setVisible(true);
                    guiareaadm.jlUsername.setText(jtfUser.getText());
                    dispose();
                }else{
                    jlErro.setText("Nome de Usuário ou Senha Inválidos!!!");
                }
            }else{
                try {
                    RFC2307SSHAPasswordEncryptor encrypt = new RFC2307SSHAPasswordEncryptor();
                    UsuarioVO usuvo = new UsuarioVO();
                    usuvo.setLogin(jtfUser.getText());
                    usuvo.setSenha(jpfPassword.getText().toLowerCase());
                    
                    UsuarioService us = services.ServiceFactory.getUsuarioService();
                    String password = us.verificarUsuario(jtfUser.getText());
                    status = encrypt.checkPassword(jpfPassword.getText().toLowerCase(), password);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao efetuar login Usuário GUILogin" + e.getMessage());
                }
                if(status == true){
                    GUIAreaUsuario guiareausuario = new GUIAreaUsuario();
                    guiareausuario.setVisible(true);
                    guiareausuario.jlUsername.setText(jtfUser.getText());
                    dispose();
                }else{
                    jlErro.setText("Nome de Usuário ou Senha Inválidos");
                }
            }
        }
    }
    
    private void jbtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_jbtnCloseActionPerformed

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        login();
    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jbtnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnLoginKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_jbtnLoginKeyPressed

    private void jbtnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSigninActionPerformed
        abrirCadastro();
    }//GEN-LAST:event_jbtnSigninActionPerformed

    private void jbtnSigninKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnSigninKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            abrirCadastro();
        }
    }//GEN-LAST:event_jbtnSigninKeyPressed

    private void jcbMostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMostrarSenhaMouseClicked
        if(jcbMostrarSenha.isSelected()){
            jpfPassword.setEchoChar((char)0);
        }else{
            jpfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarSenhaMouseClicked

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
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnClose;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnSignin;
    private javax.swing.JCheckBox jcbMostrarSenha;
    private javax.swing.JComboBox<String> jcbPerfil;
    private javax.swing.JLabel jlErro;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
