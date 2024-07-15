package strings;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args)
    {
        String str = "cse";
        String str2 = "section4";
        System.out.println(str);
        System.out.println(str2);
        
        str2 = "technical";
        System.out.println(str2);
        String str3 = new String("madurai");
        String str4 = new String("hyderabad");
        System.out.println(str3);
        System.out.println(str4);
        str4 = new String("klu");
        System.out.println(str4);
        
        String str5 = "pavan";
        String str6 = "pavan";
        System.out.println(str5==str6);
        
        String str7 = new String("chandu");
        String str8 = new String("cahndu");
        System.out.println(str7==str8);

        System.out.println('a'/2);
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        System.out.println(word);

        String line = scan.nextLine();
        System.out.println(line);
    }
}