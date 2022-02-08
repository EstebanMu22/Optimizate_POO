/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package optimizate;

/**
 *
 * @author sergio andres
 */
public class MicroondasPantalla extends javax.swing.JPanel {

    /**
     * Creates new form MicroondasPantalla
     */
    public MicroondasPantalla() {
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

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MicroondasKV = new javax.swing.JLabel();
        EnergiaAhorrada = new javax.swing.JLabel();
        EnergiaDesperdiciada = new javax.swing.JLabel();
        Consejo1MicroondasE = new javax.swing.JLabel();
        Consejo2MicroondasE = new javax.swing.JLabel();
        Consejo3MicroondasE = new javax.swing.JLabel();
        Consejo4MicroondasE = new javax.swing.JLabel();
        Consejo5MicroondasE = new javax.swing.JLabel();
        Consejo5Microondas = new javax.swing.JCheckBox();
        Consejo4Microondas = new javax.swing.JCheckBox();
        Consejo3Microondas = new javax.swing.JCheckBox();
        Consejo2Microondas = new javax.swing.JCheckBox();
        Consejo1Microondas = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        Separador4 = new javax.swing.JSeparator();
        Separador5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><b>Tareas  Microondas</b></html>");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphics/Microondas.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><b>Tareas Pendientes Bombillos</b></html>");

        MicroondasKV.setText("Energia Gastada: 500 kv");

        EnergiaAhorrada.setText("Energia a ahorrar: 500 kv");

        EnergiaDesperdiciada.setText("Energia a despediciarr: 500 kv");

        Consejo1MicroondasE.setText("Energia ahorrada: 50kv");

        Consejo2MicroondasE.setText("Energia ahorrada: 50kv");

        Consejo3MicroondasE.setText("Energia ahorrada: 50kv");

        Consejo4MicroondasE.setText("Energia ahorrada: 50kv");

        Consejo5MicroondasE.setText("Energia ahorrada: 50kv");

        Consejo5Microondas.setText("Poner consejos de bombilla aqui");
        Consejo5Microondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consejo5MicroondasActionPerformed(evt);
            }
        });

        Consejo4Microondas.setText("Poner consejos de bombilla aqui");
        Consejo4Microondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consejo4MicroondasActionPerformed(evt);
            }
        });

        Consejo3Microondas.setText("Poner consejos de bombilla aqui");
        Consejo3Microondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consejo3MicroondasActionPerformed(evt);
            }
        });

        Consejo2Microondas.setText("Poner consejos de bombilla aqui");
        Consejo2Microondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consejo2MicroondasActionPerformed(evt);
            }
        });

        Consejo1Microondas.setText("Poner consejos de bombilla aqui");
        Consejo1Microondas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consejo1MicroondasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(MicroondasKV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EnergiaAhorrada)
                        .addGap(29, 29, 29)
                        .addComponent(EnergiaDesperdiciada))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Consejo1Microondas, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Consejo1MicroondasE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Consejo5Microondas, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Consejo5MicroondasE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Consejo4Microondas, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Consejo4MicroondasE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Consejo3Microondas, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Consejo3MicroondasE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Consejo2Microondas, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Consejo2MicroondasE))
                    .addComponent(Separador5)
                    .addComponent(Separador4)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MicroondasKV)
                    .addComponent(EnergiaAhorrada)
                    .addComponent(EnergiaDesperdiciada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consejo1Microondas)
                    .addComponent(Consejo1MicroondasE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consejo2Microondas)
                    .addComponent(Consejo2MicroondasE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consejo3Microondas)
                    .addComponent(Consejo3MicroondasE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consejo4Microondas)
                    .addComponent(Consejo4MicroondasE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separador5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consejo5Microondas)
                    .addComponent(Consejo5MicroondasE))
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Consejo5MicroondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consejo5MicroondasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Consejo5MicroondasActionPerformed

    private void Consejo4MicroondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consejo4MicroondasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Consejo4MicroondasActionPerformed

    private void Consejo3MicroondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consejo3MicroondasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Consejo3MicroondasActionPerformed

    private void Consejo2MicroondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consejo2MicroondasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Consejo2MicroondasActionPerformed

    private void Consejo1MicroondasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consejo1MicroondasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Consejo1MicroondasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JCheckBox Consejo1Microondas;
    protected javax.swing.JLabel Consejo1MicroondasE;
    protected javax.swing.JCheckBox Consejo2Microondas;
    protected javax.swing.JLabel Consejo2MicroondasE;
    protected javax.swing.JCheckBox Consejo3Microondas;
    protected javax.swing.JLabel Consejo3MicroondasE;
    protected javax.swing.JCheckBox Consejo4Microondas;
    protected javax.swing.JLabel Consejo4MicroondasE;
    protected javax.swing.JCheckBox Consejo5Microondas;
    protected javax.swing.JLabel Consejo5MicroondasE;
    protected javax.swing.JLabel EnergiaAhorrada;
    protected javax.swing.JLabel EnergiaDesperdiciada;
    protected javax.swing.JLabel MicroondasKV;
    protected javax.swing.JSeparator Separador4;
    protected javax.swing.JSeparator Separador5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
