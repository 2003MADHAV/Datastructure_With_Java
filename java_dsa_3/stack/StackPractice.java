package stack;
import java.util.Stack;
public class StackPractice {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push('a');
        s1.push(40);
        s1.push("klu");
        s1.push(50);
        s1.push(34.50);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        System.out.println("peek: "+s1.peek());
        System.out.println(s1.isEmpty());
    }
}