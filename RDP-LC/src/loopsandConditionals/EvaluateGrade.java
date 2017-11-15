package loopsandConditionals;

import java.util.Scanner;

public class EvaluateGrade {

	public static void main(String[] args)
	{

		int no_of_countries, shipment_per_month;	
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the total number of countries :");
	     no_of_countries = in.nextInt();
	     System.out.println("Enter the total number of shipment per month :");
	     shipment_per_month = in.nextInt();
	     if(no_of_countries > 150 &&  shipment_per_month  > 1500)
	     {
	      System.out.println("The company grade is : A ");
	     }
	      else if(no_of_countries > 125 &&  shipment_per_month  > 1200){
	      System.out.println("The company grade is : B ");
	      }
	      else if(no_of_countries > 100 &&  shipment_per_month  > 1000){
	      System.out.println("The company grade is : C ");
	      }
	       else if(no_of_countries > 75 &&  shipment_per_month  > 700){
	      System.out.println("The company grade is : D ");
	       }
	       else if(((no_of_countries >= 0) &&(no_of_countries <= 75))  &&  ((shipment_per_month  <= 700) &&(shipment_per_month  >= 0))){
	        System.out.println("The company grade is : E ");
	       }
	      
	      else {
	      
	      System.out.println("Invalid Input");
	     }
	     }



	}


