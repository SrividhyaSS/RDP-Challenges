package oopsconceptexam1;

public class User
{

	private String userName;
	private String firstName;
	private String lastName;
	private String contact;
	

public User ()
{
	
}


public User (String userName, String firstName, String lastName, String contact)
{
	
	this.userName= userName;
	
	this.firstName = firstName;
		
	this.lastName = lastName;
	
	this.contact = contact;
	
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getContact() {
	return contact;
}


public void setContact(String contact) {
	this.contact = contact;
}


public User finduser(User userArray[],String userName)
{
	User user = new User();
	boolean flag = false;
	for (int i=0; i<userArray.length; i++)
	{
		if (userArray[i].equals(userName))
		{
			user = userArray[i];
			
			System.out.println("User details :"+"\n"+"Username :"+user.getUserName()+"\n"+"FirstName :"+user.getFirstName()+
                    "\n"+"LastName :"+user.getLastName()+"\n"+"Contact :"+user.getContact());

			
			flag = true;
			
		}
	}
	
	if (flag == false)
	{
		System.out.println("User is not found");
	}
	

	return user;
}


public User finduser(User userArray[],String firstName,String lastName)
{
	User user = new User ();
	boolean flag = false;

	for (int i=0; i<userArray.length;i++)
	{
		if (userArray[i].getFirstName().equals(firstName) && userArray[i].getLastName().equals(lastName))
		{
			user = userArray[i];
			System.out.println("User details :"+"\n"+"Username :"+user.getUserName()+"\n"+"FirstName :"+user.getFirstName()+
                    "\n"+"LastName :"+user.getLastName()+"\n"+"Contact :"+user.getContact());
			flag = true;
		}
	if (flag == false)
	{
		System.out.println("user is not found");
	}
	
	
	}
	return user;
	
}



}