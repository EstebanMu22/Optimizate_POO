
package optimizate;
import Clases.DiagnosticoGeneral;
import Clases.Electrodomesticos;
import Clases.PersistenciaObjetos;
import Clases.Usuario;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.SpinnerNumberModel;
import javax.swing.JPanel;
import java.awt.*;

import Clases.Usuarios;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Optimizate extends javax.swing.JFrame {
    
    
    
    InicioDeSesion sesion ;
    Diagnostico_2 diagnostico2;
    Diagnostico_5 diagnostico5;
    Diagnostico_4 diagnostico4;
    Diagnostico_3 diagnostico3;
    Diagnostico_1 diagnostico1;
    PrincipalBombillos PprincipalBombillos;
    PrincipalNevera PprincipalNevera;
    PrincipalMicroondas PprincipalMicroondas;
    PrincipalLavadora PprincipalLavadora;
    RegistroApp registro;
    Menu menu;
   
    
    Usuarios ListaUsuarios;
    
    String[] UsuariosCombo;
    String[] AparatosElegidos ;
    
    String UsuarioActual;
    Object[] DatosUsuarioActual= new Object[9];
    
    Usuario usuario;
    DiagnosticoGeneral diagnosticoUsuario;
    Electrodomesticos electrodomesticosUsuario;
    HashMap<String,ArrayList> ConsejosUsuario;
    ArrayList ConsejosLavadora;
    ArrayList ConsejosMicroondas;
    ArrayList ConsejosNevera;
    ArrayList ConsejosBombillo;
   

    

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
        
        
        AparatosElegidos = new String[3];
        AparatosElegidos[0]="";
        AparatosElegidos[1]="";
        AparatosElegidos[2]="";
        
        
        
        initComponents();
        Anterior.setVisible(false);
        Siguiente.setVisible(false);
        BotonMenu.setVisible(false);
        
        setBounds(30,50,650,530);
        setResizable(false);
        
        sesion =  new InicioDeSesion();
        registro = new RegistroApp();
        diagnostico5 = new Diagnostico_5();
        diagnostico2 = new Diagnostico_2();
        diagnostico1 = new Diagnostico_1();
        
        diagnostico3 = new Diagnostico_3();
        diagnostico4 = new Diagnostico_4();
        
        PprincipalBombillos = new PrincipalBombillos();
        PprincipalLavadora = new PrincipalLavadora();
        PprincipalNevera = new PrincipalNevera();
        PprincipalMicroondas = new PrincipalMicroondas();
        menu = new Menu();
        
        
       
        sesion.setBounds(30,50,562,415);
        registro.setBounds(30,50,562,370);
        diagnostico1.setBounds(30,50,562,370);
        diagnostico2.setBounds(30,50,562,370);
        diagnostico3.setBounds(30,50,562,370);
        diagnostico4.setBounds(30,50,562,370);
        diagnostico5.setBounds(30,50,562,370);
        PprincipalBombillos.setBounds(30,40,581,380);
        PprincipalLavadora.setBounds(30,40,581,380);
        PprincipalNevera.setBounds(30,40,581,380);
        PprincipalMicroondas.setBounds(30,40,581,380);
        menu.setBounds(0,0,187,300);
        
        registro.setVisible(false);
        
        diagnostico1.setVisible(false);
        diagnostico2.setVisible(false);
        diagnostico3.setVisible(false);
        diagnostico4.setVisible(false);
        diagnostico5.setVisible(false);
        PprincipalBombillos.setVisible(false);
        PprincipalLavadora.setVisible(false);
        PprincipalNevera.setVisible(false);
        PprincipalMicroondas.setVisible(false);
        
        
        menu.setVisible(false);
        
        
        
        add(sesion);
        add(registro);
        add(diagnostico1);
        add(diagnostico2);
        add(diagnostico3);
        add(diagnostico4);
        add(diagnostico5);
        add(PprincipalBombillos);
        add(PprincipalLavadora);
        add(PprincipalNevera);
        add(PprincipalMicroondas);
        
        
        
        
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
    
    private void EntraActionPerformed(){
        System.out.println("SE EJECUTA 0");
        UsuarioActual = (String) sesion.ComboSesion.getSelectedItem();
        if(UsuarioActual != null){
          System.out.println("El usuario elegido es: "+UsuarioActual);
          usuario = ListaUsuarios.getUsuarioLlave(UsuarioActual);
            if(usuario.GetDiagnosticoHecho()){
                sesion.setVisible(false);
                PprincipalBombillos.setVisible(true);
                Siguiente.setVisible(true);
                Anterior.setVisible(true);
                Anterior.setLabel("Anterior");
                try{
                    
                    
                    
                    diagnosticoUsuario = usuario.GetDiagnostico();
                    electrodomesticosUsuario = diagnosticoUsuario.GetElectrodomesticos();

                    ConsejosUsuario = electrodomesticosUsuario.getConsejosElectrodomesticos();

                    ConsejosLavadora =  ConsejosUsuario.get("Lavadora");

                    System.out.println(ConsejosLavadora);
                    ConsejosBombillo = (ArrayList) ConsejosUsuario.get("Bombillo");
                    System.out.println(ConsejosBombillo);
                    
                    ConsejosNevera = (ArrayList)ConsejosUsuario.get("Nevera");
                    System.out.println(ConsejosNevera);
                    ConsejosMicroondas = (ArrayList)ConsejosUsuario.get("Microondas");
                    System.out.println(ConsejosMicroondas);
                    
                    PprincipalBombillos.BombilloKV.setText("Energia gastada "+(electrodomesticosUsuario.GetBombilloKV()*2)+" Kv");
                    PprincipalNevera.NeveraKV.setText("Energia gastada "+(electrodomesticosUsuario.GetNeveraKV()*2)+" Kv");
                    
                    String consejos2[][] = electrodomesticosUsuario.ConsejosFacilesBombillo;
                    String consejos3[][] = electrodomesticosUsuario.ConsejosComplejosBombillo;
                    String consejos4[][] = electrodomesticosUsuario.ConsejosModeradosBombillo;
                    
                    String consejos5[][] = electrodomesticosUsuario.ConsejosFacilesNevera;
                    String consejos6[][] = electrodomesticosUsuario.ConsejosComplejosNevera;
                    String consejos7[][] = electrodomesticosUsuario.ConsejosModeradosNevera;
                    
                    
                    
                    
                    if(electrodomesticosUsuario.ObtenerEnfocarse()){
                        
                       PprincipalBombillos.Consejo1Bombillo.setText(usuario.ConsejosActualesBombillo.get(0));
                       PprincipalBombillos.Consejo2Bombillo.setText(usuario.ConsejosActualesBombillo.get(1));
                       PprincipalBombillos.Consejo3Bombillo.setText(usuario.ConsejosActualesBombillo.get(2));
                       PprincipalBombillos.Consejo4Bombillo.setText(usuario.ConsejosActualesBombillo.get(3));
                       PprincipalBombillos.Consejo5Bombillo.setText(usuario.ConsejosActualesBombillo.get(4));
                       
                       PprincipalNevera.Consejo1Nevera.setText(usuario.ConsejosActualesNevera.get(0));
                       PprincipalNevera.Consejo2Nevera.setText(usuario.ConsejosActualesNevera.get(1));
                       PprincipalNevera.Consejo3Nevera.setText(usuario.ConsejosActualesNevera.get(2));
                       PprincipalNevera.Consejo4Nevera.setText(usuario.ConsejosActualesNevera.get(3));
                       PprincipalNevera.Consejo5Nevera.setText(usuario.ConsejosActualesNevera.get(4));
                       
                       PprincipalMicroondas.Consejo1Microondas.setText(usuario.ConsejosActualesMicroondas.get(0));
                       PprincipalMicroondas.Consejo2Microondas.setText(usuario.ConsejosActualesMicroondas.get(1));
                       PprincipalMicroondas.Consejo3Microondas.setText(usuario.ConsejosActualesMicroondas.get(2));
                       PprincipalMicroondas.Consejo4Microondas.setText(usuario.ConsejosActualesMicroondas.get(3));
                       PprincipalMicroondas.Consejo5Microondas.setText(usuario.ConsejosActualesMicroondas.get(4));
                       
                       PprincipalLavadora.Consejo1Lavadora.setText(usuario.ConsejosActualesLavadora.get(0));
                       PprincipalLavadora.Consejo2Lavadora.setText(usuario.ConsejosActualesLavadora.get(1));
                       PprincipalLavadora.Consejo3Lavadora.setText(usuario.ConsejosActualesLavadora.get(2));
                       PprincipalLavadora.Consejo4Lavadora.setText(usuario.ConsejosActualesLavadora.get(3));
                       PprincipalLavadora.Consejo5Lavadora.setText(usuario.ConsejosActualesLavadora.get(4));
                       
                    }else{
                       PprincipalBombillos.Consejo1Bombillo.setText(usuario.ConsejosActualesBombillo.get(0));
                       PprincipalBombillos.Consejo2Bombillo.setText(usuario.ConsejosActualesBombillo.get(1));
                       PprincipalBombillos.Consejo3Bombillo.setText(usuario.ConsejosActualesBombillo.get(2));
                       PprincipalBombillos.Consejo4Bombillo.setText(usuario.ConsejosActualesBombillo.get(3));
                       PprincipalBombillos.Consejo5Bombillo.setText(usuario.ConsejosActualesBombillo.get(4));
                       PprincipalBombillos.Consejo4Bombillo.setVisible(false);
                       PprincipalBombillos.Consejo5Bombillo.setVisible(false);
                       PprincipalBombillos.Separador4.setVisible(false);
                       PprincipalBombillos.Separador5.setVisible(false);
                       PprincipalBombillos.Consejo4BombilloE.setVisible(false);
                       PprincipalBombillos.Consejo5BombilloE.setVisible(false);
                       
                       
                       PprincipalNevera.Consejo1Nevera.setText(usuario.ConsejosActualesNevera.get(0));
                       PprincipalNevera.Consejo2Nevera.setText(usuario.ConsejosActualesNevera.get(1));
                       PprincipalNevera.Consejo3Nevera.setText(usuario.ConsejosActualesNevera.get(2));
                       PprincipalNevera.Consejo4Nevera.setText(usuario.ConsejosActualesNevera.get(3));
                       PprincipalNevera.Consejo5Nevera.setText(usuario.ConsejosActualesNevera.get(4));
                       PprincipalNevera.Consejo4Nevera.setVisible(false);
                       PprincipalNevera.Consejo5Nevera.setVisible(false);
                       PprincipalNevera.Separador4.setVisible(false);
                       PprincipalNevera.Separador5.setVisible(false);
                       PprincipalNevera.Consejo4NeveraE.setVisible(false);
                       PprincipalNevera.Consejo5NeveraE.setVisible(false);
                       
                       
                       PprincipalMicroondas.Consejo1Microondas.setText(usuario.ConsejosActualesMicroondas.get(0));
                       PprincipalMicroondas.Consejo2Microondas.setText(usuario.ConsejosActualesMicroondas.get(1));
                       PprincipalMicroondas.Consejo3Microondas.setText(usuario.ConsejosActualesMicroondas.get(2));
                       PprincipalMicroondas.Consejo4Microondas.setText(usuario.ConsejosActualesMicroondas.get(3));
                       PprincipalMicroondas.Consejo5Microondas.setText(usuario.ConsejosActualesMicroondas.get(4));
                       PprincipalMicroondas.Consejo4Microondas.setVisible(false);
                       PprincipalMicroondas.Consejo5Microondas.setVisible(false);
                       PprincipalMicroondas.Separador4.setVisible(false);
                       PprincipalMicroondas.Separador5.setVisible(false);
                       PprincipalMicroondas.Consejo4MicroondasE.setVisible(false);
                       PprincipalMicroondas.Consejo5MicroondasE.setVisible(false);
                       
                       PprincipalLavadora.Consejo1Lavadora.setText(usuario.ConsejosActualesLavadora.get(0));
                       PprincipalLavadora.Consejo2Lavadora.setText(usuario.ConsejosActualesLavadora.get(1));
                       PprincipalLavadora.Consejo3Lavadora.setText(usuario.ConsejosActualesLavadora.get(2));
                       PprincipalLavadora.Consejo4Lavadora.setText(usuario.ConsejosActualesLavadora.get(3));
                       PprincipalLavadora.Consejo5Lavadora.setText(usuario.ConsejosActualesLavadora.get(4));
                       PprincipalLavadora.Consejo4Lavadora.setVisible(false);
                       PprincipalLavadora.Consejo5Lavadora.setVisible(false);
                       PprincipalLavadora.Separador4.setVisible(false);
                       PprincipalLavadora.Separador5.setVisible(false);
                       PprincipalLavadora.Consejo4LavadoraE.setVisible(false);
                       PprincipalLavadora.Consejo5LavadoraE.setVisible(false);
                       
                       
                  
                    }
                    
                    Double EnergiaAhorrar = 0.0d;
                    DecimalFormat formato = new DecimalFormat("#.00");
         
                    for(int i = 0; i<5;i++){
                        String s =  usuario.ConsejosActualesBombillo.get(i);
                        boolean x = s.equals(consejos4[0][0]);
                        boolean y = s.equals(consejos4[1][0]);
                        if(x || y){
                            
                            
                            System.out.println("ENtro");
                           if(PprincipalBombillos.Consejo1Bombillo.getText().equals(s)){
                               if (x){
                                 EnergiaAhorrar+=  (Double.valueOf(consejos4[0][1])/100) *21.6 ;
                                 
                                 PprincipalBombillos.Consejo1BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[1][1])/100)*21.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos4[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo1BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[1][1])/100)*21.6))+"Kv"); 
                                }
                                 
                            }
                           if(PprincipalBombillos.Consejo2Bombillo.getText().equals(s)){
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos4[0][1])/100)*21.6;
                                   PprincipalBombillos.Consejo2BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[0][1])/100)*21.6))+"Kv");
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos4[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo2BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[1][1])/100)*21.6))+"Kv");
                                   
                               }
                               
                            }
                            if(PprincipalBombillos.Consejo3Bombillo.getText().equals(s)){
                                if(x){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos4[0][1])/100)*21.6;
                                    PprincipalBombillos.Consejo3BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[0][1])/100)*21.6))+"Kv");
                                }else if(y){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos4[1][1])/100)*21.6;
                                    PprincipalBombillos.Consejo3BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[1][1])/100)*21.6))+"Kv");
                                }
                               
                            }
                            
                            if(PprincipalBombillos.Consejo4Bombillo.getText().equals(s)){
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos4[0][1])/100)*21.6;
                                   PprincipalBombillos.Consejo4BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[0][1])/100)*21.6))+"Kv");
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos4[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo4BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[1][1])/100)*21.6))+"Kv");
                               }
                               
                            }
                            if(PprincipalBombillos.Consejo5Bombillo.getText().equals(s)){
                                
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos4[0][1])/100)*21.6;
                                 PprincipalBombillos.Consejo5BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[0][1])/100)*21.6))+"Kv");  
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos4[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo5BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos4[1][1])/100)*21.6))+"Kv");
                               }
                               
                            }
                
                        }
                        
                    }
                    for(int i = 0; i<5;i++){
                        String s =  usuario.ConsejosActualesBombillo.get(i);
                        boolean x = s.equals(consejos3[0][0]);
                        boolean y = s.equals(consejos3[1][0]);
                        if(x || y){
                            
                            
                            System.out.println("ENtro");
                           if(PprincipalBombillos.Consejo1Bombillo.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+= ( Double.valueOf(consejos3[0][1])/100)*21.6;
                                 PprincipalBombillos.Consejo1BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[0][1])/100)*21.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos3[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo1BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[1][1])/100)*21.6))+"Kv"); 
                                }
                                 
                            }
                           if(PprincipalBombillos.Consejo2Bombillo.getText().equals(s)){
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos3[0][1])/100)*21.6;
                                   PprincipalBombillos.Consejo2BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[0][1])/100)*21.6))+"Kv");
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos3[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo2BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[1][1])/100)*21.6))+"Kv");
                                   
                               }
                               
                            }
                            if(PprincipalBombillos.Consejo3Bombillo.getText().equals(s)){
                                if(x){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos3[0][1])/100)*21.6;
                                    PprincipalBombillos.Consejo3BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[0][1])/100)*21.6))+"Kv");
                                }else if(y){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos3[1][1])/100)*21.6;
                                    PprincipalBombillos.Consejo3BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[1][1])/100)*21.6))+"Kv");
                                }
                               
                            }
                            
                            if(PprincipalBombillos.Consejo4Bombillo.getText().equals(s)){
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos3[0][1])/100)*21.6;
                                   PprincipalBombillos.Consejo4BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[0][1])/100)*21.6))+"Kv");
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos3[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo4BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[1][1])/100)*21.6))+"Kv");
                               }
                               
                            }
                            if(PprincipalBombillos.Consejo5Bombillo.getText().equals(s)){
                                
                               if(x){
                                   EnergiaAhorrar+= (Double.valueOf(consejos3[0][1])/100)*21.6;
                                 PprincipalBombillos.Consejo5BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[0][1])/100)*21.6))+"Kv");  
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos3[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo5BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos3[1][1])/100)*21.6))+"Kv");
                               }
                               
                            }
                
                        }
                        
                    }
                    for(int i = 0; i<5;i++){
                        String s =  usuario.ConsejosActualesBombillo.get(i);
                        boolean x = s.equals(consejos2[0][0]);
                        boolean y = s.equals(consejos2[1][0]);
                        boolean z = s.equals(consejos2[2][0]);
                        if(x || y || z){
                            
                            
                            System.out.println("ENtro");
                           if(PprincipalBombillos.Consejo1Bombillo.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[0][1])/100)*21.6;
                                 PprincipalBombillos.Consejo1BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[0][1])/100)*21.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo1BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[1][1])/100)*21.6))+"Kv"); 
                               }else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[2][1])/100)*21.6;
                                   PprincipalBombillos.Consejo1BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[2][1])/100)*21.6))+"Kv");
                                   
                               }
                                 
                            }
                           if(PprincipalBombillos.Consejo2Bombillo.getText().equals(s)){
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[0][1])/100)*21.6;
                                   PprincipalBombillos.Consejo2BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[0][1])/100)*21.6))+"Kv");
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo2BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[1][1])/100)*21.6))+"Kv");
                                   
                               }
                               else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[2][1])/100)*21.6;
                                   PprincipalBombillos.Consejo2BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[2][1])/100)*21.6))+"Kv");
                                   
                               }
                 
                       
                               
                            }
                            
                            if(PprincipalBombillos.Consejo3Bombillo.getText().equals(s)){
                               
                                
                                if(x){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos2[0][1])/100)*21.6;
                                    PprincipalBombillos.Consejo3BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[0][1])/100)*21.6))+"Kv");
                                }else if(y){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos2[1][1])/100)*21.6;
                                    PprincipalBombillos.Consejo3BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[1][1])/100)*21.6))+"Kv");
                                }
                                else if(z){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos2[2][1])/100)*21.6;
                                   PprincipalBombillos.Consejo3BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[2][1])/100)*21.6))+"Kv");
                                   
                               }
                               
                            }
                            
                            if(PprincipalBombillos.Consejo4Bombillo.getText().equals(s)){
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[0][1])/100)*21.6;
                                   PprincipalBombillos.Consejo4BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[0][1])/100)*21.6))+"Kv");
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo4BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[1][1])/100)*21.6))+"Kv");
                               }
                               else if(z){
                                   EnergiaAhorrar+= ( Double.valueOf(consejos2[2][1])/100)*21.6;
                                   PprincipalBombillos.Consejo4BombilloE.setText("Energia Ahorrada "+((Double.valueOf(consejos2[2][1])/100)*21.6)+"Kv");
                                   
                               }
                               
                            }
                            if(PprincipalBombillos.Consejo5Bombillo.getText().equals(s)){
                                
                               if(x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[0][1])/100)*21.6;
                                 PprincipalBombillos.Consejo5BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[0][1])/100)*21.6))+"Kv");  
                               }else if(y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[1][1])/100)*21.6;
                                   PprincipalBombillos.Consejo5BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[1][1])/100)*21.6))+"Kv");
                               }
                               else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos2[2][1])/100)*21.6;
                                   PprincipalBombillos.Consejo5BombilloE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos2[2][1])/100)*21.6))+"Kv");
                                   
                               }
                               
                            }
                
                        }
                        
                    }
                    
                    PprincipalBombillos.EnergiaAhorrada.setText("Energia a ahorrar "+formato.format(EnergiaAhorrar));
                    PprincipalBombillos.EnergiaDesperdiciada.setText("Energia a desperdiciar "+formato.format(EnergiaAhorrar));
                    
                    ///////////////////////////////////
                    ////////////////////////////////////NEVERA Nevera
                    EnergiaAhorrar = 0.0;
         
                    for(int i = 0; i<5;i++){
                        String s =  usuario.ConsejosActualesNevera.get(i);
                        boolean x = s.equals(consejos5[0][0]);
                        boolean y = s.equals(consejos5[1][0]);
                        boolean z = s.equals(consejos5[2][0]);
                        boolean w = s.equals(consejos5[3][0]);
                                
                        if(x || y || z || w){
                            
                            
                            System.out.println("ENtro");
                           if(PprincipalNevera.Consejo1Nevera.getText().equals(s)){
                               if (x){
                                 EnergiaAhorrar+= ( Double.valueOf(consejos5[0][1])/100)*44.6;
                                 PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[0][1])/100)*44.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[1][1])/100)*44.6;
                                   PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[1][1])/100)*44.6))+"Kv"); 
                                }else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[2][1])/100)*44.6;
                                   PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[2][1])/100)*44.6))+"Kv"); 
                                    
                                }else if(w){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos5[3][1])/100)*44.6;
                                   PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[3][1])/100)*44.6))+"Kv"); 
                                    
                                }
                                 
                            }
                           if(PprincipalNevera.Consejo2Nevera.getText().equals(s)){
                              if (x){
                                 EnergiaAhorrar+=  (Double.valueOf(consejos5[0][1])/100)*44.6;
                                 PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[0][1])/100)*44.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+= (Double.valueOf(consejos5[1][1])/100)*44.6;
                                   PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[1][1])/100)*44.6))+"Kv"); 
                                }else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[2][1])/100)*44.6;
                                   PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[2][1])/100)*44.6))+"Kv"); 
                                    
                                }else if(w){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos5[3][1])/100)*44.6;
                                   PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[3][1])/100)*44.6))+"Kv"); 
                                    
                                }
                               
                            }
                            if(PprincipalNevera.Consejo3Nevera.getText().equals(s)){
                               if (x){
                                 EnergiaAhorrar+= ( Double.valueOf(consejos5[0][1])/100)*44.6;
                                 PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[0][1])/100)*44.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[1][1])/100)*44.6;
                                   PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[1][1])/100)*44.6))+"Kv"); 
                                }else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[2][1])/100)*44.6;
                                   PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[2][1])/100)*44.6))+"Kv"); 
                                    
                                }else if(w){
                                    EnergiaAhorrar+=  Double.valueOf(consejos5[3][1])/100;
                                   PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[3][1])/100)*44.6))+"Kv"); 
                                    
                                }
                               
                            }
                            
                            if(PprincipalNevera.Consejo4Nevera.getText().equals(s)){
                               if (x){
                                 EnergiaAhorrar+=  (Double.valueOf(consejos5[0][1])/100)*44.6;
                                 PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[0][1])/100)*44.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos5[1][1])/100*44.6;
                                   PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[1][1])/100)*44.6))+"Kv"); 
                                }else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[2][1])/100)*44.6;
                                   PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[2][1])/100)*44.6))+"Kv"); 
                                    
                                }else if(w){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos5[3][1])/100)*44.6;
                                   PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[3][1])/100)*44.6))+"Kv"); 
                                    
                                }
                               
                            }
                            if(PprincipalNevera.Consejo5Nevera.getText().equals(s)){
                                
                               if (x){
                                 EnergiaAhorrar+=  (Double.valueOf(consejos5[0][1])/100)*44.6;
                                 PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[0][1])/100)*44.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[1][1])/100)*44.6;
                                   PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[1][1])/100)*44.6))+"Kv"); 
                                }else if(z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos5[2][1])/100)*44.6;
                                   PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[2][1])/100)*44.6))+"Kv"); 
                                    
                                }else if(w){
                                    EnergiaAhorrar+=  (Double.valueOf(consejos5[3][1])/100)*44.6;
                                   PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos5[3][1])/100)*44.6))+"Kv"); 
                                    
                                }
                               
                            }
                
                        }
                        
                    }
                    for(int i = 0; i<5;i++){
                        String s =  usuario.ConsejosActualesNevera.get(i);
                        boolean x = s.equals(consejos6[0][0]);
                        boolean y = s.equals(consejos6[1][0]);
                        boolean z = s.equals(consejos6[2][0]);
                        if(x || y || z){
                            
                            
                           
                           if(PprincipalNevera.Consejo1Nevera.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos6[0][1])/100)*44.6;
                                 PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos6[0][1])/100)*44.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos6[1][1])/100)*44.6;
                                   PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos6[1][1])/100)*44.6))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[2][1])/100;
                                   PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+formato.format(((Double.valueOf(consejos6[2][1])/100)*44.6))+"Kv"); 
                                }
                                 
                            }
                           if(PprincipalNevera.Consejo2Nevera.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos6[0][1])/100)*44.6;
                                 PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos6[0][1])/100)*44.6))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos6[1][1])/100)*44.6;
                                   PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos6[1][1])/100)*44.6))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  (Double.valueOf(consejos6[2][1])/100)*44.6;
                                   PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format((Double.valueOf(consejos6[2][1])/100)*44.6))+"Kv"); 
                                }
                               
                            }
                            if(PprincipalNevera.Consejo3Nevera.getText().equals(s)){
                                if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[0][1])/100;
                                 PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[0][1])/100)+"Kv"));   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[1][1])/100;
                                   PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[2][1])/100;
                                   PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[2][1])/100))+"Kv"); 
                                }
                               
                            }
                            
                            if(PprincipalNevera.Consejo4Nevera.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[0][1])/100;
                                 PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[0][1])/100))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[1][1])/100;
                                   PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[2][1])/100;
                                   PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[2][1])/100))+"Kv"); 
                                }
                               
                            }
                            if(PprincipalNevera.Consejo5Nevera.getText().equals(s)){
                                
                               if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[0][1])/100;
                                 PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[0][1])/100))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[1][1])/100;
                                   PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos6[2][1])/100;
                                   PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos6[2][1])/100))+"Kv"); 
                                }
                               
                            }
                
                        }
                        
                    }
                    for(int i = 0; i<5;i++){
                        String s =  usuario.ConsejosActualesNevera.get(i);
                        boolean x = s.equals(consejos7[0][0]);
                        boolean y = s.equals(consejos7[1][0]);
                        boolean z = s.equals(consejos7[2][0]);
                        if(x || y || z){
                            
                            
                           
                           if(PprincipalNevera.Consejo1Nevera.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[0][1])/100;
                                 PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[0][1])/100))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[1][1])/100;
                                   PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[2][1])/100;
                                   PprincipalNevera.Consejo1NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[2][1])/100))+"Kv"); 
                                }
                                 
                            }
                           if(PprincipalNevera.Consejo2Nevera.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[0][1])/100;
                                 PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[0][1])/100))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[1][1])/100;
                                   PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[2][1])/100;
                                   PprincipalNevera.Consejo2NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[2][1])/100))+"Kv"); 
                                }
                               
                            }
                            if(PprincipalNevera.Consejo3Nevera.getText().equals(s)){
                                if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[0][1])/100;
                                 PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[0][1])/100))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[1][1])/100;
                                   PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[2][1])/100;
                                   PprincipalNevera.Consejo3NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[2][1])/100))+"Kv"); 
                                }
                               
                            }
                            
                            if(PprincipalNevera.Consejo4Nevera.getText().equals(s)){
                               if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[0][1])/100;
                                 PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[0][1])/100))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[1][1])/100;
                                   PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[2][1])/100;
                                   PprincipalNevera.Consejo4NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[2][1])/100))+"Kv"); 
                                }
                               
                            }
                            if(PprincipalNevera.Consejo5Nevera.getText().equals(s)){
                                
                               if (x){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[0][1])/100;
                                 PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+formato.format((Double.valueOf(consejos7[0][1])/100))+"Kv");   
                               }else if (y){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[1][1])/100;
                                   PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[1][1])/100))+"Kv"); 
                                }else if (z){
                                   EnergiaAhorrar+=  Double.valueOf(consejos7[2][1])/100;
                                   PprincipalNevera.Consejo5NeveraE.setText("Energia Ahorrada "+(formato.format(Double.valueOf(consejos7[2][1])/100))+"Kv"); 
                                }
                               
                            }
                
                        }
                        
                    }
                    
                    
                    PprincipalNevera.EnergiaAhorrada.setText("Energia a ahorrar "+formato.format(EnergiaAhorrar));
                    PprincipalNevera.EnergiaDesperdiciada.setText("Energia a desperdiciar "+formato.format(EnergiaAhorrar));
                    
                    
                    


                }catch(Exception e){
                    System.out.println("No habia usuario listo");
                    throw e;
                  }

            
            
            
            
                
            }else{
                Anterior.setVisible(true);
                Siguiente.setVisible(true);
                sesion.setVisible(false);
                diagnostico1.setVisible(true);
                revalidate();
                repaint();
            }
        
        }
        
   
        
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
            Siguiente.setLabel("Siguiente");
            System.out.println("SE EJECUTO 1");
            diagnostico5.setVisible(false);
            diagnostico4.setVisible(true);
            sesion.setVisible(false);
            revalidate();
            repaint();
            
        }else if(diagnostico3.isVisible()){
            System.out.println("SE EJECUTO 2.5");
            diagnostico3.setVisible(false);
            diagnostico2.setVisible(true);
            revalidate();
            repaint();
            
        }else if(diagnostico4.isVisible()){
            diagnostico4.setVisible(false);
            diagnostico3.setVisible(true);
            revalidate();
            repaint();
        
        
        }else if(diagnostico1.isVisible()==true){
           
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
            
            
        }else if(PprincipalBombillos.isVisible()){
            PprincipalBombillos.setVisible(false);
            sesion.setVisible(true);
            revalidate();
            repaint();
        }else if(PprincipalLavadora.isVisible()){
            PprincipalLavadora.setVisible(false);
            PprincipalBombillos.setVisible(true);
            revalidate();
            repaint();
        }else if(PprincipalNevera.isVisible()){
            PprincipalNevera.setVisible(false);
            PprincipalLavadora.setVisible(true);
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
            
            if((boolean)DatosUsuarioActual[0]){
                DatosUsuarioActual[8] = (int) diagnostico2.ElectrodomesticosSpinner.getValue();
            }else{
                DatosUsuarioActual[8] = 0;
            }
            
            
            System.out.println("Numero de electrodomesticos "+DatosUsuarioActual[8]);
            revalidate();
            repaint();
        
        }else if(diagnostico3.isVisible()){
            System.out.println("SE EJECUTO 33");
            diagnostico3.setVisible(false);
            diagnostico4.setVisible(true);
            
            if((boolean)DatosUsuarioActual[0]){
                DatosUsuarioActual[7] = (int) diagnostico3.ElectrodomesticosSlider.getValue();
                
            }else{
                DatosUsuarioActual[8] = 0;
            }
            
            System.out.println("Horas de uso electrodomesticos "+DatosUsuarioActual[7]);
            
            revalidate();
            repaint();
        }
        else if(diagnostico5.isVisible()){
            Anterior.setVisible(false);
            Siguiente.setVisible(false);
            System.out.println("SE EJECUTO 4");
            diagnostico5.setVisible(false);
            PprincipalBombillos.setVisible(true);
            System.out.println(PprincipalBombillos.getBounds());
            
            if(diagnostico5.MaximoAhorroRadio.isSelected()){
                DatosUsuarioActual[6] = 3;
                System.out.println("Ahorro maximo seleccionado");
            }else if (diagnostico5.MedioAhorroRadio.isSelected()){
                DatosUsuarioActual[6] = 2;
                System.out.println("Ahorro medio seleccionado");
            }else if (diagnostico5.FacilAhorroRadio.isSelected()){
                DatosUsuarioActual[6] = 1;
                System.out.println("Ahorro minimo seleccionado");
            }else{
                DatosUsuarioActual[6] = 2;
                System.out.println("Ahorro medio seleccionado");
            }
            
            
            String enfocado = (String) diagnostico5.EnfocarseCombo.getSelectedItem();
            
            DatosUsuarioActual[5] = enfocado.equals("Electrodomesticos");
            
            System.out.println("El aparato enfocado"+enfocado);
            System.out.println(DatosUsuarioActual[5]);
            System.out.println("_____________________");
            
            System.out.println("Datos de "+UsuarioActual);
            for (Object DatosUsuarioActual1 : DatosUsuarioActual) {
                System.out.println(DatosUsuarioActual1);
            }
            System.out.println("_____________________");
            
            ListaUsuarios.AjustarConsejosUsuario(UsuarioActual,(boolean)DatosUsuarioActual[0] , (boolean)DatosUsuarioActual[1],(boolean)DatosUsuarioActual[2] ,(boolean)DatosUsuarioActual[3] ,(boolean) DatosUsuarioActual[4],(boolean)DatosUsuarioActual[5] ,(int)DatosUsuarioActual[6] ,(int) DatosUsuarioActual[7],(int) DatosUsuarioActual[8]);
            
            Usuario u = ListaUsuarios.getUsuarioLlave(UsuarioActual);
            DiagnosticoGeneral diag = u.GetDiagnostico();
            
            Electrodomesticos  electro = diag.GetElectrodomesticos();
            HashMap<String,ArrayList> mapaCON = electro.getConsejosElectrodomesticos();
            
            ArrayList<String> conBOM = mapaCON.get("Bombillo");
            ArrayList<String> conLAV = mapaCON.get("Lavadora");
            ArrayList<String> conNEV = mapaCON.get("Nevera");
            ArrayList<String> conMIC = mapaCON.get("Microondas");
            
            int cont = 3;
            boolean enfocarse = electro.ObtenerEnfocarse();
            if (enfocarse){
                cont = 5;
            }
            for(int i = 0; i<cont;i++){
                u.ConsejosActualesBombillo.add(conBOM.get(i));
                u.ConsejosActualesLavadora.add(conLAV.get(i));
                u.ConsejosActualesNevera.add(conNEV.get(i));
                u.ConsejosActualesMicroondas.add(conMIC.get(i));
                
            }
            
            u.ActualizarUsuario(UsuarioActual, u);
            System.out.println(u.ConsejosActualesBombillo);
            
            
            try {
                guardar(ListaUsuarios);
            } catch (IOException ex) {
                System.out.println("ERROR");
        
                Logger.getLogger(Optimizate.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            EntraActionPerformed();
            
            
            
            revalidate();
            repaint();
        }else if(diagnostico4.isVisible()){
            
            Siguiente.setLabel("Siguiente");
            diagnostico5.EnfocarseCombo.removeAllItems();
            for(int i = 0; i < 3; i++){
                if(AparatosElegidos[i] != ""){
                    diagnostico5.EnfocarseCombo.addItem(AparatosElegidos[i]);
                } 
            }
            
            
            diagnostico4.setVisible(false);
            diagnostico5.setVisible(true);
            
            if((boolean)DatosUsuarioActual[0]){
                DatosUsuarioActual[1] = diagnostico4.AhorrasCasa.isSelected();
                DatosUsuarioActual[2] = diagnostico4.RecibosCasa.isSelected();
                DatosUsuarioActual[3] = diagnostico4.MenosCasa.isSelected();
                DatosUsuarioActual[4] = diagnostico4.AhorradoresCasa.isSelected();
                
                
            }else{
                DatosUsuarioActual[1] = false;
                DatosUsuarioActual[2] = false;
                DatosUsuarioActual[3] = false;
                DatosUsuarioActual[4] = false;
            }
            
            System.out.println("El usuario ahorra en la casa (electrodomesticos) "+ DatosUsuarioActual[1]);
            System.out.println("El usuario paga caro los recibos (electrodomesticos) "+ DatosUsuarioActual[2]);
            System.out.println("El usuario puede usar menos sus electronicos (electrodomesticos) "+ DatosUsuarioActual[3]);
            System.out.println("El usuario tiene ahorradores en su casa(electrodomesticos) "+ DatosUsuarioActual[4]);
            
            
            
            
            
            
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
            
        }else if(PprincipalBombillos.isVisible()){
            PprincipalBombillos.setVisible(false);
            PprincipalLavadora.setVisible(true);
            revalidate();
            repaint();
        }else if(PprincipalLavadora.isVisible()){
            PprincipalLavadora.setVisible(false);
            PprincipalNevera.setVisible(true);
            revalidate();
            repaint();
        }
    }//GEN-LAST:event_SiguienteActionPerformed
   private void ElectrodomesticosCheckActionPerformed(boolean x) {
    
        if(x){
           System.out.println("Electrodomestico seleccionado");

           diagnostico2.ElectrodomesticosSpinner.setModel(new SpinnerNumberModel(1,1,4,1));
           diagnostico3.ElectrodomesticosSlider.setMaximum(24);
           diagnostico3.ElectrodomesticosSlider.setMinimum(1);
           AparatosElegidos[0] = "Electrodomesticos";
           
           DatosUsuarioActual[0] = true;
           
           
           
  
        }else{
            diagnostico2.ElectrodomesticosSpinner.setModel(new SpinnerNumberModel(0,0,0,0));
            diagnostico3.ElectrodomesticosSlider.setMaximum(0);
            AparatosElegidos[0] = "";
            
            System.out.println("Electrodomestico no elegido");
            DatosUsuarioActual[0] = false;
        }
    }                                                      

    private void CelularCheckActionPerformed(boolean x) {  
       
        System.out.println(x);
        if(x){
           System.out.println("Celular  seleccionado");

           diagnostico2.CelularSpinner.setModel(new SpinnerNumberModel(1,1,5,1));
           diagnostico3.CelularSlider.setMaximum(24);
           diagnostico3.CelularSlider.setMinimum(1);
           AparatosElegidos[1] = "Celular";
           
           
           
        }else{
            diagnostico2.CelularSpinner.setModel(new SpinnerNumberModel(0,0,0,0));
            diagnostico3.CelularSlider.setMaximum(0);
            AparatosElegidos[1] = "";
        }

    }                                            

    private void ComputadorCheckActionPerformed( boolean x) {

        System.out.println(x);
        if(x){
           System.out.println("Computador seleccionado");
           
           
           diagnostico2.ComputadorSpinner.setModel(new SpinnerNumberModel(1,1,5,1));
           diagnostico3.ComputadorSlider.setMaximum(24);
           diagnostico3.ComputadorSlider.setMinimum(24);
           
           AparatosElegidos[2] = "Computador";
           
        }else{
           diagnostico2.ComputadorSpinner.setModel(new SpinnerNumberModel(0,0,0,0));
           diagnostico3.ComputadorSlider.setMaximum(0);
           AparatosElegidos[2] = "";
        }
            

    }
private class Diagnostico_1 extends Diagnostico1 implements ActionListener{
    
    public boolean x1,x2,x3;
    public Diagnostico_1(){
       
        
        ElectrodomesticosCheck.addActionListener(this);
        CelularCheck.addActionListener(this);
        ComputadorCheck.addActionListener(this);
        
        

        
    }
    
    public void actionPerformed(ActionEvent e) {

        
        if(e.getSource()== ElectrodomesticosCheck){
            boolean x = ElectrodomesticosCheck.isSelected();
            ElectrodomesticosCheckActionPerformed(x);
           
        }
        else if(e.getSource()==CelularCheck){
            boolean x = CelularCheck.isSelected();
            CelularCheckActionPerformed(x);
        }else if(e.getSource()==ComputadorCheck){
            boolean x = ComputadorCheck.isSelected();
            ComputadorCheckActionPerformed(x);
           
        }
 
     }
    
    
    
    
}

private class Diagnostico_2 extends Diagnostico2{

    public Diagnostico_2(){
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(0);
        nm.setMinimum(0);
        nm.setStepSize(0);
        
        DatosUsuarioActual[0] = false;

       ComputadorSpinner.setModel(nm);
       ElectrodomesticosSpinner.setModel(nm);
       CelularSpinner.setModel(nm);
       
      
        
    }

    
}
private class Diagnostico_3 extends Diagnostico3{
    
    public Diagnostico_3(){
        ElectrodomesticosSlider.setMaximum(0);
        CelularSlider.setMaximum(0);
        ComputadorSlider.setMaximum(0);
        
        DatosUsuarioActual[7] = 0;
    } 
    
}
    
    
    
private class Diagnostico_4 extends Diagnostico4{
    
}
private class Diagnostico_5 extends Diagnostico5{
    
    public Diagnostico_5(){
        EnfocarseCombo.removeAllItems();
    }
    
}
    
private class PrincipalBombillos extends PantallaPrincipal implements ActionListener{
    
        
    public PrincipalBombillos(){
        
        
        
        
        
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
private class PrincipalNevera extends NeveraPantalla{
    
}
private class PrincipalMicroondas extends MicroondasPantalla{
    
}
private class PrincipalLavadora extends LavadoraPantalla{
    
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
            EntraActionPerformed();
        
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

