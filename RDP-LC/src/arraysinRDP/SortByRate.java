package arraysinRDP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SortByRate {

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int count;
		    count=sc.nextInt();
		    String a[]=new String[count];
		    for(int i=0;i<count;i++)
		    {
		    a[i]=sc.next();
		    }// fill the code
		    Double b[]=new Double[count];
		        
		    for(int i=0;i<count;i++)
		    {
		        b[i]=sc.nextDouble();
		        
		    }
		  /*Integer[] newArray = new Integer[b.length];
		     for (int i = 0; i < b.length; i++) {
		       newArray[i] = Integer.valueOf(b[i]);}*/
		    HashMap<Double,String> hmap=new HashMap<Double,String>();
		    for(int i=0;i<count;i++)
		    {
		        hmap.put(b[i],a[i]);
		    }
		    Map<Double,String> Shmap=new TreeMap<Double,String>(hmap);
		    
		   Set set = Shmap.entrySet();
		      Iterator iterator = set.iterator();
		      System.out.println("Details are :");
		      while(iterator.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator.next();
		         System.out.print(mentry.getValue() + " - " +mentry.getKey()+"\n");
		      }
		    /*Arrays.sort(b);
		     System.out.println("Details are :");
		    for(int i=0;i<count;i++)
		    {
		       
		        System.out.println(a[i]+" - "+b[i]+"\n");
		    }*/
		    
			}


	}

