package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Exercise1 {

	public static void main(String[] args) throws IOException
	{
	
		System.out.println("Enter the agent details");	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	    System.out.println("Enter the agent name :");
	    String name = br.readLine();
	    
	   System.out.println("Enter the identification number :");
	    String id = br.readLine();
	    
	    System.out.println("Enter the accountNumber :");
	    String accountNumber = br.readLine();
	    
	     System.out.println("Enter the creditLimit :");
	    String creditLimit = br.readLine();
	    
	    Double credit_Limit = Double.parseDouble(creditLimit);
	    DecimalFormat df = new DecimalFormat("#.00");
	    
	     System.out.println("Agent details are");
	     
	     System.out.println("Name : " +name+ "\n"+"Identification Number : " +id+"\n"+"Account Number : " + accountNumber+"\n"+"Credit Limit : "
	      +df.format(credit_Limit));
		

	}

}
