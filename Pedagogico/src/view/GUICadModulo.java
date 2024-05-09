package view;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import services.AreaUService;
import java.sql.SQLException;
import model.ModVO;
import util.LogUtil;
import util.SQLErrorMessage;

public class GUICadModulo extends javax.swing.JInternalFrame {
    SQLErrorMessage util = new SQLErrorMessage();
    LogUtil lutil = new LogUtil();

    public GUICadModulo() {
        initComponents();
        listarCursos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlErro = new javax.swing.JLabel();
        jbtnCadastrar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbModulo = new javax.swing.JComboBox<>();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Modulo");

        jlErro.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));

        jbtnCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnCadastrar.setForeground(new java.awt.Color(0, 255, 0));
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

        jLayeredPane1.setLayer(jlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbtnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jbtnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jbtnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setText("Curso:");

        jcbCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setText("Modulo:");

        jcbModulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modulo A", "Modulo B", "Modulo C", "Modulo D" }));

        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbModulo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jcbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escolha um Curso e um Modulo para criar");

        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpar(){
        jcbCurso.setSelectedIndex(0);
        jcbModulo.setSelectedIndex(0);
    }
    
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
    private void cadastrarM(){
        String mod = jcbModulo.getSelectedItem().toString() + " (" + jcbCurso.getSelectedItem().toString() + ")";
            
        try {
            int ref = 0;
            AreaUService aus = services.ServiceFactory.getAreaUService();
            
            try {
                ref = aus.refCurso(jcbCurso.getSelectedItem().toString().toUpperCase());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            ModVO mvo = new ModVO();
            mvo.setNome_modulo(mod);
            mvo.setCurso(ref);
            
            aus.cadastrarMod(mvo);
            try{
                String log = lutil.criarLogUsuario("criou", "modulo", mod);
                aus.log(log);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Modulo Cadastrado com Sucesso!", "Parabéns!", JOptionPane.INFORMATION_MESSAGE);
                
        } catch (SQLException e) {
            if(e.getMessage().equals(util.sqlError(mod, "nome_modulo"))){
                JOptionPane.showMessageDialog(null, mod + " já existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar o " + jcbModulo.getSelectedItem()
        + " do Curso " + jcbCurso.getSelectedItem() + "?", "AVISO", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
            cadastrarM();
            limpar();
        }
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(JOptionPane.showConfirmDialog(null, "Deseja cadastrar o " + jcbModulo.getSelectedItem()
            + " do Curso " + jcbCurso.getSelectedItem() + "?", "AVISO", JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION){
                cadastrarM();
                limpar();
            }
        }
    }//GEN-LAST:event_jbtnCadastrarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbModulo;
    private javax.swing.JLabel jlErro;
    // End of variables declaration//GEN-END:variables
}
