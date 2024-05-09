package view;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.UsuarioVO;
import org.jasypt.util.password.rfc2307.RFC2307SSHAPasswordEncryptor;
import services.UsuarioService;

public class GUISignin extends javax.swing.JFrame {

    
    
    public GUISignin() {
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
        jtfUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpfPassword = new javax.swing.JPasswordField();
        jpfPasswordConfirm = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jbtnCadastrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jftfCpf = new javax.swing.JFormattedTextField();
        jlError = new javax.swing.JLabel();
        jcbMostrarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign in");
        jLabel1.setToolTipText("");

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
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnClose))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome de usuário:");

        jtfUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfUserKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mínimo 6 caracteres (3 letras, 2 números e 1 caracter especial)");

        jpfPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jpfPasswordConfirm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jpfPasswordConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfPasswordConfirmKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirme sua senha");

        jbtnCadastrar.setBackground(new java.awt.Color(0, 204, 0));
        jbtnCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbtnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("CPF:");

        jtfEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfEmailKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("E-mail:");

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jftfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jftfCpfKeyReleased(evt);
            }
        });

        jlError.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 0));
        jlError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jcbMostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbMostrarSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jpfPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbMostrarSenha)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jlError, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnCadastrar)
                .addGap(159, 159, 159))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpfPassword)
                                    .addComponent(jcbMostrarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpfPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCadastrar)))
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean loopingConfirm(String senha){
        int tamanho = 6, letra = 3, letraC = 0, num = 2, numC = 0, simbolo = 1, simboloC = 0;
        boolean tamanhoB = false, letraB = false, numB = false, simboloB = false, ultimateBoo;
        String simboloS = "'!@#$%&*()_-+=";
        
        tamanhoB = senha.length() >= tamanho;
                
        letraC = 0;
        for(int i = 0; i < senha.length(); i++){
            if(senha.toLowerCase().charAt(i) >= 'a' && senha.toLowerCase().charAt(i) <= 'z'){
                letraC ++;
            }
        }
        letraB = letraC >= letra;
                
        numC = 0;
        for(int i = 0; i < senha.length(); i++){
            if(senha.charAt(i) >= '0' && senha.charAt(i) <= '9'){
                numC ++;
            }
        }
        numB = numC >= num;
                
        simboloC = 0;
        for(int i = 0; i < senha.length(); i++){
            for(int j = 0; j < simboloS.length(); j++){
                if(senha.charAt(i) == simboloS.charAt(j)){
                    simboloC ++;
                }
            }
        }
        simboloB = simboloC >= simbolo;
        if (!tamanhoB || !letraB || !numB || !simboloB) {
            ultimateBoo = false;
        } else {
            ultimateBoo = true;
        }
      
        
        return ultimateBoo;
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
    
    public boolean loopingUser (String nome){
        boolean tamanho = nome.length() <= 35;
        return tamanho;
    }
    
    public boolean loopingUseradm (String nome){
        boolean tamanho = nome.length() <= 40;
        return tamanho;
    }
    
    public boolean loopingCpf(String cpf){
        int num = 11, numC = 0;
        boolean numB = false;
                
        numC = 0;
        for(int i = 0; i < cpf.length(); i++){
            if(cpf.charAt(i) >= '0' && cpf.charAt(i) <= '9'){
                numC ++;
            }
        }
        numB = numC >= num;
        
        return numB;
    }
    
    private void cadastrar(){
        try {
            UsuarioVO uvo = new UsuarioVO();
            uvo.setLogin(jtfUser.getText());
            uvo.setCpf(jftfCpf.getText());
            uvo.setEmail(jtfEmail.getText());
            uvo.setSenha(jpfPassword.getText().toLowerCase());
            
            if(jtfUser.getText().isEmpty() || jftfCpf.getText().isEmpty() || jtfEmail.getText().isEmpty() || 
                    jpfPassword.getText().isEmpty() || jpfPasswordConfirm.getText().isEmpty()){
                    jlError.setText("Preencha todos os campos!");
            }else{
                if(!jpfPassword.getText().toLowerCase().equals(jpfPasswordConfirm.getText().toLowerCase())){
                    jlError.setText("Senha não coincide!");
                    jpfPasswordConfirm.setText(null);
                }else{
                    if(!loopingConfirm(jpfPassword.getText().toLowerCase())){
                        jlError.setText("Senha não cumpre com os requisitos!");
                        jpfPassword.setText(null);
                        jpfPasswordConfirm.setText(null);
                    }else{
                        if(!loopingCpf(jftfCpf.getText())){
                            jlError.setText("Cpf inválido!");
                            jftfCpf.setText(null);
                        }else{
                            if(!loopingEmail(jtfEmail.getText())){
                                jlError.setText("Email inválido!");
                                jtfEmail.setText(null);
                            }else{
                                if(!loopingUser(jtfUser.getText())){
                                    jlError.setText("Nome de usuário inválido!");
                                    jtfUser.setText(null);
                                }else{
                                    RFC2307SSHAPasswordEncryptor encrypt = new RFC2307SSHAPasswordEncryptor();
                                    uvo.setSenha(encrypt.encryptPassword(jpfPassword.getText().toLowerCase()));
                        
                                    UsuarioService us = services.ServiceFactory.getUsuarioService();
                                    us.cadastrarUsuarios(uvo);
                        
                                    GUIAreaUsuario gau = new GUIAreaUsuario();
                                    gau.setVisible(true);
                                    GUIAreaUsuario.jlUsername.setText(jtfUser.getText());
                                    dispose();
                                }
                            }
                            
                        }
                        
                    }
                }
            }
            
        } catch (SQLException e) {
            if(e.getMessage().equals("Duplicate entry '" + jtfUser.getText() + "' for key 'login'")){
                JOptionPane.showMessageDialog(null, "Nome de usuário indisponível! ", "ERRO", JOptionPane.ERROR_MESSAGE);
            }else{
                if(e.getMessage().equals("Duplicate entry '" + jtfEmail.getText() + "' for key 'email'")){
                    JOptionPane.showMessageDialog(null, "Endereço de E-mail indisponível! ", "ERRO", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(e.getMessage().equals("Duplicate entry '" + jftfCpf.getText() + "' for key 'cpf'")){
                        JOptionPane.showMessageDialog(null, "CPF indisponível! ", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "SQLErro ao cadastrar usuário! ", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário ", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jbtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseActionPerformed
        GUILogin guilogin = new GUILogin();
        dispose();
        guilogin.setVisible(true);
    }//GEN-LAST:event_jbtnCloseActionPerformed

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrar();
        }
    }//GEN-LAST:event_jbtnCadastrarKeyPressed

    private void jpfPasswordConfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfPasswordConfirmKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrar();
        }
    }//GEN-LAST:event_jpfPasswordConfirmKeyPressed

    private void jcbMostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMostrarSenhaMouseClicked
        if(jcbMostrarSenha.isSelected()){
            jpfPassword.setEchoChar((char)0);
            jpfPasswordConfirm.setEchoChar((char)0);
        }else{
            jpfPassword.setEchoChar('*');
            jpfPasswordConfirm.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarSenhaMouseClicked

    private void jtfEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEmailKeyReleased
        if(!loopingEmail(jtfEmail.getText())){
            jlError.setText("Email inválido!");
        }else{
            jlError.setText(null);
        }
    }//GEN-LAST:event_jtfEmailKeyReleased

    private void jftfCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftfCpfKeyReleased
        if(!loopingCpf(jftfCpf.getText())){
            jlError.setText("Cpf inválido!");
        }else{
            jlError.setText(null);
        }
    }//GEN-LAST:event_jftfCpfKeyReleased

    private void jtfUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUserKeyReleased
        if(!loopingUser(jtfUser.getText())){
            jlError.setText("Nome de usuário inválido!");
        }else{
            jlError.setText(null);
        }
    }//GEN-LAST:event_jtfUserKeyReleased

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
            java.util.logging.Logger.getLogger(GUISignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISignin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnClose;
    private javax.swing.JCheckBox jcbMostrarSenha;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JLabel jlError;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JPasswordField jpfPasswordConfirm;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
