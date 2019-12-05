package dev.mior.esconsultorio.gui.consulta;

import dev.mior.esconsultorio.dao.EntityDAO;
import dev.mior.esconsultorio.entity.Consulta;
import dev.mior.esconsultorio.util.DialogUtil;
import dev.mior.esconsultorio.util.Logger;
import java.awt.Frame;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import javax.swing.JOptionPane;

/**
 *
 * @author Mior
 */
public class DialogoGerenciarClienteConsultas extends javax.swing.JDialog {

    /** User variables and constants */
    private static final EntityDAO<Consulta> DAO = new EntityDAO<>(Consulta.class);

    /**
     * Creates new form DialogoHistoricoDeConsultas
     * @param parent
     * @param modal
     */
    public DialogoGerenciarClienteConsultas(java.awt.Frame parent, boolean modal) {
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
        consultas = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<>());
        jpBuscarCliente = new javax.swing.JPanel();
        jlPeriodo = new javax.swing.JLabel();
        jdpPeriodoInicial = new org.jdesktop.swingx.JXDatePicker();
        jlAte = new javax.swing.JLabel();
        jdpPeriodoFinal = new org.jdesktop.swingx.JXDatePicker();
        jcbTodoPeriodo = new javax.swing.JCheckBox();
        jbtnBuscar = new javax.swing.JButton();
        jpHistoricoDoCliente = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jtConsultas = new javax.swing.JTable();
        jpBotoes = new javax.swing.JPanel();
        jbtnVisualizarConsulta = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Histórico de Consultas");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("dialogo"); // NOI18N

        jpBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));

        jlPeriodo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlPeriodo.setText("Período:   De");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jcbTodoPeriodo, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), jdpPeriodoInicial, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jcbTodoPeriodo, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), jdpPeriodoInicial, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jlAte.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jlAte.setText("até");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jcbTodoPeriodo, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), jdpPeriodoFinal, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jcbTodoPeriodo, org.jdesktop.beansbinding.ELProperty.create("${!selected}"), jdpPeriodoFinal, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jcbTodoPeriodo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbTodoPeriodo.setSelected(true);
        jcbTodoPeriodo.setText("Todo o Período");
        jcbTodoPeriodo.setFocusPainted(false);
        jcbTodoPeriodo.setFocusable(false);

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

        javax.swing.GroupLayout jpBuscarClienteLayout = new javax.swing.GroupLayout(jpBuscarCliente);
        jpBuscarCliente.setLayout(jpBuscarClienteLayout);
        jpBuscarClienteLayout.setHorizontalGroup(
            jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlPeriodo)
                .addGap(3, 3, 3)
                .addComponent(jdpPeriodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jlAte)
                .addGap(4, 4, 4)
                .addComponent(jdpPeriodoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbTodoPeriodo)
                .addGap(18, 18, 18)
                .addComponent(jbtnBuscar)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jpBuscarClienteLayout.setVerticalGroup(
            jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPeriodo)
                    .addComponent(jdpPeriodoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAte)
                    .addComponent(jdpPeriodoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTodoPeriodo)
                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jpBuscarCliente, java.awt.BorderLayout.PAGE_START);

        jpHistoricoDoCliente.setBackground(new java.awt.Color(255, 255, 255));

        jtConsultas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtConsultas.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, consultas, jtConsultas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaInicial}"));
        columnBinding.setColumnName("Data");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaInicial}"));
        columnBinding.setColumnName("Hora Inicial");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaFinal}"));
        columnBinding.setColumnName("Hora Final");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorTotal}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${servicos}"));
        columnBinding.setColumnName("Servicos Prestados");
        columnBinding.setColumnClass(java.util.List.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${observacoes}"));
        columnBinding.setColumnName("Observacoes");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane.setViewportView(jtConsultas);
        if (jtConsultas.getColumnModel().getColumnCount() > 0) {
            jtConsultas.getColumnModel().getColumn(0).setMinWidth(80);
            jtConsultas.getColumnModel().getColumn(0).setPreferredWidth(80);
            jtConsultas.getColumnModel().getColumn(0).setMaxWidth(80);
            jtConsultas.getColumnModel().getColumn(0).setCellRenderer(new dev.mior.esconsultorio.gui.renderer.DataRenderer());
            jtConsultas.getColumnModel().getColumn(1).setMinWidth(80);
            jtConsultas.getColumnModel().getColumn(1).setPreferredWidth(80);
            jtConsultas.getColumnModel().getColumn(1).setMaxWidth(80);
            jtConsultas.getColumnModel().getColumn(1).setCellRenderer(new dev.mior.esconsultorio.gui.renderer.HorarioRenderer());
            jtConsultas.getColumnModel().getColumn(2).setMinWidth(80);
            jtConsultas.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtConsultas.getColumnModel().getColumn(2).setMaxWidth(80);
            jtConsultas.getColumnModel().getColumn(2).setCellRenderer(new dev.mior.esconsultorio.gui.renderer.HorarioRenderer());
            jtConsultas.getColumnModel().getColumn(3).setMinWidth(150);
            jtConsultas.getColumnModel().getColumn(3).setPreferredWidth(150);
            jtConsultas.getColumnModel().getColumn(3).setMaxWidth(150);
            jtConsultas.getColumnModel().getColumn(3).setCellRenderer(new dev.mior.esconsultorio.gui.renderer.DinheiroRenderer());
            jtConsultas.getColumnModel().getColumn(4).setCellRenderer(new dev.mior.esconsultorio.gui.renderer.ListaRenderer());
            jtConsultas.getColumnModel().getColumn(5).setCellRenderer(new dev.mior.esconsultorio.gui.renderer.AreaDeTextoRenderer());
        }

        javax.swing.GroupLayout jpHistoricoDoClienteLayout = new javax.swing.GroupLayout(jpHistoricoDoCliente);
        jpHistoricoDoCliente.setLayout(jpHistoricoDoClienteLayout);
        jpHistoricoDoClienteLayout.setHorizontalGroup(
            jpHistoricoDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
        );
        jpHistoricoDoClienteLayout.setVerticalGroup(
            jpHistoricoDoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        getContentPane().add(jpHistoricoDoCliente, java.awt.BorderLayout.CENTER);

        jpBotoes.setBackground(new java.awt.Color(255, 255, 255));
        jpBotoes.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 15));

        jbtnVisualizarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/info.png"))); // NOI18N
        jbtnVisualizarConsulta.setMnemonic('V');
        jbtnVisualizarConsulta.setText("Visualizar Dados Completos da Consulta");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jtConsultas, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jbtnVisualizarConsulta, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jbtnVisualizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVisualizarConsultaActionPerformed(evt);
            }
        });
        jpBotoes.add(jbtnVisualizarConsulta);

        getContentPane().add(jpBotoes, java.awt.BorderLayout.PAGE_END);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Query createQuery(String sql, Date periodoInicial, Date periodoFinal) {
        Query query = entityManager.createQuery(sql);
        if (periodoInicial != null) query.setParameter("periodoInicial", periodoInicial, TemporalType.TIMESTAMP);
        if (periodoFinal != null) query.setParameter("periodoFinal", periodoFinal, TemporalType.TIMESTAMP);
        return query;
    }
    
    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        String sql = "SELECT c FROM Consulta c";
        Query query;
        if (!jcbTodoPeriodo.isSelected()) {
            Date periodoInicial = jdpPeriodoInicial.getDate();
            Date periodoFinal = jdpPeriodoFinal.getDate();
            if (periodoFinal != null && periodoInicial != null) {
                if (periodoInicial.getTime() > periodoFinal.getTime()) {
                    JOptionPane.showMessageDialog(this, "Os periodos não podem ser inconsistentes.\nO periodo final esta vindo antes do inicial!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    sql += " and c.horaInicial > :periodoInicial and c.horaFinal < :periodoFinal";
                }
            } else if (periodoInicial != null) {
                sql += " and c.horaInicial > :periodoInicial";
            } else if (periodoFinal != null) {
                sql += " and c.horaFinal < :periodoFinal";
            } else {
                JOptionPane.showMessageDialog(this, "Você deve informar o período para poder efeutar a busca!\nCaso não queira selecione a opção \"Todo o Período\".", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            query = createQuery(sql, periodoInicial, periodoFinal);
        } else {
            query = createQuery(sql, null, null);
        }
        consultas.clear();
        consultas.addAll(query.getResultList());
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnVisualizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVisualizarConsultaActionPerformed
        new DialogoVisualizarConsulta((Frame) getParent(), true, consultas.get(jtConsultas.getSelectedRow())).setVisible(true);
    }//GEN-LAST:event_jbtnVisualizarConsultaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<Consulta> consultas;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JToggleButton jbtnVisualizarConsulta;
    private javax.swing.JCheckBox jcbTodoPeriodo;
    private org.jdesktop.swingx.JXDatePicker jdpPeriodoFinal;
    private org.jdesktop.swingx.JXDatePicker jdpPeriodoInicial;
    private javax.swing.JLabel jlAte;
    private javax.swing.JLabel jlPeriodo;
    private javax.swing.JPanel jpBotoes;
    private javax.swing.JPanel jpBuscarCliente;
    private javax.swing.JPanel jpHistoricoDoCliente;
    private javax.swing.JTable jtConsultas;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    
}