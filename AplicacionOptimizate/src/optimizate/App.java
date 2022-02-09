/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optimizate;
import Clases.PersistenciaObjetos;
import Clases.Usuario;
import java.io.*;
import java.io.Serializable;
import Clases.Usuarios;

/**
 *
 * @author sergio andres
 */
public class App {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
  

        Optimizate app = new Optimizate();
        app.setVisible(true);
        
        
        app.ListaUsuarios.VerApodosUsuarios();
        
        
        
        
    }

    
}
