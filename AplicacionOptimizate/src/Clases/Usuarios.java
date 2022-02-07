/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sergio andres
 */
public class Usuarios implements Serializable{
    
    protected String nombre;
    protected String apodo;
    protected int edad;
    private HashMap<String,Usuario> usuarios = new HashMap<>();;
    
    Usuario prueba;
    
  
    
    public Usuarios(){
        
    }
    
    public void CrearUsuario(String nombre, String apodo, int edad){
        
        Usuario usuario = new Usuario(nombre,apodo,edad);
        
      
        usuarios.put(nombre, usuario);
              
       
        
        
        
        //usuarios.put(tamañoS, usuario);
       
    }
    public void AjustarConsejos(Usuario u,boolean Ahorra, boolean Recibo, boolean UsarMenos, boolean Ahorradores,boolean enfocarse, int Exigencia,int HorasDeUso,int NumeroAparatos){
        
        u.ConsejosUsuario(Ahorra,Recibo,UsarMenos,Ahorradores,enfocarse,Exigencia,HorasDeUso,NumeroAparatos);
    }
    public void VerNombresUsuarios(){
        for(Map.Entry m : usuarios.entrySet()){   
            Usuario u =(Usuario) m.getValue();
            System.out.println(m.getKey()+" "+u.GetNombre());    
        }  
    }
    public void VerApodosUsuarios(){
        for(Map.Entry m : usuarios.entrySet()){   
            Usuario u =(Usuario) m.getValue();
            System.out.println(m.getKey()+" "+u.GetApodo());    
        }
        
    }
    
   
    
    public String GetNombre(){
        return nombre;
    }
    public String GetApodo(){
        return apodo;
    }
    public int GetEdad(){
        return edad;
    }
    

}


