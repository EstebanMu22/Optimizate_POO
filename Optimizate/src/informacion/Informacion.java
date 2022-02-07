package informacion;

import diagnostico_1.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Informacion extends javax.swing.JFrame {

    public Informacion() {
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
        Inf = new javax.swing.JPanel();
        Contenido = new javax.swing.JPanel();
        text_contenido = new javax.swing.JLabel();
        opciones = new javax.swing.JComboBox<>();
        text1 = new javax.swing.JLabel();
        info_icon = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        text2 = new javax.swing.JLabel();
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

        Inf.setBackground(new java.awt.Color(255, 255, 255));
        Inf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Inf.setPreferredSize(new java.awt.Dimension(540, 399));

        Contenido.setBackground(new java.awt.Color(255, 255, 255));
        Contenido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        text_contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addContainerGap())
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );

        opciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Seleccionado = (String)opciones.getSelectedItem();
                if ("Instrucciones de uso".equals(Seleccionado)) {
                    text_contenido.setText("<html> \t<body width='%1s'> \t<p> <b> 1) </b> Crear usuario e iniciar sesión. \t<p> <b> 2) </b> Completar diagnóstico. \t<p> <b> 3) </b> Seguir las recomendaciones para completar tareas y reducir el consumo.");
                }
                if ("Cálculos y recomendaciones".equals(Seleccionado)) {
                    text_contenido.setText("<html>  <body width='%1s'> <p> <b> Para el consumo calculado en la aplicación se realiza lo siguiente:  </b> <p> <b> 1) </b> Se toma la potencia del electrodoméstico en vatios y se transforma a kilovatios (dividiendo la potencia sobre 1000). <p> <b> 2) </b> Se calculan los kilovatios usados cada día teniendo en cuenta las horas de uso diarias que han sido reportadas por el usuario (multiplicando la potencia por el número de horas diarias). <p> <b> 3) </b> Se calculan los kilovatios consumidos en un mes de 30 días (multiplicando el resultado del paso anterior por 30). \t<p> <b> 4) </b> Finalmente se calcula el costo mensual de este uso.");
                }
                if ("Créditos".equals(Seleccionado)){
                    text_contenido.setText("<html> \t<body width='%1s'> \t<p> <b> Optimízate ha sido desarrollada por: </b>  \t<p> • Sergio Castro \t<p> • Andrés Murillo \t<p> • Santiago Ballén \t<p> • Sebastián Moreno \t<p> • Juan Tavera ");
                }
                if ("-".equals(Seleccionado)){
                    text_contenido.setText("");
                }
            }
        });
        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Instrucciones de uso", "Cálculos y recomendaciones", "Créditos" }));
        opciones.setToolTipText("");

        text1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        text1.setText("Información");

        info_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/information.png"))); // NOI18N

        text2.setText("Selecciona una opción para obtener información:");

        javax.swing.GroupLayout InfLayout = new javax.swing.GroupLayout(Inf);
        Inf.setLayout(InfLayout);
        InfLayout.setHorizontalGroup(
            InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfLayout.createSequentialGroup()
                        .addGroup(InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InfLayout.createSequentialGroup()
                                .addComponent(text2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(InfLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(text1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(info_icon)
                        .addGap(217, 217, 217))
                    .addGroup(InfLayout.createSequentialGroup()
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InfLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        InfLayout.setVerticalGroup(
            InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text1)
                    .addComponent(info_icon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(InfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfLayout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
                    .addComponent(Inf, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 447, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Anterior)
                            .addComponent(jButton2)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 85, Short.MAX_VALUE)
                    .addComponent(Inf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 86, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anterior;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel Inf;
    private javax.swing.JPanel Inferior;
    private javax.swing.JPanel Superior;
    private javax.swing.JLabel info_icon;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel op1;
    private javax.swing.JLabel op2;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text_contenido;
    // End of variables declaration//GEN-END:variables

}
