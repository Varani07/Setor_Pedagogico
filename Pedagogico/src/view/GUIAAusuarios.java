package view;


import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.UsuarioVO;
import org.jasypt.util.password.rfc2307.RFC2307SSHAPasswordEncryptor;
import services.AdmService;
import services.ServiceFactory;
import services.UsuarioService;
import util.Utilidades;


public class GUIAAusuarios extends javax.swing.JInternalFrame{
    GUISignin signin = new GUISignin();
    Utilidades util = new Utilidades();
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"ID", "USER", "EMAIL", "CPF"}
    );

    public GUIAAusuarios() {
        initComponents();
        fillTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpTabela = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtData = new javax.swing.JTable();
        jlpPesquisa = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jcbItemPesquisa = new javax.swing.JComboBox<>();
        jlpDados = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbtnDelete = new javax.swing.JButton();
        jbtnAlterar = new javax.swing.JButton();
        jbtnAltSenha = new javax.swing.JButton();
        jlErro = new javax.swing.JLabel();
        jftfCpf = new javax.swing.JFormattedTextField();
        jlInv = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Usuários");

        jtData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "USER", "EMAIL", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtData);

        jlpTabela.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpTabelaLayout = new javax.swing.GroupLayout(jlpTabela);
        jlpTabela.setLayout(jlpTabelaLayout);
        jlpTabelaLayout.setHorizontalGroup(
            jlpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jlpTabelaLayout.setVerticalGroup(
            jlpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Pesquisa:");

        jtfPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyReleased(evt);
            }
        });

        jcbItemPesquisa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbItemPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Usuário", "Cpf" }));

        jlpPesquisa.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jtfPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpPesquisa.setLayer(jcbItemPesquisa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpPesquisaLayout = new javax.swing.GroupLayout(jlpPesquisa);
        jlpPesquisa.setLayout(jlpPesquisaLayout);
        jlpPesquisaLayout.setHorizontalGroup(
            jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpPesquisaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbItemPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpPesquisaLayout.setVerticalGroup(
            jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpPesquisaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jlpPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbItemPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("ID:");

        jtfID.setEditable(false);
        jtfID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfID.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Username:");

        jtfUsername.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfUsernameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("E-mail:");

        jtfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfEmailKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Cpf:");

        jtfSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Senha");

        jbtnDelete.setBackground(new java.awt.Color(255, 0, 0));
        jbtnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnDelete.setForeground(new java.awt.Color(0, 0, 0));
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jbtnDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnDeleteKeyPressed(evt);
            }
        });

        jbtnAlterar.setBackground(new java.awt.Color(255, 102, 0));
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

        jbtnAltSenha.setBackground(new java.awt.Color(51, 51, 51));
        jbtnAltSenha.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jbtnAltSenha.setForeground(new java.awt.Color(0, 255, 255));
        jbtnAltSenha.setText("Alterar Senha");
        jbtnAltSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAltSenhaActionPerformed(evt);
            }
        });
        jbtnAltSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAltSenhaKeyPressed(evt);
            }
        });

        jlErro.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jftfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jftfCpfKeyReleased(evt);
            }
        });

        jlInv.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jlInv.setForeground(new java.awt.Color(255, 0, 0));

        jlpDados.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfUsername, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtfSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jbtnDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jbtnAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jbtnAltSenha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jftfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlInv, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jlInv, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnAltSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addComponent(jbtnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnDelete))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpDadosLayout.createSequentialGroup()
                                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addContainerGap())
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAltSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnAlterar)
                            .addComponent(jbtnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, 5, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpPesquisa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpTabela, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlpDados)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpDados)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillTable(){
        try {
            AdmService as = ServiceFactory.getAdmService();
            
            ArrayList<UsuarioVO> usulist = new ArrayList<>();
            usulist = as.fillTable();
            
            for(int i = 0; i < usulist.size(); i++){
                dtm.addRow(new String[]{
                    String.valueOf(usulist.get(i).getId_usuario()),
                    String.valueOf(usulist.get(i).getLogin()),
                    String.valueOf(usulist.get(i).getEmail()),
                    String.valueOf(usulist.get(i).getCpf()),
                });
            }
            jtData.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar tabela com os usuários! GUIAAusuarios" + e.getMessage());
        }
    }
    private void filterTable(){
        try {
            if(jtfPesquisa.getText().isEmpty()){
                fillTable();
            }else{
                AdmService as = ServiceFactory.getAdmService();
                String pesquisa = (String) jcbItemPesquisa.getSelectedItem();
                String query = "";
                if(pesquisa.equals("ID")){
                    query = "id_usuario = " + jtfPesquisa.getText();
                }else{
                    if(pesquisa.equals("Usuário")){
                        query = "login LIKE '%" + jtfPesquisa.getText() + "%'";
                    }else{
                        query = "cpf LIKE '%" + jtfPesquisa.getText() + "%'";
                    }
                }
                ArrayList<UsuarioVO> arrayusu = new ArrayList<>();
                arrayusu = as.filterTable(query);
                
                for(int i = 0; i < arrayusu.size(); i++){
                    dtm.addRow(new String[]{
                        String.valueOf(arrayusu.get(i).getId_usuario()),
                        String.valueOf(arrayusu.get(i).getLogin()),
                        String.valueOf(arrayusu.get(i).getEmail()),
                        String.valueOf(arrayusu.get(i).getCpf()),
                    });
                }
                jtData.setModel(dtm);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao filtrar tabela com os usuários! GUIAAusuarios" + e.getMessage());
        }
    }
    private void cleanScreen(){
        dtm.setRowCount(0);
    }
    private void catchdata(){
        jtfID.setText((String) jtData.getValueAt(jtData.getSelectedRow(), 0));
        jtfUsername.setText((String) jtData.getValueAt(jtData.getSelectedRow(), 1));
        jtfEmail.setText((String) jtData.getValueAt(jtData.getSelectedRow(), 2));
        jftfCpf.setText((String) jtData.getValueAt(jtData.getSelectedRow(), 3));
    }
    
    private void alterarDadosUsuario(){
        if(jtfUsername.getText().isEmpty() || jtfEmail.getText().isEmpty() || jftfCpf.getText().isEmpty()){
            jlErro.setText("Preencha todos os campos!");
        }else{
            try {
                UsuarioVO uvo = new UsuarioVO();
            
                uvo.setLogin(jtfUsername.getText());
                uvo.setEmail(jtfEmail.getText());
                uvo.setCpf(jftfCpf.getText());
                uvo.setId_usuario(Integer.parseInt(jtfID.getText()));
            
                if(!signin.loopingUser(jtfUsername.getText())){
                    JOptionPane.showMessageDialog(null, "Nome de usuário inválido!");
                    jtfUsername.setText(null);
                }else{
                    if(!signin.loopingEmail(jtfEmail.getText())){
                        JOptionPane.showMessageDialog(null, "Endereço de e-mail inválido!");
                        jtfEmail.setText(null);
                    }else{
                        if(!signin.loopingCpf(jftfCpf.getText())){
                            JOptionPane.showMessageDialog(null, "Cpf inválido!");
                            jftfCpf.setText(null);
                        }else{
                            UsuarioService us = ServiceFactory.getUsuarioService();
                            us.alterarDadosUsuarios(uvo);
                            try{
                                Date d = new Date();
                                SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                                AdmService as = ServiceFactory.getAdmService();
                                String log = 
                                    GUIAreaAdm.jlUsername.getText().toUpperCase() 
                                        + " ALTEROU USUÁRIO " 
                                        + jtfUsername.getText().toUpperCase()
                                        + " "
                                        + formatd.format(d);
                                    as.log(log);
                            } catch (Exception e){
                                JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
                            }
                        }
                    }
                }
                
            } catch (SQLException e) {
                if(e.getMessage().equals("Duplicate entry '" + jtfUsername.getText() + "' for key 'login'")){
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
                JOptionPane.showMessageDialog(null, "Erro ao alterar dados do usuário ", "ERRO", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }
    
    private void alterarSenhaUsuario(){
        if(jtfSenha.getText().isEmpty()){
            jlErro.setText("Preencha o campo!");
        }else{
            try {
                UsuarioVO uvo = new UsuarioVO();
                RFC2307SSHAPasswordEncryptor encrypt = new RFC2307SSHAPasswordEncryptor();
                
                uvo.setId_usuario(Integer.parseInt(jtfID.getText()));
                uvo.setSenha(encrypt.encryptPassword(jtfSenha.getText().toLowerCase()));
                
                UsuarioService us = ServiceFactory.getUsuarioService();
                us.alterarSenhaUsuario(uvo);
                try{
                    Date d = new Date();
                    SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                    AdmService as = ServiceFactory.getAdmService();
                    String log = 
                        GUIAreaAdm.jlUsername.getText().toUpperCase() 
                            + " ALTEROU SENHA USUÁRIO " 
                            + jtfUsername.getText().toUpperCase()
                            + " "
                            + formatd.format(d);
                        as.log(log);
                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar senha do usuário!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void deletarUsuario(){
        try {
            UsuarioVO uvo = new UsuarioVO();
            uvo.setId_usuario(Integer.parseInt(jtfID.getText()));
            UsuarioService us = ServiceFactory.getUsuarioService();
            us.deletarUsuario(uvo);
            try{
                Date d = new Date();
                SimpleDateFormat formatd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                AdmService as = ServiceFactory.getAdmService();
                String log = 
                    GUIAreaAdm.jlUsername.getText().toUpperCase() 
                        + " DELETOU USUÁRIO " 
                        + jtfUsername.getText().toUpperCase()
                        + " "
                        + formatd.format(d);
                as.log(log);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao registrar log!" + e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuário!" + e.getMessage());
        }
    }
    
    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja deletar este usuário?", "AVISO DE EXCLUSÃO", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
            deletarUsuario();
            util.limparTelalp(jlpPesquisa);
            util.limparTelalp(jlpDados);
            cleanScreen();
            fillTable();
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnDeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnDeleteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(JOptionPane.showConfirmDialog(null, "Deseja deletar este usuário?", "AVISO DE EXCLUSÃO", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
                deletarUsuario();
                util.limparTelalp(jlpPesquisa);
                util.limparTelalp(jlpDados);
                cleanScreen();
                fillTable();
            }
        }
    }//GEN-LAST:event_jbtnDeleteKeyPressed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        alterarDadosUsuario();
        util.limparTelalp(jlpPesquisa);
        util.limparTelalp(jlpDados);
        cleanScreen();
        fillTable();
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jbtnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAlterarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterarDadosUsuario();
            util.limparTelalp(jlpPesquisa);
            util.limparTelalp(jlpDados);
            cleanScreen();
            fillTable();
        }
    }//GEN-LAST:event_jbtnAlterarKeyPressed

    private void jtfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyReleased
        cleanScreen();
        filterTable();
    }//GEN-LAST:event_jtfPesquisaKeyReleased

    private void jtDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDataMouseClicked
        catchdata();
    }//GEN-LAST:event_jtDataMouseClicked

    private void jbtnAltSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAltSenhaActionPerformed
        alterarSenhaUsuario();
        util.limparTelalp(jlpDados);
        cleanScreen();
        fillTable();
    }//GEN-LAST:event_jbtnAltSenhaActionPerformed

    private void jbtnAltSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAltSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            alterarSenhaUsuario();
            util.limparTelalp(jlpDados);
            cleanScreen();
            fillTable();
        }
    }//GEN-LAST:event_jbtnAltSenhaKeyPressed

    private void jtfUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsernameKeyReleased
        if(!signin.loopingUser(jtfUsername.getText())){
            jlInv.setText("Nome de usuário inválido!");
        }else{
            jlInv.setText(null);
        }
    }//GEN-LAST:event_jtfUsernameKeyReleased

    private void jtfEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEmailKeyReleased
        if(!signin.loopingEmail(jtfEmail.getText())){
            jlInv.setText("Endereço de E-mail inválido!");
        }else{
            jlInv.setText(null);
        }
    }//GEN-LAST:event_jtfEmailKeyReleased

    private void jftfCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftfCpfKeyReleased
        if(!signin.loopingCpf(jftfCpf.getText())){
            jlInv.setText("Cpf inválido!");
        }else{
            jlInv.setText(null);
        }
    }//GEN-LAST:event_jftfCpfKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAltSenha;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JComboBox<String> jcbItemPesquisa;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JLabel jlErro;
    private javax.swing.JLabel jlInv;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JLayeredPane jlpPesquisa;
    private javax.swing.JLayeredPane jlpTabela;
    private javax.swing.JTable jtData;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JTextField jtfUsername;
    // End of variables declaration//GEN-END:variables

    
}
