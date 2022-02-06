
package Clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.ImageIcon;



class Electrodomesticos extends DiagnosticoGeneral{
    
    //Electrodomesticos
    
    Nevera nevera;
    Microondas microondas;
    Lavadora lavadora;
    Bombillo bombillo;
    
    //Lista de consejos
    protected Object[][] ConsejosFaciles = new Object[3][3];
    protected Object[][] ConsejosComplejos= new Object[3][3];
    protected Object[][] ConsejosModerados= new Object[3][3];
    //Guardar los consejos por llave(nevera,Bombilla,Televisro,Lavadora,Ducha,Cafetera)
    HashMap<String,ArrayList> Consejos = new HashMap<>();
    //ArrayList para guardar los consejos
    protected ArrayList<Object[]> Consejos2;
    //Imagen para representar el objeto
    
    //direccion de memoria de la imagen
    String DireccionDeMemoria;
    //entero para saber las horas de uso de electrodomesticos
    
    
    
    
    public Electrodomesticos(){
        this(false,false,false,false,false,0,0,0);
        
        
    }
    

    public Electrodomesticos(boolean Ahorra_Electrodomesticos,boolean Recibo_Electrodomesticos,boolean UsarMenos_Electrodomesticos,boolean Ahorradores_Electrodomesticos,boolean Enfocarse_Electrodomesticos, int Exigencia_Electrodomesticos , int HorasDeUso,   int Numero_Electrodomesticos ){
        
        this.HorasDeUso = HorasDeUso;
        Enfocarse = Enfocarse_Electrodomesticos;
        Exigencia = Exigencia_Electrodomesticos;
        Ahorradores = Ahorradores_Electrodomesticos;
        UsarMenos = UsarMenos_Electrodomesticos;
        Recibo = Recibo_Electrodomesticos;
        Ahorra = Ahorra_Electrodomesticos;
        Numero_Aparatos = Numero_Electrodomesticos;
        
        nevera = new Nevera();
        microondas = new Microondas();
        bombillo = new Bombillo();
        lavadora = new Lavadora();
                
        //Crear la imagen con su direccion de memoria
        Imagen = miPantalla.getImage("src/Graphics/Decodificador.png");
        
        //crear la imagen como un Image Icon para diferentes aplicaciones
        Icono = new ImageIcon(Imagen);
        
        //crear el ArrayList donde estaran los consejos
        Consejos2 = new ArrayList<>();
        
       
        
        //Configurar direccion de memoria de la imagen
        DireccionDeMemoria = "src/Graphics/Decodificador.png";
    }
    
    public void CrearConsejosTerminados(){
        
        ConfigurarListaDeConsejosIniciales(nevera);
        ConfigurarListaDeConsejosIniciales(bombillo);
        ConfigurarListaDeConsejosIniciales(lavadora);
        ConfigurarListaDeConsejosIniciales(microondas);
        
        Consejos.put("Nevera", nevera.Consejos2);
        Consejos.put("Bombillo", bombillo.Consejos2);
        Consejos.put("Lavadora", lavadora.Consejos2);
        Consejos.put("Microondas", microondas.Consejos2);
        
        
    }
    
   

    //AJUSTAR LA LISTA DE CONSEJOS SEGUN LAS NECESIDADES
    

    public  void ConfigurarListaDeConsejosIniciales(Nevera tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        if (HorasDeUso > 13){
            Exigencia = 2;
        }
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra || UsarMenos || Ahorradores){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1 ){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia == 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
    public  void ConfigurarListaDeConsejosIniciales(Microondas tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra || UsarMenos || Ahorradores){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1 ){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia== 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
      public  void ConfigurarListaDeConsejosIniciales(Bombillo tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra|| UsarMenos|| Ahorradores){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1 ){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia== 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
       public  void ConfigurarListaDeConsejosIniciales(Lavadora tipo){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra){
            ahorro1 = 2;
            ahorro2 = 5;    
        }if(UsarMenos){
            ahorro1 = 3;
            ahorro2 = 6;
        }
        if(Ahorradores){
            ahorro1 = 3;
            ahorro2 = 7;
        }   
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra|| UsarMenos || Ahorradores){
            
            for(int a =0; a<3;a++){
              tipo.ConsejosFaciles[a][1] = (int) tipo.ConsejosFaciles[a][1] *ahorro1;
            }
  
            for(int a =0; a<3;a++){
                tipo.ConsejosComplejos[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                 tipo.ConsejosModerados[a][1] = (int)  tipo.ConsejosFaciles[a][1] +ahorro2;
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1){
                                                 
            
                for(Object[] a:tipo.ConsejosFaciles){
                     tipo.Consejos2.add(a);
                }

                for(int a =0; a<tipo.ConsejosModerados.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }    
            
            }else if(Exigencia == 2){

                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosComplejos.length-1;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            }else if(Exigencia==3){
            
                for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosModerados[a]);
                }
                for(int a =0; a<tipo.ConsejosModerados.length;a++){
                    tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
                }
            
            
            }
        }else{
            for(Object[] a:tipo.ConsejosFaciles){
                    tipo.Consejos2.add(a);
                }
                    

            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosModerados[a]);
            }
            for(int a =0; a<tipo.ConsejosModerados.length;a++){
                tipo.Consejos2.add(tipo.ConsejosComplejos[a]);
            }
        }
        
    }
    
 
      
   
}


