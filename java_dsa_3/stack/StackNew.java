public class StackNew {
    int[] stk = new int[5];
    int top=0;
    int size=0;
    public void push(int data){
        if(!isFull()){
            stk[top]=data;
            top++;
            size++;
        }
        else
            System.out.println("Stack is Full");
    }
    public int pop(){
        if(!isEmpty()){
            int data = stk[top-1];
            size--;top--;
            return data;
        }
        else
            System.out.println("Stack is Empty");
        return 0;
    }
    public int peek(){
        return  stk[top-1];
    }
    public boolean isFull(){
        return size==5;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(stk[i]+" ");
        }
        System.out.println();         
    }
    public static void main(String[] args) {
        StackNew stack = new StackNew();
        stack.push(10);stack.push(20);
        stack.push(30);stack.push(40);
        stack.push(50);
        System.out.println(stack.pop());        
        stack.show();
        stack.push(60);
        System.out.println("peek: "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());        
        System.out.println(stack.pop());        
        stack.push(70);stack.push(80);
        stack.show();
    }
}
