package MapExercise;

import java.util.HashMap;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer >map=new HashMap<>();
        map.put("thanjavur",49);
        map.put("orathanadu",49);
        map.put("trichy",81);
        map.put("kumbakonam",69);

        System.out.println(map.get("thanjavur"));
        map.remove("thanjavur");
        System.out.println(map.get("Thanjavur"));
    }
}
