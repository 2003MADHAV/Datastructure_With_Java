package dsa;
import java.util.Arrays;
public class CustomSort {
    public static void main(String[] args) {
        String str = "abc";
        String order = "bca";
        int[] count = new int[26];
        for(int i=0;i<str.length();i++)
            count[str.charAt(i)-97]++;
        System.out.println(Arrays.toString(count));
        String res="";
        for(int i=0;i<order.length();i++){
            while(count[order.charAt(i)-97]-->0)
                res += order.charAt(i);
        }
        for(char ch = 'a';ch<='z';ch++){
            while(count[ch-97]-->0)
                res += ch;
        }
        System.out.println(res);
    }
}