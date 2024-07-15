package queue;
import java.util.*;
public class DEQue {
    public static void main(String[] args) {
        Deque dq = new ArrayDeque();
        dq.addFirst(10);//10
        dq.addLast(20);//10,20
        dq.addFirst(30);//30,10,20
        dq.addLast(40);//30,10,20,40
        dq.addFirst(20);
        System.out.println(dq);
        System.out.println("First: "+dq.getFirst());
        System.out.println("Last: "+dq.getLast());
        
        System.out.println(dq.contains(30));
        System.out.println(dq.contains(50));

        Deque dq2 = new ArrayDeque();
        dq2.addFirst(100);//100
        dq2.addLast(200);//100,200
        dq2.addFirst(dq);//[30,10,20,40],100,200
        System.out.println(dq2);
        dq.
        
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();        
        System.out.println(dq);
        dq.remove(20);
        System.out.println(dq);
    }
}
/*
    C-Creation
    A-addition
    R-retreival
    V-verification
    U-update
    D-delete
*/