package PSP;

/**
 *
 * @author Gonzalo López-Escobar García
 */

import java.util.Timer;
import java.util.TimerTask;

public class ejGonzaloTimer extends TimerTask {

    public static void main(String[] args) {
        Timer temporizador = new Timer();
        TimerTask timerTareas = new ejGonzaloTimer();

        temporizador.schedule(timerTareas, 5000, 5000);

        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {
                timerTareas.cancel();
                temporizador.cancel();
            }
        }, 30000);
    }

    @Override
    public void run() {
        System.out.println("¡A moverse!");
    }
}
