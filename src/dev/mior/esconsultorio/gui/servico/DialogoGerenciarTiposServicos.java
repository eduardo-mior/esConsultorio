package dev.mior.esconsultorio.gui.servico;

import dev.mior.esconsultorio.dao.EntityDAO;
import dev.mior.esconsultorio.entity.TipoServico;
import dev.mior.esconsultorio.util.DialogUtil;
import dev.mior.esconsultorio.util.Imagem;
import dev.mior.esconsultorio.util.Logger;
import java.awt.Frame;
import java.util.ArrayList;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Mior
 */
public class DialogoGerenciarTiposServicos extends javax.swing.JDialog {

    /** User variables and constants */
    private String inputAtual = "", inputVelho;
    private static final EntityDAO<TipoServico> DAO = new EntityDAO<>(TipoServico.class);

    /**
     * Creates new form DialogoBuscaTiposServicos
     * @param parent
     * @param modal
     */
    public DialogoGerenciarTiposServicos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        tiposServicos = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<>());
        jpConsulta = new javax.swing.JPanel();
        jlQuestao = new javax.swing.JLabel();
        jtfInformacao = new javax.swing.JFormattedTextField();
        jbtnBuscar = new javax.swing.JButton();
        jpAcoes = new javax.swing.JPanel();
        jbtnEditar = new javax.swing.JButton();
        jbtnApagar = new javax.swing.JButton();
        jpResultado = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jtTiposServicos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Tipos de Serviços");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Imagem.get("find.png"));
        setName("dialogo"); // NOI18N

        jpConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jlQuestao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlQuestao.setText("Buscar tipo de serviço pela descrição:");
        jlQuestao.setToolTipText("");

        jtfInformacao.setToolTipText("Descrição do Tipo do Serviço");
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
                .addContainerGap(93, Short.MAX_VALUE))
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

        jpAcoes.setBackground(new java.awt.Color(255, 255, 255));
        jpAcoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 15));

        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        jbtnEditar.setMnemonic('E');
        jbtnEditar.setText("Editar Dados");
        jbtnEditar.setToolTipText("");
        jbtnEditar.setFocusPainted(false);
        jbtnEditar.setFocusable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtTiposServicos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jbtnEditar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });
        jpAcoes.add(jbtnEditar);

        jbtnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        jbtnApagar.setMnemonic('A');
        jbtnApagar.setText("Apagar Tipo de Serviço");
        jbtnApagar.setFocusPainted(false);
        jbtnApagar.setFocusable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtTiposServicos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jbtnApagar, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jbtnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnApagarActionPerformed(evt);
            }
        });
        jpAcoes.add(jbtnApagar);

        getContentPane().add(jpAcoes, java.awt.BorderLayout.PAGE_END);

        jpResultado.setBackground(new java.awt.Color(255, 255, 255));
        jpResultado.setMaximumSize(new java.awt.Dimension(480, 190));
        jpResultado.setPreferredSize(new java.awt.Dimension(480, 190));
        jpResultado.setLayout(new java.awt.BorderLayout());

        jScrollPane.setMaximumSize(new java.awt.Dimension(600, 190));
        jScrollPane.setMinimumSize(new java.awt.Dimension(600, 190));
        jScrollPane.setPreferredSize(new java.awt.Dimension(600, 190));

        jtTiposServicos.setFocusable(false);
        jtTiposServicos.setRowHeight(23);
        jtTiposServicos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtTiposServicos.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tiposServicos, jtTiposServicos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create(" ${descricao}"));
        columnBinding.setColumnName("Descrição");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane.setViewportView(jtTiposServicos);
        if (jtTiposServicos.getColumnModel().getColumnCount() > 0) {
            jtTiposServicos.getColumnModel().getColumn(0).setMinWidth(150);
            jtTiposServicos.getColumnModel().getColumn(0).setPreferredWidth(200);
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
            String sql = "SELECT tp FROM TipoServico tp";
            if (!inputAtual.isEmpty()) {
                sql += " WHERE LOWER(tp.descricao) LIKE '%" + inputAtual.toLowerCase() + "%'";
            }
            sql += " ORDER BY tp.descricao";
            Query query = entityManager.createQuery(sql);
            tiposServicos.clear();
            tiposServicos.addAll(query.getResultList());
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        int index = jtTiposServicos.getSelectedRow();
        TipoServico tipoServico = tiposServicos.get(index);
        new DialogoSalvarTipoServico((Frame) getParent(), true, (tp) -> {
            tiposServicos.set(index, tp);
        }, tipoServico).setVisible(true);
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnApagarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente apagar este tipo de serviço?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            try {
                TipoServico tipoServico = tiposServicos.get(jtTiposServicos.getSelectedRow());
                DAO.destroy(tipoServico);
                tiposServicos.remove(tipoServico);
            } catch (Exception e) {
                Logger.save(e);
                JOptionPane.showMessageDialog(this, "Não foi possível apagar o tipo de serviço!", "Erro Interno", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtnApagarActionPerformed
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton jbtnApagar;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JLabel jlQuestao;
    private javax.swing.JPanel jpAcoes;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JTable jtTiposServicos;
    private javax.swing.JFormattedTextField jtfInformacao;
    private java.util.List<TipoServico> tiposServicos;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}