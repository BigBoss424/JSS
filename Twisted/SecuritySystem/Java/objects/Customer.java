/* Created by: Aaron Jones
*  Date: 4/1/2015
*  Last Modified: 4/5/2015
*  Description: This class is simply to be created for the purpose of creatin*g a new object called Customer. I will be working on creating the details fo*r the following class as I go along. There will be comments.
*/

public class Customer
{
	private int date; //Figure out if there is a way to get the date from			       //A function with the Java API
	private int timeIn,
		    timeOut;
	private char roomUsed,
		     tanningDown,
		     returnDown,
		     restroomLock,
		     relockRestroom,
		     cleanUpYourself,
		     didGuest,
		     didGuestTan;
	private String guestName;
	private int setsOfGoggles;

	public Customer() //Declare DVC
	{
		this.date = 01012015;
		this.timeIn = 320;
		this.timeOut = 420;
		this.roomUsed = 'V';
		this.tanningDown = 'V';
		this.returnDown = 'V';
		this.restroomLock = 'V';
		this.relockRestroom = 'V';
		this.cleanUpYourself = 'V';
		this.didGuest = 'V';
		this.didGuestTan = 'V';
		this.guestName = "John Doe";
		this.setsOfGoggles = 2;
	}
	
	public Customer(int date, int timeIn, int timeOut, char roomUsed,
			char tanningDown, char returnDown, char restroomLock,			     char relockRestroom, char cleanUpYourself,
			char didGuest, char didGuestTan, String guestName, 
			int setsOfGoggles) //Declaring EVC
	{	
		this.date = date;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.roomUsed = roomUsed;
		this.tanningDown = tanningDown;
		this.returnDown = returnDown;
		this.relockRestroom = relockRestroom;
		this.cleanUpYourself = cleanUpYourself;
		this.didGuest = didGuest;
		this.didGuestTan = didGuestTan;
		this.guestName = guestName;
		this.setsOfGoggles = setsOfGoggles;
	} 

	//Declaring getters and setters

	public int getDate()
	{ return date; }
	public void setDate(int Date)
	{ this.date = Date; }
	public int getTimeIn()
	{ return timeIn; }
	public void setTimeIn(int TimeIn)
	{ this.timeIn = TimeIn; }
	public int getTimeOut()
	{ return timeOut; }
	public void setTimeOut(int TimeOut)
	{ this.timeOut = TimeOut; }
	public char getRoomUsed()
	{ return roomUsed; }
	public void setRoomUsed(char RoomUsed)
	{ this.roomUsed = RoomUsed; }
	public char getTanningDown()
	{ return tanningDown; }
	public void setTanningDown(char TanningDown)
	{ this.tanningDown = TanningDown; }
	public char getReturnDown()
	{ return returnDown; }
	public void setReturnDown(char ReturnDown)
	{ this.returnDown = ReturnDown; }
	public char getRestroomLock()
	{ return restroomLock; }
	public void setRestroomLock(char RestroomLock)
	{ this.restroomLock = RestroomLock; }
	public char getRelockRestroom())
	{ return relockRestroom; }
	public void setRelockRestroom(char RelockRestroom)
	{ this.relockRestroom = RelockRestroom; }
	public char getCleanUpYourself()
	{ return cleanUpYourself; }
	public void setCleanUpYourself(char CleanUpYourself)
	{ this.cleanUpYourself = CleanUpYourself; }
	public char getDidGuest()
	{ return didGuest; }
	public void setDidGuest(char DidGuest)
	{ this.didGuest = DidGuest; }
	public char getDidGuestTan()
	{ return didGuestTan; }
	public void setDidGuestTan(char DidGuestTan)
	{ this.didGuestTan = DidGuestTan;}
	public String getGuestName()
	{ return guestName; }
	public void setGuestName(String GuestName)
	{ this.guestName = GuestName; }
	public int getSetsOfGoggles()
	{ return setsOfGoogles; }
	public void setSetOfGoogles(int SetsOfGoogles)
	{ this.setsOfGoogles = SetsOfGoogles; }

	//Declare toString Method
	public String toString()
	{
		return "";
	}
}//end class 
