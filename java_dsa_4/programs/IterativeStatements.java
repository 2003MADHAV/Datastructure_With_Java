/*
import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i=1;
		for(i=5;i<=10;)
		{
			System.out.println(i);
			i+=2;
		}
	}
}
[1,5] ->1,2,3,4,5 
(1,5] ->2,3,4,5
[1,5) ->1,2,3,4
(1,5) ->2,3,4

[10,25]
[10,50]

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int start = 1, end = 5, evenSum=0,oddSum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				evenSum+=i;
			else
				oddSum+=i;
		}
		System.out.println(evenSum-oddSum);
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				if((i+j)%3==0)
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
		int i=1;
		while(i>10)
		{
			System.out.println(i);
			i+=2;
		}
	}	
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int sum=0;
		int num = scan.nextInt();
		while(num>0)
		{
			sum = sum + num%10;
			num/=10;
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
		int i=1,j=1;
		while(i<=10)
		{
			while(j<=10)
			{
				if((i+j)%5==0)
					System.out.println(i+","+j);
				j+=1;
			}
			i+=1;
		}
		System.out.println(20+"20"+20);//202020
		System.out.println(20+40+"20"+40);//6020
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i=1;
		do
		{
			System.out.println(i);
			i+=2;
		}while(i>10);
	}
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		String name = "Ajay";
		for(char ch:name.toCharArray())
		{
			System.out.println(ch);
		}
	}	
}

import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<10;i++)
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
		int num = scan.nextInt();
		int isPrime=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(num%i==0)
				isPrime=false;
				break;				
		}
		if(isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
//Patterns
import java.util.Scanner;
public class IterativeStatements
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		for(int r=0;r<rows-1;r++)
		{
			for(int c=0;c<cols-1;c++)
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
			if(r%2==0)
			{
				for(int c=0;c<cols;c++)
				{
					System.out.print((c+1)+" ");
				}
			}
			else
			{
				for(int c=cols;c>0;c--)
				{
					System.out.print(c+" ");
				}
				
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
				if(r==c || r+c==rows-1 || r==0 || r==rows-1 || c==0 || c==cols-1)
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
				if(r==c || r+c==rows-1 || c==0 || c==cols-1)
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
				if(r==c || r+c==rows-1 || r==0 || r==rows-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
