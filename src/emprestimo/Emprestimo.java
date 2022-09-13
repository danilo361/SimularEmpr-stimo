package emprestimo;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Emprestimo extends javax.swing.JFrame {

    public Emprestimo() {
        initComponents();

    }

    void limpar() {
        tfNome.setText("");
        tfAno.setText("");
        tfValor.setText("100");
        tfIdade.setText("");
        cbParcelas.setSelectedIndex(1);
        ltSeguro.setSelectedIndex(1);
        rbSim.setEnabled(false);
        rbSim.setSelected(true);
        rbNao1.setEnabled(false);
        rbNao1.setSelected(false);
        jTextArea1.setText("");
        jsValor.setValue(100);
        chCliente.setSelected(true);

    }

    void adiciona() {
        jTextArea1.setText("");
      
        if (tfNome.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(this, "O campo NOME é obrigatório." + '\n' + "Informe seu NOME!");
        
        }else{
        int idade;
        int ano_atual = 2021;
        int calculo = 0;
       
        
        calculo = ano_atual - calculo;
        
        try {
            idade = Integer.valueOf(tfAno.getText().trim());
            if (idade <=0) {
                JOptionPane.showMessageDialog(this, "O campo ANO DE NASCIMENTO deve ser completado \n com um ano válido!");
                return;
            }
            idade = 2021 - idade;
            tfIdade.setText(String.valueOf(idade).trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "O campo ANO DE NASCIMENTO só podem conter números!");
            return;
        }
         jTextArea1.append("Nome: " + tfNome.getText().trim() + '\n');
        jTextArea1.append("Ano de nascimento: " + tfAno.getText().trim() + '\n');
        jTextArea1.append("Idade: " + idade +" anos"+ '\n');
        tfIdade.setText(idade + " anos"+'\n');
        jTextArea1.append("Parcelas: " + cbParcelas.getSelectedItem() + '\n');
        jTextArea1.append("Seguro: " + ltSeguro.getSelectedValue() + '\n');
        jTextArea1.append("Valor contratado: " + tfValor.getText() +" Reais" +'\n');
       
        if (chCliente.isSelected()) {
            jTextArea1.append("\n"+"\n"+"               Já é cliente da agência!");
        } else if (rbSim.isSelected()) {
            jTextArea1.append("\n"+"\n"+"            Vai abrir uma conta!");
        } else {
            jTextArea1.append("\n"+"\n"+ "       Optou por não abrir uma conta!");
        }

    }
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JComboBox<String> getCbParcelas() {
        return cbParcelas;
    }

    public void setCbParcelas(JComboBox<String> cbParcelas) {
        this.cbParcelas = cbParcelas;
    }

    public JCheckBox getChCliente() {
        return chCliente;
    }

    public void setChCliente(JCheckBox chCliente) {
        this.chCliente = chCliente;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JTextField getjTextField1() {
        return tfIdade;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.tfIdade = jTextField1;
    }

    public JSlider getJsValor() {
        return jsValor;
    }

    public void setJsValor(JSlider jsValor) {
        this.jsValor = jsValor;
    }

    public JList<String> getLtSeguro() {
        return ltSeguro;
    }

    public void setLtSeguro(JList<String> ltSeguro) {
        this.ltSeguro = ltSeguro;
    }

    public JRadioButton getRbNao1() {
        return rbNao1;
    }

    public void setRbNao1(JRadioButton rbNao1) {
        this.rbNao1 = rbNao1;
    }

  
    public JRadioButton getRbSim() {
        return rbSim;
    }

    public void setRbSim(JRadioButton rbSim) {
        this.rbSim = rbSim;
    }

    public JTextField getTfAno() {
        return tfAno;
    }

    public void setTfAno(JTextField tfAno) {
        this.tfAno = tfAno;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(JTextField tfNome) {
        this.tfNome = tfNome;
    }

    public JTextField getTfValor() {
        return tfValor;
    }

    public void setTfValor(JTextField tfValor) {
        this.tfValor = tfValor;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfIdade = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfAno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltSeguro = new javax.swing.JList<>();
        cbParcelas = new javax.swing.JComboBox<>();
        chCliente = new javax.swing.JCheckBox();
        rbSim = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rbNao1 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        jsValor = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empréstimo");
        setLocation(new java.awt.Point(350, 70));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));
        setName("Femprestimo"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Stencil Std", 0, 65)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("R");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(275, 0, 60, 80);

        jLabel8.setFont(new java.awt.Font("Birch Std", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("a");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(325, 0, 40, 40);

        jLabel9.setFont(new java.awt.Font("Birch Std", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("odrigues");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(330, 20, 110, 50);

        jLabel10.setFont(new java.awt.Font("Birch Std", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Financei");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(200, 0, 110, 50);

        jPanel4.setBackground(new java.awt.Color(209, 0, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(50, 32767));
        jPanel4.setMinimumSize(new java.awt.Dimension(50, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(5, 40, 269, 3);

        jPanel3.setBackground(new java.awt.Color(209, 0, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(50, 32767));
        jPanel3.setMinimumSize(new java.awt.Dimension(50, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(410, 40, 200, 3);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-6, 0, 610, 60);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seguro:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 240, 70, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parcelas:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 100, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dados do cliente:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 320, 160, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ano de nascimento:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 190, 30);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Valor:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 230, 60, 30);

        tfIdade.setEditable(false);
        tfIdade.setBackground(new java.awt.Color(255, 255, 255));
        tfIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfIdadeFocusLost(evt);
            }
        });
        tfIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdadeActionPerformed(evt);
            }
        });
        jPanel1.add(tfIdade);
        tfIdade.setBounds(120, 160, 120, 30);

        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFocusLost(evt);
            }
        });
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        jPanel1.add(tfNome);
        tfNome.setBounds(100, 80, 230, 30);

        tfAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfAno.setText("0");
        tfAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAnoFocusLost(evt);
            }
        });
        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });
        tfAno.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tfAnoPropertyChange(evt);
            }
        });
        jPanel1.add(tfAno);
        tfAno.setBounds(210, 120, 120, 30);

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        ltSeguro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ltSeguro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Já possui", "Contratar", "Sem seguro" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ltSeguro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ltSeguro.setPreferredSize(new java.awt.Dimension(71, 60));
        ltSeguro.setSelectedIndex(1);
        ltSeguro.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(ltSeguro);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(120, 240, 120, 60);

        cbParcelas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6x", "12x", "18x" }));
        cbParcelas.setSelectedIndex(1);
        cbParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParcelasActionPerformed(evt);
            }
        });
        jPanel1.add(cbParcelas);
        cbParcelas.setBounds(120, 200, 120, 30);

        chCliente.setBackground(new java.awt.Color(255, 0, 0));
        chCliente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        chCliente.setForeground(new java.awt.Color(255, 255, 255));
        chCliente.setSelected(true);
        chCliente.setText("Cliente?");
        chCliente.setIconTextGap(5);
        chCliente.setMargin(new java.awt.Insets(3, 3, 3, 3));
        chCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chClienteActionPerformed(evt);
            }
        });
        jPanel1.add(chCliente);
        chCliente.setBounds(400, 100, 150, 40);

        rbSim.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rbSim);
        rbSim.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbSim.setForeground(new java.awt.Color(255, 255, 255));
        rbSim.setSelected(true);
        rbSim.setText("Sim");
        rbSim.setEnabled(false);
        rbSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSimActionPerformed(evt);
            }
        });
        jPanel1.add(rbSim);
        rbSim.setBounds(420, 170, 50, 30);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(370, 140, 190, 2);

        rbNao1.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(rbNao1);
        rbNao1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbNao1.setForeground(new java.awt.Color(255, 255, 255));
        rbNao1.setText("Não");
        rbNao1.setEnabled(false);
        rbNao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNao1ActionPerformed(evt);
            }
        });
        jPanel1.add(rbNao1);
        rbNao1.setBounds(470, 170, 50, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Abrir conta?");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(420, 150, 130, 20);

        tfValor.setEditable(false);
        tfValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfValor.setText("100");
        tfValor.setSelectionColor(new java.awt.Color(255, 255, 255));
        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });
        jPanel1.add(tfValor);
        tfValor.setBounds(430, 230, 90, 30);

        jsValor.setBackground(new java.awt.Color(255, 0, 0));
        jsValor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jsValor.setForeground(new java.awt.Color(255, 255, 255));
        jsValor.setMajorTickSpacing(100);
        jsValor.setMaximum(10000);
        jsValor.setMinimum(100);
        jsValor.setToolTipText("");
        jsValor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jsValor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsValorStateChanged(evt);
            }
        });
        jsValor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jsValorPropertyChange(evt);
            }
        });
        jPanel1.add(jsValor);
        jsValor.setBounds(370, 260, 200, 26);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(282, 350, 290, 190);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(8, 320, 570, 1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 420, 120, 40);

        jLabel15.setFont(new java.awt.Font("Birch Std", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("odrigues");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(150, 510, 110, 50);

        jLabel12.setFont(new java.awt.Font("Birch Std", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("a");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, 490, 40, 40);

        jLabel13.setFont(new java.awt.Font("Stencil Std", 0, 65)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("R");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(90, 490, 60, 80);

        jLabel14.setFont(new java.awt.Font("Birch Std", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Financei");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 490, 110, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setLabel("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(130, 360, 120, 40);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nome:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(30, 80, 70, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Idade:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(30, 150, 70, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdadeActionPerformed

    private void cbParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbParcelasActionPerformed

    private void chClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chClienteActionPerformed
        rbSim.setEnabled(!chCliente.isSelected());
        rbNao1.setEnabled(!chCliente.isSelected());
    }//GEN-LAST:event_chClienteActionPerformed

    private void rbSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSimActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed

    }//GEN-LAST:event_tfValorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        adiciona();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jsValorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jsValorPropertyChange

    }//GEN-LAST:event_jsValorPropertyChange

    private void jsValorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsValorStateChanged
        tfValor.setText(jsValor.getValue() + " ");
    }//GEN-LAST:event_jsValorStateChanged

    private void tfAnoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tfAnoPropertyChange

     }//GEN-LAST:event_tfAnoPropertyChange

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbNao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNao1ActionPerformed

    private void tfIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfIdadeFocusLost
       
     
    }//GEN-LAST:event_tfIdadeFocusLost

    private void tfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusLost
       
    }//GEN-LAST:event_tfNomeFocusLost

    private void tfAnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAnoFocusLost
       String valor = tfAno.getText().trim();
        if (valor.length() == 4) {
            int idade = 2021 - Integer.valueOf(valor);
            tfIdade.setText(String.valueOf(idade)+ " anos");}
    }//GEN-LAST:event_tfAnoFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbParcelas;
    private javax.swing.JCheckBox chCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSlider jsValor;
    private javax.swing.JList<String> ltSeguro;
    private javax.swing.JRadioButton rbNao1;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
