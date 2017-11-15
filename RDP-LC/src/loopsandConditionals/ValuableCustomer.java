package loopsandConditionals;

import java.util.Scanner;

public class ValuableCustomer {

	public static void main(String[] args)
	{
		
		System.out.println("Enter the number of shipments per month :");
        Scanner sc = new Scanner(System.in);
        int shipment=sc.nextInt();
        if(shipment>20)
        System.out.println("Valuable customer");
        else if(shipment>0 && shipment<=20)
        System.out.println("Not a valuable customer");
        else
        System.out.println("Invalid Input");
		
		
	}

}
