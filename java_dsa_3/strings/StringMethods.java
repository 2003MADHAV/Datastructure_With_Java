package strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringMethods
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Engineeringee";
        System.out.println(str.length());
        String str2 = "   Engineering   ";
        System.out.println(str2.trim());
        
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.startsWith("Engine",0));
        System.out.println(str.startsWith("Engine",2));
        System.out.println(str.endsWith("g"));
        System.out.println(str.endsWith("ring"));
        System.out.println(str.contains("neer"));
        System.out.println(str.contains("meer"));

        System.out.println(str.equals(str2));
        String str3 = "engineering";
        System.out.println(str.equals(str3));
        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str.replace("Engine","Jav"));
        System.out.println(str3.replace("e","a"));
        System.out.println(str3.replaceAll("e", "b"));
        System.out.println(String.valueOf(str));
        System.out.println(String.valueOf('a'));
        String str4 = "";
        String str5 = "Welcome to KLU";
        System.out.println(str4.isEmpty());
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,8));
        System.out.println(Arrays.toString(str5.split(" ")));
    }
}