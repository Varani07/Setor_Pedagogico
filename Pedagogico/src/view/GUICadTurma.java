package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import services.AreaUService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import model.TurmaVO;
import services.ServiceFactory;
import util.DateToSql;
import util.LogUtil;
import util.SQLErrorMessage;
import util.Utilidades;

public class GUICadTurma extends javax.swing.JInternalFrame {
    SQLErrorMessage sem = new SQLErrorMessage();
    DateToSql dat = new DateToSql();
    LogUtil log = new LogUtil();
    Utilidades util = new Utilidades();

    public GUICadTurma() {
        initComponents();
        listarCursos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jcbCurso = new javax.swing.JComboBox<>();
        jlCurso = new javax.swing.JLabel();
        jlCurso1 = new javax.swing.JLabel();
        jcbTurno = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnCad = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Turma");
        setToolTipText("");

        jcbCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jlCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlCurso.setText("Curso:");

        jlCurso1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlCurso1.setText("Turno:");

        jcbTurno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANHÃ", "TARDE", "NOITE" }));

        jLayeredPane1.setLayer(jcbCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlCurso1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbTurno, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jlCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jlCurso1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCurso)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCurso1)
                    .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jbtnCad.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        jLayeredPane2.setLayer(jbtnCad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jbtnCad)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jbtnCad)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private void limparJcb(){
        jcbCurso.setSelectedIndex(0);
        jcbTurno.setSelectedIndex(0);
    }
    private void cadTurma(){
        TurmaVO tvo = new TurmaVO();
        AreaUService aus = ServiceFactory.getAreaUService();
            
        int ref = 0;
        try {
            ref = aus.refCurso((String) jcbCurso.getSelectedItem());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        tvo.setCurso(ref);
            
        Date d = new Date();
        SimpleDateFormat formatd = new SimpleDateFormat("yyyy");
        SimpleDateFormat formate = new SimpleDateFormat("yy");
        tvo.setAno_turma(formatd.format(d));
        
        String turn = "";
        if(jcbTurno.getSelectedItem().equals("MANHÃ")){
            turn = "M";
        }else{
            if(jcbTurno.getSelectedItem().equals("TARDE")){
                turn = "T";
            }else{
                if(jcbTurno.getSelectedItem().equals("NOITE")){
                    turn = "N";    
                }
            }
        }
        tvo.setTurno(turn);
            
        String sigla = ""; 
        try{
            sigla = aus.siglaCurso(jcbCurso.getSelectedItem().toString());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage() + " aqui!");
        }
            
        String nome = sigla + formate.format(d) + turn;
        tvo.setNome_turma(nome);
        try {
            aus.cadTurma(tvo);
            try{
                String logi = log.criarLogUsuario("criou", "turma", nome);
                aus.log(logi);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!");
        } catch (SQLException e) {
            if(e.getMessage().equals(sem.sqlError(nome, "nome_turma"))){
                JOptionPane.showMessageDialog(null, "Turma já existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jbtnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadActionPerformed
        cadTurma();
        limparJcb();
    }//GEN-LAST:event_jbtnCadActionPerformed

    private void jbtnCadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadTurma();
            limparJcb();
        }
    }//GEN-LAST:event_jbtnCadKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JButton jbtnCad;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbTurno;
    private javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlCurso1;
    // End of variables declaration//GEN-END:variables
}
