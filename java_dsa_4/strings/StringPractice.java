/*
package strings;
import java.util.Scanner;
public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String res="";
        for (int index = 0; index < str.length(); index++) {
            if(Character.isUpperCase(str.charAt(index)))
                res = res+str.charAt(index);            
        }
        System.out.println(res);
    }
}
package strings;
import java.util.Scanner;
public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();
        String res="";
        for (int index = 0; index < str.length(); index++) {
            int chVal = (int)str.charAt(index)+k;
            if(chVal>90 || chVal>112)
                chVal-=26;
            res += (char)chVal;
        }
        System.out.println(res);
    }
}
*/
package strings;
import java.util.Scanner;
public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] words = line.split(" ");
        String res="";        
        for(String word :words)
        {
            char first = Character.toUpperCase(word.charAt(0));
            char last = Character.toUpperCase(word.charAt(word.length()-1));
            String sub=word.substring(1,word.length()-1);
            res = res+first+sub+last+" ";
        }
        System.out.println(res);
    }
}
