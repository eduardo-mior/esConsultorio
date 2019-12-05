package dev.mior.esconsultorio.gui.cliente;

import dev.mior.esconsultorio.defaults.Defaults;
import dev.mior.esconsultorio.entity.Cliente;
import dev.mior.esconsultorio.util.DialogUtil;
import dev.mior.esconsultorio.util.Imagem;
import java.util.Date;

/**
 *
 * @author Mior
 */
public class DialogoVisualizarCliente extends javax.swing.JDialog {

    /** User variables and constants */
    private final Cliente cliente;
    
    /**
     * Creates new form DialogoVisualizarConsulta
     * @param parent
     * @param modal
     * @param cliente
     */
    public DialogoVisualizarCliente(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        this.cliente = cliente;
        initComponents();
        DialogUtil.addEscapeListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpGeral = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jlCPF = new javax.swing.JLabel();
        jlRG = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlNomeValue = new javax.swing.JLabel();
        jlCPFValue = new javax.swing.JLabel();
        jlRGValue = new javax.swing.JLabel();
        jlEmailValue = new javax.swing.JLabel();
        jlTelefoneValue = new javax.swing.JLabel();
        jlSexoValue = new javax.swing.JLabel();
        jlDataDeNascimento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações Do Cliente");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(Imagem.get("info.png"));
        setName("dialogo"); // NOI18N
        setResizable(false);

        jpGeral.setBackground(new java.awt.Color(255, 255, 255));

        jlNome.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlNome.setText("Nome");
        jlNome.setFocusable(false);

        jlCPF.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlCPF.setText("CPF:");
        jlCPF.setFocusable(false);

        jlRG.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlRG.setText("RG:");
        jlRG.setFocusable(false);

        jlEmail.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlEmail.setText("E-Mail");
        jlEmail.setFocusable(false);

        jlTelefone.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlTelefone.setText("Telefone:");
        jlTelefone.setFocusable(false);

        jlSexo.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlSexo.setText("Sexo:");
        jlSexo.setFocusable(false);

        jlNomeValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlNomeValue.setText(cliente.getNome());
        jlNomeValue.setFocusable(false);

        jlCPFValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlCPFValue.setText(checkIfInformed(cliente.getCpf())
        );
        jlCPFValue.setFocusable(false);

        jlRGValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlRGValue.setText(checkIfInformed(cliente.getRg()));
        jlRGValue.setFocusable(false);

        jlEmailValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlEmailValue.setText(checkIfInformed(cliente.getEmail()));
        jlEmailValue.setFocusable(false);

        jlTelefoneValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlTelefoneValue.setText(cliente.getTelefone());
        jlTelefoneValue.setFocusable(false);

        jlSexoValue.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jlSexoValue.setText(cliente.getSexo() == 'M' ? "Masculino" : "Feminino");
        jlSexoValue.setFocusable(false);

        jlDataDeNascimento.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jlDataDeNascimento.setText("Nascimento:");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText(checkIfInformed(cliente.getDataNascimento()));

        javax.swing.GroupLayout jpGeralLayout = new javax.swing.GroupLayout(jpGeral);
        jpGeral.setLayout(jpGeralLayout);
        jpGeralLayout.setHorizontalGroup(
            jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlDataDeNascimento)
                    .addComponent(jlCPF)
                    .addComponent(jlNome)
                    .addComponent(jlRG)
                    .addComponent(jlEmail)
                    .addComponent(jlTelefone)
                    .addComponent(jlSexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEmailValue)
                    .addComponent(jlTelefoneValue)
                    .addComponent(jlCPFValue)
                    .addComponent(jlNomeValue)
                    .addComponent(jlSexoValue)
                    .addComponent(jlRGValue)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpGeralLayout.setVerticalGroup(
            jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeValue)
                    .addComponent(jlNome))
                .addGap(18, 18, 18)
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCPF)
                    .addComponent(jlCPFValue))
                .addGap(18, 18, 18)
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRG)
                    .addComponent(jlRGValue))
                .addGap(18, 18, 18)
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jlEmailValue))
                .addGap(18, 18, 18)
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jlTelefoneValue))
                .addGap(18, 18, 18)
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo)
                    .addComponent(jlSexoValue))
                .addGap(18, 18, 18)
                .addGroup(jpGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataDeNascimento)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpGeral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private String checkIfInformed(String original) {
        if (original == null || original.trim().isEmpty()) {
            return "<html><i>Não Informado</i></html>";
        } else {
            return original;
        }
    }
        
    private String checkIfInformed(Date original) {
        if (original == null) {
            return "<html><i>Não Informado</i></html>";
        } else {
            return Defaults.D_FORMAT.format(original);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCPFValue;
    private javax.swing.JLabel jlDataDeNascimento;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEmailValue;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeValue;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlRGValue;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlSexoValue;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTelefoneValue;
    private javax.swing.JPanel jpGeral;
    // End of variables declaration//GEN-END:variables

}