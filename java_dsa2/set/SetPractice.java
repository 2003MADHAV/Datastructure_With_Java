package set;
import java.util.*;
public class SetPractice {
    public static void main(String[] args) {
        //creation
        Set s = new LinkedHashSet();
        System.out.println(s);
        //addition
        s.add("GOne");
        s.add("Bharat");
        s.add("Jhansi");
        s.add("Nikitha");
        System.out.println(s);
        Set s2 = new HashSet();
        s2.add("Charan");
        s2.add("Jai");        
        s.add(s2);        
        Set s3 = new HashSet();
        s3.add(100);
        s3.add(200);
        s.addAll(s3);
        s.add("Jhansi");
        s.add("Nikitha");
        System.out.println(s);
        //retreival
        System.out.println(s.size());
        System.out.println(s);
        for (Object element : s)
            System.out.println(element+" ");
        System.out.println();
        
        //verification
        System.out.println(s.contains("Bharat"));
        System.out.println(s.contains("RamCharan"));
        System.out.println(s.containsAll(s2));
        System.out.println(s.containsAll(s3));
        
        //update
        s.add("KLU");
        System.out.println(s);
        
        //deletion
        System.out.println("remove-->"+s.remove(100));
        System.out.println("remove-->"+s.remove("RamCharan"));
        s.remove("GOne");
        System.out.println(s);
        s.removeAll(s3);
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}