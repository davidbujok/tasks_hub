import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap<String, String> favouriteFruits;
        favouriteFruits = new HashMap<>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");
        favouriteFruits.put("Derek", "Kiwi");

        System.out.println(favouriteFruits.get("Alice"));
    }
}
