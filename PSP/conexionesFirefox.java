package PSP;

import java.io.File;

public class conexionesFirefox {
    public static void main(String args[]) {
        try {
            // el primer nombre es el programa con el que se ejecuta y el segundo es la ruta
            // del archivo
            ProcessBuilder pBuilder = new ProcessBuilder("C:/Program Files/Mozilla Firefox/firefox.exe",
                    "https://www.eurogamer.es/");

            Process proceso = pBuilder.start();
            int valorRetorno = proceso.waitFor();
            if (valorRetorno == 0) {
                System.out.println("El proceso completado, el valor es " + valorRetorno);
            } else {
                System.out.println("fallo " + valorRetorno);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}