package greedy;
import java.util.Arrays;
import java.util.Comparator;
public class FractionalKnapsack {
    static class Item{
        int profit,weight;
        public Item(int wt, int val){
            this.profit=val;
            this.weight=wt;
        }
    }
    public static double getMaxProfit(Item[] items, int capacity){
        double maxProfit = 0d;
            Arrays.sort(items, new Comparator<Item>(){
                @Override
                public int compare(Item item1, Item item2){
                    double fraction1 = (double)item1.profit/(double)item1.weight;
                    double fraction2  = (double)item2.profit/(double)item2.weight;
                    if(fraction1<fraction2)
                        return 1;
                    else
                        return -1;
                }
        });
        for(Item item : items){
            int curWeight = (int)item.weight;
            int curProfit = (int)item.profit;
            if(capacity-curWeight>=0){
                capacity -= curWeight;
                maxProfit += curProfit;
            }
            else{
                double fraction = (double)capacity/(double)curWeight;
                maxProfit+=(curProfit*fraction);
                capacity = (int)(capacity-(curWeight*fraction));
                break;
            }
        }        
        return maxProfit;
    }
    public static void main(String[] args) {
        Item[] items = {new Item(2,10),
                          new Item(3,5),
                          new Item(5,15),
                          new Item(7,7),
                          new Item(1,6),
                          new Item(4,18),
                          new Item(1,3)};
        int capacity = 15;
        System.out.println(getMaxProfit(items,capacity));
    }
}
