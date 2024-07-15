package map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class MapPractice {
    public static void main(String[] args) {
        //creation
        Map<Integer,String> m = new TreeMap();
        System.out.println("Size: "+m.size());
        //addition
        System.out.println(m);
        m.put(4197, "Bharat,CSE,9.5");
        System.out.println("Size: "+m.size());
        m.put(4014, "Riyesh,CSE,9.0");
        m.put(41154,"Bhanu,CSE,10");
        m.put(4173,"Dhathri,CSE,9.99");
        m.put(41383,"Akshitha,CSE,9.6");
        m.put(41149,"Lakshmi,CSE,9.0");
        System.out.println(m);
        m.putIfAbsent(41154,"Rakesh,CSE,8.5");
        System.out.println(m);
        //retreival
        System.out.println("----Keys----");
        Set keys = m.keySet();
        for (Object key : keys) {
            System.out.println(key);
        }
        System.out.println("----Values----");
        Collection values = m.values();
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("Keys--->Values");
        for (Object key : keys) {
            System.out.println(key+"--->"+m.get(key));
        }
        System.out.println("----Entries----");
        Set<Entry<Integer,String>> entries = m.entrySet();
        for (Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+"--->"+entry.getValue());
        }
        //deletion
        m.remove(4197);
        System.out.println(m);
        m.remove(4173);
        System.out.println(m);
        //m.clear();
        //System.out.println(m);
        
        //verification
        System.out.println(m.containsKey(41383));
        System.out.println(m.containsKey(4173));
        System.out.println(m.containsValue("Rakesh,CSE,8.5"));
        System.out.println(m.containsValue("Riyesh,CSE,9.0"));
        
        //update
        m.put(41154,"Anirudh,CSE,9.99");
        m.replace(4014, "Slman,CSE,8.5");
        System.out.println(m);
       
        //miscelaneous
        System.out.println(m.getOrDefault(41154, "Kiran,CSE,10"));
        System.out.println("Size: "+m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.hashCode());
    }
}