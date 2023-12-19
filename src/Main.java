import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

// Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class Main {
    public static void main(String[] args) {

        // metodo di inizializzazione 1 -> mappa.put():
        Map<String, Integer> students1 = new HashMap<>();
        students1.put("Maria", 19);
        students1.put("Andrea", 26);
        students1.put("Anna", 29);

        // metodo di inizializzazione 2) -> Map.of():
        Map<String, Integer> studentsEmpty = Map.of();
        Map<String, Integer> students2 = new HashMap<String, Integer>(Map.of("Sara", 20, "Carla", 31, "Andrea", 27));

        //metodo di inizializzazione 3) -> Map.ofEntries():
        Map<String, Integer> students3 = new HashMap<String, Integer>(Map.ofEntries(new AbstractMap.SimpleEntry<String, Integer>("Max", 31), new AbstractMap.SimpleEntry<String, Integer>("Alex", 28)));


        System.out.println("List of student n.1: " + students1);
        System.out.println("List of students n.2: " + students2);
        System.out.println("List of students n.3: " + students3);




    }
}