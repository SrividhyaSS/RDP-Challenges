package PortDetails;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Mainpgm {

	public static void main(String[] args) throws IOException
	{
	
		try{
	         String country;
	 InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r); 
	    List<port> list = new ArrayList<port>();
	System.out.println("Enter the number of ports");
	int n = Integer.parseInt(br.readLine());
	for(int i = 1;i<=n;i++){   
	System.out.println("Enter the port"+i+" details");
	int id = Integer.parseInt(br.readLine());
	String portName = br.readLine();
	System.out.println("Is the port from same country[Y/N]");
	String yes = br.readLine();
	if(yes.equals("N"))
	{
	System.out.println("Enter the country");

	country = br.readLine();
	port port = new port(id, portName,country);
	list.add(port);
	}
	else if(yes.equals("Y")){   
	country = "India";
	port port = new port(id,portName);
	//port.country = "India";
	list.add(port);
	}
	}
	System.out.println("The port details are");

	System.out.format("%-15s %-15s %-15s","Id", "Name","Country"); 
	System.out.println("");
	  for(port p : list){
	  System.out.println(p);
	  }
	}
	catch(IOException e)
		{
	  e.printStackTrace();
	}
	}


	}


