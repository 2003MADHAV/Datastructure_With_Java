import java.util.*;
public class DecToBin
{
	public static int deciToBin(int dec)
	{
		if(dec < 2)
		{
			return dec;
		}
		else
		{
			return ((dec % 2 * 10) + deciToBin(dec / 2));
		}
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the Decimal Number : ");
		int dec = input.nextInt();
		int bin = deciToBin(dec);
		System.out.printf("Binary Number : " + bin);
	}

}
