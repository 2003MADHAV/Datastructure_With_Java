package map;
import java.util.*;
import java.util.Map.Entry;
public class MapPractice {
    public static void main(String[] args) {
        //creation
        Map<Integer,String> m = new TreeMap();
        System.out.println(m.size());
        
        System.out.println(m);
        //addition
        m.put(42284, "Adhunika,CSE,9.5,TN");
        m.put(4179, "Divya,CSE,9.5,TN");
        m.put(4708, "Chitanya,CSE,9.6,AP");
        System.out.println(m);
        //retreival
        System.out.println("-----Keys-----");
        Set keys = m.keySet();
        for (Object key : keys)
            System.out.println(key);
        System.out.println("-----Values-----");        
        Collection values = m.values();
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("-----Keys-->Values---");
        for (Object key:keys) {
            System.out.println(key+"-->"+m.get(key));
        }
        //deletion
        System.out.println(m.remove(4179));
        System.out.println(m);
        
        //verification
        System.out.println(m.containsKey(4179));
        System.out.println(m.containsKey(42284));
        System.out.println(m.containsValue("Chitanya,CSE,9.6,AP"));
        System.out.println(m.containsValue("Akhilesh,CSE,9.6,AP"));

        //updation
        m.put(4708,"Vijay,CSE,9.99,AP");
        System.out.println(m);
        m.putIfAbsent(42284, "Jahnavi,CSE,9.99,AP");
        System.out.println(m);
        m.put(4519,"Agastya,CSE,10,AP");
        System.out.println(m);
        m.replace(4519, "ManojKumar,CSE,10,AP");
        System.out.println(m);
        System.out.println("Size: "+m.size());
        System.out.println(m.getOrDefault(4619,"Kiran"));
        System.out.println(m);

        Set<Entry<Integer,String>> entries =m.entrySet();
        for (Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }       
    }
}