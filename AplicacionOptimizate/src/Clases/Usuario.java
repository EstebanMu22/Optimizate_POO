/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Usuario extends Usuarios{
    
    DiagnosticoGeneral diagnostico;
    
    public Usuario(String nombre, String apodo, int edad){
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;      
    }  
    
    public void ConsejosUsuario(boolean Ahorra, boolean Recibo, boolean UsarMenos, boolean Ahorradores,boolean enfocarse, int Exigencia,int HorasDeUso,int NumeroAparatos){

        diagnostico = new DiagnosticoGeneral( Ahorra, Recibo, UsarMenos, Ahorradores,enfocarse,Exigencia, HorasDeUso, NumeroAparatos);
  
    }

}
