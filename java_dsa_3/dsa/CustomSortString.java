package dsa;
public class CustomSortString {
    public static void main(String[] args) {
        String str = "abcd";
        String order="bcafg";
        int[] count = new int[26];
        for(int i=0;i<str.length();i++)
            count[str.charAt(i)-97]++;
        String sorted="";
        int i;
        for(i=0;i<order.length();i++){
            while(count[order.charAt(i)-97]-->0)
                sorted += order.charAt(i);
        }
        for(char c='a'; c<='z';c++){
            while(count[c-97]-->0){
                 sorted += c;
                 i++;
            }
        }
        System.out.println(sorted);
    }
}