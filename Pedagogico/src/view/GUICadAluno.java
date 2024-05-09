package view;

import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import services.AreaUService;
import util.CalcularIdade;
import util.LogUtil;
import util.LoopingVerification;
import util.SQLErrorMessage;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.AlunoVO;
import util.DateToSql;
import java.sql.SQLException;
import model.RepFinanceiroVO;
import model.RepLegalVO;

public class GUICadAluno extends javax.swing.JInternalFrame implements InternalFrameListener{
    //financeiro f legal l
    public static String fnome, fcpf, lnome, lcelular, lsobrenome, lemail, lgenero, lcpf, letnia, lendereco, lbairro, lestado, lcidade, lestado_civil, lreligiao;
    public static Date fdata_nasc, ldata_nasc;
    public static int faluno, lnum, laluno;
    
    
    LoopingVerification loop = new LoopingVerification();
    SQLErrorMessage sqlerro = new SQLErrorMessage();
    LogUtil logu = new LogUtil();
    CalcularIdade idade = new CalcularIdade();
    DateToSql dts = new DateToSql();
    
    private static int idade_aluno;
    private boolean flagAbrirRL = false;
    private boolean flagAbrirRF = false;

    public GUICadAluno() {
        initComponents();
        cursos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgGenero = new javax.swing.ButtonGroup();
        jbgTrab = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jftfCelular = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jftfDataNasc = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jftfCpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfSobrenome = new javax.swing.JTextField();
        jrbMasculino = new javax.swing.JRadioButton();
        jrbFeminino = new javax.swing.JRadioButton();
        jrbPersonalizado = new javax.swing.JRadioButton();
        jtfPersonalizado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbGrauIns = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jcbEtnia = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfNumero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jcbEstadoCivil = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jtfReligiao = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jtfPaiMae = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jcbRepLegal = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jcbRepFinanceiro = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        jrbTrabSim = new javax.swing.JRadioButton();
        jrbTrabNao = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbtnCadastrar = new javax.swing.JButton();
        jlErro = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Aluno");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Celular:");

        try {
            jftfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("E-mail:");

        jtfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Data de nascimento:");

        try {
            jftfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jftfDataNascKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("CPF:");

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Sexo:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Sobrenome:");

        jtfSobrenome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbgGenero.add(jrbMasculino);
        jrbMasculino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbMasculino.setSelected(true);
        jrbMasculino.setText("Masculino");
        jrbMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbMasculinoMouseClicked(evt);
            }
        });

        jbgGenero.add(jrbFeminino);
        jrbFeminino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbFeminino.setText("Feminino");
        jrbFeminino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFemininoMouseClicked(evt);
            }
        });

        jbgGenero.add(jrbPersonalizado);
        jrbPersonalizado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbPersonalizado.setText("Personalizado:");
        jrbPersonalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbPersonalizadoMouseClicked(evt);
            }
        });

        jtfPersonalizado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfPersonalizado.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Grau de instrução:");

        jcbGrauIns.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbGrauIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ensino Fundamental - Em andamento", "Ensino Fundamental - Completo", "Ensino Médio - Em andamento", "Ensino Médio - Completo" }));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Etnia:");

        jcbEtnia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbEtnia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarela", "Branca", "Indigena", "Parda", "Negra", "Sem declaração" }));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Endereço:");

        jtfEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Número:");

        jtfNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Bairro:");

        jtfBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Cidade:");

        jtfCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Estado:");

        jcbEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Estado civil:");

        jcbEstadoCivil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jcbEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "solteiro", "casado", "separado", "divorciado ", "viúvo" }));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Religião:");

        jtfReligiao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Pai/Mãe:");

        jtfPaiMae.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Responsável legal:");

        jcbRepLegal.setEnabled(false);
        jcbRepLegal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbRepLegalMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Responsável financeiro:");

        jcbRepFinanceiro.setEnabled(false);
        jcbRepFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbRepFinanceiroMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Trabalha?");

        jbgTrab.add(jrbTrabSim);
        jrbTrabSim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbTrabSim.setText("sim");

        jbgTrab.add(jrbTrabNao);
        jrbTrabNao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbTrabNao.setSelected(true);
        jrbTrabNao.setText("não");

        jLabel40.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel40.setText("Curso:");

        jcbCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jftfCelular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jftfDataNasc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jftfCpf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfSobrenome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbMasculino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbFeminino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbPersonalizado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfPersonalizado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbGrauIns, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbEtnia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfEndereco, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfNumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfBairro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfCidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbEstadoCivil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfReligiao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtfPaiMae, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbRepLegal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbRepFinanceiro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbTrabSim, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jrbTrabNao, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcbCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSobrenome))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcbGrauIns, 0, 273, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEndereco)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEtnia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfReligiao, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbTrabSim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbTrabNao))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbRepLegal))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbRepFinanceiro))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfPaiMae))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbPersonalizado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jftfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jftfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jrbMasculino)
                    .addComponent(jrbFeminino)
                    .addComponent(jrbPersonalizado)
                    .addComponent(jtfPersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcbGrauIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbEtnia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcbEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jtfReligiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtfPaiMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel19)
                    .addComponent(jcbRepFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jcbRepLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jrbTrabSim)
                    .addComponent(jrbTrabNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

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

        jlErro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlErro.setForeground(new java.awt.Color(255, 0, 0));
        jlErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLayeredPane2.setLayer(jbtnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jlErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jbtnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jbtnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jlErro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLayeredPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadRepLegal() throws PropertyVetoException{
        if(!flagAbrirRL){
            GUIRepLegal rl = new GUIRepLegal();
            jLayeredPane1.add(rl);
            rl.setVisible(true);
            rl.setSelected(true);
            flagAbrirRL = true;
            rl.addInternalFrameListener(this);
        }
    }
    
    private void abrirCadRepFinanceiro() throws PropertyVetoException{
        if(!flagAbrirRF){
            GUIRepFinanceiro rf = new GUIRepFinanceiro();
            jLayeredPane1.add(rf);
            rf.setVisible(true);
            rf.setSelected(true);
            flagAbrirRF = true;
            rf.addInternalFrameListener(this);
        }
    }
    
    private void cadastrarAluno (){
        AreaUService aus = services.ServiceFactory.getAreaUService();
        AlunoVO avo = new AlunoVO();
        RepFinanceiroVO fvo = new RepFinanceiroVO();
        RepLegalVO lvo = new RepLegalVO();
        int refCurso = 0;
        
        if(!loop.loopingLimiteChar(jtfNome.getText(), 50)){
            jlErro.setText("Nome inválido!");
        }else{
            if(!loop.loopingLimiteChar(jtfSobrenome.getText(), 50)){
                jlErro.setText("Sobrenome inválido!");
            }else{
                if(!loop.loopingLimiteChar(jtfEmail.getText(), 50)){
                    jlErro.setText("Email inválido!");
                }else{
                    if(!loop.loopingEmail(jtfEmail.getText())){
                        jlErro.setText("Email inválido!");
                    }else{
                        if(jrbPersonalizado.isSelected()){
                            if(!loop.loopingLimiteChar(jtfPersonalizado.getText(), 30)){
                                jlErro.setText("Genero inválido!");
                            }
                        }else{
                            if(!loop.loopingLimiteChar(jtfEndereco.getText(), 50)){
                                jlErro.setText("Endereço inválido!");
                            }else{
                                if(!loop.loopingNumjtf(jtfNumero.getText(), 6)){
                                    jlErro.setText("Número de endereço inválido!");
                                    jtfNumero.setText(null);
                                }else{
                                    if(!loop.loopingLimiteChar(jtfBairro.getText(), 25)){
                                        jlErro.setText("Bairro inválido!");
                                    }else{
                                        if(!loop.loopingLimiteChar(jtfCidade.getText(), 30)){
                                            jlErro.setText("Cidade inválida!");
                                        }else{
                                            if(!loop.loopingLimiteChar(jtfReligiao.getText(), 25)){
                                                jlErro.setText("Religião inválida!");
                                            }else{
                                                if(!loop.loopingLimiteChar(jtfPaiMae.getText(), 100)){
                                                    jlErro.setText("Nome do pai/mãe inválido!");
                                                }else{
                                                    if(!loop.loopingNumjftf(jftfCelular.getText())){
                                                        jlErro.setText("Número de contato inválido!");
                                                    }else{
                                                        if(!loop.loopingNumjftf(jftfCpf.getText())){
                                                            jlErro.setText("Cpf inválido!");
                                                        }else{
                                                            if(idade_aluno < 18 && !jcbRepLegal.isSelected()){
                                                                jlErro.setText("Menores de idade precisam de um Responsável Legal.");
                                                            }else{
                                                                jlErro.setText(null);
                                                                SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
                                                                try{
                                                                    refCurso = aus.refCurso(jcbCurso.getSelectedItem().toString());
                                                                }catch (Exception e){
                                                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                                                }
                                                                
                                                                avo.setNome(jtfNome.getText());
                                                                avo.setSobrenome(jtfSobrenome.getText());
                                                                avo.setCelular(jftfCelular.getText());
                                                                avo.setEmail(jtfEmail.getText());
                                                                try{
                                                                    avo.setData_nasc(dts.convertDatatosql(data.parse(jftfDataNasc.getText())));
                                                                }catch (Exception e){
                                                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                                                }
                                                                avo.setCpf(jftfCpf.getText());
                                                                if(jrbMasculino.isSelected()){
                                                                    avo.setGenero("M");
                                                                }else{
                                                                    if(jrbFeminino.isSelected()){
                                                                        avo.setGenero("F");
                                                                    }else{
                                                                        avo.setGenero(jtfPersonalizado.getText());
                                                                    }
                                                                }
                                                                avo.setGrau_ins(jcbGrauIns.getSelectedItem().toString());
                                                                avo.setEtnia(jcbEtnia.getSelectedItem().toString());
                                                                avo.setEndereco(jtfEndereco.getText());
                                                                avo.setNum(Integer.parseInt(jtfNumero.getText()));
                                                                avo.setBairro(jtfBairro.getText());
                                                                avo.setCidade(jtfCidade.getText());
                                                                avo.setEstado(jcbEstado.getSelectedItem().toString());
                                                                avo.setEstado_civil(jcbEstadoCivil.getSelectedItem().toString());
                                                                avo.setReligiao(jtfReligiao.getText());
                                                                avo.setPaimae(jtfPaiMae.getText());
                                                                if(jcbRepFinanceiro.isSelected()){
                                                                    avo.setRepfin(true);
                                                                }
                                                                if(jcbRepLegal.isSelected()){
                                                                    avo.setRepleg(true);
                                                                }
                                                                if(jrbTrabSim.isSelected()){
                                                                    avo.setTrabalha(true);
                                                                }
                                                                avo.setCurso(refCurso);
                                                                try{
                                                                    aus.cadastrarAlunos(avo);
                                                                }catch (SQLException e){
                                                                    if(e.getMessage().equals(sqlerro.sqlError(jtfEmail.getText(), "email"))){
                                                                        JOptionPane.showMessageDialog(null, "E-mail Inválido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                    }else{
                                                                        if(e.getMessage().equals(sqlerro.sqlError(jftfCpf.getText(), "cpf"))){
                                                                            JOptionPane.showMessageDialog(null, "Cpf Inválido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                        }else{
                                                                            if(e.getMessage().equals(sqlerro.sqlError(jftfCelular.getText(), "celular"))){
                                                                                JOptionPane.showMessageDialog(null, "Número de contato Inválido!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                            }else{
                                                                                JOptionPane.showMessageDialog(null, "Erro SQLException!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                            }
                                                                        }
                                                                    }
                                                                }catch (Exception e){
                                                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                                                }
                                                                
                                                                try{
                                                                    avo.setId_aluno(aus.getIDAluno(jtfEmail.getText()));
                                                                }catch (Exception e){
                                                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                                                }
                                                                String cpfs [] = jftfCpf.getText().split("-");
                                                                Date d = new Date();
                                                                SimpleDateFormat seg = new SimpleDateFormat("ss");
                                                                SimpleDateFormat year = new SimpleDateFormat("yy");
                                                                int milid = 1000 + avo.getId_aluno();
                                                                String matri = refCurso + year.format(d) + seg.format(d) + cpfs[1] + milid;
                                                                try{
                                                                    avo.setMatricula(matri);
                                                                }catch (NumberFormatException e){
                                                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                                                }
                                                                try{
                                                                    aus.setMatricula(avo);
                                                                }catch (SQLException e){
                                                                    if(e.getMessage().equals(sqlerro.sqlError(avo.getMatricula(), "matricula"))){
                                                                        JOptionPane.showMessageDialog(null, "Matricula Inválida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                    }else{
                                                                        JOptionPane.showMessageDialog(null, "Erro SQLException!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                    }
                                                                }catch (Exception e){
                                                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                                                }
                                                                try {
                                                                    aus.log(logu.criarLogUsuario("cadastrou", "aluno", jtfNome.getText() + " " + jtfSobrenome.getText()));
                                                                } catch (Exception e) {
                                                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                                                }
                                                                lvo.setAluno(avo.getId_aluno());
                                                                fvo.setAluno(avo.getId_aluno());
                                                                if(jcbRepLegal.isSelected()){
                                                                    //passar para a vo por aqui
                                                                    lvo.setNome(lnome);
                                                                    lvo.setCelular(lcelular);
                                                                    lvo.setSobrenome(lsobrenome);
                                                                    lvo.setEmail(lemail);
                                                                    lvo.setGenero(lgenero);
                                                                    lvo.setCpf(lcpf);
                                                                    lvo.setEtnia(letnia);
                                                                    lvo.setEndereco(lendereco);
                                                                    lvo.setBairro(lbairro);
                                                                    lvo.setEstado(lestado);
                                                                    lvo.setCidade(lcidade);
                                                                    lvo.setEstado_civil(lestado_civil);
                                                                    lvo.setReligiao(lreligiao);
                                                                    lvo.setNum(lnum);
                                                                    lvo.setData_nasc(dts.convertDatatosql(ldata_nasc));
                                                                    try {
                                                                        aus.responsavelLegalAluno(lvo);
                                                                    } catch (SQLException e) {
                                                                        JOptionPane.showMessageDialog(null, "Erro nos dados cadastrais do responsável legal!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                        JOptionPane.showMessageDialog(null, e.getMessage());
                                                                    }
                                                                    try {
                                                                        aus.log(logu.criarLogUsuario("cadastrou", "responsável legal", "para " + jtfNome.getText() + " " + jtfSobrenome.getText()));
                                                                    } catch (Exception e) {
                                                                        JOptionPane.showMessageDialog(null, e.getMessage());
                                                                    }
                                                                }
                                                                if(jcbRepFinanceiro.isSelected()){
                                                                    //passar para a vo por aqui
                                                                    fvo.setNome(fnome);
                                                                    fvo.setCpf(fcpf);
                                                                    fvo.setData_nasc(dts.convertDatatosql(fdata_nasc));
                                                                    try {
                                                                        aus.responsavelFinanceiroAluno(fvo);
                                                                    } catch (SQLException e) {
                                                                        JOptionPane.showMessageDialog(null, "Erro nos dados cadastrais do responsável financeiro!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                                                                        JOptionPane.showMessageDialog(null, e.getMessage());
                                                                    }
                                                                    try {
                                                                        aus.log(logu.criarLogUsuario("cadastrou", "responsável financeiro", "para " + jtfNome.getText() + " " + jtfSobrenome.getText()));
                                                                    } catch (Exception e) {
                                                                        JOptionPane.showMessageDialog(null, e.getMessage());
                                                                    }
                                                                }
                                                                JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso!", "Parabéns", JOptionPane.INFORMATION_MESSAGE);
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
    }
    
    private void cursos(){
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
    
    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        if(idade_aluno > 15 && idade_aluno < 110){
            cadastrarAluno();
        }else{
            if(idade_aluno < 16){
                jlErro.setText("Aluno não cumpre com a idade mínima!");
            }else{
                jlErro.setText("Caramba, esse cara ainda tá vivo??");
            }
        }
    }//GEN-LAST:event_jbtnCadastrarActionPerformed

    private void jbtnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnCadastrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(idade_aluno > 15 && idade_aluno < 110){
                cadastrarAluno();
            }else{
                if(idade_aluno < 16){
                    jlErro.setText("Aluno não cumpre com a idade mínima!");
                }else{
                    jlErro.setText("Caramba, esse cara ainda tá vivo??");
                }
            }
        }
    }//GEN-LAST:event_jbtnCadastrarKeyPressed

    private void jcbRepLegalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbRepLegalMouseClicked
        if(idade_aluno < 18 && idade_aluno > 15){
            jlErro.setText("");
            if(!jcbRepLegal.isEnabled()){
                try {
                    abrirCadRepLegal();
                } catch (Exception e) {
                }
            }else{
                jcbRepLegal.setSelected(false);
                jcbRepLegal.setEnabled(false);
                GUIRepLegal rl = new GUIRepLegal();
            }
        }else{
            if(idade_aluno > 17 && idade_aluno < 110){
                jlErro.setText("Aluno não necessita de representante legal!");
            }else{
                if(idade_aluno > 110){
                    jlErro.setText("Caramba, esse cara ainda tá vivo??");
                }else{
                    jlErro.setText("Aluno não cumpre com a idade mínima!");
                }
            }
        }
    }//GEN-LAST:event_jcbRepLegalMouseClicked

    private void jftfDataNascKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftfDataNascKeyReleased
        jlErro.setText(null);
        SimpleDateFormat data = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date nData = data.parse(jftfDataNasc.getText());
            idade_aluno = idade.Calculo(nData);
        } catch (ParseException parseException) {
        }
    }//GEN-LAST:event_jftfDataNascKeyReleased

    private void jcbRepFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbRepFinanceiroMouseClicked
        if(!jcbRepFinanceiro.isEnabled()){
            try {
                abrirCadRepFinanceiro();
            } catch (Exception e) {
            }
        }else{
            jcbRepFinanceiro.setSelected(false);
            jcbRepFinanceiro.setEnabled(false);
            GUIRepFinanceiro rf = new GUIRepFinanceiro();
        }
    }//GEN-LAST:event_jcbRepFinanceiroMouseClicked

    private void jrbPersonalizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbPersonalizadoMouseClicked
        if(jrbPersonalizado.isSelected()){
            jtfPersonalizado.setEnabled(true);
        }
    }//GEN-LAST:event_jrbPersonalizadoMouseClicked

    private void jrbFemininoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFemininoMouseClicked
        jtfPersonalizado.setEnabled(false);
        jtfPersonalizado.setText(null);
    }//GEN-LAST:event_jrbFemininoMouseClicked

    private void jrbMasculinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbMasculinoMouseClicked
        jtfPersonalizado.setEnabled(false);
        jtfPersonalizado.setText(null);
    }//GEN-LAST:event_jrbMasculinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.ButtonGroup jbgGenero;
    private javax.swing.ButtonGroup jbgTrab;
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbEstadoCivil;
    private javax.swing.JComboBox<String> jcbEtnia;
    private javax.swing.JComboBox<String> jcbGrauIns;
    public static javax.swing.JCheckBox jcbRepFinanceiro;
    public static javax.swing.JCheckBox jcbRepLegal;
    private javax.swing.JFormattedTextField jftfCelular;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JFormattedTextField jftfDataNasc;
    private javax.swing.JLabel jlErro;
    private javax.swing.JRadioButton jrbFeminino;
    private javax.swing.JRadioButton jrbMasculino;
    private javax.swing.JRadioButton jrbPersonalizado;
    private javax.swing.JRadioButton jrbTrabNao;
    private javax.swing.JRadioButton jrbTrabSim;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfPaiMae;
    private javax.swing.JTextField jtfPersonalizado;
    private javax.swing.JTextField jtfReligiao;
    private javax.swing.JTextField jtfSobrenome;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof GUIRepLegal){
            flagAbrirRL = false;
        }
        if(e.getInternalFrame() instanceof GUIRepFinanceiro){
            flagAbrirRF = false;
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
