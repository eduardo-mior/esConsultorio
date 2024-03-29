package dev.mior.esconsultorio.gui.cliente;

import dev.mior.esconsultorio.dao.EntityDAO;
import dev.mior.esconsultorio.entity.Cliente;
import dev.mior.esconsultorio.util.DialogUtil;
import dev.mior.esconsultorio.util.Imagem;
import dev.mior.esconsultorio.util.Logger;
import dev.mior.esconsultorio.util.Validar;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Mior
 */
public class DialogoBuscarCliente extends javax.swing.JDialog {

    /** User variables and constants */
    private String filtroAtual = "Nome", filtroVelho;
    private String inputAtual = "", inputVelho;
    private final Consumer<Cliente> action;
    
    /**
     * Creates new form DialogoBuscaCliente
     * @param parent
     * @param modal
     * @param action
     */
    public DialogoBuscarCliente(java.awt.Frame parent, boolean modal, Consumer<Cliente> action) {
        super(parent, modal);
        this.action = action;
        initComponents();
        DialogUtil.addEscapeListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = EntityDAO.EMF.createEntityManager();
        clientes = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<>());
        jpConsulta = new javax.swing.JPanel();
        jlQuestao = new javax.swing.JLabel();
        jcbBuscarPor = new javax.swing.JComboBox<>();
        jtfInformacao = new javax.swing.JFormattedTextField();
        jbtnBuscar = new javax.swing.JButton();
        jpConfirmar = new javax.swing.JPanel();
        jbtnConfirmar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jpResultado = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Imagem.get("find.png"));
        setName("dialogo"); // NOI18N

        jpConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jlQuestao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlQuestao.setText("Buscar clientes por:");
        jlQuestao.setToolTipText("Método de busca");

        jcbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "RG", "Telefone", "E-Mail" }));
        jcbBuscarPor.setToolTipText("Método de busca");
        jcbBuscarPor.setFocusable(false);
        jcbBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBuscarPorActionPerformed(evt);
            }
        });

        jtfInformacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfInformacao.setMargin(new java.awt.Insets(2, 1, 2, 1));

        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/find.png"))); // NOI18N
        jbtnBuscar.setMnemonic('B');
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.setToolTipText("Efetuar busca");
        jbtnBuscar.setFocusPainted(false);
        jbtnBuscar.setFocusable(false);
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultaLayout = new javax.swing.GroupLayout(jpConsulta);
        jpConsulta.setLayout(jpConsultaLayout);
        jpConsultaLayout.setHorizontalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlQuestao)
                .addGap(6, 6, 6)
                .addComponent(jcbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBuscar)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfInformacao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultaLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jcbBuscarPor))))
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlQuestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );

        getContentPane().add(jpConsulta, java.awt.BorderLayout.PAGE_START);

        jpConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jpConfirmar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 15));

        jbtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirm.png"))); // NOI18N
        jbtnConfirmar.setMnemonic('C');
        jbtnConfirmar.setText("Confirmar");
        jbtnConfirmar.setToolTipText("");
        jbtnConfirmar.setFocusPainted(false);
        jbtnConfirmar.setFocusable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtClientes, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jbtnConfirmar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jbtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmarActionPerformed(evt);
            }
        });
        jpConfirmar.add(jbtnConfirmar);

        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.setFocusPainted(false);
        jbtnCancelar.setFocusable(false);
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });
        jpConfirmar.add(jbtnCancelar);

        getContentPane().add(jpConfirmar, java.awt.BorderLayout.PAGE_END);

        jpResultado.setBackground(new java.awt.Color(255, 255, 255));
        jpResultado.setMaximumSize(new java.awt.Dimension(480, 400));
        jpResultado.setPreferredSize(new java.awt.Dimension(480, 400));
        jpResultado.setLayout(new java.awt.BorderLayout());

        jScrollPane.setMaximumSize(new java.awt.Dimension(700, 390));
        jScrollPane.setMinimumSize(new java.awt.Dimension(700, 390));
        jScrollPane.setPreferredSize(new java.awt.Dimension(700, 390));

        jtClientes.setFocusable(false);
        jtClientes.setRowHeight(23);
        jtClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtClientes.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientes, jtClientes);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${telefone}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${cpf}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${rg}"));
        columnBinding.setColumnName("RG");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setMinWidth(150);
            jtClientes.getColumnModel().getColumn(0).setPreferredWidth(200);
            jtClientes.getColumnModel().getColumn(1).setMinWidth(150);
            jtClientes.getColumnModel().getColumn(2).setMinWidth(90);
            jtClientes.getColumnModel().getColumn(2).setPreferredWidth(97);
            jtClientes.getColumnModel().getColumn(2).setMaxWidth(100);
            jtClientes.getColumnModel().getColumn(3).setMinWidth(100);
            jtClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            jtClientes.getColumnModel().getColumn(3).setMaxWidth(100);
            jtClientes.getColumnModel().getColumn(4).setMinWidth(81);
            jtClientes.getColumnModel().getColumn(4).setPreferredWidth(81);
            jtClientes.getColumnModel().getColumn(4).setMaxWidth(81);
        }

        jpResultado.add(jScrollPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpResultado, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void trocarMascara(String mascara) {
        try {
            jtfInformacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(mascara)));
        } catch (ParseException e) {
           Logger.save(e);
        }
    }
    
    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        inputAtual = jtfInformacao.getText().trim().replace("'", "").replace("\"", "");
        if (!inputAtual.equals(inputVelho)) {
            inputVelho = inputAtual;
            String sql = "SELECT c FROM Cliente c WHERE ";
            switch (filtroAtual) {
                case "CPF":
                    if (Validar.CPF(inputAtual)) {
                        sql += "c.cpf = '" + inputAtual + "'";
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "O CPF informado não é valido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                case "RG":
                    if (Validar.RG(inputAtual)) {
                        sql += "c.rg = '" + inputAtual + "'";
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "O RG informado não é valido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                case "Telefone":
                    if (Validar.telefone(inputAtual, 6)) {
                        sql += "c.telefone LIKE '%" + inputAtual + "%'";
                        break;
                    }  else {
                        JOptionPane.showMessageDialog(this, "O telefone informado não é valido!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                case "E-Mail":
                    if (!inputAtual.isEmpty()) {
                        sql += "c.email LIKE '%" + inputAtual + "%'";
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Informe o E-Mail ou parte do E-Mail para poder efetuar a busca!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                default:
                    if (!inputAtual.isEmpty()) {
                        sql += "LOWER(c.nome) LIKE '%" + inputAtual.toLowerCase() + "%'";
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Informe o nome ou parte do nome para poder efetuar a busca!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
            }
            sql += " ORDER BY c.nome";
            Query query = entityManager.createQuery(sql);
            clientes.clear();
            clientes.addAll(query.getResultList());
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jcbBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBuscarPorActionPerformed
        filtroAtual = jcbBuscarPor.getSelectedItem().toString();
        if (!filtroAtual.equals(filtroVelho)) {
            switch (filtroAtual) {
                case "CPF":
                    trocarMascara("###.###.###-##");
                    break;
                case "RG":
                    trocarMascara("##########");
                    break;
                case "Telefone":
                    trocarMascara("(##) #########");
                    break;
                default:
                    jtfInformacao.setFormatterFactory(null);
                    break;
            }
            filtroVelho = filtroAtual;
            inputVelho = null;
            jtfInformacao.setText("");
        }
    }//GEN-LAST:event_jcbBuscarPorActionPerformed

    private void jbtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarActionPerformed
        Cliente c = clientes.get(jtClientes.getSelectedRow());
        if (action != null) {
            action.accept(c);
        }
        this.dispose();
    }//GEN-LAST:event_jbtnConfirmarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<Cliente> clientes;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnConfirmar;
    private javax.swing.JComboBox<String> jcbBuscarPor;
    private javax.swing.JLabel jlQuestao;
    private javax.swing.JPanel jpConfirmar;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JTable jtClientes;
    private javax.swing.JFormattedTextField jtfInformacao;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}