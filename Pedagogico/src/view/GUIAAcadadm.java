package view;

import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import model.AdmVO;
import org.jasypt.util.password.rfc2307.RFC2307SSHAPasswordEncryptor;
import services.AdmService;
import services.ServiceFactory;
import util.Utilidades;



public class GUIAAcadadm extends javax.swing.JInternalFrame implements InternalFrameListener{
    Utilidades util = new Utilidades();
    GUISignin sign = new GUISignin();
    private boolean flagInfo = false;

    public GUIAAcadadm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jpfConfirmarSenha = new javax.swing.JPasswordField();
        jcbPerm = new javax.swing.JCheckBox();
        jcbCargo = new javax.swing.JComboBox<>();
        jlcargo = new javax.swing.JLabel();
        jbtnCadastrar = new javax.swing.JButton();
        jbtnInfoSenha = new javax.swing.JButton();
        jlErro = new javax.swing.JLabel();
        jcbMostrarSenha = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro Administrador");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Username:");

        jtfNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNomeKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Senha:");

        jpfSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Confirme sua senha:");

        jpfConfirmarSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jcbPerm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbPerm.setText("Perm.");
        jcbPerm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbPermMouseClicked(evt);
            }
        });

        jcbCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        jcbCargo.setEnabled(false);
        jcbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargoActionPerformed(evt);
            }
        });

        jlcargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlcargo.setText("Cargo:");
        jlcargo.setEnabled(false);

        jbtnCadastrar.setBackground(new java.awt.Color(0, 204, 0));
        jbtnCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jbtnInfoSenha.setBackground(new java.awt.Color(255, 255, 0));
        jbtnInfoSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnInfoSenha.setForeground(new java.awt.Color(0, 0, 0));
        jbtnInfoSenha.setText("?");
        jbtnInfoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInfoSenhaActionPerformed(evt);
            }
        });

        jlErro.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));
        jlErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jcbMostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbMostrarSenhaMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpfSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpfConfirmarSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbPerm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlcargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnInfoSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbMostrarSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNome))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpfConfirmarSenha))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnInfoSenha)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbMostrarSenha))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jcbPerm)
                                .addGap(18, 18, 18)
                                .addComponent(jlcargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnCadastrar))
                            .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnInfoSenha))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbMostrarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jpfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPerm)
                    .addComponent(jlcargo)
                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCadastrar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void abrirInfoSenha() throws PropertyVetoException{
        if(!flagInfo){
            InfoSenha infs = new InfoSenha();
            jLayeredPane1.add(infs);
            infs.setVisible(true);
            infs.setSelected(true);
            flagInfo = true;
            infs.addInternalFrameListener(this);
        }
    }
    
    private void givePerm(){
        if(jcbPerm.isSelected()){
            jcbCargo.setEnabled(true);
            jlcargo.setEnabled(true);
            jcbCargo.setSelectedItem("1");
        }else{
            jcbCargo.setEnabled(false);
            jlcargo.setEnabled(false);
            jcbCargo.setSelectedItem("0");
        }
    }
    private void permC(){
        if(jcbPerm.isSelected() && jcbCargo.getSelectedItem().equals("0")){
            jcbCargo.setSelectedItem("1");
        }
    }
    
    private void cadastrarAdm(){
        AdmVO avo = new AdmVO();
        avo.setUser(jtfNome.getText());
        avo.setPerm(jcbPerm.isSelected());
        avo.setCargo(Integer.parseInt((String) jcbCargo.getSelectedItem()));
        avo.setPassword(jpfSenha.getText().toLowerCase());
        
        if(jtfNome.getText().isEmpty() || jpfSenha.getText().isEmpty() || jpfConfirmarSenha.getText().isEmpty()){
            jlErro.setText("Preencha todos os campos!");
        }else{
            if(!jpfSenha.getText().toLowerCase().equals(jpfConfirmarSenha.getText().toLowerCase())){
                jlErro.setText("Senha não coincide!");
                jpfConfirmarSenha.setText(null);
            }else{
                if(!sign.loopingConfirm(jpfSenha.getText().toLowerCase())){
                    jlErro.setText("Senha não cumpre os requisitos!");
                    jpfSenha.setText(null);
                    jpfConfirmarSenha.setText(null);
                }else{
                    try {
                        if(!sign.loopingUseradm(jtfNome.getText())){
                            JOptionPane.showMessageDialog(null, "Nome de usuário inválido!");
                        }else{
                            RFC2307SSHAPasswordEncryptor encrypt = new RFC2307SSHAPasswordEncryptor();
                            avo.setPassword(encrypt.encryptPassword(jpfSenha.getText().toLowerCase()));
                        
                            AdmService as = ServiceFactory.getAdmService();
                            as.cadastrarAdm(avo);
                            try{
                                Date d = new Date();
                                SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    
                                String log = 
                                    GUIAreaAdm.jlUsername.getText().toUpperCase() 
                                        + " CADASTROU ADM " 
                                        + jtfNome.getText().toUpperCase()
                                        + " "
                                        + formatd.format(d);
                                as.log(log);
                            } catch (Exception e){
                                JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
                            }   
                            util.limparTelalp(jLayeredPane1);
                            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "PARABÉNS", JOptionPane.INFORMATION_MESSAGE);
                            jlErro.setText("");
                        }
                    } catch (SQLException e) {
                        if(e.getMessage().equals("Duplicate entry '" + jtfNome.getText() + "' for key 'user_adm'")){
                            JOptionPane.showMessageDialog(null, "Nome de usuário indisponível! ", "ERRO", JOptionPane.ERROR_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "SQLErro ao cadastrar usuário! ", "ERRO", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário! ", "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }
    
    private void jcbPermMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbPermMouseClicked
        givePerm();
    }//GEN-LAST:event_jcbPermMouseClicked

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        cadastrarAdm();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrarAdm();
        }
    }//GEN-LAST:event_jbtnCadastrarKeyPressed

    private void jbtnInfoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInfoSenhaActionPerformed
        try {
            abrirInfoSenha();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIAAcadadm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnInfoSenhaActionPerformed

    private void jcbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargoActionPerformed
        permC();
    }//GEN-LAST:event_jcbCargoActionPerformed

    private void jcbMostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMostrarSenhaMouseClicked
        if(jcbMostrarSenha.isSelected()){
            jpfSenha.setEchoChar((char)0);
            jpfConfirmarSenha.setEchoChar((char)0);
        }else{
            jpfSenha.setEchoChar('*');
            jpfConfirmarSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbMostrarSenhaMouseClicked

    private void jtfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyReleased
        if(!sign.loopingUseradm(jtfNome.getText())){
            jlErro.setText("Nome de usuário inválido!");
        }else{
            jlErro.setText(null);
        }
    }//GEN-LAST:event_jtfNomeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JButton jbtnInfoSenha;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JCheckBox jcbMostrarSenha;
    private javax.swing.JCheckBox jcbPerm;
    private javax.swing.JLabel jlErro;
    private javax.swing.JLabel jlcargo;
    private javax.swing.JPasswordField jpfConfirmarSenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof InfoSenha){
            flagInfo = false;
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
