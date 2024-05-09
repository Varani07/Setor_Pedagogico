package view;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import model.RepLegalVO;
import util.CalcularIdade;
import util.DateToSql;
import util.LoopingVerification;
import util.SQLErrorMessage;

public class GUIRepLegal extends javax.swing.JInternalFrame {
    DateToSql dts = new DateToSql();
    CalcularIdade idade = new CalcularIdade();
    LoopingVerification loop = new LoopingVerification();
    
    private static int idade_rl;

    public GUIRepLegal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgGenero = new javax.swing.ButtonGroup();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel27 = new javax.swing.JLabel();
        jftfDataNasc1 = new javax.swing.JFormattedTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jrbMasculino1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jrbFeminino1 = new javax.swing.JRadioButton();
        jftfCpf1 = new javax.swing.JFormattedTextField();
        jrbPersonalizado1 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfSobrenome1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jftfCelular1 = new javax.swing.JFormattedTextField();
        jtfPersonalizado1 = new javax.swing.JTextField();
        jtfNome1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jtfBairro1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jcbEstado1 = new javax.swing.JComboBox<>();
        jtfEndereco1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jcbEstadoCivil1 = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jtfCidade1 = new javax.swing.JTextField();
        jtfNumero1 = new javax.swing.JTextField();
        jtfReligiao1 = new javax.swing.JTextField();
        jcbEtnia1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jlErro = new javax.swing.JLabel();
        jbtnCadastrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastrar Responsável Legal");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel27.setText("E-mail:");

        try {
            jftfDataNasc1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfDataNasc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jftfDataNasc1KeyReleased(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel30.setText("Sexo:");

        jLabel28.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel28.setText("Data de nascimento:");

        jbgGenero.add(jrbMasculino1);
        jrbMasculino1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbMasculino1.setSelected(true);
        jrbMasculino1.setText("Masculino");
        jrbMasculino1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbMasculino1MouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel25.setText("Sobrenome:");

        jbgGenero.add(jrbFeminino1);
        jrbFeminino1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbFeminino1.setText("Feminino");
        jrbFeminino1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFeminino1MouseClicked(evt);
            }
        });

        try {
            jftfCpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbgGenero.add(jrbPersonalizado1);
        jrbPersonalizado1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbPersonalizado1.setText("Personalizado:");
        jrbPersonalizado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbPersonalizado1MouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel26.setText("Celular:");

        jtfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfSobrenome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel29.setText("CPF:");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("Nome:");

        try {
            jftfCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtfPersonalizado1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfPersonalizado1.setEnabled(false);

        jtfNome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel39.setText("Religião:");

        jLabel38.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel38.setText("Estado civil:");

        jtfBairro1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel35.setText("Bairro:");

        jcbEstado1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbEstado1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jcbEstado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbEstado1MouseClicked(evt);
            }
        });

        jtfEndereco1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel32.setText("Etnia:");

        jLabel37.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel37.setText("Estado:");

        jcbEstadoCivil1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbEstadoCivil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "solteiro", "casado", "separado", "divorciado ", "viúvo" }));
        jcbEstadoCivil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbEstadoCivil1MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel33.setText("Endereço:");

        jtfCidade1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfNumero1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfReligiao1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jcbEtnia1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbEtnia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarela", "Branca", "Indigena", "Parda", "Negra", "Sem declaração" }));
        jcbEtnia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbEtnia1MouseClicked(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel34.setText("Número:");

        jLabel36.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel36.setText("Cidade:");

        jLayeredPane2.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jftfDataNasc1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbMasculino1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbFeminino1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jftfCpf1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jrbPersonalizado1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfSobrenome1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jftfCelular1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfPersonalizado1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfNome1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfBairro1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbEstado1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfEndereco1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbEstadoCivil1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfCidade1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfNumero1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jtfReligiao1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jcbEtnia1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfSobrenome1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfDataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftfCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbMasculino1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbFeminino1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbPersonalizado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfPersonalizado1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEtnia1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfReligiao1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jtfNome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jtfSobrenome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jftfCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jftfDataNasc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jftfCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jrbMasculino1)
                    .addComponent(jrbFeminino1)
                    .addComponent(jrbPersonalizado1)
                    .addComponent(jtfPersonalizado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jcbEtnia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jtfEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jtfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jtfBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(jtfCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jcbEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jcbEstadoCivil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jtfReligiao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jlErro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));
        jlErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                .addGap(246, 246, 246)
                .addComponent(jbtnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jbtnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cadastrarResLegal(){
        if(idade_rl < 18 || idade_rl > 110){
            jlErro.setText("Idade Inválida!");
        }else{
            if(!loop.loopingLimiteChar(jtfNome1.getText(), 50)){
                jlErro.setText("Nome Inválido!");
            }else{
                if(!loop.loopingLimiteChar(jtfSobrenome1.getText(), 50)){
                    jlErro.setText("Sobrenome Inválido!");
                }else{
                    if(!loop.loopingLimiteChar(jtfEmail.getText(), 50)){
                        jlErro.setText("E-mail Inválido!");
                    }else{
                        if(!loop.loopingEmail(jtfEmail.getText())){
                            jlErro.setText("E-mail Inválido!");
                        }else{
                            if(jrbPersonalizado1.isSelected()){
                                if(!loop.loopingLimiteChar(jtfPersonalizado1.getText(), 30)){
                                    jlErro.setText("Genero Inválido!");
                                }
                            }else{
                                if(!loop.loopingNumjftf(jftfCpf1.getText())){
                                    jlErro.setText("Cpf Inválido!");
                                }else{
                                    if(!loop.loopingLimiteChar(jtfEndereco1.getText(), 50)){
                                        jlErro.setText("Endereço Inválido!");
                                    }else{
                                        if(!loop.loopingLimiteChar(jtfBairro1.getText(), 25)){
                                            jlErro.setText("Bairro Inválido!");
                                        }else{
                                            if(!loop.loopingLimiteChar(jtfCidade1.getText(), 30)){
                                                jlErro.setText("Cidade Inválida!");
                                            }else{
                                                if(!loop.loopingLimiteChar(jtfReligiao1.getText(), 25)){
                                                    jlErro.setText("Religião Inválida!");
                                                }else{
                                                    if(!loop.loopingNumjftf(jftfCelular1.getText())){
                                                        jlErro.setText("Número de contato Inválido!");
                                                    }else{
                                                        if(!loop.loopingNumjtf(jtfNumero1.getText(), 6)){
                                                            jlErro.setText("Número de endereço Inválido!");
                                                        }else{
                                                            jlErro.setText(null);
                                                            SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
                                                            
                                                            GUICadAluno.lnome = jtfNome1.getText();
                                                            GUICadAluno.lsobrenome = jtfSobrenome1.getText();
                                                            GUICadAluno.lemail = jtfEmail.getText();
                                                            if(jrbMasculino1.isSelected()){
                                                                GUICadAluno.lgenero = "M";
                                                            }else{
                                                                if(jrbFeminino1.isSelected()){
                                                                    GUICadAluno.lgenero = "F";
                                                                }else{
                                                                    if(jrbPersonalizado1.isSelected()){
                                                                        GUICadAluno.lgenero = jtfPersonalizado1.getText();
                                                                    }
                                                                }
                                                            }
                                                            GUICadAluno.lcpf = jftfCpf1.getText();
                                                            GUICadAluno.letnia = jcbEtnia1.getSelectedItem().toString();
                                                            GUICadAluno.lendereco = jtfEndereco1.getText();
                                                            GUICadAluno.lbairro = jtfEndereco1.getText();
                                                            GUICadAluno.lestado = jcbEstado1.getSelectedItem().toString();
                                                            GUICadAluno.lcidade = jtfCidade1.getText();
                                                            GUICadAluno.lestado_civil = jcbEstadoCivil1.getSelectedItem().toString();
                                                            GUICadAluno.lreligiao = jtfReligiao1.getText();
                                                            GUICadAluno.lcelular = jftfCelular1.getText();
                                                            GUICadAluno.lnum = Integer.parseInt(jtfNumero1.getText());
                                                            try {
                                                                GUICadAluno.ldata_nasc = data.parse(jftfDataNasc1.getText());
                                                            } catch (Exception e) {
                                                            }
                                                            GUICadAluno.jcbRepLegal.setEnabled(true);
                                                            GUICadAluno.jcbRepLegal.setSelected(true);
                                                            dispose();
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
    
    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        cadastrarResLegal();
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cadastrarResLegal();
        }
    }//GEN-LAST:event_jbtnCadastrarKeyPressed

    private void jftfDataNasc1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftfDataNasc1KeyReleased
        jlErro.setText(null);
        SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
        try{
            idade_rl = idade.Calculo(data.parse(jftfDataNasc1.getText()));
        }catch (Exception e){
        }
    }//GEN-LAST:event_jftfDataNasc1KeyReleased

    private void jrbPersonalizado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbPersonalizado1MouseClicked
        jtfPersonalizado1.setEnabled(true);
    }//GEN-LAST:event_jrbPersonalizado1MouseClicked

    private void jrbFeminino1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFeminino1MouseClicked
        jtfPersonalizado1.setEnabled(false);
        jtfPersonalizado1.setText(null);
    }//GEN-LAST:event_jrbFeminino1MouseClicked

    private void jrbMasculino1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbMasculino1MouseClicked
        jtfPersonalizado1.setEnabled(false);
        jtfPersonalizado1.setText(null);
    }//GEN-LAST:event_jrbMasculino1MouseClicked

    private void jcbEtnia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEtnia1MouseClicked
        jcbEtnia1.showPopup();
    }//GEN-LAST:event_jcbEtnia1MouseClicked

    private void jcbEstado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstado1MouseClicked
        jcbEstado1.showPopup();
    }//GEN-LAST:event_jcbEstado1MouseClicked

    private void jcbEstadoCivil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbEstadoCivil1MouseClicked
        jcbEstadoCivil1.showPopup();
    }//GEN-LAST:event_jcbEstadoCivil1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.ButtonGroup jbgGenero;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JComboBox<String> jcbEstado1;
    private javax.swing.JComboBox<String> jcbEstadoCivil1;
    private javax.swing.JComboBox<String> jcbEtnia1;
    private javax.swing.JFormattedTextField jftfCelular1;
    private javax.swing.JFormattedTextField jftfCpf1;
    private javax.swing.JFormattedTextField jftfDataNasc1;
    private javax.swing.JLabel jlErro;
    private javax.swing.JRadioButton jrbFeminino1;
    private javax.swing.JRadioButton jrbMasculino1;
    private javax.swing.JRadioButton jrbPersonalizado1;
    private javax.swing.JTextField jtfBairro1;
    private javax.swing.JTextField jtfCidade1;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEndereco1;
    private javax.swing.JTextField jtfNome1;
    private javax.swing.JTextField jtfNumero1;
    private javax.swing.JTextField jtfPersonalizado1;
    private javax.swing.JTextField jtfReligiao1;
    private javax.swing.JTextField jtfSobrenome1;
    // End of variables declaration//GEN-END:variables
}
