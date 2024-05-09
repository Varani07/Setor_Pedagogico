package view;

import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AdmVO;
import services.AdmService;
import services.ServiceFactory;
import util.Utilidades;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import org.jasypt.util.password.rfc2307.RFC2307SSHAPasswordEncryptor;

public class GUIAAadm extends javax.swing.JInternalFrame implements InternalFrameListener{
    GUISignin sign = new GUISignin();
    Utilidades util = new Utilidades();
    private boolean flagAbrirIS = false;

    public GUIAAadm() {
        initComponents();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jlpPesquisa = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbSearchPerm = new javax.swing.JCheckBox();
        jcbSearchCargo = new javax.swing.JComboBox<>();
        jlSearchCargo = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtData = new javax.swing.JTable();
        jlpDados = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jcbVerSenha = new javax.swing.JCheckBox();
        jbtnTrocarSenha = new javax.swing.JButton();
        jlCargo = new javax.swing.JLabel();
        jcbPerm = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jcbCargo = new javax.swing.JComboBox<>();
        jbtnDeletar = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnInfSenha = new javax.swing.JButton();
        jlErro = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Admnistradores");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearch.setToolTipText("");
        jtfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSearchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Perm:");

        jcbSearchPerm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbSearchPermMouseClicked(evt);
            }
        });

        jcbSearchCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbSearchCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "0", "1", "2", "3" }));
        jcbSearchCargo.setEnabled(false);
        jcbSearchCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSearchCargoActionPerformed(evt);
            }
        });

        jlSearchCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlSearchCargo.setText("Cargo:");
        jlSearchCargo.setEnabled(false);

        jlpPesquisa.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jtfSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jcbSearchPerm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jcbSearchCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jlSearchCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpPesquisaLayout = new javax.swing.GroupLayout(jlpPesquisa);
        jlpPesquisa.setLayout(jlpPesquisaLayout);
        jlpPesquisaLayout.setHorizontalGroup(
            jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpPesquisaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSearchPerm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlSearchCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSearchCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jlpPesquisaLayout.setVerticalGroup(
            jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpPesquisaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlSearchCargo)
                        .addComponent(jcbSearchCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcbSearchPerm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))))
        );

        jtData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "USER", "PERM", "CARGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtData);

        jLayeredPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("ID:");

        jtfID.setEditable(false);
        jtfID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfID.setToolTipText("");
        jtfID.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Username:");

        jtfUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfUser.setToolTipText("");
        jtfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfUserKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Senha:");

        jpfSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jcbVerSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbVerSenhaMouseClicked(evt);
            }
        });

        jbtnTrocarSenha.setBackground(new java.awt.Color(255, 255, 0));
        jbtnTrocarSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnTrocarSenha.setForeground(new java.awt.Color(0, 0, 0));
        jbtnTrocarSenha.setText("Trocar Senha");
        jbtnTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTrocarSenhaActionPerformed(evt);
            }
        });
        jbtnTrocarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnTrocarSenhaKeyPressed(evt);
            }
        });

        jlCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlCargo.setText("Cargo:");
        jlCargo.setEnabled(false);

        jcbPerm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbPermMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Perm:");

        jcbCargo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3" }));
        jcbCargo.setEnabled(false);
        jcbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCargoActionPerformed(evt);
            }
        });

        jbtnDeletar.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDeletar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnDeletar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDeletar.setText("Deletar");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });
        jbtnDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnDeletarKeyPressed(evt);
            }
        });

        jbtnAlterar.setBackground(new java.awt.Color(255, 153, 51));
        jbtnAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });
        jbtnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAlterarKeyPressed(evt);
            }
        });

        jbtnInfSenha.setBackground(new java.awt.Color(255, 255, 255));
        jbtnInfSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnInfSenha.setForeground(new java.awt.Color(0, 0, 0));
        jbtnInfSenha.setText("?");
        jbtnInfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInfSenhaActionPerformed(evt);
            }
        });

        jlErro.setForeground(new java.awt.Color(255, 0, 0));

        jlpDados.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jpfSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcbVerSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jbtnTrocarSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcbPerm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jcbCargo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jbtnDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jbtnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jbtnInfSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbVerSenha))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPerm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jbtnTrocarSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnInfSenha))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jbtnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDeletar)))))
                .addContainerGap())
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbVerSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAlterar)
                            .addComponent(jbtnDeletar))
                        .addContainerGap())
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jlCargo)
                                                .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jlpDadosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbPerm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtnTrocarSenha)
                                .addComponent(jbtnInfSenha)))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpDados)
                    .addComponent(jLayeredPane2)
                    .addComponent(jlpPesquisa))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirInfoSenha() throws PropertyVetoException{
        if(!flagAbrirIS){
            InfoSenha infs = new InfoSenha();
            jlpDados.add(infs);
            infs.setVisible(true);
            infs.setSelected(true);
            flagAbrirIS = true;
            infs.addInternalFrameListener(this);
        }
    }
    
    private void fillTable() {
        try {
            ArrayList<AdmVO> arvo = new ArrayList<>();
            AdmService as = ServiceFactory.getAdmService();
            arvo = as.fillAdmTable();
            DefaultTableModel dtm = (DefaultTableModel) jtData.getModel();
            dtm.setNumRows(WIDTH);
            for(AdmVO aVO : arvo){
                dtm.addRow(new Object[]{
                    aVO.getId_adm(),
                    aVO.getUser(),
                    aVO.isPerm(),
                    aVO.getCargo()
                }
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela com os Adms! GUIAAadm" + e.getMessage());
        }
    }
    
    private void filterTable(){
        try {
            if(jtfSearch.getText().isEmpty() && !jcbSearchPerm.isSelected()){
                fillTable();
            }else{
                AdmService as = ServiceFactory.getAdmService();
                String query = null;
            
                if(!jtfSearch.getText().isEmpty() && !jcbSearchPerm.isSelected()){
                    query = "user_adm LIKE '%" + jtfSearch.getText() + "%';";
                }else{
                    if(jtfSearch.getText().isEmpty() && jcbSearchPerm.isSelected() && jcbSearchCargo.getSelectedItem().equals("ALL")){
                        query = "perm = 1;";
                    }else{
                        if(jtfSearch.getText().isEmpty() && jcbSearchPerm.isSelected() && !jcbSearchCargo.getSelectedItem().equals("ALL")){
                            query = "cargo = " + jcbSearchCargo.getSelectedItem() + ";";
                        }else{
                            if(!jtfSearch.getText().isEmpty() && jcbSearchPerm.isSelected() && jcbSearchCargo.getSelectedItem().equals("ALL")){
                                query = "user_adm LIKE '%" + jtfSearch.getText() + "%' AND perm = 1;";
                            }else{
                                if(!jtfSearch.getText().isEmpty() && jcbSearchPerm.isSelected() && !jcbSearchCargo.getSelectedItem().equals("ALL")){
                                    query = "user_adm LIKE '%" + jtfSearch.getText() + "%' AND cargo = " + jcbCargo.getSelectedItem() + ";";
                                }
                            }
                        }
                    }
                }
                ArrayList<AdmVO> ala = as.filterAdmTable(query);
                DefaultTableModel dtm = (DefaultTableModel) jtData.getModel();
                dtm.setNumRows(WIDTH);
                for(AdmVO avo : ala){
                    dtm.addRow(new Object[]{
                        avo.getId_adm(),
                        avo.getUser(),
                        avo.isPerm(),
                        avo.getCargo()
                    });
                } 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar usuários!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void catchData(){
        jtfID.setText(jtData.getValueAt(jtData.getSelectedRow(), 0).toString());
        jtfUser.setText((String) jtData.getValueAt(jtData.getSelectedRow(), 1));
        String p = jtData.getValueAt(jtData.getSelectedRow(), 2).toString();
        if(p.equals("true")){
            jcbPerm.setSelected(true);
        }else{
            jcbPerm.setSelected(false);
        }
        jcbCargo.setSelectedItem(jtData.getValueAt(jtData.getSelectedRow(), 3).toString());
    }
    
    private void givePerm(){
        if(jcbPerm.isSelected()){
            jcbCargo.setEnabled(true);
            jlCargo.setEnabled(true);
            jcbCargo.setSelectedItem("1");
        }else{
            jcbCargo.setEnabled(false);
            jlCargo.setEnabled(false);
            jcbCargo.setSelectedItem("0");
        }
    }
    private void permC(){
        if(jcbPerm.isSelected() && jcbCargo.getSelectedItem().equals("0")){
            jcbCargo.setSelectedItem("1");
        }
    }
    
    private void giveSearchPerm(){
        if(jcbSearchPerm.isSelected()){
            jcbSearchCargo.setEnabled(true);
            jlSearchCargo.setEnabled(true);
            jcbSearchCargo.setSelectedItem("ALL");
        }else{
            jcbSearchCargo.setEnabled(false);
            jlSearchCargo.setEnabled(false);
            jcbSearchCargo.setSelectedItem("ALL");
        }
    }
    
    private void alterarAdm(){
        if(jtfUser.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nome de usuário inválido!");
        }else{
            try {
                AdmVO avo = new AdmVO();
                avo.setId_adm(Integer.parseInt(jtfID.getText()));
                avo.setUser(jtfUser.getText());
                if(jcbPerm.isSelected()){
                    avo.setPerm(true);
                }else{
                    avo.setPerm(false);
                }
                avo.setCargo(Integer.parseInt(jcbCargo.getSelectedItem().toString()));
                
                if(!sign.loopingUseradm(jtfUser.getText())){
                    JOptionPane.showMessageDialog(null, "Nome de usuário inválido!");
                    jtfUser.setText(null);
                }else{
                    AdmService as = ServiceFactory.getAdmService();
                    as.alterarDadosAdm(avo);
                    try{
                        Date d = new Date();
                        SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    
                        String log = 
                                GUIAreaAdm.jlUsername.getText().toUpperCase() 
                                + " ALTEROU ADM " 
                                + jtfUser.getText().toUpperCase()
                                + " "
                                + formatd.format(d);
                        as.log(log);
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
                    }
                }
                
            } catch (SQLException e) {
                if(e.getMessage().equals("Duplicate entry '" + jtfUser.getText() + "' for key 'user_adm'")){
                    JOptionPane.showMessageDialog(null, "Nome de usuário inválido!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados do Administrador", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void alterarSenhaAdm(){
        if(jpfSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Senha inválida!");
        }else{
            GUISignin gs = new GUISignin();
            boolean status = gs.loopingConfirm(jpfSenha.getText().toLowerCase());
            if(!status){
                JOptionPane.showMessageDialog(null, "Senha não cumpre os requisitos!");
            }else{
                try {
                    RFC2307SSHAPasswordEncryptor encrypt = new RFC2307SSHAPasswordEncryptor();
                    AdmVO avo = new AdmVO();
                    avo.setId_adm(Integer.parseInt(jtfID.getText()));
                    avo.setPassword(encrypt.encryptPassword(jpfSenha.getText().toLowerCase()));
                    
                    AdmService as = ServiceFactory.getAdmService();
                    as.alterarSenhaAdm(avo);
                    try{
                        Date d = new Date();
                        SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    
                        String log = 
                                GUIAreaAdm.jlUsername.getText().toUpperCase() 
                                + " ALTEROU SENHA ADM " 
                                + jtfUser.getText().toUpperCase()
                                + " "
                                + formatd.format(d);
                        as.log(log);
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar senha do adm!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    private void deletarAdm(){
        try {
            if(jtfID.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Selecione um Adm na tabela!", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
            }else{
                AdmService as = ServiceFactory.getAdmService();
                as.deletarAdm(Integer.parseInt(jtfID.getText()));
                try{
                    Date d = new Date();
                    SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    
                    String log = 
                        GUIAreaAdm.jlUsername.getText().toUpperCase() 
                            + " DELETOU ADM " 
                            + jtfUser.getText().toUpperCase()
                            + " "
                            + formatd.format(d);
                        as.log(log);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar adm!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void jbtnTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTrocarSenhaActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja alterar senha?", "AVISO!", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
            alterarSenhaAdm();
            util.limpaAreaAdmadm(jlpDados);
            util.limpaAreaAdmadm(jlpPesquisa);
        }
    }//GEN-LAST:event_jbtnTrocarSenhaActionPerformed

    private void jbtnTrocarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnTrocarSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(JOptionPane.showConfirmDialog(null, "Deseja alterar senha?", "AVISO!", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
                alterarSenhaAdm();
                util.limpaAreaAdmadm(jlpDados);
                util.limpaAreaAdmadm(jlpPesquisa);
            }
        }
    }//GEN-LAST:event_jbtnTrocarSenhaKeyPressed

    private void jtfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSearchKeyReleased
        filterTable();
    }//GEN-LAST:event_jtfSearchKeyReleased

    private void jcbSearchPermMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbSearchPermMouseClicked
        giveSearchPerm();
        filterTable();
    }//GEN-LAST:event_jcbSearchPermMouseClicked

    private void jcbPermMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbPermMouseClicked
        givePerm();
    }//GEN-LAST:event_jcbPermMouseClicked

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja deletar este acesso?", "AVISO!", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
            deletarAdm();
            util.limpaAreaAdmadm(jlpDados);
            util.limpaAreaAdmadm(jlpPesquisa);
        }
    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jbtnDeletarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnDeletarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(JOptionPane.showConfirmDialog(null, "Deseja deletar este acesso?", "AVISO!", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
                deletarAdm();
                util.limpaAreaAdmadm(jlpDados);
                util.limpaAreaAdmadm(jlpPesquisa);
            }
        }
    }//GEN-LAST:event_jbtnDeletarKeyPressed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        alterarAdm();
        util.limpaAreaAdmadm(jlpDados);
        util.limpaAreaAdmadm(jlpPesquisa);
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAlterarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterarAdm();
            util.limpaAreaAdmadm(jlpDados);
            util.limpaAreaAdmadm(jlpPesquisa);
        }
    }//GEN-LAST:event_jbtnAlterarKeyPressed

    private void jtDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDataMouseClicked
        try {
            AdmService as = ServiceFactory.getAdmService();
            int cargoAtual = as.permAlterarDados(GUIAreaAdm.jlUsername.getText());
            int cargoAlvo = Integer.parseInt(jtData.getValueAt(jtData.getSelectedRow(), 3).toString());
            
            if(cargoAtual <= cargoAlvo){
                JOptionPane.showMessageDialog(null, "Você não tem permissão para alterar os dados deste usuário!");
                util.limpaAreaAdmadm(jlpDados);
                util.limpaAreaAdmadm(jlpPesquisa);
            }else{
                catchData();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar dados da tabela!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jtDataMouseClicked

    private void jcbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCargoActionPerformed
        permC();
    }//GEN-LAST:event_jcbCargoActionPerformed

    private void jcbSearchCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSearchCargoActionPerformed
        filterTable();
    }//GEN-LAST:event_jcbSearchCargoActionPerformed

    private void jbtnInfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInfSenhaActionPerformed
        try {
            abrirInfoSenha();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(GUIAAcadadm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnInfSenhaActionPerformed

    private void jcbVerSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbVerSenhaMouseClicked
        if(jcbVerSenha.isSelected()){
            jpfSenha.setEchoChar((char)0);
        }else{
            jpfSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_jcbVerSenhaMouseClicked

    private void jtfUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUserKeyReleased
        if(!sign.loopingUseradm(jtfUser.getText())){
            jlErro.setText("!");
        }else{
            jlErro.setText(null);
        }
    }//GEN-LAST:event_jtfUserKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnInfSenha;
    private javax.swing.JButton jbtnTrocarSenha;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JCheckBox jcbPerm;
    private javax.swing.JComboBox<String> jcbSearchCargo;
    private javax.swing.JCheckBox jcbSearchPerm;
    private javax.swing.JCheckBox jcbVerSenha;
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlErro;
    private javax.swing.JLabel jlSearchCargo;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JLayeredPane jlpPesquisa;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTable jtData;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof InfoSenha){
            flagAbrirIS = false;
        }
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
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
