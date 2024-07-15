/*
[1,5] -> 1,2,3,4,5
(1,5] -> 2,3,4,5
[1,5) -> 1,2,3,4
(1,5) -> 2,3,4
[10,20]
import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int noOfFactors=0;
		int num=scan.nextInt();
		for(int factor=1;factor<=num;factor++)
		{
			if(num%factor==0)
				noOfFactors+=1;
		}
		if(noOfFactors==2)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i+j==3)
					System.out.println(i+","+j);
			}
		}
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum=0;
		while(num>0)
		{
			sum = sum + num%10;
			num /= 10;
		}
		System.out.println(sum);
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i=0;
		do{
			System.out.println(i);
			i+=1;
		}while(i<num);
	}
}

	seq = [10,2,13,45,85]
	for(datatype var : seq)
	{
		sop(var)
	}
	10
	2
	13
	45
	85
	
import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String name = "Kalasalingam";
		for(char letter : name.toCharArray())
		{
			System.out.println(letter);
		}	
	}
}
import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
				if(i==5)
					continue;
			System.out.println(i);
		}
	}
}


import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		boolean isPrime=true;
		for(int factor=2;factor<num/2+1;factor++)
		{
			if(num%factor==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)	System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				if(r==0 || r==rows-1 || c==0 || c==cols-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				if(r==rows/2 || c==cols/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				if(c==0 || c==cols-1 || r==c || r+c==rows-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				if(r==0 || r==rows-1 || r==c || r+c==rows-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				if(c<=r)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
*/
import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				if(c==0 || r==rows-1 || r==c)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


		AskMeToShine@gmail.com
		
		
		
