package arraysinRDP;

import java.util.Arrays;
import java.util.Scanner;

public class ShippmentCompany 
{

	
	
		static int no_of_shipment;
   	    static int index;
	
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
         
	        System.out.println("Enter the number of cargo");
	        int n = scanner.nextInt();
	        //String[] name=new String[no_of_shipment];
	        Integer[] id = new Integer[n];
	          
	         System.out.println("Enter the cargo id");
	          
	        for (int i = 0; i < n; i++) 
	        {
	           id[i] = scanner.nextInt();
	            
	         }
	          
	          
	         System.out.println("Enter the number of shipment");
	         no_of_shipment = scanner.nextInt();
	      
	         
	              
	         System.out.println("Enter the shipment name");
	         String[] name=new String[no_of_shipment];
	          
	        for (int j = 0; j < no_of_shipment; j++) 
	         {
	              
	             name[j]=scanner.next().trim();
	               
	             name[j]+=scanner.nextLine();
	                       
	             String[] strArray = new String[] {name[j]};
	            
	         }
	          
	          
	         System.out.println("Enter the cargo id");
	        int cargo_id=scanner.nextInt();
	          
	          
	          
	         for(int i=0;i<id.length;i++)
	        {
	                      
	                 if(cargo_id==id[i])
	                 {               
	                 index=  Arrays.asList(id).indexOf(cargo_id);
	                          
	                 }
	         }
	          
	          
	     boolean flag=false;
	      
	    for (int i=0; i<no_of_shipment; i++)
	    {
	        if (index==i)
	         {
	             System.out.println(name[index]);
	             flag = true;
	             
	             
	        }
	    }
	         if (flag ==false) {
	         {
	             System.out.println("Yet to be shipped ");
	        }
	         
	     }
	     
	             
	       }



	}


