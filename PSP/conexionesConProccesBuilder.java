package PSP;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class conexionesConProccesBuilder {
    public static void main(String args[]) {
        try {
            // el primer nombre es el programa con el que se ejecuta y el segundo es la ruta
            // del archivo
            ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe", "mirar estudiar.txt");

            Process p = pBuilder.start(); // tambien si solo quiero ejecutarlo, se puede poner pBuilder.star();
            int a = p.waitFor();
            System.out.println("el valor es " + a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
