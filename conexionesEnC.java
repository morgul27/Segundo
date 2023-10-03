import java.io.File;

public class conexionesEnC {
    public static void main(String args[]) {
        try {
            // el primer nombre es el programa con el que se ejecuta y el segundo es la ruta
            // del archivo
            ProcessBuilder pBuilder = new ProcessBuilder("Notepad.exe",
                    "C:/Users/JoséMiguelNavarroDeA/Desktop/trabajos/Segundo/prueba.txt");

            pBuilder.directory(new File("c:/directorio_salida/", "prueba.txt"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
