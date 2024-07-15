package stack;
import java.util.*;
public class StockSpan {
    public static int[] calculateSpans(int[] prices){
        int[] spans = new int[prices.length];
        spans[0]=1;
        Stack<Integer> indStack = new Stack();
        indStack.push(0);
        for(int i=1;i<prices.length;i++){
            while(!indStack.isEmpty() && prices[indStack.peek()]<=prices[i])
                indStack.pop();

            if(indStack.isEmpty())
                spans[i]=i+1;
            else
                spans[i] = i-indStack.peek();
            
            indStack.push(i);
        }
        return spans;
    }
    public static void main(String[] args) {
        int[] prices = {100,60,70,75,60,85};
        int[] spans = calculateSpans(prices);
        System.out.println(Arrays.toString(spans));
    }
}