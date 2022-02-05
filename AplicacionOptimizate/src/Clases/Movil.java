package Diagnostico_3;

public class Movil {

     float bateria;
    

    public void consejos() {

        if (bateria >= 80.0 && bateria <=100.0) {
            System.out.println("Configura la pantalla de tu móvil para que el brillo se ajuste automáticamente.");
            System.out.println("Desactiva el sonido y vibración del teclado de tu celular.");
            System.out.println("Cuando dejes el móvil inactivo, cierra todas las aplicaciones.");
            System.out.println("Ajusta la pantalla para que se apague en 2 minutos de inactividad.");
        }
        if (bateria >= 40.0 && bateria < 80 ) {
            System.out.println("Configura la pantalla de tu móvil para que el brillo baje a un 20% del total.");
            System.out.println("Si tu celular ofrece esta función, pon tu celular en ahorro medio de batería.");
            System.out.println("Usa 20 minutos menos las 3 aplicaciones que más frecuentas diariamente.");
            System.out.println("Cuando dejes el móvil inactivo, cierra todas las aplicaciones");
        } if(bateria < 40) {
            System.out.println("Configura la pantalla de tu móvil para que el brillo baje a un 15% del total");
            System.out.println("Si tu celular ofrece esta función, pon tu celular en ahorro máximo de batería.");
            System.out.println("Usa 60 minutos menos las 3 aplicaciones que más frecuentas diariamente.");
            System.out.println("Borra las cuentas que no uses con frecuencia en tu celular.");
            System.out.println("Restringe las aplicaciones que más consumen batería (lo puedes ver en el cuidado del dispositivo, aplicaciones, uso de batería).");
            System.out.println("Activa el ahorro de datos móviles si estas fuera de casa.");
            System.out.println("Desactiva la conexión Wi-Fi siempre que el celular se encuentre inactivo.");
        }

    }

}
