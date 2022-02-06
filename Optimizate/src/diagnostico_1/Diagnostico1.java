package diagnostico_1;

import java.awt.Image;
import java.awt.Toolkit;

public class Diagnostico1 extends javax.swing.JFrame {

    public Diagnostico1() {
        initComponents();
        setResizable(false);
        
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("graphics/logo.png"));
        setIconImage(icon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Superior = new javax.swing.JPanel();
        op1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Diag1 = new javax.swing.JPanel();
        text1 = new javax.swing.JLabel();
        info_icon = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        text2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        icon_1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        icon_2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        icon_3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        Anterior = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Inferior = new javax.swing.JPanel();
        op2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Superior.setBackground(new java.awt.Color(255, 255, 255));
        Superior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        op1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        op1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        op1.setText("Optimizate");

        javax.swing.GroupLayout SuperiorLayout = new javax.swing.GroupLayout(Superior);
        Superior.setLayout(SuperiorLayout);
        SuperiorLayout.setHorizontalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(op1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SuperiorLayout.setVerticalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(op1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Diag1.setBackground(new java.awt.Color(255, 255, 255));
        Diag1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Diag1.setPreferredSize(new java.awt.Dimension(540, 399));

        text1.setText("¡Empecemos!");

        info_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/question.png"))); // NOI18N

        text2.setText("Selecciona los aparatos electrónicos que hay en tu hogar:");

        jLabel1.setText("Electrodomesticos");

        icon_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/microwave.png"))); // NOI18N
        icon_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        icon_1.setPreferredSize(new java.awt.Dimension(110, 117));

        jLabel2.setText("Celular");

        icon_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/phone.png"))); // NOI18N
        icon_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        icon_2.setPreferredSize(new java.awt.Dimension(110, 117));

        jLabel3.setText("Computador");

        icon_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/pc.png"))); // NOI18N
        icon_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        icon_3.setPreferredSize(new java.awt.Dimension(110, 117));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Otros");
        jCheckBox4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox4.setIconTextGap(8);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Diag1Layout = new javax.swing.GroupLayout(Diag1);
        Diag1.setLayout(Diag1Layout);
        Diag1Layout.setHorizontalGroup(
            Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Diag1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Diag1Layout.createSequentialGroup()
                        .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Diag1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addComponent(text2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(Diag1Layout.createSequentialGroup()
                        .addComponent(text1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(info_icon)
                        .addGap(21, 21, 21))))
            .addGroup(Diag1Layout.createSequentialGroup()
                .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Diag1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addComponent(icon_1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1)))
                        .addGap(32, 32, 32)
                        .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addComponent(icon_2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)))
                        .addGap(21, 21, 21)
                        .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addComponent(icon_3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3))
                            .addComponent(jLabel3)))
                    .addGroup(Diag1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jCheckBox4)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Diag1Layout.setVerticalGroup(
            Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Diag1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text1)
                    .addComponent(info_icon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text2)
                .addGap(38, 38, 38)
                .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Diag1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(icon_1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(icon_2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jCheckBox1))))
                    .addGroup(Diag1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(Diag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(icon_3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jCheckBox2))
                            .addGroup(Diag1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jCheckBox3)))))
                .addGap(45, 45, 45)
                .addComponent(jCheckBox4)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Anterior.setText("Anterior");

        jButton2.setText("Siguiente");

        Inferior.setBackground(new java.awt.Color(255, 255, 255));
        Inferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        op2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        op2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        op2.setText("Optimizate");

        javax.swing.GroupLayout InferiorLayout = new javax.swing.GroupLayout(Inferior);
        Inferior.setLayout(InferiorLayout);
        InferiorLayout.setHorizontalGroup(
            InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(op2)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        InferiorLayout.setVerticalGroup(
            InferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(op2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addComponent(Diag1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 447, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Anterior)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 85, Short.MAX_VALUE)
                    .addComponent(Diag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 86, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed

    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed

    }//GEN-LAST:event_jCheckBox4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JPanel Diag1;
    private javax.swing.JPanel Inferior;
    private javax.swing.JPanel Superior;
    private javax.swing.JLabel icon_1;
    private javax.swing.JLabel icon_2;
    private javax.swing.JLabel icon_3;
    private javax.swing.JLabel info_icon;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
