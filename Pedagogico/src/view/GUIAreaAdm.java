package view;

import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import services.AdmService;

public class GUIAreaAdm extends javax.swing.JFrame implements InternalFrameListener{
    private boolean flagAbrirUsuario = false;
    private boolean flagAbrirCadAdmin = false;
    private boolean flagAbrirAdm = false;
    private boolean flagAbrirlog = false;
    public static String user;

    public GUIAreaAdm() {
        initComponents();
        setarUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jdpAreaAdm = new javax.swing.JDesktopPane();
        jlUsername = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlOpcoes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

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
        jLabel1.setText("Area do Administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnClose)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jbtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jlUsername.setBackground(new java.awt.Color(0, 102, 102));
        jlUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlUsername.setForeground(new java.awt.Color(255, 46, 25));
        jlUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlUsername.setMaximumSize(new java.awt.Dimension(2, 2));
        jlUsername.setMinimumSize(new java.awt.Dimension(2, 2));
        jlUsername.setPreferredSize(new java.awt.Dimension(2, 2));

        jdpAreaAdm.setLayer(jlUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpAreaAdmLayout = new javax.swing.GroupLayout(jdpAreaAdm);
        jdpAreaAdm.setLayout(jdpAreaAdmLayout);
        jdpAreaAdmLayout.setHorizontalGroup(
            jdpAreaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaAdmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );
        jdpAreaAdmLayout.setVerticalGroup(
            jdpAreaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpAreaAdmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlOpcoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlOpcoes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Usuários", "Administradores", "Cad. Admin.", "Log" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlOpcoes.setFocusable(false);
        jlOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlOpcoesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlOpcoes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdpAreaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdpAreaAdm)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirUsuario(){
        int c = 0;
        try {
            AdmService as = services.ServiceFactory.getAdmService();
            c = as.permAlterarDados(jlUsername.getText());
        } catch (Exception e) {
        }
        if(jlOpcoes.getSelectedValue().equals("Usuários")){
            if(!flagAbrirUsuario){
                GUIAAusuarios guiusuarios = new GUIAAusuarios();
                jdpAreaAdm.add(guiusuarios);
                guiusuarios.setVisible(true);
                flagAbrirUsuario = true;
                guiusuarios.addInternalFrameListener(this);
            }
        }else{
            if(jlOpcoes.getSelectedValue().equals("Cad. Admin.")){
                if(!flagAbrirCadAdmin && c > 1){
                    GUIAAcadadm cadadm = new GUIAAcadadm();
                    jdpAreaAdm.add(cadadm);
                    cadadm.setVisible(true);
                    flagAbrirCadAdmin = true;
                    cadadm.addInternalFrameListener(this);
                }
                if(c < 2){
                    JOptionPane.showMessageDialog(null, "ACESSO NEGADO!");
                }
            }else{
                if(jlOpcoes.getSelectedValue().equals("Administradores")){
                    if(!flagAbrirAdm && c > 0){
                        GUIAAadm gadm = new GUIAAadm();
                        jdpAreaAdm.add(gadm);
                        gadm.setVisible(true);
                        flagAbrirAdm = true;
                        gadm.addInternalFrameListener(this);
                    }
                    if(c < 1){
                        JOptionPane.showMessageDialog(null, "ACESSO NEGADO!");
                    }
                }else{
                    if(jlOpcoes.getSelectedValue().equals("Log")){
                        if(!flagAbrirlog && c > 2){
                            GUIAAlog guil = new GUIAAlog();
                            jdpAreaAdm.add(guil);
                            guil.setVisible(true);
                            flagAbrirlog = true;
                            guil.addInternalFrameListener(this);
                        }
                        if(c < 3){
                            JOptionPane.showMessageDialog(null, "ACESSO NEGADO!");
                        }
                    }
                }
            }
        }
    }
    
    private void setarUsuario(){
        user = jlUsername.getText();
    }
    
    private void jbtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCloseActionPerformed
        GUILogin guilog = new GUILogin();
        dispose();
        guilog.setVisible(true);
        user = null;
    }//GEN-LAST:event_jbtnCloseActionPerformed

    private void jlOpcoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlOpcoesMouseClicked
        abrirUsuario();
    }//GEN-LAST:event_jlOpcoesMouseClicked

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
            java.util.logging.Logger.getLogger(GUIAreaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAreaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAreaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAreaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAreaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnClose;
    private javax.swing.JDesktopPane jdpAreaAdm;
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
        if(e.getInternalFrame() instanceof GUIAAusuarios){
            flagAbrirUsuario = false;
        }
        if(e.getInternalFrame() instanceof GUIAAcadadm){
            flagAbrirCadAdmin = false;
        }
        if(e.getInternalFrame() instanceof GUIAAadm){
            flagAbrirAdm = false;
        }
        if(e.getInternalFrame() instanceof GUIAAlog){
            flagAbrirlog = false;
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
