package arraysinRDP;

import java.util.Scanner;

public class MissingCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int number_of_customers;
	    Scanner input = new Scanner(System.in);
	    number_of_customers = input.nextInt();
	   int customer_id[]=new int[number_of_customers+1];
	   for(int i=1; i<=number_of_customers;i++){
	       customer_id[i] = input.nextInt();
	   }
	   
	   
	    for(int i=1; i<=number_of_customers;i++)
	    {
	    if(i == customer_id[i])
	    continue;
	    else
	        System.out.println("Customer id"+" "+i+" "+"is missing");
	    break;
	    }

		
	}

}
