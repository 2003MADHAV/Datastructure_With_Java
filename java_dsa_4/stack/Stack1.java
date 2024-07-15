package stack;
import java.util.Arrays;
public class Stack1 {
    int[] stk = new int[5];
    int size,top;
    public void push(int data){
        if(!isFull()){
            stk[top]=data;
            top++;size++;
        }
        else
            System.out.println("Stack is Full");
    }
    public int pop(){
        if(!isEmpty()){
            int data = stk[top-1];
            top--;size--;
            return data;
        }
        else
            System.out.println("Stack is Empty");
        return 0;
    }
    public int peek(){
        return stk[top-1]; 
    }
    public boolean isFull(){
        return size==5;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void show(){
        if(!isEmpty()){
        for(int i=0;i<size;i++)
            System.out.print(stk[i]+" ");
        System.out.println();
        }
        else
            System.out.println("Stack is Empty");
    }
    public static void main(String[] args) {
        Stack1 s = new Stack1();
        s.push(10);s.push(20);
        s.push(30);s.push(40);
        s.push(50);
        System.out.println(s.isFull());
        s.push(60);                
        s.show();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.show();
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        s.push(60);s.push(70);                
        s.push(80);                
        System.out.println("peek: "+s.peek());
    }
}