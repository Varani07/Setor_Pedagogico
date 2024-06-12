package view;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.ProfessorVO;
import services.AreaUService;
import util.CalcularIdade;
import util.DateToSql;
import util.LogUtil;
import util.LoopingVerification;
import util.SQLErrorMessage;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GUICadProf extends javax.swing.JInternalFrame {
    LoopingVerification loop = new LoopingVerification();
    SQLErrorMessage sqlerro = new SQLErrorMessage();
    LogUtil logu = new LogUtil();
    CalcularIdade idade = new CalcularIdade();
    DateToSql dts = new DateToSql();
    
    private static int idade_prof = 0;

    public GUICadProf() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgGenero = new javax.swing.ButtonGroup();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jbtnCadastrar1 = new javax.swing.JButton();
        pjlErro = new javax.swing.JLabel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLabel69 = new javax.swing.JLabel();
        pjtfNome = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        pjftfCelular = new javax.swing.JFormattedTextField();
        jLabel71 = new javax.swing.JLabel();
        pjtfEmail = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        pjftfDataNasc = new javax.swing.JFormattedTextField();
        jLabel73 = new javax.swing.JLabel();
        pjftfCpf = new javax.swing.JFormattedTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        pjtfSobrenome = new javax.swing.JTextField();
        pjrbMasculino = new javax.swing.JRadioButton();
        pjrbFeminino = new javax.swing.JRadioButton();
        pjrbPersonalizado = new javax.swing.JRadioButton();
        pjtfPersonalizado = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        pjcbGrauIns = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        pjcbEtnia = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        pjtfEndereco = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        pjtfNumero = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        pjtfBairro = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        pjtfCidade = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        pjcbEstado = new javax.swing.JComboBox<>();
        jLabel83 = new javax.swing.JLabel();
        pjcbEstadoCivil = new javax.swing.JComboBox<>();
        jLabel84 = new javax.swing.JLabel();
        pjtfReligiao = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        pjtfPaiMae = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jcbManha = new javax.swing.JCheckBox();
        jcbTarde = new javax.swing.JCheckBox();
        jcbNoite = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Professor");

        jbtnCadastrar1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCadastrar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnCadastrar1.setForeground(new java.awt.Color(0, 255, 0));
        jbtnCadastrar1.setText("Cadastrar");
        jbtnCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrar1ActionPerformed(evt);
            }
        });
        jbtnCadastrar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnCadastrar1KeyPressed(evt);
            }
        });

        pjlErro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        pjlErro.setForeground(new java.awt.Color(255, 0, 0));
        pjlErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLayeredPane3.setLayer(jbtnCadastrar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(pjlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pjlErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jbtnCadastrar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jbtnCadastrar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(pjlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel69.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel69.setText("Nome:");

        pjtfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel70.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel70.setText("Celular:");

        try {
            pjftfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel71.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel71.setText("E-mail:");

        pjtfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel72.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel72.setText("Data de nascimento:");

        try {
            pjftfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pjftfDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pjftfDataNascjftfDataNascKeyReleased(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel73.setText("CPF:");

        try {
            pjftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel74.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel74.setText("Sexo:");

        jLabel75.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel75.setText("Sobrenome:");

        pjtfSobrenome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbgGenero.add(pjrbMasculino);
        pjrbMasculino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjrbMasculino.setSelected(true);
        pjrbMasculino.setText("Masculino");
        pjrbMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pjrbMasculinojrbMasculinoMouseClicked(evt);
            }
        });

        jbgGenero.add(pjrbFeminino);
        pjrbFeminino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjrbFeminino.setText("Feminino");
        pjrbFeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pjrbFemininojrbFemininoMouseClicked(evt);
            }
        });

        jbgGenero.add(pjrbPersonalizado);
        pjrbPersonalizado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjrbPersonalizado.setText("Personalizado:");
        pjrbPersonalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pjrbPersonalizadojrbPersonalizadoMouseClicked(evt);
            }
        });

        pjtfPersonalizado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjtfPersonalizado.setEnabled(false);

        jLabel76.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel76.setText("Grau de instrução:");

        pjcbGrauIns.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjcbGrauIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médio", "Técnico", "Graduado", "Pós-Graduado", "Mestrado", "Doutorado" }));

        jLabel77.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel77.setText("Etnia:");

        pjcbEtnia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjcbEtnia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarela", "Branca", "Indigena", "Parda", "Negra", "Sem declaração" }));

        jLabel78.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel78.setText("Endereço:");

        pjtfEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel79.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel79.setText("Número:");

        pjtfNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel80.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel80.setText("Bairro:");

        pjtfBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel81.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel81.setText("Cidade:");

        pjtfCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel82.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel82.setText("Estado:");

        pjcbEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel83.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel83.setText("Estado civil:");

        pjcbEstadoCivil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pjcbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "solteiro", "casado", "separado", "divorciado ", "viúvo" }));

        jLabel84.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel84.setText("Religião:");

        pjtfReligiao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel85.setText("Pai/Mãe:");

        pjtfPaiMae.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel86.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel86.setText("TURNO");

        jcbManha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbManha.setText("Manhã");

        jcbTarde.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbTarde.setText("Tarde");

        jcbNoite.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbNoite.setText("Noite");

        jLayeredPane7.setLayer(jLabel69, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel70, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjftfCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel71, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel72, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjftfDataNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel73, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjftfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel74, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel75, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfSobrenome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjrbMasculino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjrbFeminino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjrbPersonalizado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfPersonalizado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel76, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjcbGrauIns, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel77, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjcbEtnia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel78, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel79, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel80, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel81, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel82, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjcbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel83, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjcbEstadoCivil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel84, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfReligiao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel85, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pjtfPaiMae, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jLabel86, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jcbManha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jcbTarde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jcbNoite, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pjtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pjtfSobrenome))
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                        .addComponent(jLabel76)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjcbGrauIns, 0, 273, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane7Layout.createSequentialGroup()
                                        .addComponent(jLabel78)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjtfEndereco)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjcbEtnia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel84)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjtfReligiao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                        .addComponent(jLabel85)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjtfPaiMae))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane7Layout.createSequentialGroup()
                                        .addComponent(jLabel80)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel82)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjrbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjrbFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjrbPersonalizado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pjtfPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                        .addComponent(jLabel70)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjftfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142)
                                        .addComponent(jLabel86))
                                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                        .addComponent(jLabel71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pjftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbNoite)
                                    .addComponent(jcbTarde)
                                    .addComponent(jcbManha))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(pjtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(pjtfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(pjftfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(jcbManha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(pjtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTarde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbNoite)
                    .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72)
                        .addComponent(pjftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(pjftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(pjrbMasculino)
                    .addComponent(pjrbFeminino)
                    .addComponent(pjrbPersonalizado)
                    .addComponent(pjtfPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(pjcbGrauIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(pjcbEtnia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(pjtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)
                    .addComponent(pjtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(pjtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(pjtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82)
                    .addComponent(pjcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(pjcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(pjtfReligiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(pjtfPaiMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane3)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarProf(){
        if(!loop.loopingLimiteChar(pjtfNome.getText(), 50)){
            pjlErro.setText("Nome inválido!");
        }else{
            if(!loop.loopingLimiteChar(pjtfSobrenome.getText(), 50)){
                pjlErro.setText("Sobrenome inválido!");
            }else{
                if(!loop.loopingEmail(pjtfEmail.getText())){
                    pjlErro.setText("E-mail inválido!");
                }else{
                    if(!loop.loopingLimiteChar(pjtfEmail.getText(), 50)){
                        pjlErro.setText("E-mail inválido!");
                    }else{
                        if(pjrbPersonalizado.isSelected()){
                            if(!loop.loopingLimiteChar(pjtfPersonalizado.getText(), 30)){
                                pjlErro.setText("Gênero inválido!");
                            }
                        }else{
                            if(!loop.loopingNumjftf(pjftfCpf.getText())){
                                pjlErro.setText("Cpf inválido!");
                            }else{
                                if(!loop.loopingLimiteChar(pjtfEndereco.getText(), 50)){
                                    pjlErro.setText("Endereço inválido!");
                                }else{
                                    if(!loop.loopingLimiteChar(pjtfBairro.getText(), 25)){
                                        pjlErro.setText("Bairro inválido!");
                                    }else{
                                        if(!loop.loopingLimiteChar(pjtfCidade.getText(), 30)){
                                            pjlErro.setText("Cidade inválida!");
                                        }else{
                                            if(!loop.loopingLimiteChar(pjtfReligiao.getText(), 25)){
                                                pjlErro.setText("Religião inválida!");
                                            }else{
                                                if(!loop.loopingLimiteChar(pjtfPaiMae.getText(), 100)){
                                                    pjlErro.setText("Nome do pai/mãe inválido!");
                                                }else{
                                                    if(!loop.loopingNumjftf(pjftfCelular.getText())){
                                                        pjlErro.setText("Número para contato inválido!");
                                                    }else{
                                                        if(!loop.loopingNumjtf(pjtfNumero.getText(), 6)){
                                                            pjlErro.setText("Número do endereço inválido!");
                                                        }else{
                                                            pjlErro.setText(null);
                                                            SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
                                                            ProfessorVO pvo = new ProfessorVO();
                                                            
                                                            pvo.setNome(pjtfNome.getText());
                                                            pvo.setSobrenome(pjtfSobrenome.getText());
                                                            pvo.setEmail(pjtfEmail.getText());
                                                            if(pjrbMasculino.isSelected()){
                                                                pvo.setGenero("M");
                                                            }else{
                                                                if(pjrbFeminino.isSelected()){
                                                                    pvo.setGenero("F");
                                                                }else{
                                                                    if(pjrbPersonalizado.isSelected()){
                                                                        pvo.setGenero(pjtfPersonalizado.getText());
                                                                    }
                                                                }
                                                            }
                                                            pvo.setCpf(pjftfCpf.getText());
                                                            pvo.setGrau_ins(pjcbGrauIns.getSelectedItem().toString());
                                                            pvo.setEtnia(pjcbEtnia.getSelectedItem().toString());
                                                            pvo.setEndereco(pjtfEndereco.getText());
                                                            pvo.setBairro(pjtfBairro.getText());
                                                            pvo.setCidade(pjtfCidade.getText());
                                                            pvo.setEstado(pjcbEstado.getSelectedItem().toString());
                                                            pvo.setEstado_civil(pjcbEstadoCivil.getSelectedItem().toString());
                                                            pvo.setReligiao(pjtfReligiao.getText());
                                                            pvo.setPaimae(pjtfPaiMae.getText());
                                                            pvo.setCelular(pjftfCelular.getText());
                                                            pvo.setNum(Integer.parseInt(pjtfNumero.getText()));
                                                            try {
                                                                pvo.setData_nasc(dts.convertDatatosql(data.parse(pjftfDataNasc.getText())));
                                                            } catch (Exception e) {
                                                            }
                                                            if(jcbManha.isSelected()){
                                                                pvo.setManha(true);
                                                            }
                                                            if(jcbTarde.isSelected()){
                                                                pvo.setTarde(true);
                                                            }
                                                            if(jcbNoite.isSelected()){
                                                                pvo.setNoite(true);
                                                            }
                                                            AreaUService aus = services.ServiceFactory.getAreaUService();
                                                            try {
                                                                aus.cadastrarProfessor(pvo);
                                                                
                                                                try {
                                                                    aus.log(logu.criarLogUsuario("cadastrou", "professor", pjtfNome.getText() + " " + pjtfSobrenome.getText()));
                                                                } catch (Exception e) {
                                                                    JOptionPane.showMessageDialog(null, "Erro ao gerar log!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                }
                                                                
                                                                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
                                                                dispose();
                                                            } catch (SQLException e) {
                                                                if(e.getMessage().equals(sqlerro.sqlError(pjtfEmail.getText(), "email"))){
                                                                    JOptionPane.showMessageDialog(null, "Endereço de e-mail inválido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                }else{
                                                                    if(e.getMessage().equals(sqlerro.sqlError(pjftfCpf.getText(), "cpf"))){
                                                                        JOptionPane.showMessageDialog(null, "CPF inválido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                    }else{
                                                                        if(e.getMessage().equals(sqlerro.sqlError(pjftfCelular.getText(), "celular"))){
                                                                            JOptionPane.showMessageDialog(null, "Número para contato inválido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                        }else{
                                                                            JOptionPane.showMessageDialog(null, "SQLERROR", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Exception e) {
                                                                JOptionPane.showMessageDialog(null, e.getMessage());
                                                            }
                                                            
                                                            
                                                            
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void jbtnCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrar1ActionPerformed
        if(idade_prof > 17 && idade_prof < 130){
            cadastrarProf();
        }else{
            if(idade_prof < 18){
                pjlErro.setText("Professor não cumpre com a idade mínima!");
            }else{
                pjlErro.setText("Caramba, esse cara ainda tá vivo??");
            }
        }
    }//GEN-LAST:event_jbtnCadastrar1ActionPerformed

    private void jbtnCadastrar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrar1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(idade_prof > 17 && idade_prof < 130){
                cadastrarProf();
            }else{
                if(idade_prof < 18){
                    pjlErro.setText("Professor não cumpre com a idade mínima!");
                }else{
                    pjlErro.setText("Caramba, esse cara ainda tá vivo??");
                }
            }
        }
    }//GEN-LAST:event_jbtnCadastrar1KeyPressed

    private void pjftfDataNascjftfDataNascKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pjftfDataNascjftfDataNascKeyReleased
        pjlErro.setText(null);
        SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date nData = data.parse(pjftfDataNasc.getText());
            idade_prof = idade.Calculo(nData);
        } catch (ParseException parseException) {
        }
    }//GEN-LAST:event_pjftfDataNascjftfDataNascKeyReleased

    private void pjrbMasculinojrbMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjrbMasculinojrbMasculinoMouseClicked
        pjtfPersonalizado.setText(null);
        pjtfPersonalizado.setEnabled(false);
    }//GEN-LAST:event_pjrbMasculinojrbMasculinoMouseClicked

    private void pjrbFemininojrbFemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjrbFemininojrbFemininoMouseClicked
        pjtfPersonalizado.setText(null);
        pjtfPersonalizado.setEnabled(false);
    }//GEN-LAST:event_pjrbFemininojrbFemininoMouseClicked

    private void pjrbPersonalizadojrbPersonalizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pjrbPersonalizadojrbPersonalizadoMouseClicked
        pjtfPersonalizado.setEnabled(true);
    }//GEN-LAST:event_pjrbPersonalizadojrbPersonalizadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.ButtonGroup jbgGenero;
    private javax.swing.JButton jbtnCadastrar1;
    private javax.swing.JCheckBox jcbManha;
    private javax.swing.JCheckBox jcbNoite;
    private javax.swing.JCheckBox jcbTarde;
    private javax.swing.JComboBox<String> pjcbEstado;
    private javax.swing.JComboBox<String> pjcbEstadoCivil;
    private javax.swing.JComboBox<String> pjcbEtnia;
    private javax.swing.JComboBox<String> pjcbGrauIns;
    private javax.swing.JFormattedTextField pjftfCelular;
    private javax.swing.JFormattedTextField pjftfCpf;
    private javax.swing.JFormattedTextField pjftfDataNasc;
    private javax.swing.JLabel pjlErro;
    private javax.swing.JRadioButton pjrbFeminino;
    private javax.swing.JRadioButton pjrbMasculino;
    private javax.swing.JRadioButton pjrbPersonalizado;
    private javax.swing.JTextField pjtfBairro;
    private javax.swing.JTextField pjtfCidade;
    private javax.swing.JTextField pjtfEmail;
    private javax.swing.JTextField pjtfEndereco;
    private javax.swing.JTextField pjtfNome;
    private javax.swing.JTextField pjtfNumero;
    private javax.swing.JTextField pjtfPaiMae;
    private javax.swing.JTextField pjtfPersonalizado;
    private javax.swing.JTextField pjtfReligiao;
    private javax.swing.JTextField pjtfSobrenome;
    // End of variables declaration//GEN-END:variables
}
