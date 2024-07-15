package list;
import java.util.*;
public class ListOpearations {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList();
        l.add("Rohith");
        l.add("Abhishek");
        l.add("Teja");
        l.add("Chaitanya");
        l.add(2,"Srinath");
        List l2 = new LinkedList();
        l2.add("Pujith");
        l2.add("Akilesh");
        l2.add("Charan");
        l.addAll(l2);
        List l3 = new LinkedList();
        l3.add("Jagan");
        l3.add("Karthik");
        l3.add("Mohan");
        l.addAll(2,l3);
        l.addFirst("Sushma");
        l.addLast("Ashish");
        System.out.println(l);
        System.out.println("first: "+l.getFirst());
        System.out.println("last: "+l.getLast());        
        System.out.println(l.get(3));
        l.remove("Pujith");
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        l.remove(5);
        System.out.println(l);
        System.out.println(l.contains("Karthik"));
        l.clear();
        System.out.println(l);
    }
}