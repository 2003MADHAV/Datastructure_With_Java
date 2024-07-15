package strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringMethods
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String word = scan.next();
        String word = "Intelligent";
        System.out.println(word.length());
        System.out.println(word.trim());
        System.out.println(Arrays.toString(word.toCharArray()));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.startsWith("Intel"));
        System.out.println(word.startsWith("Inter"));        
        System.out.println(word.endsWith("gent"));
        System.out.println(word.endsWith("gentle"));        
        System.out.println(word.contains("tell"));
        String word2 = "intelligent";
        System.out.println(word.equals(word2));
        System.out.println(word.equalsIgnoreCase(word2));
        System.out.println(word.replace("ll","rr"));
        System.out.println(word.replaceAll("tell","talk"));
        String str = new String("Welcome");
        System.out.println(String.valueOf(str));
        String str2 = "";
        String str3 = "     ";
        System.out.println(str2.isEmpty());
        //System.out.println(str2.isBlank());
        System.out.println(word.indexOf("l"));
        System.out.println(word.lastIndexOf("t"));
        System.out.println(word.substring(0,5));
        String line = scan.nextLine();
        String[] words =line.split(" ");
        System.out.println(Arrays.toString(words));
        for(String name:words)
            System.out.println(name);
        System.out.println(word.charAt(4));
        System.out.println(word);
    }
}