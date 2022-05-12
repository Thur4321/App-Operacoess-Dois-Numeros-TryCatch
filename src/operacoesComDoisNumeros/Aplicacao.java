package operacoesComDoisNumeros;

import javax.swing.JOptionPane;

public class Aplicacao extends javax.swing.JFrame {

    private DoisNumerosInteiros doisNumerosObj;

    public Aplicacao() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPValores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNumero1 = new javax.swing.JTextField();
        jTFNumero2 = new javax.swing.JTextField();
        jPResultado = new javax.swing.JPanel();
        jLResultado = new javax.swing.JLabel();
        jPOperacoes = new javax.swing.JPanel();
        jBAdicao = new javax.swing.JButton();
        jBSubtracao = new javax.swing.JButton();
        jBMultiplicacao = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBDivisao = new javax.swing.JButton();
        jBPar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tratamento de exceção");
        setFont(new java.awt.Font("Arial Narrow", 0, 10)); // NOI18N
        setResizable(false);

        jPValores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valores:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setText("Número:");

        jLabel2.setText("Número:");

        javax.swing.GroupLayout jPValoresLayout = new javax.swing.GroupLayout(jPValores);
        jPValores.setLayout(jPValoresLayout);
        jPValoresLayout.setHorizontalGroup(
            jPValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPValoresLayout.createSequentialGroup()
                .addGroup(jPValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPValoresLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPValoresLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTFNumero2)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPValoresLayout.setVerticalGroup(
            jPValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPResultadoLayout = new javax.swing.GroupLayout(jPResultado);
        jPResultado.setLayout(jPResultadoLayout);
        jPResultadoLayout.setHorizontalGroup(
            jPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPResultadoLayout.setVerticalGroup(
            jPResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPResultadoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPOperacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operações:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(102, 0, 0))); // NOI18N

        jBAdicao.setText("Adição");
        jBAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicaoActionPerformed(evt);
            }
        });

        jBSubtracao.setText("Subtração");
        jBSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubtracaoActionPerformed(evt);
            }
        });

        jBMultiplicacao.setText("Multiplicação");
        jBMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicacaoActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBDivisao.setText("Divisão");
        jBDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDivisaoActionPerformed(evt);
            }
        });

        jBPar.setText("Divisão Par");
        jBPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBParActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPOperacoesLayout = new javax.swing.GroupLayout(jPOperacoes);
        jPOperacoes.setLayout(jPOperacoesLayout);
        jPOperacoesLayout.setHorizontalGroup(
            jPOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBAdicao, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBSubtracao)
                        .addComponent(jBMultiplicacao)
                        .addComponent(jBDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpar)
                        .addComponent(jBSair))
                    .addComponent(jBPar))
                .addContainerGap())
        );

        jPOperacoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAdicao, jBDivisao, jBLimpar, jBMultiplicacao, jBPar, jBSair, jBSubtracao});

        jPOperacoesLayout.setVerticalGroup(
            jPOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSubtracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBMultiplicacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBDivisao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jBLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSair)
                .addContainerGap())
        );

        jPOperacoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBAdicao, jBDivisao, jBLimpar, jBMultiplicacao, jBPar, jBSair, jBSubtracao});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPValores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jPOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicaoActionPerformed
        realizaOperacao('+');
    }//GEN-LAST:event_jBAdicaoActionPerformed

    private void jBSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubtracaoActionPerformed
        realizaOperacao('-');
    }//GEN-LAST:event_jBSubtracaoActionPerformed

    private void jBMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicacaoActionPerformed
        realizaOperacao('*');
    }//GEN-LAST:event_jBMultiplicacaoActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFNumero1.setText(null);
        jTFNumero2.setText(null);
        jLResultado.setText("");
        jTFNumero1.requestFocusInWindow();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDivisaoActionPerformed
        realizaOperacao('/');
    }//GEN-LAST:event_jBDivisaoActionPerformed

    private void jBParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBParActionPerformed
        realizaOperacao('%');
    }//GEN-LAST:event_jBParActionPerformed

    private void realizaOperacao(char op) {
        int numero1;
        int numero2;
        try {
            numero1 = Integer.parseInt(jTFNumero1.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Fornaça um valor numérico", "Aviso", 0);
            jTFNumero1.requestFocusInWindow();
            return;
        } finally {
            jTFNumero1.setText(null);
        }
        try {
            numero2 = Integer.parseInt(jTFNumero2.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Fornaça um valor numérico", "Aviso", 0);
            jTFNumero2.requestFocusInWindow();
            return;
        } finally {
            jTFNumero2.setText(null);
        }

        doisNumerosObj = new DoisNumerosInteiros(numero1, numero2);

        int resultOperacao = 0;
        switch (op) {
            case '+':
                resultOperacao = doisNumerosObj.adicao();
                break;
            case '-':
                resultOperacao = doisNumerosObj.subtracao();
                break;
            case '*':
                resultOperacao = doisNumerosObj.multiplicacao();
                break;
            case '/':
                try {
                    resultOperacao = doisNumerosObj.divisao();
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(this, "O segundo valor deve ser maior que zero", "Aviso", 0);
                    jTFNumero2.requestFocusInWindow();
                } finally {
                    jTFNumero2.setText(null);
                }
                break;
            case '%':
                try{
                resultOperacao = doisNumerosObj.divisaoPar();
                } catch (NaoParException ex){
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Aviso", 0);
                    jTFNumero2.requestFocusInWindow();
                } finally{
                    jTFNumero2.setText(null);
                }
                break;

        }//fim do switch
        jLResultado.setText(String.valueOf(doisNumerosObj.getNumero1()) + op + doisNumerosObj.getNumero2() + " = " + String.valueOf(resultOperacao));
    }//fim do método realizaOperacoes 

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicao;
    private javax.swing.JButton jBDivisao;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBMultiplicacao;
    private javax.swing.JButton jBPar;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSubtracao;
    private javax.swing.JLabel jLResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPOperacoes;
    private javax.swing.JPanel jPResultado;
    private javax.swing.JPanel jPValores;
    private javax.swing.JTextField jTFNumero1;
    private javax.swing.JTextField jTFNumero2;
    // End of variables declaration//GEN-END:variables
}