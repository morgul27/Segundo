import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SistemaTareasRiego {
    @Override
    public void run() {

        System.out.println("Regando...");
    }

    public static void main(String[] args) {

        SistemaRiegoExecutor sr = new SistemaRiegoExecutor();

        ScheduledExecutorService stp = Executors.newSingleThreadScheduledExecutor();

        stp.scheduleAtFixedRate(sr, 1, 5, TimeUnit.SECONDS);
        System.out.println("Sistema de riego configurado.");

        stp.scheduleAtFixedRate(sr, 2, 5, TimeUnit.SECONDS);
        System.out.println("Sistema de riego 2 configurado.");

    }

}
