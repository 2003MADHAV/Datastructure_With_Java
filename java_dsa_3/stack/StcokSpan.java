package stack;
import java.util.*;
public class StcokSpan {
    public static int[] calculateSpans(int[] prices){
        int[] spans = new int[prices.length];
        spans[0]=1;
        Stack<Integer> indexStack = new Stack<Integer>();
        indexStack.push(0);
        for(int i=1;i<prices.length;i++){
            while(!indexStack.isEmpty() && prices[indexStack.peek()]<=prices[i])
                indexStack.pop();
    
            if(indexStack.isEmpty())
                spans[i]=i+1;
            else
                spans[i] = i-indexStack.peek();
            
            indexStack.push(i);
        }   
        return spans;
    }
    public static void main(String[] args) {
        int[] prices = {100,80,60,70,60,75,85};
        int[] spans = calculateSpans(prices);
        System.out.println(Arrays.toString(spans));
    }
}