/*
package strings;
import java.util.Scanner;
public class StringsPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                res += ch;
        }
        System.out.println(res);
    }
}

package strings;
import java.util.Scanner;
public class StringsPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int val = (int)ch+k;
            char enChar = (char)val;
            res += enChar;
        }
        System.out.println(res);
    }
}

package strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringsPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String res="";
        String words[] = line.split(" ");
        for(String word:words)
        {
            if(word.length()>res.length())
                res = word;
        }
        System.out.println(res);
    }
}
*/
package strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringsPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String res="";
        String words[] = line.split(" ");
        for(String word:words)
        {
            String updatedWord = Character.toUpperCase(word.charAt(0))+word.substring(1,word.length()-1)+Character.toUpperCase(word.charAt(word.length()-1));            
            res = res +" "+updatedWord;
        }
        System.out.println(res);
        StringBuilder str1 = new StringBuilder("awesome");
        StringBuffer str2 = new StringBuffer("awesome");
    }
}