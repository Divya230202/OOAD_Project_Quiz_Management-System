package quizapp.ui.admin;

import javax.swing.JOptionPane;
import models.Question;
import repositories.QuestionRepository;
import services.QuestionService;

public class AddQuestion extends javax.swing.JFrame {

    /**
     * Creates new form AddQuestion
     */
    private final QuestionService questionService;

    public AddQuestion() {
        initComponents();
        this.questionService = new QuestionRepository();
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
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        optionA = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        optionB = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        optionC = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        optionD = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        answer = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/ui/admin/1bg.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(384, 800));
        setMinimumSize(new java.awt.Dimension(384, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/ui/admin/question-and-answer.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 520, 460));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel2.setText("Add Question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 70, 160, 40));

        question.setColumns(20);
        question.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        question.setRows(5);
        jScrollPane2.setViewportView(question);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 590, 70));

        optionA.setColumns(20);
        optionA.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        optionA.setRows(5);
        jScrollPane3.setViewportView(optionA);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 590, 50));

        optionB.setColumns(20);
        optionB.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        optionB.setRows(5);
        jScrollPane4.setViewportView(optionB);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 590, 50));

        optionC.setColumns(20);
        optionC.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        optionC.setRows(5);
        jScrollPane5.setViewportView(optionC);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 590, 50));

        optionD.setColumns(20);
        optionD.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        optionD.setRows(5);
        jScrollPane1.setViewportView(optionD);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 510, 590, 50));

        submit.setBackground(new java.awt.Color(0, 153, 0));
        submit.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 710, 150, 50));

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, 150, 50));

        answer.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        answer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d" }));
        getContentPane().add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 600, 360, 40));

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("(A)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, -1, 30));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("(B)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("(C)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 30, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("(D)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 43, 16));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quizapp/ui/admin/1bg.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new AdminDashboard().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        boolean isAdded = questionService.addQuestion(new Question(question.getText(), optionA.getText(), optionB.getText(), optionC.getText(), optionD.getText(), answer.getSelectedItem().toString()));
        if (isAdded) {
            JOptionPane.showMessageDialog(null, "Question addition successful!");
        } else {
            JOptionPane.showMessageDialog(null, "Question addition failed!");
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> answer;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea optionA;
    private javax.swing.JTextArea optionB;
    private javax.swing.JTextArea optionC;
    private javax.swing.JTextArea optionD;
    private javax.swing.JTextArea question;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
