package streamsPractice;

import java.util.*;

public class MPRACTICE {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        Map<Integer, String> m = new Hashtable<>();
        m.put(535003, "vizianagaram");
        m.put(50013, "hyderabad");
        m.put(530081, "madhapur");
        m.put(535002, "vizag");
        Set<Integer> keys = m.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        System.out.println();

        Collection<String> values= m.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println();

        System.out.println(m.get(535003));
        
        System.out.println();


        for(Integer key: keys){
            System.out.println(key + ">>>>>" +m.get(key) );
        }




    }
}

