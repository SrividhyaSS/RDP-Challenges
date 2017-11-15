package oopsconceptexam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{

	public static void main (String args[]) throws Exception, IOException
	{
		System.out.println("Enter the total number of users");
		String userName="",firstName="",lastName="",contact="";	
		User user = new User();
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int users=Integer.parseInt(bf.readLine());
		User[] userArray=new User[users];
        System.out.println("Enter user details");
        for(int i=0;i<users;i++)
        {
          String d=bf.readLine();
          String temp[] = d.split(",");
          userName=temp[0];
          firstName=temp[1];
          lastName=temp[2];
         contact=temp[3];
          
        userArray[i]=new User(userName,firstName,lastName,contact);
       
    
   
}  
        
       System.out.println("1)Search user by user name \n" + "2)Search user by first name and last name");
        System.out.println("Enter your option");
        int option=Integer.parseInt(bf.readLine());
        User userOut=new User();
        if(option==1)
        {
            System.out.println("Enter the user name to search");
            String username=bf.readLine();
            
         userOut=user.finduser(userArray,username);
         
       //  System.out.println("User details :"+"\n"+"Username :"+userOut.getUserName()+"\n"+"FirstName :"+userOut.getFirstName()+
         //"\n"+"LastName :"+userOut.getLastName()+"\n"+"Contact"+userOut.getContact());
        }
      else if(option==2)
        {
            System.out.println("Enter the first name to search");
            String firstname=bf.readLine();
            System.out.println("Enter the last name to search");
            String lastname=bf.readLine();
            userOut=user.finduser(userArray,firstname,lastname);
          //  System.out.println("User details :"+"\n"+"Username :"+userOut.getUserName()+"\n"+"FirstName :"+userOut.getFirstName()+
         //"\n"+"LastName :"+userOut.getLastName()+"\n"+"Contact :"+userOut.getContact());
        }
        else
        System.out.println("User not found");
   }

				
	}	

