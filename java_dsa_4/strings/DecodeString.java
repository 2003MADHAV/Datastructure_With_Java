package strings;
import java.util.Scanner;
public class DecodeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-->0) {
            int n = scan.nextInt();
            String str = scan.next();
            System.out.println(decode(str));
        }
    }
    static String decode(String str) {
        StringBuilder decodedString = new StringBuilder();
        //reading given number from right to left
        int i = str.length() - 1;
        while (i >= 0) {
            if (str.charAt(i) == '0') {
                // It means we have a two-digit number
                int number = Integer.parseInt(str.substring(i - 2, i));
                decodedString.append((char) (number + 'a' - 1));
                i -= 3;
            } else {
                // It's a single-digit number
                int number = str.charAt(i) - '0';
                decodedString.append((char) (number + 'a' - 1));
                i -= 1;
            }
        }
        // Since we read the string from right to left, reverse the result
        return decodedString.reverse().toString();
    }
}