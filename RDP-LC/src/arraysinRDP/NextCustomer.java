package arraysinRDP;

import java.util.Scanner;

public class NextCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	     int count=sc.nextInt();
	     int a[]=new int[count];
	     int max=0;
	     for(int i=0;i<count;i++)
	     {
	     a[i]=sc.nextInt();
	     if(a[i]>max)
	     max=a[i];//System.out.println(a[i]);
	     }//Fill the code
	     
	     System.out.println("Next customer id is "+(max+1));

	}

}
