package loopsandConditionals;

import java.util.Scanner;

public class Excercise1loops {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the shipment code :");
	    Scanner sc=new Scanner(System.in);
	int code=sc.nextInt();
	
	int a[]=new int[3];
	
	String mode = "";
	
	for(int i=0; i<3;i++)
	{
	    a[i]=code%10;
	 code = code/10;
	}
	int temp;
	
	temp =  a[0];
	a[0]= a[2];
	a[2]= temp;
	  if(a[0]==1 && a[1]==0 && a[2]==0)
	   mode="Airway";
	  
	  else if(a[0]==0 && a[1]==1 && a[2]==0)
	  mode = "Waterway";
	  
	  else if(a[0]==0 && a[1]==0 && a[2]==1)
	  mode = "Roadway";
	  
	  else if(a[0]==1 && a[1]==1 && a[2]==0)
	  mode= "Airway and Waterway";
	  
	   else if(a[0]==1 && a[1]==0 && a[2]==1)
	  mode="Airway and Roadway";
	  
	    else if(a[0]==0 && a[1]==1 && a[2]==1)
	  mode = "Waterway and Roadway";
	  
	     else if(a[0]==1 && a[1]==1 && a[2]==1)
	    mode = "All ways";

	System.out.println(mode);

	}

}
