package stack;
import java.util.*;
public class BalancedBrackets {
    public static boolean isValid(String brackets){
        Stack<Character> st = new Stack<Character>();
        char[] expression = brackets.toCharArray();
        for(char ch :expression){
            if(ch=='(' || ch=='[' || ch=='{')
                st.push(ch);
            else{
                if(ch==')' && !st.isEmpty() && st.pop() =='(')
                    continue;
                else if(ch==']' && !st.isEmpty() && st.pop() =='[')
                    continue;
                else if(ch=='}' && !st.isEmpty() && st.pop() =='{')
                    continue;
                else
                    return false;
            }
        }
        return st.isEmpty();
    }            
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0){
            String brackets = scan.next();
            System.out.println(isValid(brackets));
        }
    }
}
//(a+b)*[c-d]