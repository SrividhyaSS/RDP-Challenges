package javaBasics;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the User Details :");
	    
	    System.out.println("Enter the id :");
	    int id=sc.nextInt();
	    
	    System.out.println("Enter the name :");
	    String name=sc.next();
	    
	    System.out.println("Enter the username :");
	    String username=sc.next();
	    
	    System.out.println("Enter the password :");
	    String password=sc.next();
	    
	    System.out.println("Enter the mobilenumber :");
	    String mobilenumber=sc.next();
	    
	    System.out.println("Enter the rating :");// fill the code
		Double rating = sc.nextDouble();
		
	    System.out.println("User details are :");
	    System.out.println("Id : "+id+"\n"+"Name : "+ name +"\n"+"Username : "+ username +"\n"+"Mobile Number : "+ mobilenumber +"\n"+"Rating : "+ rating);

		
		

	}

}
