import java.util.HashMap;
import java.util.Set;

public class HashMapTesting {

    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of a HashMap to store and retrieve user
     * information.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {

        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("Nombre", "Sergio");
        userMap.put("Apellido", "Gonzalez");
        userMap.put("Nombre", "Sergio");
        userMap.put("Apellido", "Gonzalez");

        String name = userMap.get("Nombre");

        System.out.println("El nombre es: " + name);

        Set<String> Keys = userMap.keySet();
        for (String key : Keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}
