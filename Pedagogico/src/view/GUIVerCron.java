package view;

import services.CronogramaService;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.AreaUService;
import util.DateVerif;

public class GUIVerCron extends javax.swing.JInternalFrame {
    DateVerif dv = new DateVerif();

   public GUIVerCron() {
        initComponents();
        preencher_Tabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtInfo = new javax.swing.JTable();

        setClosable(true);
        setTitle("Cronogramas");

        jtInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Curso", "Turma", "Módulo", "UC", "Professor", "Data Inicio", "Data Final", "Turno"
            }
        ));
        jScrollPane1.setViewportView(jtInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencher_Tabela(){
        CronogramaService cs = services.ServiceFactory.getCronogramaService();
        AreaUService aus = services.ServiceFactory.getAreaUService();
        DefaultTableModel dtm = (DefaultTableModel) jtInfo.getModel();
        try {
            ResultSet rs = cs.tabela_Cronograma();
            int c = 0, row = 1;
            
            while(rs.next()){
                String dataI = "", dataF = "", t = "", uc = "", mod = "", curso = "", prof = "", turma = "";
                int ref_uc = 0, ref_mod = 0, ref_cron = 0, ref_prof = 0, ref_curso = 0, ref_turma = 0;
                dtm.setNumRows(row);
                
                dataI = dv.DateSQLtoUtil(rs.getDate("data_inicio"));
                dataF = dv.DateSQLtoUtil(rs.getDate("data_fim"));
                
                if(rs.getString("turno").equals("M")){
                    t = "MANHÃ";
                }else{
                    if(rs.getString("turno").equals("T")){
                        t = "TARDE";
                    }else{
                        t = "NOITE";
                    }
                }
                
                ref_prof = rs.getInt("id_professor");
                ref_uc = rs.getInt("id_uc");
                ref_cron = rs.getInt("id_cronograma");
                ref_curso = cs.curso_TC(ref_cron);
                ref_mod = cs.curso_TM(ref_cron);
                ref_turma = cs.curso_TT(ref_cron);
                
                curso = aus.getCurso(ref_curso);
                uc = cs.getUnidadeCurricular(ref_uc);
                mod = cs.getMod(ref_mod);
                prof = cs.getProfessor(ref_prof);
                turma = cs.getTurma(ref_turma);
                
                jtInfo.setValueAt(curso, c, 0);
                jtInfo.setValueAt(turma, c, 1);
                jtInfo.setValueAt(mod, c, 2);
                jtInfo.setValueAt(uc, c, 3);
                jtInfo.setValueAt(prof, c, 4);
                jtInfo.setValueAt(dataI, c, 5);
                jtInfo.setValueAt(dataF, c, 6);
                jtInfo.setValueAt(t, c, 7);
                
                c++;
                row = row + 1;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtInfo;
    // End of variables declaration//GEN-END:variables
}
