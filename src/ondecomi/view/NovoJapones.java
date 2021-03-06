/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.view;
import ondecomi.model.Japones;
/**
 *
 * @author Luan Amor
 */
public class NovoJapones extends javax.swing.JFrame {
    private String nome;
    private String ender;
    /**
     * Creates new form NovoJapones
     */
    public NovoJapones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notaGeralJapones = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVoltarJapones = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNomeJapones = new javax.swing.JTextField();
        btnSalvarJapones = new javax.swing.JButton();
        txtEndJapones = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        notaPrecoJapones = new javax.swing.JTextField();
        lbend = new javax.swing.JLabel();
        notaAmbienteJapones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        notaAtendimentoJapones = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        notaPFrescoJapones = new javax.swing.JTextField();
        notaVariedadesJapones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Atendimento");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nota Geral");

        notaGeralJapones.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        notaGeralJapones.setText("0.0");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Peixe Fresco");

        btnVoltarJapones.setText("Voltar");
        btnVoltarJapones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarJaponesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Variedades");

        txtNomeJapones.setText("Informe o nome do Restaurante?");
        txtNomeJapones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeJaponesActionPerformed(evt);
            }
        });

        btnSalvarJapones.setText("Salvar");
        btnSalvarJapones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarJaponesActionPerformed(evt);
            }
        });

        txtEndJapones.setText("Qual o endereço?");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Nome                ");

        lbend.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbend.setText("Endereço");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Preço");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Ambiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnVoltarJapones, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notaGeralJapones, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvarJapones, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(notaVariedadesJapones, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(notaPFrescoJapones, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(notaAtendimentoJapones, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(notaAmbienteJapones, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(notaPrecoJapones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbend)
                            .addComponent(jLabel1))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomeJapones)
                            .addComponent(txtEndJapones, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeJapones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbend)
                    .addComponent(txtEndJapones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(notaPrecoJapones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(notaAmbienteJapones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(notaAtendimentoJapones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(notaPFrescoJapones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(notaVariedadesJapones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(notaGeralJapones))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltarJapones)
                    .addComponent(btnSalvarJapones))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarJaponesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarJaponesActionPerformed
        JJapones japas = new JJapones();
        japas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarJaponesActionPerformed

    private void btnSalvarJaponesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarJaponesActionPerformed
        //Nome e endereço, construtor
        this.ender = txtEndJapones.getText();
        this.nome = txtNomeJapones.getText();
        Japones newJapones = new Japones(nome, ender);
        //Notas individuais
        newJapones.setPreco(Float.parseFloat(notaPrecoJapones.getText()));
        newJapones.setVariedades(Float.parseFloat(notaVariedadesJapones.getText()));
        newJapones.setPeixeFresco(Float.parseFloat(notaPFrescoJapones.getText()));
        newJapones.setAtendimento(Float.parseFloat(notaAtendimentoJapones.getText()));
        newJapones.setAmbiente(Float.parseFloat(notaAmbienteJapones.getText()));
        //NotaGeral
        newJapones.setNotaGeral((newJapones.getAmbiente()+ newJapones.getPreco()+ newJapones.getAtendimento()+ newJapones.getVariedades()+ newJapones.getPeixeFresco())/5);
        notaGeralJapones.setText(Float.toString(newJapones.getNotaGeral()));
        // console
        System.out.println(newJapones.getNotaGeral());
        System.out.println(newJapones.getNomeLocal());

    }//GEN-LAST:event_btnSalvarJaponesActionPerformed

    private void txtNomeJaponesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeJaponesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeJaponesActionPerformed

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
            java.util.logging.Logger.getLogger(NovoJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoJapones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarJapones;
    private javax.swing.JButton btnVoltarJapones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbend;
    private javax.swing.JTextField notaAmbienteJapones;
    private javax.swing.JTextField notaAtendimentoJapones;
    private javax.swing.JLabel notaGeralJapones;
    private javax.swing.JTextField notaPFrescoJapones;
    private javax.swing.JTextField notaPrecoJapones;
    private javax.swing.JTextField notaVariedadesJapones;
    private javax.swing.JTextField txtEndJapones;
    private javax.swing.JTextField txtNomeJapones;
    // End of variables declaration//GEN-END:variables
}
