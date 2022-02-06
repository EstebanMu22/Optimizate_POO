/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sergio andres
 */
class Usuarios implements Serializable{
    
    private String nombre;
    private String apodo;
    private int edad;
    
    private ArrayList<Usuario> usuarios;
    
    public Usuarios(){
        this("","",0);
        
    }
    
    public Usuarios(String nombre,String apodo, int edad){
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        usuarios = new ArrayList<>();
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

class Usuario extends Usuarios{
    
    DiagnosticoGeneral diagnostico;
    
    
    public Usuario(String nombre, String apodo, int edad,boolean Ahorra, boolean Recibo, boolean UsarMenos, boolean Ahorradores,boolean enfocarse, int Exigencia,int HorasDeUso,int NumeroAparatos){
        super(nombre,apodo,edad);
        
        diagnostico = new DiagnosticoGeneral( Ahorra, Recibo, UsarMenos, Ahorradores,enfocarse,Exigencia, HorasDeUso, NumeroAparatos);
        
        
    }
}




class Persistencia{
    
    public void guardar(Usuarios x) throws FileNotFoundException, IOException{
        ObjectOutputStream guardar = new ObjectOutputStream(new FileOutputStream("Usuario.obj"));
        guardar.writeObject(x);
        guardar.close();
    }
    public Usuarios recuperar() throws IOException, ClassNotFoundException{
        ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("Usuario.obj"));
         Usuarios usuario = (Usuarios) recuperar.readObject();
         recuperar.close();
         return usuario;
    }
    
}
