package dev.mior.esconsultorio.gui.produto;

import dev.mior.esconsultorio.dao.EntityDAO;
import dev.mior.esconsultorio.entity.Produto;
import dev.mior.esconsultorio.util.DialogUtil;
import dev.mior.esconsultorio.util.Imagem;
import java.util.ArrayList;
import java.util.function.Consumer;
import javax.persistence.Query;

/**
 *
 * @author Mior
 */
public class DialogoBuscarProduto extends javax.swing.JDialog {

    /** User variables and constants */
    private String inputAtual = "", inputVelho;
    private final Consumer<Produto> action;
    
    /**
     * Creates new form DialogoBuscaProduto
     * @param parent
     * @param modal
     * @param action
     */
    public DialogoBuscarProduto(java.awt.Frame parent, boolean modal, Consumer<Produto> action) {
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
        produtos = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<>());
        jpConsulta = new javax.swing.JPanel();
        jlQuestao = new javax.swing.JLabel();
        jtfInformacao = new javax.swing.JFormattedTextField();
        jbtnBuscar = new javax.swing.JButton();
        jpConfirmar = new javax.swing.JPanel();
        jbtnConfirmar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jpResultado = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Produto");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Imagem.get("find.png"));
        setName("dialogo"); // NOI18N

        jpConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jlQuestao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlQuestao.setText("Buscar produto pela descrição:");
        jlQuestao.setToolTipText("");

        jtfInformacao.setToolTipText("Descrição do produto");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnBuscar)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQuestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfInformacao)
                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
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

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtProdutos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jbtnConfirmar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
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
        jpResultado.setPreferredSize(new java.awt.Dimension(480, 190));
        jpResultado.setLayout(new java.awt.BorderLayout());

        jScrollPane.setMaximumSize(new java.awt.Dimension(600, 190));
        jScrollPane.setMinimumSize(new java.awt.Dimension(600, 190));
        jScrollPane.setPreferredSize(new java.awt.Dimension(600, 190));

        jtProdutos.setFocusable(false);
        jtProdutos.setRowHeight(23);
        jtProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtProdutos.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, produtos, jtProdutos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${descricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${tipoProduto}"));
        columnBinding.setColumnName("Tipo do Produto");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(1).setMinWidth(85);
            jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(85);
            jtProdutos.getColumnModel().getColumn(1).setMaxWidth(125);
            jtProdutos.getColumnModel().getColumn(1).setCellRenderer(new dev.mior.esconsultorio.gui.renderer.DinheiroRenderer());
        }

        jpResultado.add(jScrollPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpResultado, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        inputAtual = jtfInformacao.getText().trim().replace("'", "").replace("\"", "");
        if (!inputAtual.equals(inputVelho)) {
            inputVelho = inputAtual;
            String sql = "SELECT p FROM Produto p";
            if (!inputAtual.isEmpty()) {
                sql += " WHERE LOWER(p.descricao) LIKE '%" + inputAtual.toLowerCase() + "%'";
            }
            sql += " ORDER BY p.descricao";
            Query query = entityManager.createQuery(sql);
            produtos.clear();
            produtos.addAll(query.getResultList());
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmarActionPerformed
        Produto p = produtos.get(jtProdutos.getSelectedRow());
        if (action != null) {
            action.accept(p);
        }
        this.dispose();
    }//GEN-LAST:event_jbtnConfirmarActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnConfirmar;
    private javax.swing.JLabel jlQuestao;
    private javax.swing.JPanel jpConfirmar;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JFormattedTextField jtfInformacao;
    private java.util.List<Produto> produtos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}