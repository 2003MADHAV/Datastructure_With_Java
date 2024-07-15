package list;
import java.util.*;
public class ListOperations {
    public static void main(String[] args) {
        LinkedList hotel = new LinkedList();
        hotel.add("Deepak");
        hotel.add("Sunil");
        hotel.add("RajShekar");
        System.out.println(hotel);
        
        List l = new LinkedList();
        l.add("Bhargav");
        l.add("Akhilesh");
        l.add("Sathwik");

        hotel.add(l);
        System.out.println(hotel);

        List l2 = new LinkedList();
        l2.add("Akshitha");
        l2.add("Vishali");
        l2.add("Chaitanya");

        hotel.addAll(2,l2);
        System.out.println(hotel);

        hotel.addFirst("SreeLeela");
        hotel.addLast("Prabhas");
        System.out.println(hotel);

        System.out.println(hotel.get(2));
        System.out.println("first: "+hotel.getFirst());
        System.out.println("last: "+hotel.getLast());
        
        hotel.remove("Sunil");
        System.out.println(hotel);
        hotel.remove(1);
        hotel.add(1,"DeepikaPadukone");
        System.out.println(hotel);
        
        hotel.removeFirst();
        System.out.println(hotel);
        hotel.removeLast();
        System.out.println(hotel);

        System.out.println(hotel.contains("DeepikaPadukone"));
        System.out.println(hotel.contains("PawanKalyan"));
        
        hotel.removeAll(l2);
        System.out.println(hotel);
        System.out.println(hotel.indexOf("DeepikaPadukone"));
        hotel.removeFirstOccurrence("DeepikaPadukone");
        System.out.println(hotel);
        hotel.set(0,"NTR");        
        System.out.println(hotel);
        hotel.clear();
        System.out.println(hotel);
    }
}