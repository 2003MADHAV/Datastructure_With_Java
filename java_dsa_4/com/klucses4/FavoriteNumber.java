package com.klucses4;
import java.util.Scanner;
public class FavoriteNumber {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        if(num%3==0 && num%5==0)
            System.out.println("Our Favorite");
        else if(num%5==0)
            System.out.println("Your Favorite");
        else if(num%3==0)
            System.out.println("My Favorite");
        else
            System.out.println("Not Favorite");
    }
}
