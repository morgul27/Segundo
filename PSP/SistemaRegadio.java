package PSP;

import java.util.Timer;
import java.util.TimerTask;

public class SistemaRegadio extends TimerTask {

	@Override

	public void run() {
		System.out.println("Regando...");
	}

	public static void main(String[] args) {

		Timer temporizador = new Timer();
		temporizador.schedule(new SistemaRegadio(), 1000, 2000); // nombre de la clase en el new
	}
}