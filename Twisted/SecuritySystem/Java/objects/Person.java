/* Created by: Aaron Jones
*  Date: 4/1/2015
*  Description: This class is to be the person class for the application suit*  e that I am creating. 
*/

public class Person
{
	//Declare global variables up here
	private String name;

	public Person()
	{
	   this.name = "Default Name";
	}

	public Person(String name)
	{
	   this.name = name;
	}
	//Declared the EVC and DVC

	public String getName(String name)
	{
	  return name;
	}

	public void setName(String name)
	{
	  this.name = name;
	}

	public String toString()
	{
	  return "Name: " + this.name;
	}

	


}
