import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import PSP.SistemaRiegoExecutor;

public class SistemaTareasRiego {
    @Override
    public void run() {

        System.out.println("Regando...");
    }

    @Override
    public static void run2() {

        System.out.println("cuidando...");
    }

    public static void main(String[] args) {

        SistemaRiegoExecutor sr = new SistemaRiegoExecutor();
        SistemaRiegoExecutor sr2 = new SistemaRiegoExecutor();

        ScheduledExecutorService stp = Executors.newSingleThreadScheduledExecutor();

        stp.scheduleAtFixedRate(sr, 1, 5, TimeUnit.SECONDS);
        System.out.println("Sistema de riego configurado.");

        stp.scheduleAtFixedRate(run2(), 2, 5, TimeUnit.SECONDS);
        System.out.println("Sistema de riego 2 configurado.");

    }

}
