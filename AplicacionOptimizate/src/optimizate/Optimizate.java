
package optimizate;
import Clases.PersistenciaObjetos;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

import Clases.Usuarios;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Optimizate extends javax.swing.JFrame {
    
    
    
    InicioDeSesion sesion ;
    Diagnostico2 diagnostico2;
    Diagnostico5 diagnostico5;
    Diagnostico3 diagnostico3;
    Diagnostico1 diagnostico1;
    PrincipalP Pprincipal;
    RegistroApp registro;
    Menu menu;
   
    
    Usuarios ListaUsuarios;
    
    String[] UsuariosCombo;
   

    

    /**
     * Creates new form Optimizate
     */
    public Optimizate() throws IOException, ClassNotFoundException {
 
        try{
            ListaUsuarios = recuperar();
            System.out.println("Objeto leido");
        }catch(Exception e){
            ListaUsuarios = new Usuarios();
            System.out.println("Objeto vacio");
        }
        ListaUsuarios.SetStrings();
        
        UsuariosCombo = ListaUsuarios.getStrings();
        
        
        
        
        
        initComponents();
        Anterior.setVisible(false);
        Siguiente.setVisible(false);
        BotonMenu.setVisible(false);
        
        setBounds(30,50,650,530);
        setResizable(false);
        
        sesion =  new InicioDeSesion();
        registro = new RegistroApp();
        diagnostico1 = new Diagnostico1();
        diagnostico2 = new Diagnostico2();
        diagnostico3 = new Diagnostico3();
        diagnostico5 = new Diagnostico5();
        Pprincipal = new PrincipalP();
        menu = new Menu();
        
        
       
        sesion.setBounds(30,50,562,415);
        registro.setBounds(30,50,562,370);
        diagnostico1.setBounds(30,50,562,370);
        diagnostico2.setBounds(30,50,562,370);
        diagnostico3.setBounds(30,50,562,370);
        diagnostico5.setBounds(30,50,562,370);
        Pprincipal.setBounds(30,50,581,405);
        menu.setBounds(0,0,187,300);
        
        registro.setVisible(false);
        
        diagnostico1.setVisible(false);
        diagnostico2.setVisible(false);
        diagnostico3.setVisible(false);
        diagnostico5.setVisible(false);
        Pprincipal.setVisible(false);
        menu.setVisible(false);
        
        
        
        add(sesion);
        add(registro);
        add(diagnostico1);
        add(diagnostico2);
        add(diagnostico3);
        add(diagnostico5);
        add(Pprincipal);
        Pprincipal.add(menu);
        
        
    }
    
    public void IniciarUsuarios(Usuarios x) throws IOException, ClassNotFoundException{
        ListaUsuarios = x;   
        
    }
    public  void guardar(Usuarios u2) throws IOException{
        PersistenciaObjetos per = new PersistenciaObjetos();
        per.guardar(u2);
        System.out.println("Correcto guardado");
    }
    public  void borrar() throws IOException{
        Usuarios u = new Usuarios();
        PersistenciaObjetos per = new PersistenciaObjetos();
        per.guardar(u);
        System.out.println("Correcto borrado");
    }
    public  Usuarios recuperar() throws IOException, ClassNotFoundException{
        PersistenciaObjetos per = new PersistenciaObjetos();
        Usuarios u = per.recuperar();
        
        System.out.println("Correcto recuperado");
        return u;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        Anterior = new java.awt.Button();
        Siguiente = new java.awt.Button();
        BotonMenu = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Optimizate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Optimizate");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Optimizate");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Optimizate");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Anterior.setLabel("Anterior");
        //Anterior.setVisible(false);
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorActionPerformed(evt);
            }
        });

        //Siguiente.setVisible(false);
        Siguiente.setLabel("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        BotonMenu.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonMenu)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                        .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jSeparator7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void EntraActionPerformed(java.awt.event.ActionEvent evt){
        System.out.println("SE EJECUTA 0");
        Anterior.setVisible(true);
        Siguiente.setVisible(true);
        sesion.setVisible(false);
        diagnostico1.setVisible(true);
        
        revalidate();
        repaint();
        
    }
    private void RegistroBotonActionPerformed(java.awt.event.ActionEvent evt){
        
        sesion.setVisible(false);
        registro.setVisible(true);
        revalidate();
        repaint();
        Siguiente.setLabel("Guardar");
        Siguiente.setVisible(true);
        
        
        
        
    }
    private void AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorActionPerformed
        // TODO add your handling code here:
        
        if(diagnostico5.isVisible() && diagnostico2.isVisible()==false){
            
            System.out.println("SE EJECUTO 1");
            diagnostico5.setVisible(false);
            diagnostico3.setVisible(true);
            sesion.setVisible(false);
            revalidate();
            repaint();
            
        }else if(diagnostico3.isVisible()){
            System.out.println("SE EJECUTO 2.5");
            diagnostico3.setVisible(false);
            diagnostico2.setVisible(true);
            revalidate();
            repaint();
            
        }
        
        else if(diagnostico1.isVisible()==true){
           
            System.out.println("SE EJECUTO 2");
            
            diagnostico1.setVisible(false);
            sesion.setVisible(true);
            Anterior.setVisible(false);
            Siguiente.setVisible(false);
            revalidate();
            repaint();
            
            
        }else if(diagnostico2.isVisible()){
            diagnostico2.setVisible(false);
            diagnostico1.setVisible(true);
            revalidate();
            repaint();
            
            
        }
        

    }//GEN-LAST:event_AnteriorActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
        
        if (diagnostico1.isVisible()){
            diagnostico1.setVisible(false);
            diagnostico2.setVisible(true);
            revalidate();
            repaint();
            
        }
        else if(diagnostico2.isVisible()){
            System.out.println("SE EJECUTO 3");
            
            diagnostico2.setVisible(false);
            diagnostico3.setVisible(true);
            revalidate();
            repaint();
        
        }else if(diagnostico3.isVisible()){
            System.out.println("SE EJECUTO 33");
            diagnostico3.setVisible(false);
            diagnostico5.setVisible(true);
            revalidate();
            repaint();
        }
        else if(diagnostico5.isVisible()){
            Anterior.setVisible(false);
            Siguiente.setVisible(false);
            System.out.println("SE EJECUTO 4");
            diagnostico5.setVisible(false);
            Pprincipal.setVisible(true);
            System.out.println(Pprincipal.getBounds());
            revalidate();
            repaint();
        }else if(registro.isVisible()){
            System.out.println("ENTRO");
            registro.setVisible(false);
            Siguiente.setLabel("Siguiente");
            Siguiente.setVisible(false);
            sesion.setVisible(true);
            
            try {
                guardar(ListaUsuarios);
            } catch (IOException ex) {
                Logger.getLogger(Optimizate.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListaUsuarios.SetStrings();
            sesion.ComboSesion.removeAllItems();
            UsuariosCombo = ListaUsuarios.getStrings();
            for(int i = 0; i<UsuariosCombo.length;i++){
                sesion.ComboSesion.addItem(UsuariosCombo[i]);
            }
            
            ListaUsuarios.VerNombresUsuarios();
            
            revalidate();
            repaint();
            
        }
    }//GEN-LAST:event_SiguienteActionPerformed
private class PrincipalP extends PantallaPrincipal implements ActionListener{
    
        
    public PrincipalP(){
        
        
        
    }
       
    private void LogoMenuActionPerformed(java.awt.event.ActionEvent evt) {  
        menu.setVisible(true);
       
    }                                       

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Aqui estot");
        LogoMenuActionPerformed(e);
     }
    
}
private class InicioDeSesion extends Sesion implements ActionListener{
    
   
    
    public InicioDeSesion(){
        super();
        Entra.addActionListener(this);
        Siguiente.addActionListener(this);
        Anterior.addActionListener(this);
        RegistroBoton.addActionListener(this);
        
        for(int i = 0; i<UsuariosCombo.length;i++){
            ComboSesion.addItem(UsuariosCombo[i]);
        }
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==Entra){
            EntraActionPerformed(e);
        
        }if(e.getSource()== RegistroBoton){

            RegistroBotonActionPerformed(e);
        }
       
    }
  
}
private class RegistroApp extends Registro implements ActionListener,KeyListener{

    public RegistroApp(){
        CrearUsuario.addActionListener(this);
        Usuario.addKeyListener(this);
        Edad.addKeyListener(this);

        
        
    }
    public void actionPerformed(ActionEvent e) {
        String nombre="";
        String apodo="";
        int edad=0;
        
        if (e.getSource()==CrearUsuario){
            nombre = Usuario.getText();
            apodo = Apodo.getText();
            edad =Integer.parseInt(Edad.getText());
            try{
                ListaUsuarios.CrearUsuario(nombre,apodo,edad);
                System.out.println("Usuario creado correctamente");
            }catch(Exception error){
                System.out.println("no fue posible crear usuario");
                throw error;
            }     
    
        }
        
        
   

    }
    private void UsuarioKeyTyped(java.awt.event.KeyEvent e) {                                 
        // TODO add your handling code here:
        char c = e.getKeyChar();
        char c2 = e.getKeyChar();
        if (e.getSource()== Usuario){
            if (Character.isDigit(c)){
            e.consume();
            }
        }else if(e.getSource()==Edad){
            if(c2<'0'||c2>'9'){
                e.consume();
            }
        }

    }

        @Override
        public void keyTyped(KeyEvent e) {
            UsuarioKeyTyped(e);
         }

        @Override
        public void keyPressed(KeyEvent e) {
         }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    
    
    
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
            java.util.logging.Logger.getLogger(Optimizate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Optimizate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Optimizate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Optimizate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Optimizate().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Optimizate.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Optimizate.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Anterior;
    private javax.swing.JButton BotonMenu;
    private java.awt.Button Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}

