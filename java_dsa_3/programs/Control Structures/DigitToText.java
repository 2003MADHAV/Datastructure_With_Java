import java.util.Scanner;
public class DigitToText{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int digit = scan.nextInt();
		switch(digit){
			case 0:
				System.out.println("Zero");break;
			case 1:
				System.out.println("One");break;
			case 2:
				System.out.println("Two");break;
			case 3:
				System.out.println("Three");break;
			case 4:
				System.out.println("Four");break;
			case 5:
				System.out.println("Five");break;
			default:
				if(digit%2==1)
					System.out.println("odd");
				else
					System.out.println("even");
		}
	}
}
