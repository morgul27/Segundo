package PSP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conexionesJavaPython {
    public static void main(String args[]) {
        try {
            String[] infoProceso = { "phyton", "prueba.phyton" }; // colocar los archivos que se quiera leer
            Process proceso = Runtime.getRuntime().exec(infoProceso);// seleccionar el proceso que se va a ejecutar
            int valorRetorno = proceso.waitFor();
            if (valorRetorno == 0) {
                System.out.println("El proceso se ha completado satisfactoriamente");
            } else {
                System.out.println("El proceso ha fallado. Codigo de error:" + valorRetorno);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}