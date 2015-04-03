/**
 * Created by: Aaron Jones
 * Date: 4/3/2015
 * Last Modified:
 * Description: This class will basically hold all the menu driven options in the following
 * menu system below in seperate methods. I plan on implementing this into the driver method
 * for further testing. 
 * 
 * 
 * Bugs:
 *
 *
 * 
 * Fixes: 
 * 
 * 
 * 
 * 
 */

/**
 * @author bigboss424
 *
 */
public class MenuSystem implements MenuSystemInterface 
{

	//Whether or not I should be required to put in variables into this class or 
	//not has yet to be determined. 
	
	public void displayCheckMenu()
	{
		System.out.println("Please fill out this form and answer 'V' if the option doesn't apply to you");
		System.out.println("Date:");
		System.out.println("Time in: ");
		System.out.println("Time out: ");
		System.out.println("What room did you use?: ");
		System.out.println("Was the tanning bed lid down?: ");
		System.out.println("Did you return it to the down position?: ");
		System.out.println("How many sets of goggles were in the room?: ");
		System.out.println("Did you relock the door after using the restroom?: ");
		System.out.println("Did you remember to clean up after yourself?: ");
		System.out.println("Did you bring a Guest?: ");
		System.out.println("What is their name?: ");
		System.out.println("Did your guest tan?: ");
	}
	
	public void displayMainMenu()
	{
		System.out.println("Please choose from the following options: ");
		System.out.println("1) Check In ");
		System.out.println("2) Check Out");
		System.out.println("3) Quit");
	}
	
	public void displayDebugMenu()
	{
		System.out.println("Please choose from the following options: ");
		System.out.println("1) List of Customer Objects");
		System.out.println("2) List of ")
	}
}
