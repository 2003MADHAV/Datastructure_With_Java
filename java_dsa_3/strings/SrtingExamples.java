package strings;
import java.util.Scanner;
public class SrtingExamples
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1 = "Pavan";
        String name2 = "Kalyan";
        System.out.println(name1);
        System.out.println(name2);
        name2 = "Power Star";
        System.out.println(name2);
        String str1 = new String("Sree");
        String str2 = new String("Leela");
        System.out.println(str1);
        System.out.println(str2);
        str2 = new String("Cutie");
        System.out.println(str2);
        String str3 = "Hyd";
        String str4 = "Hyd";
        System.out.println(str3==str4);
        String name3 = new String("Madurai");
        String name4 = new String("Madurai");
        System.out.println(name3==name4);
        
        System.out.println('a'+'a');
        System.out.println("a"+"a");
        
        System.out.println('a'-'b');
        //System.out.println("a"-"b");

        System.out.println('a'*2);
        //System.out.println("a"*2);
        System.out.println('c'==99);

        String name = scan.next();
        System.out.println(name);
        String line = scan.nextLine();
        System.out.println(line);
    }
}