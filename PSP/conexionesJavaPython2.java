package PSP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class conexionesJavaPython2 {
    public static void main(String args[]) {
        try {
            // Comando para ejecutar el programa Python
            String command = "python3 TuProgramaPython.py"; // Reemplaza "TuProgramaPython.py" por el nombre de tu
                                                            // archivo Python

            // Ejecuta el comando
            Process process = Runtime.getRuntime().exec(command);

            // Lee la salida estándar del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Imprime la salida del programa Python
            }

            // Espera a que el proceso termine
            process.waitFor();

            // Cierra el lector
            reader.close();

            // Verifica el código de salida del proceso (0 generalmente significa que se
            // ejecutó con éxito)
            int exitCode = process.exitValue();
            if (exitCode == 0) {
                System.out.println("El programa Python se ejecutó correctamente.");
            } else {
                System.out.println("El programa Python devolvió un código de salida no válido: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}