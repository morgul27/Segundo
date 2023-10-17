package PSP;

import java.util.Timer;
import java.util.TimerTask;

public class claseTimerTask extends TimerTask {
    int count;

    public static void main(String arg[]) {
        Timer temporizador = new Timer();

        temporizador.schedule(new claseTimerTask(), 1000, 1000);

    }

    @Override
    public void run() {
        System.out.println("estirar las piernas...");
        count++;
        System.out.println(count);

        if (count == 3) {
            cancel();
            System.exit(0);
        }
    }
}