package cargoDetails;

public class Cargo {
	
	private String name; 
    private String description;
    private Double length;
    private Double width;
    public String getName() {   
            return name;   
    }   
    public void setName(String name) {   
            this.name = name;   
    }
    public String getDescription() {   
            return description;   
    }   
    public void setDescription(String description) {   
            this.description = description;   
    }
    public Double getLength() {   
            return length;   
    }   
    public void setLength(Double length) {   
            this.length = length;   
    }
    public Double getWidth() {   
            return width;   
    }   
    public void setWidth(Double width) {   
            this.width = width;   
    }
public void displayCargoDetails(){
//System.out.println("The cargo details are:");
System.out.println("Name : "+name+"\n"+"Description : "+description+"\n"+"Length : "+length+" "+"cm"+"\n"+"Width : "+width+" "+"cm");

}


}
