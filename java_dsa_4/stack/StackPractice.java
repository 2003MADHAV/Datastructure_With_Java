package stack;
import java.util.Stack;
public class StackPractice {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        //s.push('A');
       //s.push("KLU");
      //s.push(25.50);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}