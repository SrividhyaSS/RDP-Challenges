package containerDetails;

import cargoDetails.Cargo;

public class Container extends Cargo
{
	private String containerNumber;
	Container(){}
	public Container(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	public String getContainerNumber() {
		return containerNumber;
	}
	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}
	public void displayContainerDetails() {
        
		System.out.format("%-20s %-15.1f %-15.1f %-15.1f %.1f\n",containerNumber,length,width,height,weight);
	}

}
