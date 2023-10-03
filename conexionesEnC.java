import java.io.File;

public class conexionesEnC {
    public static void main(String args[]) {
        try {
            // el primer nombre es el programa con el que se ejecuta y el segundo es la ruta
            // del archivo
            ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe",
                    "C:/Users/JoséMiguelNavarroDeA/Desktop/trabajos/Segundo/prueba.txt");

            pBuilder.directory(new File("C:/Users/JoséMiguelNavarroDeA/Desktop/trabajos")); // C:/directorio_salida"

            Process proceso = pBuilder.start();
            int valorRetorno = proceso.waitFor();
            if (valorRetorno == 0) {
                System.out.println("El proceso completado" + valorRetorno);
            } else {
                System.out.println("fallo" + valorRetorno);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
