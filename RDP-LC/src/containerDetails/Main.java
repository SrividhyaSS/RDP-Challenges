package containerDetails;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of containers :");
		int n = Integer.parseInt(buff.readLine());
		
		Container[] container = new Container[n];
		 Container c = new Container();
		for(int i=0;i<n;i++) {
			container[i] = new Container();
			System.out.println("Enter the container "+(i+1)+" details :");
			String s1 = buff.readLine();
            String temp[] = s1.split(",");
            String containerNumber = temp[0];
            Float length = Float.parseFloat(temp[1]);
             Float width = Float.parseFloat(temp[2]);
              Float height = Float.parseFloat(temp[3]);
               Double weight = Double.parseDouble(temp[4]);
               container[i].setContainerNumber(containerNumber);
            container[i].setLength(length);
            container[i].setWidth(width);
            container[i].setHeight(height);
            container[i].setWeight(weight);
		}
		
		System.out.format("Container details are\n%-20s %-15s %-15s %-15s %s\n","Container Number","Length","Width","Height","Weight");
       for(int i=0;i<container.length;i++){
        container[i].displayContainerDetails();
       }

		

	}

}
