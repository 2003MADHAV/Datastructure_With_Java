package backtracking;
import java.util.*;
public class Subsets {
    static List<List<Character>> subsets(char[] nums){
        List<List<Character>> resList = new ArrayList<>();
        backtrack(resList,new ArrayList<>(),nums,0);
        return resList;
    }
    static void backtrack(List<List<Character>> resList, ArrayList<Character> subList, char[] nums, int start){
        resList.add(new ArrayList<>(subList));
        for(int i=start;i<nums.length;i++){
            subList.add(nums[i]);
            backtrack(resList,subList,nums,i+1);
            subList.remove(subList.size()-1);
        }
    }
    public static void main(String[] args) {
        char[] nums = {'a','b','c'};
        List<List<Character>> res = subsets(nums);
        System.out.println(res);
    }
}