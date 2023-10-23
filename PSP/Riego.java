import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Riego {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        int zona1Duracion = 10; // Duración de riego para la zona 1 (en segundos)
        int zona2Duracion = 15; // Duración de riego para la zona 2 (en segundos)

    
        executor.scheduleAtFixedRate(() -> realizarRiego("Zona 1"), 0, zona1Duracion, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(() -> realizarRiego("Zona 2"), 0, zona2Duracion, TimeUnit.SECONDS);

        // Duracion de 5 min
        try {
            Thread.sleep(5 * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Parar el executor
        executor.shutdown();
    }

    private static void realizarRiego(String zona) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); // Formato de hora
        String horaActual = sdf.format(new Date()); 
        System.out.println("Riego en " + zona + " - Hora: " + horaActual);
       
    }
}
