import java.util.ArrayList;
import java.util.HashMap;

public class Prueba {
    public static void main(String arg[]) {

        ArrayList al = new ArrayList<String>();
        al.add("Sevilla");
        al.add("Cordoba");

        al.get(1);
        al.get(1);

        HashMap capitalesPorComunidad = new HashMap<String, String>();
        capitalesPorComunidad.put("Andalucía", "Sevilla");
        capitalesPorComunidad.put("Madrid", "Madrid");

        System.out.println(capitalesPorComunidad.get("Andalucía"));
    }
}
