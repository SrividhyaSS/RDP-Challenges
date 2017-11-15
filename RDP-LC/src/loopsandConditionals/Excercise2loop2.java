package loopsandConditionals;

import java.util.Scanner;

public class Excercise2loop2 {

	public static void main(String[] args)
	{
		
		int distance,weight;
	    System.out.println("Enter the weight");
	    Scanner input = new Scanner(System.in);
	    weight = input.nextInt();
	    System.out.println("Enter the distance");
	    distance = input.nextInt();
	    if(weight > 100 && distance > 500)
	    {
	    System.out.println("Datex shipping offers no discount");
	    }
	    else
	{
	  System.out.println("Datex shipping offers discount");  
	}
	}

		
	}


