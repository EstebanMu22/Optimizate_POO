/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario extends Usuarios implements Serializable{
    
    protected DiagnosticoGeneral diagnostico;
    public ArrayList<String> ConsejosActualesNevera = new ArrayList<String>();
    public ArrayList<String> ConsejosActualesBombillo = new ArrayList<String>();
    public ArrayList<String> ConsejosActualesMicroondas = new ArrayList<String>();
    public ArrayList<String> ConsejosActualesLavadora = new ArrayList<String>();
    
    public Usuario(String nombre, String apodo, int edad){
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;      
        DiagnosticoHecho = false;
        
    }  
    
    public void ConsejosUsuario(boolean Elegido,boolean Ahorra, boolean Recibo, boolean UsarMenos, boolean Ahorradores,boolean enfocarse, int Exigencia,int HorasDeUso,int NumeroAparatos){
        System.out.println("Se ejecuta correctamente");
        diagnostico = new DiagnosticoGeneral(Elegido, Ahorra, Recibo, UsarMenos, Ahorradores,enfocarse,Exigencia, HorasDeUso, NumeroAparatos);
  
    }
    public boolean GetDiagnosticoHecho(){
        return DiagnosticoHecho;
    }
    public DiagnosticoGeneral GetDiagnostico(){
        return diagnostico;
    }

}
