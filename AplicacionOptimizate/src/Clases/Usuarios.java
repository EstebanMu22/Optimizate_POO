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
    protected HashMap<String,Usuario> usuarios = new HashMap<>();;
    
    protected String[] ListaStrings ;
    
    protected boolean DiagnosticoHecho;
    
    Usuario prueba;
    
  
    
    public Usuarios(){
        
        String[] ListaStrings = {""};
        
    }
    
    public void CrearUsuario(String nombre, String apodo, int edad){
        
        Usuario usuario = new Usuario(nombre,apodo,edad);
        usuario.DiagnosticoHecho = false;
        
      
        usuarios.put(nombre, usuario);
              

       
    }
    public void SetStrings(){
        int tamano = usuarios.size();
        ListaStrings = new String[tamano];
        int cont = 0;
        for(Map.Entry m : usuarios.entrySet()){   
            Usuario u =(Usuario) m.getValue();
            ListaStrings[cont] = u.GetNombre();
            
            cont++;
        } 
        
    }
    
    public String[] getStrings(){
        return ListaStrings;
    }
    
    public Usuario getUsuarioLlave(String llave){
        
        return usuarios.get(llave);
   
    }
    
    
    public void AjustarConsejosUsuario(String u,boolean Elegido,boolean Ahorra, boolean Recibo, boolean UsarMenos, boolean Ahorradores,boolean enfocarse, int Exigencia,int HorasDeUso,int NumeroAparatos){
        Usuario usu = getUsuarioLlave(u);
        usu.ConsejosUsuario(Elegido,Ahorra,Recibo,UsarMenos,Ahorradores,enfocarse,Exigencia,HorasDeUso,NumeroAparatos);
        usu.DiagnosticoHecho = true;
        usuarios.replace(u, usu);
        
    }
    public void ActualizarUsuario(String key,Usuario u){
        usuarios.replace(key, u);
    }
    public void VerNombresUsuarios(){
        
        for(Map.Entry m : usuarios.entrySet()){   
            Usuario u =(Usuario) m.getValue();
            System.out.println(m.getKey()+" "+u.GetNombre());    
        }  
    }
    public void VerApodosUsuarios(){
        System.out.println(usuarios);
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


