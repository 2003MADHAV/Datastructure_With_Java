/*Find the given number is Favorite Number or not?*/
import java.util.Scanner;
public class FavoriteNumber
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		if(num%3==0  && num%5==0)
			System.out.println("Our Fav");
		else if(num%5==0)
			System.out.println("Your Fav");
		else if(num%3==0)
			System.out.println("My Fav");
		else
			System.out.println("Not Fav");
	}
}
