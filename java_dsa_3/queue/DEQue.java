package queue;
import java.util.*;
public class DEQue {
    public static void main(String[] args) {
        Deque q = new LinkedList();
        q.addFirst(10);
        q.addLast(20);//10,20
        q.addFirst(30);//30,10,20
        q.addLast(40);//30,10,20,40
        System.out.println(q);
        System.out.println("removeFront: "+q.removeFirst());
        System.out.println(q);//10,20,40
        System.out.println("removeLastt: "+q.removeLast());
        System.out.println(q);//10,20
        Deque q2 = new ArrayDeque();
        q2.addFirst(q);
        System.out.println(q2);//10,20        
        q2.addFirst(90);
        //q2.addLast(100);
        System.out.println(q2);//90,[10,20]
        System.out.println("First: "+q2.getFirst());
        System.out.println("Last: "+q2.getLast());
        System.out.println(q2.contains(90));
        q2.remove(100);
        System.out.println(q2);
        System.out.println(q2.removeAll(q));
        System.out.println(q2);
    }
}
/*
    C-creation
    A-addition
    R-retreival
    V-verification
    U-update
    D-deletion
*/