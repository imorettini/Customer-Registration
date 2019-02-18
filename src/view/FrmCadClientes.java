package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import model.Cliente;

public class FrmCadClientes extends javax.swing.JFrame {

    MaskFormatter mfTel;
    MaskFormatter mfCep;
    MaskFormatter mfUf;
    MaskFormatter mfData;
    boolean gravar = false;
    boolean editar = false;

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public FrmCadClientes() {
         
        try {
            initComponents();
            habilitaCampos(false);

            mfUf = new MaskFormatter("UU");
            mfUf.setPlaceholderCharacter('_');
            mfUf.setValueContainsLiteralCharacters(false);
            mfUf.setValueClass(String.class);
            DefaultFormatterFactory ddUf
                    = new DefaultFormatterFactory(mfUf);
            txtUf.setFormatterFactory(ddUf);

            mfCep = new MaskFormatter("#####-###");
            mfCep.setPlaceholderCharacter('_');
            mfCep.setValueContainsLiteralCharacters(false);
            mfCep.setValueClass(String.class);
            DefaultFormatterFactory ddfCep
                    = new DefaultFormatterFactory(mfCep);
            txtCep.setFormatterFactory(ddfCep);

            mfTel = new MaskFormatter("(##)#####-####");
            mfTel.setPlaceholderCharacter('_');
            mfTel.setValueContainsLiteralCharacters(false);
            mfTel.setValueClass(String.class);
            DefaultFormatterFactory ddfTel
                    = new DefaultFormatterFactory(mfTel);
            txtTel.setFormatterFactory(ddfTel);

            mfData = new MaskFormatter("##/##/####");
            mfData.setPlaceholderCharacter('_');
            mfData.setValueContainsLiteralCharacters(true);
            mfData.setValueClass(String.class);
            DefaultFormatterFactory ddfData
                    = new DefaultFormatterFactory(mfData);
            txtData.setFormatterFactory(ddfData);

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro: " + e.getMessage(),
                    "Erro:", JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblUf = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtUf = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        lblCodigo.setText("Código:");

        lblNome.setText("Nome:");

        lblEndereco.setText("Endereço:");

        lblCidade.setText("Cidade:");

        lblBairro.setText("Bairro:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtNome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCidade)
                            .addComponent(lblBairro))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade)
                            .addComponent(txtBairro))))
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        lblUf.setText("UF:");

        lblCep.setText("CEP:");

        lblTelefone.setText("Telefone:");

        lblData.setText("Nascimento:");

        txtCep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(lblCep)
                    .addComponent(lblUf)
                    .addComponent(lblData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(txtData)
                    .addComponent(txtCep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUf)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Cidade", "Bairro", "UF", "CEP", "Telefone", "Data de Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        limpaCampos();
        habilitaCampos(true); //dar uma olhada em todas as linhas desse botao
        habilitaBotoes(false);
        gravar = true;
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tblClientes.getModel().getRowCount() > 0) {
            if (tblClientes.getSelectedRow() > -1) {
                try {
                    limpaCampos();
                    habilitaCampos(true);
                    txtCodigo.setEnabled(false);
                    habilitaBotoes(false);
                    editar = true;
                    int linha = tblClientes.getSelectedRow();
                    txtCodigo.setText(String.valueOf(tblClientes.getModel().getValueAt(linha, 0)));
                    txtNome.setText((String) tblClientes.getModel().getValueAt(linha, 1));
                    txtEndereco.setText((String) tblClientes.getModel().getValueAt(linha, 2));
                    txtCidade.setText((String) tblClientes.getModel().getValueAt(linha, 3));
                    txtBairro.setText((String) tblClientes.getModel().getValueAt(linha, 4));
                    //txtUf.setText(String.ValueOf(tblClientes.getModel().getValueAt(linha, 5)));
                    txtUf.setValue((String) tblClientes.getModel().getValueAt(linha, 5));
                    txtCep.setValue(tblClientes.getModel().getValueAt(linha, 6));
                    txtTel.setValue(mfTel.stringToValue((String) tblClientes.getModel().getValueAt(linha, 7)));
                    txtData.setValue(mfData.stringToValue((String) tblClientes.getModel().getValueAt(linha, 8)));
                    txtNome.requestFocus();

                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Erro de conversão: " + ex.getMessage(),
                            "Erro:", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um cliente primeiro! ",
                        "Erro:", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {
            Cliente cli = new Cliente();
            cli.setCod(Integer.valueOf(txtCodigo.getText()));
            cli.setNome(txtNome.getText());
            cli.setEndereco(txtEndereco.getText());
            cli.setCidade(txtCidade.getText());
            cli.setBairro(txtBairro.getText());
            cli.setUf((String) txtUf.getValue());
            cli.setCep((String) txtCep.getValue());
            cli.setTelefone((String) txtTel.getValue());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            cli.setDataNasc(sdf.parse(txtData.getText()));
            if (gravar) {
                clientes.add(cli);
            }
            if (editar) {
                for (Cliente cliente : clientes) {
                    if (cliente.getCod() == cli.getCod()) {
                        cliente.setNome(cli.getNome());
                        cliente.setEndereco(cli.getEndereco());
                        cliente.setCidade(cli.getCidade());
                        cliente.setBairro(cli.getBairro());
                        cliente.setUf(cli.getUf());
                        cliente.setCep(cli.getCep());
                        cliente.setTelefone(cli.getTelefone());
                        cliente.setDataNasc(cli.getDataNasc());
                    }
                }
            }
            btnCancelarActionPerformed(null);
            atualizaTabela();

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Erro de conversão: " + ex.getMessage(),
                    "Erro:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        habilitaBotoes(true);
        habilitaCampos(false);
        editar = false;
        gravar = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int codTemp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do cliente: "));
        Cliente clienteescolhido1 = null;
        boolean naotem = true;

        for (Iterator<Cliente> it = clientes.iterator(); it.hasNext();) {
            Cliente cliente = it.next();
            if (cliente.getCod() == codTemp) {
                clienteescolhido1 = cliente;
                it.remove();
                JOptionPane.showMessageDialog(this, "Cliente Excluido!");
                naotem = false;

            }
        }
        if (naotem == true) {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
        }
        atualizaTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        boolean naoachou = false;
        try {

            int op = Integer.parseInt(JOptionPane.showInputDialog("Digite qual opção de pesquisa desejada:  \n 1- Código: \n 2-Nome"));

            if (op == 1) {
                int codTemp = Integer.parseInt(JOptionPane.showInputDialog("Informe o Código do Cliente: "));
                int posicao = -1;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String[] linha = {"", "", "", "", "", "", "", "", ""};
                for (Cliente cliente : clientes) {

                    if (codTemp == cliente.getCod()) {
                        limpaTable();

                        DefaultTableModel tbl
                                = (DefaultTableModel) tblClientes.getModel();

                        posicao++;
                        //incluindo linha em branco
                        tbl.addRow(linha);
                        //preenchendo a linha em branco, celula a celula
                        tbl.setValueAt(cliente.getCod(), posicao, 0);
                        tbl.setValueAt(cliente.getNome(), posicao, 1);
                        tbl.setValueAt(cliente.getEndereco(), posicao, 2);
                        tbl.setValueAt(cliente.getCidade(), posicao, 3);
                        tbl.setValueAt(cliente.getBairro(), posicao, 4);
                        tbl.setValueAt(cliente.getUf(), posicao, 5);
                        tbl.setValueAt(cliente.getCep(), posicao, 6);
                        //Usando o MaskFormatter para formatar o dado do campo Telefone
                        tbl.setValueAt(mfTel.valueToString(cliente.getTelefone()), posicao, 7);
                        //Usando o SimpleDateFormate para formatar o dado do campo Data
                        tbl.setValueAt(sdf.format(cliente.getCod()), posicao, 8);

                    }
                    naoachou = true;
                }

            }
            if (op == 2) {
                String nomeTemp = JOptionPane.showInputDialog(this, "Digite o Nome do Cliente", JOptionPane.QUESTION_MESSAGE);
                int posicao = -1;
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String[] linha = {"", "", "", "", "", "", "", "", ""};
                for (Cliente cliente : clientes) {

                    if (cliente.getNome().toUpperCase().contains(nomeTemp.toUpperCase())) {
                        limpaTable();

                        DefaultTableModel tbl
                                = (DefaultTableModel) tblClientes.getModel();

                        posicao++;
                        //incluindo linha em branco
                        tbl.addRow(linha);
                        //preenchendo a linha em branco, celula a celula
                        tbl.setValueAt(cliente.getCod(), posicao, 0);
                        tbl.setValueAt(cliente.getNome(), posicao, 1);
                        tbl.setValueAt(cliente.getEndereco(), posicao, 2);
                        tbl.setValueAt(cliente.getCidade(), posicao, 3);
                        tbl.setValueAt(cliente.getBairro(), posicao, 4);
                        tbl.setValueAt(cliente.getUf(), posicao, 5);
                        tbl.setValueAt(cliente.getCep(), posicao, 6);
                        //Usando o MaskFormatter para formatar o dado do campo Telefone
                        tbl.setValueAt(mfTel.valueToString(cliente.getTelefone()), posicao, 7);
                        //Usando o SimpleDateFormate para formatar o dado do campo Data
                        tbl.setValueAt(sdf.format(cliente.getCod()), posicao, 8);

                    }
                    naoachou = true;
                }
            }
            if (naoachou == false) {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + ex.getMessage(),
                    "Erro:", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed
    private void atualizaTabela() {
        limpaTable();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] linha = {"", "", "", "", "", "", "", "", ""};
        DefaultTableModel tbl
                = (DefaultTableModel) tblClientes.getModel();
        //Criado como referência para posição da linha
        int posicao = -1;
        for (Cliente cliente : clientes) {
            try {
                posicao++;
                //incluindo linha em branco
                tbl.addRow(linha);
                //preenchendo a linha em branco, celula a celula
                tbl.setValueAt(cliente.getCod(), posicao, 0);
                tbl.setValueAt(cliente.getNome(), posicao, 1);
                tbl.setValueAt(cliente.getEndereco(), posicao, 2);
                tbl.setValueAt(cliente.getCidade(), posicao, 3);
                tbl.setValueAt(cliente.getBairro(), posicao, 4);
                tbl.setValueAt(cliente.getUf(), posicao, 5);
                tbl.setValueAt(cliente.getCep(), posicao, 6);
                //Usando o MaskFormatter para formatar o dado do campo Telefone
                tbl.setValueAt(mfTel.valueToString(cliente.getTelefone()), posicao, 7);
                //Usando o SimpleDateFormate para formatar o dado do campo Data
                tbl.setValueAt(sdf.format(cliente.getCod()), posicao, 8);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro: " + ex.getMessage(),
                        "Erro:", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    private void limpaTable() {
        DefaultTableModel tbl = (DefaultTableModel) tblClientes.getModel();
        while (tbl.getRowCount() > 0) {
            tbl.removeRow(0);
        }
    }

    private void habilitaBotoes(boolean hab) {
        btnIncluir.setEnabled(hab);
        btnAlterar.setEnabled(hab);
        btnExcluir.setEnabled(hab);
        btnPesquisar.setEnabled(hab);
        btnGravar.setEnabled(!hab);
        btnCancelar.setEnabled(!hab);

    }

    private void habilitaCampos(boolean hab) {
        txtCodigo.setEnabled(hab);
        txtNome.setEnabled(hab);
        txtEndereco.setEnabled(hab);
        txtCidade.setEnabled(hab);
        txtBairro.setEnabled(hab);
        txtUf.setEnabled(hab);
        txtCep.setEnabled(hab);
        txtTel.setEnabled(hab);
        txtData.setEnabled(hab);
    }

    private void limpaCampos() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtUf.setText("");
        txtCep.setText("");
        txtTel.setText("");
        txtData.setText("");
    }

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
            java.util.logging.Logger.getLogger(FrmCadClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadClientes.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JFormattedTextField txtUf;
    // End of variables declaration//GEN-END:variables

}
