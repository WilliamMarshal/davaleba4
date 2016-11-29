import java.util.HashMap;
import java.util.Map;

public class CommonHashMaps {
    public static void main(String[] args) {

        HashMap<String, String > hash1 = new HashMap<>();
        HashMap<String, String > hash2 = new HashMap<>();
        hash1.put("Name", "JohnD");
        hash1.put("Name1", "Zumba");
        hash1.put("Name2", "Xaniga");
        hash1.put("Name3", "Shmara");
        hash1.put("Name4", "Yuhu");

        hash2.put("Name", "JohnD");
        hash2.put("Name31", "Noone");
        hash2.put("Name2", "Ara");
        hash2.put("Name3", "Shmara");

        System.out.println(commonKeyValuePairs(hash1, hash2));

    }

    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        int counter = 0;
        for (Map.Entry<String, String> element1 : map1.entrySet()) {
            for (Map.Entry<String, String> element2 : map2.entrySet()) {
                if (element1.equals(element2)) {
                    counter++;
                }
            }
        }

        return counter;
    }


}
