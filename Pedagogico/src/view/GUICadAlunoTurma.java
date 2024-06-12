package view;

import dao.AreaUDAO;
import java.awt.event.KeyEvent;
import services.AreaUService;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import util.LogUtil;

public class GUICadAlunoTurma extends javax.swing.JInternalFrame {
    LogUtil logu = new LogUtil();

    public GUICadAlunoTurma() {
        initComponents();
        preencher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jcbAluno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbTurma = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnInserir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Inserir Aluno Em Turma");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Aluno");

        jcbAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlunoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Curso");

        jcbCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Turma");

        jcbTurma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbTurma, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jcbAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbCurso, 0, 444, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(jcbTurma, 0, 444, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jcbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbtnInserir.setBackground(new java.awt.Color(0, 0, 0));
        jbtnInserir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
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

        jLayeredPane2.setLayer(jbtnInserir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jbtnInserir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbtnInserir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencher () {
        AreaUService aus = services.ServiceFactory.getAreaUService();
        int refCurso = 0; 
        try {
            ResultSet rs = aus.listaAlunos();
            while(rs.next()){
                jcbAluno.addItem(rs.getInt("id_aluno") + " // " + rs.getString("nome") + " " + rs.getString("sobrenome") + " // " + rs.getString("matricula"));
                refCurso = rs.getInt("curso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void alterarAluno(){
        AreaUService aus = services.ServiceFactory.getAreaUService();
        int refCurso = 0; 
        String inf = "";
        try {
            String infoAluno [] = jcbAluno.getSelectedItem().toString().split(" // ");
            refCurso = aus.getCursoA(Integer.parseInt(infoAluno[0]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            jcbCurso.addItem(aus.getCurso(refCurso));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            ResultSet rs = aus.getTurma(refCurso);
            String turno;
            while(rs.next()){
                if(rs.getString("turno").equals("M")){
                    turno = "Manhã";
                }else{
                    if(rs.getString("turno").equals("T")){
                        turno = "Tarde";
                    }else{
                        turno = "Noite";
                    }
                }
                jcbTurma.addItem(rs.getString("nome_turma") + " // " + rs.getString("ano") + " // " + turno);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void cleanjcbCurso(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbCurso.setModel(cbm);
    }
    
    private void cleanjcbTurma(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbTurma.setModel(cbm);
    }
    
    private void setTurma(){
        try {
            String [] est = jcbAluno.getSelectedItem().toString().split(" // ");
            String [] turma = jcbTurma.getSelectedItem().toString().split(" // ");
            AreaUService aus = services.ServiceFactory.getAreaUService();
            int ref = aus.getTurmaId(turma[0]);
            aus.cadTurmaA(ref, Integer.parseInt(est[0]));
            JOptionPane.showMessageDialog(null, "Aluno " + est[1] + " foi cadastrado a turma " + turma[0] + " com sucesso!");
            aus.log(logu.criarLogUsuario("adicionou", "aluno", est[1] + " a turma " + turma[0] + "!"));
            jcbAluno.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jbtnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInserirActionPerformed
        setTurma();
    }//GEN-LAST:event_jbtnInserirActionPerformed

    private void jbtnInserirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnInserirKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            setTurma();
        }
    }//GEN-LAST:event_jbtnInserirKeyPressed

    private void jcbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlunoActionPerformed
        cleanjcbCurso();
        cleanjcbTurma();
        alterarAluno();
    }//GEN-LAST:event_jcbAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbtnInserir;
    private javax.swing.JComboBox<String> jcbAluno;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbTurma;
    // End of variables declaration//GEN-END:variables
}
