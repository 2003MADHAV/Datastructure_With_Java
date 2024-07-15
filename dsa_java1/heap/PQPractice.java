package heap;

import java.util.*;
public class PQPractice {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.add(10);
        pq.offer(50);
        pq.offer(70);
        pq.add(40);
        pq.add(20);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}