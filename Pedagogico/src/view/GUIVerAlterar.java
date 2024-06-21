package view;

import javax.swing.DefaultComboBoxModel;
import services.AreaUService;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import util.LogUtil;
import util.LoopingVerification;

public class GUIVerAlterar extends javax.swing.JInternalFrame {
    String select = "< selecione >";
    static String cpfD = "", nome = "", seNum = "", seNome = "", selected = "", sec = "", tabua = "";
    LoopingVerification loop = new LoopingVerification();
    LogUtil logu = new LogUtil();

    public GUIVerAlterar() {
        initComponents();
        preencher();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jcbPerson = new javax.swing.JComboBox<>();
        jcbData = new javax.swing.JComboBox<>();
        jbtnPesquisar = new javax.swing.JButton();
        jtfInfo = new javax.swing.JTextField();
        jftfInfo = new javax.swing.JFormattedTextField();
        jbtnAlterar = new javax.swing.JButton();
        jcbVer = new javax.swing.JComboBox<>();
        jftfCelular = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("Alterar Info");

        jcbPerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPersonActionPerformed(evt);
            }
        });

        jcbData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jbtnPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnPesquisar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnPesquisar.setForeground(new java.awt.Color(255, 255, 0));
        jbtnPesquisar.setText("Pesquisar");
        jbtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPesquisarActionPerformed(evt);
            }
        });

        jtfInfo.setEnabled(false);

        try {
            jftfInfo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfInfo.setEnabled(false);

        jbtnAlterar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAlterar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnAlterar.setForeground(new java.awt.Color(255, 255, 0));
        jbtnAlterar.setText("Alterar");
        jbtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarActionPerformed(evt);
            }
        });

        jcbVer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            jftfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCelular.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbData, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbVer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 158, Short.MAX_VALUE)
                        .addComponent(jtfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jftfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jftfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbData, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPesquisar)
                    .addComponent(jcbVer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jftfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPesquisarActionPerformed
        if(!jcbVer.getSelectedItem().equals(this.select) && !jcbData.getSelectedItem().equals(this.select)){
            pesquisar();
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos superiores para conseguir pesquisar!");
        }
    }//GEN-LAST:event_jbtnPesquisarActionPerformed

    private void jbtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarActionPerformed
        if(!jtfInfo.isEnabled() && !jftfCelular.isEnabled() && !jftfInfo.isEnabled()){
            JOptionPane.showMessageDialog(null, "Pesquise algo antes!");
        }else{
            alterar();
            jtfInfo.setText(null);
            jftfCelular.setText(null);
            jftfInfo.setText(null);
            cpfD = "";
            nome = "";
            seNum = "";
            seNome = ""; 
            selected = "";
            sec = "";
            tabua = "";
            jcbPerson.setSelectedIndex(0);
            jcbData.setSelectedIndex(0);
            if(jtfInfo.isEnabled()){
                jtfInfo.setEnabled(false);
            }
            if(jftfCelular.isEnabled()){
                jftfCelular.setEnabled(false);
            }
            if(jftfInfo.isEnabled()){
                jftfInfo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jbtnAlterarActionPerformed

    private void jcbPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPersonActionPerformed
        preencher_Data();
        preencher_Ver();
    }//GEN-LAST:event_jcbPersonActionPerformed

    private void preencher(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbPerson.setModel(cbm);
        jcbPerson.addItem(this.select);
        jcbPerson.addItem("ALUNO");
        jcbPerson.addItem("PROFESSOR");
        jcbPerson.addItem("R. LEGAL");
        jcbPerson.addItem("R. FINANCEIRO");
    }
    private void preencher_Data(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbData.setModel(cbm);
        jcbData.addItem(this.select);
        if(!jcbPerson.getSelectedItem().equals(this.select)){
            if(jcbPerson.getSelectedItem().equals("R. FINANCEIRO")){
                jcbData.addItem("Nome");
                jcbData.addItem("Cpf");
            }else{
                jcbData.addItem("Nome");
                jcbData.addItem("Sobrenome");
                jcbData.addItem("Email");
                jcbData.addItem("Cpf");
                jcbData.addItem("Endereço");
                jcbData.addItem("Número Residencial");
                jcbData.addItem("Bairro");
                jcbData.addItem("Cidade");
                jcbData.addItem("Celular");
            }
        }
    }
    private void preencher_Ver(){
        DefaultComboBoxModel cbm = new DefaultComboBoxModel();
        cbm.removeAllElements();
        jcbVer.setModel(cbm);
        jcbVer.addItem(this.select);
        if(!jcbPerson.getSelectedItem().equals(this.select)){
            try {
                String param = "", tab = "", where = ";";
                AreaUService aus = services.ServiceFactory.getAreaUService();
                
                if(jcbPerson.getSelectedItem().equals("ALUNO")){
                    tab = "alunos";
                }else{
                    if(jcbPerson.getSelectedItem().equals("PROFESSOR")){
                        tab = "professores";
                    }else{
                        if(jcbPerson.getSelectedItem().equals("R. LEGAL")){
                            tab = "responsavel_legal";
                        }else{
                            if(jcbPerson.getSelectedItem().equals("R. FINANCEIRO")){
                                tab = "representante_financeiro";
                            }
                        }
                    }
                }
            
                if(jcbPerson.getSelectedItem().equals("R. FINANCEIRO")){
                    param = "nome, cpf";
                }else{
                    param = "nome, sobrenome, cpf";
                }
                
                ResultSet inf = aus.preencher_VerInfo(param, tab, where);
                while(inf.next()){
                    if(jcbPerson.getSelectedItem().equals("R. FINANCEIRO")){
                        jcbVer.addItem(inf.getString("nome") + " // " + inf.getString("cpf"));
                    }else{
                        jcbVer.addItem(inf.getString("nome") + " " + inf.getString("sobrenome") + " // " + inf.getString("cpf"));
                    }
                }
            } catch (Exception e) {
            }
        }
    }
    private void pesquisar(){
        String param = "", tab = "", where = "";
        
        if(jcbPerson.getSelectedItem().equals("ALUNO")){
            tab = "alunos";
        }else{
            if(jcbPerson.getSelectedItem().equals("PROFESSOR")){
                tab = "professores";
            }else{
                if(jcbPerson.getSelectedItem().equals("R. LEGAL")){
                    tab = "responsavel_legal";
                }else{
                    if(jcbPerson.getSelectedItem().equals("R. FINANCEIRO")){
                        tab = "representante_financeiro";
                    }
                }
            }
        }
        if(jcbPerson.getSelectedItem().equals("R. FINANCEIRO")){
            this.seNome = "1";
        }else{
            this.seNome = "2";
        }
        
        if(jcbData.getSelectedItem().equals("Nome")){
            param = "nome";
        }else{
            if(jcbData.getSelectedItem().equals("Sobrenome")){
                param = "sobrenome";
            }else{
                if(jcbData.getSelectedItem().equals("Email")){
                    param = "email";
                }else{
                    if(jcbData.getSelectedItem().equals("Cpf")){
                        param = "cpf";
                    }else{
                        if(jcbData.getSelectedItem().equals("Endereço")){
                            param = "endereco";
                        }else{
                            if(jcbData.getSelectedItem().equals("Número Residencial")){
                                param = "num";
                            }else{
                                if(jcbData.getSelectedItem().equals("Bairro")){
                                    param = "bairro";
                                }else{
                                    if(jcbData.getSelectedItem().equals("Cidade")){
                                        param = "cidade";
                                    }else{
                                        if(jcbData.getSelectedItem().equals("Celular")){
                                            param = "celular";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        String [] cpf = {""};
        cpf = jcbVer.getSelectedItem().toString().split(" // ");
        String cpfS = "";
        cpfS = cpf[1];
        where = " WHERE cpf = '" + cpfS + "';";
        
        this.nome = cpf[0];
        this.cpfD = cpfS;
        this.selected = param;
        this.sec = jcbData.getSelectedItem().toString();
        this.tabua = tab;
        
        try {
            AreaUService aus = services.ServiceFactory.getAreaUService();
            ResultSet rs = aus.preencher_VerInfo(param, tab, where);
            while(rs.next()){
                if(jcbData.getSelectedItem().equals("Celular")){
                    jtfInfo.setEnabled(false);
                    jtfInfo.setText(null);
                    jftfInfo.setText(null);
                    jftfCelular.setEnabled(true);
                    
                    jftfCelular.setText(rs.getString(param));
                }else{
                    jftfCelular.setEnabled(false);
                    if(jcbData.getSelectedItem().equals("Cpf")){
                        jtfInfo.setText(null);
                        jftfCelular.setText(null);
                        jtfInfo.setEnabled(false);
                        jftfInfo.setEnabled(true);
                        
                        jftfInfo.setText(rs.getString(param));
                    }else{
                        jftfInfo.setEnabled(false);
                        if(jcbData.getSelectedItem().equals("Número Residencial")){
                            jftfCelular.setText(null);
                            jftfInfo.setText(null);
                            jtfInfo.setEnabled(true);
                            
                            this.seNum = "1";
                            jtfInfo.setText(Integer.toString(rs.getInt(param)));
                        }else{
                            jftfCelular.setText(null);
                            jftfInfo.setText(null);
                            jtfInfo.setEnabled(true);
                            
                            this.seNum = "2";
                            jtfInfo.setText(rs.getString(param));
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }
    private void alterar (){
        boolean ok = false;
        String def = "";
        if(jtfInfo.isEnabled()){
            def = jtfInfo.getText();
            if(this.selected.equals("nome")){
                if(this.seNome.equals("1")){
                    if(!loop.loopingLimiteChar(jtfInfo.getText(), 100)){
                        ok = true;
                    }
                }else{
                    if(this.seNome.equals("2")){
                        if(!loop.loopingLimiteChar(jtfInfo.getText(), 50)){
                            ok = true;
                        }
                    }
                }
            }else{
                if(this.selected.equals("sobrenome")){
                    if(!loop.loopingLimiteChar(jtfInfo.getText(), 50)){
                        ok = true;
                    }
                }else{
                    if(this.selected.equals("email")){
                        if(!loop.loopingEmail(jtfInfo.getText())){
                            ok = true;
                        }
                        if(!loop.loopingLimiteChar(jtfInfo.getText(), 50)){
                            ok = true;
                        }
                    }else{
                        if(this.selected.equals("endereco")){
                            if(!loop.loopingLimiteChar(jtfInfo.getText(), 50)){
                                ok = true;
                            }
                        }else{
                            if(this.selected.equals("bairro")){
                                if(!loop.loopingLimiteChar(jtfInfo.getText(), 25)){
                                    ok = true;
                                }
                            }else{
                                if(this.selected.equals("cidade")){
                                    if(!loop.loopingLimiteChar(jtfInfo.getText(), 30)){
                                        ok = true;
                                    }
                                }else{
                                    if(this.selected.equals("num")){
                                        if(!loop.loopingNumjtf(jtfInfo.getText(), 6)){
                                            ok = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }else{
            if(jftfInfo.isEnabled()){
                def = jftfInfo.getText();
                if(this.selected.equals("cpf")){
                    if(!loop.loopingNumjftf(jftfInfo.getText())){
                        ok = true;
                    }
                }
            }else{
                if(jftfCelular.isEnabled()){
                    def = jftfCelular.getText();
                    if(this.selected.equals("celular")){
                        if(!loop.loopingNumjftf(jftfCelular.getText())){
                            ok = true;
                        }
                    }
                }
            }
        }
        if(ok){
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }else{
            try {
                AreaUService aus = services.ServiceFactory.getAreaUService();
                aus.infoUpdate(this.tabua, this.selected, this.cpfD, def);
                aus.log(logu.criarLogUsuario("alterou", this.sec + " de ", this.nome + " // " + this.cpfD));
                JOptionPane.showMessageDialog(null, "ALTERAÇÃO FEITA COM SUCESSO!");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAlterar;
    private javax.swing.JButton jbtnPesquisar;
    private javax.swing.JComboBox<String> jcbData;
    private javax.swing.JComboBox<String> jcbPerson;
    private javax.swing.JComboBox<String> jcbVer;
    private javax.swing.JFormattedTextField jftfCelular;
    private javax.swing.JFormattedTextField jftfInfo;
    private javax.swing.JTextField jtfInfo;
    // End of variables declaration//GEN-END:variables
}
