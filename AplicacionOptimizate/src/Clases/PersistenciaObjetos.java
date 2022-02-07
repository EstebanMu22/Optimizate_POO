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

/**
 *
 * @author sergio andres
 */
public class PersistenciaObjetos {
    
    public  void guardar(Usuarios x) throws FileNotFoundException, IOException{
        ObjectOutputStream guar = new ObjectOutputStream(new FileOutputStream("Usuario.obj"));
        guar.writeObject(x);
        guar.close();
    }
    public Usuarios recuperar() throws IOException, ClassNotFoundException{
        ObjectInputStream recu = new ObjectInputStream(new FileInputStream("Usuario.obj"));
        Usuarios usuario = (Usuarios) recu.readObject();
        recu.close();
        return usuario;
    }
    
}
