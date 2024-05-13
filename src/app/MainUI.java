
package app;


public class MainUI extends javax.swing.JFrame {

    
    public MainUI() {
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

        Button_minus = new javax.swing.JButton();
        Button_divide = new javax.swing.JButton();
        Button_multiply = new javax.swing.JButton();
        copyright_area = new javax.swing.JLabel();
        Display_of_calculator = new javax.swing.JTextField();
        Button_euqal = new javax.swing.JButton();
        Button_clear = new javax.swing.JButton();
        Button_plus = new javax.swing.JButton();
        Number_7 = new javax.swing.JButton();
        Number_2 = new javax.swing.JButton();
        Number_3 = new javax.swing.JButton();
        Number_4 = new javax.swing.JButton();
        Number_5 = new javax.swing.JButton();
        Number_6 = new javax.swing.JButton();
        Number_1 = new javax.swing.JButton();
        Number_8 = new javax.swing.JButton();
        Number_9 = new javax.swing.JButton();
        Number_0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Button_minus.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button_minus.setText("-");
        Button_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_minusActionPerformed(evt);
            }
        });

        Button_divide.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button_divide.setText("/");
        Button_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_divideActionPerformed(evt);
            }
        });

        Button_multiply.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button_multiply.setText("*");
        Button_multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_multiplyActionPerformed(evt);
            }
        });

        copyright_area.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        copyright_area.setText("Copyright @Tajuar Akash");

        Display_of_calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_of_calculatorActionPerformed(evt);
            }
        });

        Button_euqal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button_euqal.setText("=");
        Button_euqal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_euqalActionPerformed(evt);
            }
        });

        Button_clear.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        Button_clear.setText("Clear");
        Button_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_clearActionPerformed(evt);
            }
        });

        Button_plus.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button_plus.setText("+");
        Button_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_plusActionPerformed(evt);
            }
        });

        Number_7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Number_7.setText("7");
        Number_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_7ActionPerformed(evt);
            }
        });

        Number_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Number_2.setText("2");
        Number_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_2ActionPerformed(evt);
            }
        });

        Number_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Number_3.setText("3");
        Number_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_3ActionPerformed(evt);
            }
        });

        Number_4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Number_4.setText("4");
        Number_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_4ActionPerformed(evt);
            }
        });

        Number_5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        Number_5.setText("5");
        Number_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_5ActionPerformed(evt);
            }
        });

        Number_6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Number_6.setText("6");
        Number_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_6ActionPerformed(evt);
            }
        });

        Number_1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Number_1.setText("1");
        Number_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_1ActionPerformed(evt);
            }
        });

        Number_8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Number_8.setText("8");
        Number_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_8ActionPerformed(evt);
            }
        });

        Number_9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Number_9.setText("9");
        Number_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_9ActionPerformed(evt);
            }
        });

        Number_0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Number_0.setText("0");
        Number_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Number_0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Number_0)
                        .addGap(157, 157, 157)
                        .addComponent(copyright_area, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Number_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Number_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Number_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Number_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Number_1)
                                .addGap(20, 20, 20)
                                .addComponent(Number_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Number_3, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(Number_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_clear)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Button_plus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addComponent(Button_multiply, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Button_minus)
                            .addComponent(Button_divide)
                            .addComponent(Button_euqal, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addComponent(Display_of_calculator, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Display_of_calculator, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button_multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(Button_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Button_euqal)
                                    .addComponent(Button_clear))
                                .addGap(31, 31, 31)
                                .addComponent(copyright_area))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Number_8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Number_7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Number_9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Number_0)
                                .addGap(0, 14, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number_1)
                            .addComponent(Number_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Number_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Number_5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number_4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Number_6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_multiplyActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "*");
    }//GEN-LAST:event_Button_multiplyActionPerformed

    private void Button_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_plusActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "+");
    }//GEN-LAST:event_Button_plusActionPerformed

    private void Button_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_divideActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "/");
    }//GEN-LAST:event_Button_divideActionPerformed

    private void Button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_clearActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText("");
    }//GEN-LAST:event_Button_clearActionPerformed

    private void Number_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_8ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "8");
    }//GEN-LAST:event_Number_8ActionPerformed

    private void Number_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_0ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "0");
    }//GEN-LAST:event_Number_0ActionPerformed

    private void Display_of_calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_of_calculatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Display_of_calculatorActionPerformed

    private void Number_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_9ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "9");
    }//GEN-LAST:event_Number_9ActionPerformed

    private void Number_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_7ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "7");
    }//GEN-LAST:event_Number_7ActionPerformed

    private void Number_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_6ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "6");
    }//GEN-LAST:event_Number_6ActionPerformed

    private void Number_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_5ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "5");
    }//GEN-LAST:event_Number_5ActionPerformed

    private void Number_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_4ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "4");
    }//GEN-LAST:event_Number_4ActionPerformed

    private void Number_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_3ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "3");
    }//GEN-LAST:event_Number_3ActionPerformed

    private void Number_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_2ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "2");
    }//GEN-LAST:event_Number_2ActionPerformed

    private void Number_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Number_1ActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "1");
    }//GEN-LAST:event_Number_1ActionPerformed

    private void Button_euqalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_euqalActionPerformed
        // TODO add your handling code here:
        // Get the expression from the display
    // Get the expression from the display
    String expression = Display_of_calculator.getText();

    // Check if the expression contains addition
    if (expression.contains("+")) {
        // Split the expression using the addition operator
        String[] parts = expression.split("\\+");
        // Parse the operands
        int operand1 = Integer.parseInt(parts[0]);
        int operand2 = Integer.parseInt(parts[1]);
        // Perform the addition
        int result = operand1 + operand2;
        // Update the display with the result
        Display_of_calculator.setText(Integer.toString(result));
    }
    // Check if the expression contains subtraction
    else if (expression.contains("-")) {
        // Split the expression using the subtraction operator
        String[] parts = expression.split("-");
        // Parse the operands
        int operand1 = Integer.parseInt(parts[0]);
        int operand2 = Integer.parseInt(parts[1]);
        // Perform the subtraction
        int result = operand1 - operand2;
        // Update the display with the result
        Display_of_calculator.setText(Integer.toString(result));
    }
    // Check if the expression contains multiplication
    else if (expression.contains("*")) {
        // Split the expression using the multiplication operator
        String[] parts = expression.split("\\*");
        // Parse the operands
        int operand1 = Integer.parseInt(parts[0]);
        int operand2 = Integer.parseInt(parts[1]);
        // Perform the multiplication
        int result = operand1 * operand2;
        // Update the display with the result
        Display_of_calculator.setText(Integer.toString(result));
    }
    // Check if the expression contains division
    else if (expression.contains("/")) {
        // Split the expression using the division operator
        String[] parts = expression.split("/");
        // Parse the operands
        int operand1 = Integer.parseInt(parts[0]);
        int operand2 = Integer.parseInt(parts[1]);
        // Check for division by zero
        if (operand2 == 0) {
            Display_of_calculator.setText("Error: Division by zero");
        } else {
            // Perform the division
            int result = operand1 / operand2;
            // Update the display with the result
            Display_of_calculator.setText(Integer.toString(result));
        }
    } else {
        // If none of the operators are found, display an error
        Display_of_calculator.setText("Error: No operator found");
    }
        
    }//GEN-LAST:event_Button_euqalActionPerformed

    private void Button_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_minusActionPerformed
        // TODO add your handling code here:
        Display_of_calculator.setText(Display_of_calculator.getText() + "-");
    }//GEN-LAST:event_Button_minusActionPerformed

 
 
    
    
// Method to handle number button clicks
    private void NumberActionPerformed(java.awt.event.ActionEvent evt) {
        // Get the source of the event (which button was clicked)
        javax.swing.JButton button = (javax.swing.JButton) evt.getSource();
        // Get the text of the button and append it to the display
        Display_of_calculator.setText(Display_of_calculator.getText() + button.getText());
    }
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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_clear;
    private javax.swing.JButton Button_divide;
    private javax.swing.JButton Button_euqal;
    private javax.swing.JButton Button_minus;
    private javax.swing.JButton Button_multiply;
    private javax.swing.JButton Button_plus;
    private javax.swing.JTextField Display_of_calculator;
    private javax.swing.JButton Number_0;
    private javax.swing.JButton Number_1;
    private javax.swing.JButton Number_2;
    private javax.swing.JButton Number_3;
    private javax.swing.JButton Number_4;
    private javax.swing.JButton Number_5;
    private javax.swing.JButton Number_6;
    private javax.swing.JButton Number_7;
    private javax.swing.JButton Number_8;
    private javax.swing.JButton Number_9;
    private javax.swing.JLabel copyright_area;
    // End of variables declaration//GEN-END:variables
}
