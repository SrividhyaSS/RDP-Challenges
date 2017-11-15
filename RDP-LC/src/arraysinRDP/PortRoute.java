package arraysinRDP;

import java.util.Scanner;

public class PortRoute {

	public static void main(String[] args)
	{
	
		Scanner scanner = new Scanner(System.in);
        
        
        int n=scanner.nextInt();
         
         int[][] path = new int[n][n];
          
                 
     for ( int i = 0 ; i < n ; i++ )
         {
             
             for (int j=0; j<n; j++)
             {   
                path[i][j] = scanner.nextInt();
             }
              
         }
         System.out.println("Enter two port numbers A and B :");
          
         int port1=scanner.nextInt();
         int port2=scanner.nextInt();
          
         port1=port1-1;
         port2=port2-1;
          
         int route=path[port1][port2];
          
        if (route==1)
        {
            System.out.println("There is a route");
        }
         
        else
        {
            System.out.println("There is no route"); 
             
        }
          
 

	}

}
