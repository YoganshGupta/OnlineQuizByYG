/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ques9.java
 *
 * Created on Aug 20, 2014, 10:19:32 PM
 */

/**
 *
 * @author acer
 */
public class Ques9 extends javax.swing.JFrame {

    /** Creates new form Ques9 */
    public Ques9() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        r6 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        l3 = new javax.swing.JLabel();
        r7 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JButton();
        r1 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ls1 = new javax.swing.JList();
        b3 = new javax.swing.JButton();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup2.add(r6);
        r6.setText("flipp the question");
        r6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6ActionPerformed(evt);
            }
        });

        buttonGroup2.add(r5);
        r5.setText("50:50");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        l3.setText("Lifelines");

        buttonGroup2.add(r7);
        r7.setText("Odians pole");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        b2.setText("Use lifeline");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r1);
        r1.setText("Rambabu Gupta");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r3);
        r3.setText("S Venkataraghavan");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r4);
        r4.setText("Philoo Reporter");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r2);
        r2.setText("Swaroop kumar");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        b4.setText("QUIT THE GAME");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setText("Lock your answer");
        b1.setEnabled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l2.setText("Q.9)Which Indian umpire took 100 Test wickets as a bowler?");

        l1.setText("Online Quiz");

        ls1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Q.NO    PRIZE WON", "12.          1 CRORE", "11.          50,00,000", "10.          25,00,000", " 9.           12,50,000", " 8.             6,40,000", " 7.             3,20,000", " 6.             1,60,000                     ", " 5                  80,000", " 4.                 40,000", " 3.                 20,000", " 2.                 10,000", " 1.                   5,000", "you not won any prize                         " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ls1.setEnabled(false);
        jScrollPane2.setViewportView(ls1);

        b3.setText("Proceed to next question");
        b3.setEnabled(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(b3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(r1)
                                            .addComponent(r3))
                                        .addGap(134, 134, 134)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(r4)
                                            .addComponent(r2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(l2)
                                        .addGap(45, 45, 45)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(b1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(b4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(r6)
                                            .addComponent(r5)
                                            .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(r7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                        .addComponent(b2)))
                                .addGap(118, 118, 118)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(l1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r1)
                            .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r3)
                            .addComponent(r4))
                        .addGap(25, 25, 25)
                        .addComponent(b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(b2)
                                .addGap(19, 19, 19)))
                        .addGap(7, 7, 7)
                        .addComponent(b3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b4)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_r6ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed

}//GEN-LAST:event_r5ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_r7ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(r5.isSelected()==true) {
            r2.setText(" ");
            r4.setText(" ");
        } else
            if(r6.isSelected()==true) {
                l2.setText(" ");
                r1.setText(" ");
                r2.setText(" ");
                r3.setText(" ");
                r4.setText(" ");
                l2.setText("Which bowler first claimed a hattrick in" +
                        " One Day International cricket?  ");
                r1.setText("Richard Hadlee");
                r2.setText("Chetan Sharma");
                r3.setText("Jalaluddin");
                r4.setText("Dennis lillee");
            } else
                if(r7.isSelected()==true) {
                    r1.setText("30%");
                    r2.setText("26%");
                    r3.setText("34%");
                    r4.setText("10%");
                }
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        new Gameover1().setVisible(true);
        dispose();
}//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(r4.isSelected()==true) {
            t1.setText("Sorry,your answer is wrong." +
                    "You slip to Rs.80,000.");
            t2.setText("Correct Answer is Option 3");
            b4.setText("GAME OVER");
            ls1.setSelectedIndex(8);
        } else
            if(r3.isSelected()==true) {
                t1.setText("Congrats,your answer is correct." +
                        "You won Rs.12,50,000");
                b4.setVisible(false);
                b3.setEnabled(true);
                ls1.setSelectedIndex(4);
            } else
                if(r1.isSelected()==true) {
                    t1.setText("Sorry,your answer is wrong." +
                            "You slip to Rs.80,000.");
                    t2.setText("Correct Answer is Option 3");
                    b4.setText("GAME OVER");
                    ls1.setSelectedIndex(8);
                } else

                {
            t1.setText("Sorry,your answer is wrong." +
                    "You slip to Rs.80,000.");
            t2.setText("Correct Answer is Option 3");
            b4.setText("GAME OVER");
            ls1.setSelectedIndex(8);
                }
        r5.setVisible(false);
r2.setEnabled(false);
r3.setEnabled(false);
r4.setEnabled(false);
r1.setEnabled(false);
r6.setVisible(false);
r7.setVisible(false);

b1.setVisible(false);
b2.setVisible(false);
l3.setVisible(false);
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        new Ques10().setVisible(true);
        dispose();
}//GEN-LAST:event_b3ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
         b1.setEnabled(true);
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
 b1.setEnabled(true);
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        b1.setEnabled(true);
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
         b1.setEnabled(true);
    }//GEN-LAST:event_r4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ques9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JList ls1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    // End of variables declaration//GEN-END:variables

}
