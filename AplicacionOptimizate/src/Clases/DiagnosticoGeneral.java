/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author sergio andres
 */
public class DiagnosticoGeneral {
    
    Electrodomesticos electrodomesticos;
    
    
    //Booleano para saber si ahorra energia en su casa
    protected boolean Ahorra;    //VARIABLE DE UNA SUPERCLASE
    //Booleano para saber si mensualmente paga caro el recibo
    protected boolean Recibo;     //VARIABLE DE UNA SUPERCLASE
    //Si puede usar menos los electrodomesticos
    protected boolean UsarMenos ; //VARIABLE DE UNA SUPERCLASE
    //Si los aparatos son ahorradores
    protected boolean Ahorradores;  //VARIABLE DE UNA SUPERCLASE
    //Exigencia en el nivel de ahorro (1,2,3) 1 siendo el minimo y 3 el maximo
    protected int Exigencia; //VARIABLE DE UNA SUPERCLASE
    //Enfocarse en electrodomesticos
    protected boolean Enfocarse;
    //numero de aparatos
    protected int Numero_Aparatos;
    //numero de horas de uso
    protected int HorasDeUso; 
    protected Image Imagen;
    //La imagen pero como un icono
    protected ImageIcon Icono ;
    
    //Herramienta necesaria para leer una imagen
    protected Toolkit miPantalla = Toolkit.getDefaultToolkit();
    
    public DiagnosticoGeneral(){
        this(false,false,false,false,false,0,0,0);
    }
    
    public DiagnosticoGeneral(boolean Ahorra, boolean Recibo, boolean UsarMenos, boolean Ahorradores,boolean enfocarse, int Exigencia,int HorasDeUso,int NumeroAparatos){
        electrodomesticos = new Electrodomesticos(Ahorra,Recibo,UsarMenos,Ahorradores,Enfocarse,Exigencia,HorasDeUso,NumeroAparatos);
        
    }
    public boolean ObtenerRecibo(){
        return Recibo;
    }
    
    //GETTERS
    
    public boolean ObtenerUsarMenos(){
        return UsarMenos;
    }
    
    public boolean ObtenerAhorradores(){
        return Ahorradores ;
    }
    
    public int ObtenerExigencias(){
        return Exigencia ;
    }
    public boolean ObtenerEnfocarse(){
        return Enfocarse;
    }
    public int ObtenerNumero(){  
        return Numero_Aparatos;
    }
    public boolean ObtenerAhorra(){
        return Ahorra ;  
    }    
    public int ObtenerHorasDeUso(){      
        return HorasDeUso ;
    }
    public Image ObtenerImagen(){
        return Imagen;
    }
    
    //Configura el ImageIcon
    private ImageIcon ObtenerImageIcon(){
        return Icono ;
    }
    public void configurarImagenElectrodomestico(String direccionDeMemoria){
        
        boolean flag = true;
        
        Scanner sc = new Scanner(System.in);
        
        while(flag){
            
            direccionDeMemoria = sc.nextLine();
            try{
                Imagen = miPantalla.getImage(direccionDeMemoria);
                flag= false;
            }catch(Exception e){
                
                System.out.println("Direccion Incorrecta. Vuelva e intente");
            }
            
        }  
        
        ConfigurarImageIconElectrodomestico();
    }
    
    //Configura el ImageIcon
    private void ConfigurarImageIconElectrodomestico(){
        Icono = new ImageIcon(Imagen); 
    }
    
    
    
    //setters
    public void ConfigurarHorasDeUso(int x){      
        HorasDeUso = x;
    } 
    public void ConfigurarAhorra(boolean x){   
        Ahorra = x; 
    }
    //Saber si el recibo de la luz le llega caro
    public void ConfigurarRecibo(boolean x){
        Recibo = x;
    }
    //Si puede usar menos los electrodomesticos
    public void ConfigurarUsarMenos(boolean x){
        UsarMenos= x;
    }
    //Configurar si los electrodomesticos son ahorradores
    public void ConfigurarAhorradores(boolean x){
        Ahorradores = x;
    }
    //configurar que tanto va a ser la exigencia en los consejos
    public void ConfigurarExigencias(int x){
        Exigencia = x;
    }
    //boleano para configurarse en un electronico
    public void ConfigurarEnfocarse(boolean x){
        Enfocarse = x;
    }
 
    
    
}
