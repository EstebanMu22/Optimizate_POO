
package diagnostico_1;

import informacion.Informacion;


public class App {

    public static void main(String[] args) {
        Diagnostico1 gui = new Diagnostico1();
        gui.setVisible(true);
        
        // text_contenido.setText("<html> \t<body width='%1s'> \t<p> <b> 1) </b> Crear usuario e iniciar sesión. \t<p> <b> 2) </b> Completar diagnóstico. \t<p> <b> 3) </b> Seguir las recomendaciones para completar tareas y reducir el consumo.");

        
        Informacion gui2 = new Informacion();
        gui2.setVisible(true);
    }
    
}
