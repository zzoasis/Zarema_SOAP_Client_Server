package newpackage;
import zarema_soap_client_server.Answer;
import zarema_soap_client_server.ICommunicationWithClient;
import java.awt.Color;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
/**
 *
 * @author Зарема
 */
public class NewJFrame extends javax.swing.JFrame {
    String address = "";
    ICommunicationWithClient server;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabelX = new javax.swing.JLabel();
        jLabelResult = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jTextFieldB = new javax.swing.JTextField();
        jTextFieldX = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jButtonSolve = new javax.swing.JButton();
        jLabelX1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newpackage/5variant.JPG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 552, 240);

        jLabelA.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabelA.setText("Введите a = ");
        getContentPane().add(jLabelA);
        jLabelA.setBounds(30, 300, 112, 24);

        jLabelB.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabelB.setText("Введите b =  ");
        getContentPane().add(jLabelB);
        jLabelB.setBounds(30, 330, 120, 24);

        jLabelX.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabelX.setText("Адрес:");
        getContentPane().add(jLabelX);
        jLabelX.setBounds(30, 400, 58, 24);

        jLabelResult.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabelResult.setText("Ответ: y = ");
        getContentPane().add(jLabelResult);
        jLabelResult.setBounds(410, 330, 210, 24);

        jTextFieldA.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextFieldA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldA);
        jTextFieldA.setBounds(150, 300, 70, 25);

        jTextFieldB.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        getContentPane().add(jTextFieldB);
        jTextFieldB.setBounds(150, 330, 70, 25);

        jTextFieldX.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        getContentPane().add(jTextFieldX);
        jTextFieldX.setBounds(150, 360, 70, 25);

        jTextFieldAddress.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextFieldAddress.setText("http://localhost:1111/zarema/soap");
        getContentPane().add(jTextFieldAddress);
        jTextFieldAddress.setBounds(90, 400, 280, 25);

        jButtonClear.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButtonClear.setText("Очистить");
        jButtonClear.setName(""); // NOI18N
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear);
        jButtonClear.setBounds(250, 350, 150, 40);

        jButtonSolve.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jButtonSolve.setText("Решить");
        jButtonSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSolveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSolve);
        jButtonSolve.setBounds(250, 300, 150, 40);

        jLabelX1.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jLabelX1.setText("Введите x = ");
        getContentPane().add(jLabelX1);
        jLabelX1.setBounds(30, 360, 120, 24);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Вариант 5");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 0, 180, 50);

        setSize(new java.awt.Dimension(597, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldA.setText("");
        jTextFieldB.setText("");
        jTextFieldX.setText("");
        jTextFieldAddress.setText("http://localhost:1111/zarema/soap");
        jLabelResult.setText("Ответ: y = ");
        jLabelResult.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSolveActionPerformed
        try {
            String newAddress = jTextFieldAddress.getText();

            if (!address.equals(newAddress)) {
                address = newAddress;
                JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
                factoryBean.setServiceClass(ICommunicationWithClient.class);
                factoryBean.setAddress(address);
                server = (ICommunicationWithClient) factoryBean.create();
            }
            double a = Double.parseDouble(jTextFieldA.getText());
            double b = Double.parseDouble(jTextFieldB.getText());
            double x = Double.parseDouble(jTextFieldX.getText());
            // Вызов удаленного метода на сервере через web-технологию SOAP
            Answer answer = server.solution(a, b, x);
            if (answer != null) {
                //jLabelResult.setText("Ответ: Y = " + answer.getY());
                jLabelResult.setForeground(Color.BLACK);
                jLabelResult.setText(String.format("Ответ: y = %.3f", answer.getY()));
            } else {
                jLabelResult.setText("Ошибка");
                jLabelResult.setForeground(Color.red);
            }
        } catch (NumberFormatException e) {
            jLabelResult.setText("Ошибка");
            jLabelResult.setForeground(Color.red);
        }
    }//GEN-LAST:event_jButtonSolveActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSolve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelX;
    private javax.swing.JLabel jLabelX1;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JTextField jTextFieldX;
    // End of variables declaration//GEN-END:variables
}
