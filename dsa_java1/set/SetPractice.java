package set;

import java.util.*;
public class SetPractice {
    public static void main(String[] args) {
        //creation
        Set s = new TreeSet();
        System.out.println(s);

        //addition
        s.add("Sandeep");
        s.add("Mohan");
        s.add("Guna");
        System.out.println(s);
        
        Set s2 = new HashSet();
        s2.add("Suresh");
        s2.add("Ramesh");
        s2.add("Naresh");
        System.out.println("size: "+s.size());
        System.out.println("set2: "+s2);
        //s.add(s2);
        System.out.println("size: "+s.size());
        System.out.println("size: "+s.size());
        System.out.println(s);
        
        //retreival
        for (Object element : s) {
            System.out.println(element+" ");
        }
        System.out.println();
        
        Set s3 = new HashSet();
        s3.add(100);
        s3.add(200);
        s3.add(300);
        //s.addAll(s3);
        System.out.println("s3: "+s3);
        System.out.println(s);
        //verification
        System.out.println(s.contains("Guna"));
        System.out.println(s.contains("Rana"));
        System.out.println(s.contains(s2));
        System.out.println(s.containsAll(s3));
        
        //delete
        System.out.println(s.remove("Guna"));
        System.out.println(s);
        System.out.println(s.remove("Rana"));
        System.out.println(s);
    }
}