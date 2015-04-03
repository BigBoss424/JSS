/* Created by: Aaron Jones
*  Date: 4/2/2015
*  Description: This will be the parent class for the entire program suite.*  I will include more details down below i nthe commit/comment section of *  the code.
*
*/

public class Person
{
	//Declaring Global Variables
	private String fName,lName;
	private int UID;

	public Person() //Declaring DVC
	{
		this.fName = "John";
		this.lName = "Doe";
		this.UID = 0;
	}

	public Person(String fName, String lName, int userID) //Declare EVC
	{
		this.fName = fName;
		this.lName = lName;
		this.UID = userID;
	}

	//Declaring getters and setters
	public String getFirstName(String fName)
	{ return fName; }
	public void setFirstName(String fName)
	{ this.fName = fName;}
	public String getLastName(String lName)
	{ return lName;}
	public void setLastName(String lName)
	{ this.lName = lName;}
	public int getUserID(int userID)
	{ return userID; }
	public void setUserID(int userID)
	{ this.UID = userID; }

	//Declaring toString Method
	public String toString()
	{
		return "First Name: " + fName + "\n" +
			   "Last Name: "  + lName + "\n" +
			   "User ID: "    + UID;
	}
}//end class

