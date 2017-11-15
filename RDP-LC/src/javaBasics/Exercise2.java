package javaBasics;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args)
	{
	
		System.out.println("Enter the shipping cost of Item 1");
		
        Scanner sc=new Scanner(System.in);
        int item1=sc.nextInt();
        
        System.out.println("Enter the shipping cost of Item 2");
        int item2=sc.nextInt();
        
        System.out.println("Enter the shipping cost of Item 3");
        int item3=sc.nextInt();
        
        int total=item1+item2+item3;
        
        System.out.println("Total shipping cost of items is "+total);
		// fill the code
	}

	}


