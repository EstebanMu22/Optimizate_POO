
package Clases;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.ImageIcon;



public class Electrodomesticos extends DiagnosticoGeneral implements Serializable{
    
    //Electrodomesticos
    
    protected final double EnergiaGastadaMesBombillo = 21.6;
    protected final double EnergiaGastadaMesLavadora = 4.4;
    protected final double EnergiaGastadaMesMicroondas = 3;
    protected final double EnergiaGastadaMesNevera = 44.64;
    //Lista de consejos
    protected Object[][] ConsejosFaciles = new Object[3][3];
    protected Object[][] ConsejosComplejos= new Object[3][3];
    protected Object[][] ConsejosModerados= new Object[3][3];
    //Guardar los consejos por llave(nevera,Bombilla,Televisro,Lavadora,Ducha,Cafetera)
    HashMap<String,ArrayList> Consejos = new HashMap<>();
    //ArrayList para guardar los consejos
    protected ArrayList<String> ConsejosNevera;
    protected ArrayList<String> ConsejosMicroondas;
    protected ArrayList<String> ConsejosBombillo;
    protected ArrayList<String> ConsejosLavadora;
    
    
    
    //Imagen para representar el objeto
    
    //direccion de memoria de la imagen
    String DireccionDeMemoria;
    //entero para saber las horas de uso de electrodomesticos
    
    public String[][] ConsejosFacilesBombillo ={
        {"Apaga las luces al salir de la habitacion","6"},
        {"Ilumina tu casa con luz natural","6"},
        {"si es de noche, usa las necesarias","8"}
    };
                       
    public String[][] ConsejosModeradosBombillo = {
        {"Concientiza a los demas de apagar las luces","13"},
        {"Sustituye tus bombillos antiguos por unos led","11"},
       
    };
    
    public String[][] ConsejosComplejosBombillo ={
        {"Usa reguladores de intensida de luz a los niveles mas bajos","23"},
        {"Se muy estricto con las horas de uso","15"}
         
    };
    
    public String[][] ConsejosModeradosNevera= {
        {"No te excedas con el frio, si esta muy alto, bajale","10"},
        {"Limpia tu nevera ","8"}, 
        {"Comprueba que tu nevera este en buen estado","5"}
    };
    
    public String[][] ConsejosComplejosNevera = {
            {"Si la puerta de tu nevera no cierra hermeticamente, mandala a arreglar","15"},
            {"Si tu nevera esta en un lugar caliente, cambiala de lugar","12"},
            {"Las neveras antiguas gastan mucha energia, si es el caso, cambiala por una nueva","30"}};
    public String[][] ConsejosFacilesNevera= {
        {"Si tu nevera esta llena, vaciala un poco","3"}, 
        {"Descongela comida dentro del mismo congelador","3"},
        {"Revisa si la puerta de tu nevera esta abierta","2"}, 
        {"No introduzcas alimentos calientes","3"}};;
    
    public String[][] ConsejosFacilesLavadora ={
        {"Lee las instrucciones de la lavadora y siguelas estrictamente","3"},
        {"Acumula la mayor cantidad de ropa hasta cuando creas conveniente lavar","3"},
        {"Seca tu ropa al aire libre, evita la secadora","3"}
        
                        
    };
    public String[][] ConsejosModeradosLavadora = {
        {"Utiliza un buen detergente que use menos agua","10"},
        {"Lava con agua fria","8"},
        {"Usa programas cortos para lavar tu ropa de diario","8"},
        {"Saca tu ropa apenas termine de lavar, asi no se arruga y evitas usar la plancha","3"}
    };
    
    public String[][] ConsejosComplejosLavadora ={
        {"Si tu lavadora es muy antigua, consigue una eficiente","20"},
        {"Manten la lavadora en buenas condiciones","12"},
        {"Limpia el fitro","10"}
         
    };
    public String[][] ConsejosFacilesMicroondas ={
        {"No la abras antes de tiempo","3"},
        {"Calienta varias cosas","3"},
        {"Bajale a los minutos de calentamiento","2"},
                                 
    };
    public String[][] ConsejosModeradosMicroondas = {
        {"Usa Recipientes Circulares","10"},
        {"Limpia el microondas","8"},
        {"Comprueba que el microondas este en buen estado","5"}
    };
    
    public String[][] ConsejosComplejosMicroondas ={
        {"Compra papel Stretch para calentar tu comida","15"},
        {"Usa vidrio Pirex para calentar tu comida","12"},
        {"Ayuda a concientizar sobre estas practicas","5"}
         
    };
    
    
    
    
    
    public Electrodomesticos(){
        
    }

    public Electrodomesticos(boolean Elegido,boolean Ahorra_Electrodomesticos,boolean Recibo_Electrodomesticos,boolean UsarMenos_Electrodomesticos,boolean Ahorradores_Electrodomesticos,boolean Enfocarse_Electrodomesticos, int Exigencia_Electrodomesticos , int HorasDeUso,   int Numero_Electrodomesticos ){
        
        
        this.Elegido = Elegido;
        this.HorasDeUso = HorasDeUso;
        Enfocarse = Enfocarse_Electrodomesticos;
        Exigencia = Exigencia_Electrodomesticos;
        Ahorradores = Ahorradores_Electrodomesticos;
        UsarMenos = UsarMenos_Electrodomesticos;
        Recibo = Recibo_Electrodomesticos;
        Ahorra = Ahorra_Electrodomesticos;
        Numero_Aparatos = Numero_Electrodomesticos;
        
        ConsejosNevera = new ArrayList<String>();
        ConsejosMicroondas = new ArrayList<String>();
        ConsejosBombillo = new ArrayList<String>();
        ConsejosLavadora = new ArrayList<String>();

        
        
        

    }
    public double GetBombilloKV(){
        return EnergiaGastadaMesBombillo;
        
    }
    public double GetLavadoraKV(){
        
        return EnergiaGastadaMesLavadora;
    }
    public double GetNeveraKV(){
        return EnergiaGastadaMesNevera;
        
    }
    public double GetMicroondasKV(){
        return EnergiaGastadaMesMicroondas;
        
    }
    public HashMap<String,ArrayList> getConsejosElectrodomesticos(){
        return Consejos;
    }
    
    public void CrearConsejosTerminados(){
        
        ConfigurarListaDeConsejosIniciales();
        
        
        Consejos.put("Nevera",ConsejosNevera );
        Consejos.put("Bombillo",ConsejosBombillo );
        Consejos.put("Lavadora",ConsejosLavadora );
        Consejos.put("Microondas",ConsejosMicroondas );
        
        
    }
    
   

    //AJUSTAR LA LISTA DE CONSEJOS SEGUN LAS NECESIDADES
    

    public  void ConfigurarListaDeConsejosIniciales(){

        //Hacer filtro de los consejos segun la encuesta

        //Si la persona se considera ahorradora 
        int ahorro1 = 1;
        int ahorro2 = 1;
        if(Ahorra){
            ahorro1 = 5;
            ahorro2 = 8;    
        }if(UsarMenos){
            ahorro1 = 5;
            ahorro2 = 6;
        }
        if(Ahorradores){
            ahorro1 = 5;
            ahorro2 = 7;
        }   
        if (HorasDeUso > 13){
            Exigencia = 2;
        }
        //Si puede dejar de usar un aparato o Si son ahorradores

        if(Ahorra || UsarMenos || Ahorradores){
            //nevera
            for(int a =0; a<ConsejosFacilesNevera.length;a++){
              
                ConsejosFacilesNevera[a][1] = ""+(Integer.valueOf( ConsejosFacilesNevera[a][1]) *ahorro1);
            }
            
  
            for(int a =0; a<ConsejosComplejosNevera.length;a++){
                ConsejosComplejosNevera[a][1] = ""+(Integer.valueOf(ConsejosComplejosNevera[a][1]) +ahorro2);
                ConsejosModeradosNevera[a][1] = ""+(Integer.valueOf(ConsejosModeradosNevera[a][1]) +ahorro2);
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1 ){
                                                 
            
                for(int a = 0; a< ConsejosFacilesNevera.length;a++){
                   
                   ConsejosNevera.add(ConsejosFacilesNevera[a][0]);
                    
                }
                     
                

                for(int a =0; a<ConsejosModeradosNevera.length-1;a++){
                    ConsejosNevera.add(ConsejosModeradosNevera[a][0]);
                }    
            
            }else if(Exigencia == 2){

                for(int a = 0; a< ConsejosFacilesNevera.length;a++){
                   
                   ConsejosNevera.add(ConsejosFacilesNevera[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosNevera.length;a++){
                    ConsejosNevera.add(ConsejosModeradosNevera[a][0]);
                }
                for(int a =0; a<ConsejosComplejosNevera.length-1;a++){
                    ConsejosNevera.add(ConsejosComplejosNevera[a][0]);
                }
            }else if(Exigencia==3){
            
                for(int a = 0; a< ConsejosFacilesNevera.length;a++){
                   
                   ConsejosNevera.add(ConsejosFacilesNevera[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosNevera.length;a++){
                    ConsejosNevera.add(ConsejosModeradosNevera[a][0]);
                }
                for(int a =0; a<ConsejosComplejosNevera.length;a++){
                    ConsejosNevera.add(ConsejosComplejosNevera[a][0]);
                }
            
            
            }
        }else{
            for(int a = 0; a< ConsejosFacilesNevera.length;a++){
                   
                   ConsejosNevera.add(ConsejosFacilesNevera[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosNevera.length;a++){
                    ConsejosNevera.add(ConsejosModeradosNevera[a][0]);
                }
                for(int a =0; a<ConsejosComplejosNevera.length;a++){
                    ConsejosNevera.add(ConsejosComplejosNevera[a][0]);
                }
            
        }
        
        
        
        //MICROONDAS
        
        if(Ahorra || UsarMenos || Ahorradores){
            //nevera
            for(int a =0; a<ConsejosFacilesMicroondas.length;a++){  
              
                ConsejosFacilesMicroondas[a][1] = ""+(Integer.valueOf( ConsejosFacilesMicroondas[a][1]) *ahorro1);
            }
            
  
            for(int a =0; a<ConsejosComplejosNevera.length;a++){
                ConsejosComplejosNevera[a][1] = ""+(Integer.valueOf(ConsejosComplejosMicroondas[a][1]) +ahorro2);
                ConsejosModeradosMicroondas[a][1] = ""+(Integer.valueOf(ConsejosModeradosMicroondas[a][1]) +ahorro2);
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1 ){
                                                 
            
                for(int a = 0; a<ConsejosFacilesMicroondas.length;a++){
                    
                    ConsejosMicroondas.add(ConsejosFacilesMicroondas[a][0]);
                    
                }
                     
                

                for(int a =0; a<ConsejosModeradosMicroondas.length-1;a++){
                    ConsejosMicroondas.add(ConsejosModeradosMicroondas[a][0]);
                }    
            
            }else if(Exigencia == 2){

                for(int a = 0; a<ConsejosFacilesMicroondas.length;a++){
                    
                    ConsejosMicroondas.add(ConsejosFacilesMicroondas[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosMicroondas.length;a++){
                    ConsejosMicroondas.add(ConsejosModeradosMicroondas[a][0]);
                }
                for(int a =0; a<ConsejosComplejosMicroondas.length-1;a++){
                    ConsejosMicroondas.add(ConsejosComplejosMicroondas[a][0]);
                }
            }else if(Exigencia==3){
            
                for(int a = 0; a<ConsejosFacilesMicroondas.length;a++){
                    
                    ConsejosMicroondas.add(ConsejosFacilesMicroondas[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosMicroondas.length;a++){
                    ConsejosMicroondas.add(ConsejosModeradosMicroondas[a][0]);
                }
                for(int a =0; a<ConsejosComplejosMicroondas.length;a++){
                    ConsejosMicroondas.add(ConsejosComplejosMicroondas[a][0]);
                }
            
            
            }
        }else{
            for(int a = 0; a<ConsejosFacilesMicroondas.length;a++){
                    
                    ConsejosMicroondas.add(ConsejosFacilesMicroondas[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosMicroondas.length;a++){
                    ConsejosMicroondas.add(ConsejosModeradosMicroondas[a][0]);
                }
                for(int a =0; a<ConsejosComplejosMicroondas.length;a++){
                    ConsejosMicroondas.add(ConsejosComplejosMicroondas[a][0]);
                }
        
        }
        
        //bombillo
        if(Ahorra || UsarMenos || Ahorradores){ 
            
            for(int a =0; a<ConsejosFacilesBombillo.length;a++){  
              
                ConsejosFacilesBombillo[a][1] = ""+(Integer.valueOf( ConsejosFacilesBombillo[a][1]) *ahorro1);
            }
            
  
            for(int a =0; a<ConsejosComplejosBombillo.length;a++){
                ConsejosComplejosBombillo[a][1] = ""+(Integer.valueOf(ConsejosComplejosBombillo[a][1]) +ahorro2);
                ConsejosModeradosBombillo[a][1] = ""+(Integer.valueOf(ConsejosModeradosBombillo[a][1]) +ahorro2);
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1 ){
                                                 
            
                for(int a = 0;a<ConsejosFacilesBombillo.length;a++){
                    
                    ConsejosBombillo.add(ConsejosFacilesBombillo[a][0]);
                    
                }
                     
                

                for(int a =0; a<ConsejosModeradosBombillo.length-1;a++){
                    ConsejosBombillo.add(ConsejosModeradosBombillo[a][0]);
                }    
            
            }else if(Exigencia == 2){

                for(int a = 0;a<ConsejosFacilesBombillo.length;a++){
                    
                    ConsejosBombillo.add(ConsejosFacilesBombillo[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosBombillo.length;a++){
                    ConsejosBombillo.add(ConsejosModeradosBombillo[a][0]);
                }
                for(int a =0; a<ConsejosComplejosBombillo.length-1;a++){
                    ConsejosBombillo.add(ConsejosComplejosBombillo[a][0]);
                }
            }else if(Exigencia==3){
            
                for(int a = 0;a<ConsejosFacilesBombillo.length;a++){
                    
                    ConsejosBombillo.add(ConsejosFacilesBombillo[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosBombillo.length;a++){
                    ConsejosBombillo.add(ConsejosModeradosBombillo[a][0]);
                }
                for(int a =0; a<ConsejosComplejosBombillo.length;a++){
                    ConsejosBombillo.add(ConsejosComplejosBombillo[a][0]);
                }
            
            
            }
        }else{
            for(int a = 0;a<ConsejosFacilesBombillo.length;a++){
                    
                    ConsejosBombillo.add(ConsejosFacilesBombillo[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosBombillo.length;a++){
                    ConsejosBombillo.add(ConsejosModeradosBombillo[a][0]);
                }
                for(int a =0; a<ConsejosComplejosBombillo.length;a++){
                    ConsejosBombillo.add(ConsejosComplejosBombillo[a][0]);
                }
            
            
        }
        //Lavadora
        if(Ahorra || UsarMenos || Ahorradores){ 
            
            for(int a =0; a<ConsejosFacilesLavadora.length;a++){  
              
                ConsejosFacilesLavadora[a][1] = ""+(Integer.valueOf( ConsejosFacilesLavadora[a][1]) *ahorro1);
            }
            
  
            for(int a =0; a<ConsejosComplejosLavadora.length;a++){
                ConsejosComplejosLavadora[a][1] = ""+(Integer.valueOf(ConsejosComplejosLavadora[a][1]) +ahorro2);
                ConsejosModeradosLavadora[a][1] = ""+(Integer.valueOf(ConsejosModeradosLavadora[a][1]) +ahorro2);
                
            }

        }

        //Si el nivel es maximo, moderado o medio o si sus recibos de luz son altos
        
        if(!Recibo){
            if(Exigencia == 1 ){
                                                 
            
                for(int a =0;a<ConsejosFacilesLavadora.length;a++){
                    
                    ConsejosLavadora.add(ConsejosFacilesLavadora[a][0]);
                    
                }
                     
                

                for(int a =0; a<ConsejosModeradosLavadora.length-1;a++){
                    ConsejosLavadora.add(ConsejosModeradosLavadora[a][0]);
                }    
            
            }else if(Exigencia == 2){

                for(int a =0;a<ConsejosFacilesLavadora.length;a++){
                    
                    ConsejosLavadora.add(ConsejosFacilesLavadora[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosLavadora.length;a++){
                    ConsejosLavadora.add(ConsejosModeradosLavadora[a][0]);
                }
                for(int a =0; a<ConsejosComplejosLavadora.length-1;a++){
                    ConsejosLavadora.add(ConsejosComplejosLavadora[a][0]);
                }
            }else if(Exigencia==3){
            
                for(int a =0;a<ConsejosFacilesLavadora.length;a++){
                    
                    ConsejosLavadora.add(ConsejosFacilesLavadora[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosLavadora.length;a++){
                    ConsejosLavadora.add(ConsejosModeradosLavadora[a][0]);
                }
                for(int a =0; a<ConsejosComplejosLavadora.length;a++){
                    ConsejosLavadora.add(ConsejosComplejosLavadora[a][0]);
                }
            
            
            }
        }else{
            for(int a =0;a<ConsejosFacilesLavadora.length;a++){
                    
                    ConsejosLavadora.add(ConsejosFacilesLavadora[a][0]);
                    
                }
                    

                for(int a =0; a<ConsejosModeradosLavadora.length;a++){
                    ConsejosLavadora.add(ConsejosModeradosLavadora[a][0]);
                }
                for(int a =0; a<ConsejosComplejosLavadora.length;a++){
                    ConsejosLavadora.add(ConsejosComplejosLavadora[a][0]);
                }
        } 
        
    }
}